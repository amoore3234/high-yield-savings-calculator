package savings;

public class NovemberSavings extends Calculations {
  
  public NovemberSavings() {
  }

  public double getAverageBalance(double highYieldPrinciple) {
    double averageBalance = 0;
    int days = 1;
    int daysInMonth = 0;
    while (days <= 30) {
      if (days == 1) {
        daysInMonth = days;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
      }
      if (days == 9) {
        days++;
        days -= daysInMonth;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 9;
        daysInMonth = 9;
      }
      if (days == 23) {
        days++;
        days -= daysInMonth;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 23;
        daysInMonth = 23;
      }
      if (days == 30) {
        days++;
        days -= daysInMonth;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        averageBalance += highYieldPrinciple;
        days = 30;
      }
      days++;
    }
    return averageBalance;
  }

  public double getHighYieldPrinciple(double highYieldPrinciple) {
    highYieldPrinciple += 2392.43;
    highYieldPrinciple += 2392.45;
    return highYieldPrinciple;
  }

  public double getHighYieldInterest(double highYieldPrinciple, double averageBalance, double highYieldInterest) {
    double interest = 0.0;
    double interestFinal = 0.0;
    double interestRate = 0.0422;
    double monthInDays = 30;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    interest = averageDays * 12;
    interestFinal = interestRate / 12;
    averageBalance /= monthInDays;
    highYieldInterest = averageBalance * (Math.pow(1 + interestFinal, interest));
    highYieldInterest -= averageBalance;
    return highYieldInterest;
  }
}
