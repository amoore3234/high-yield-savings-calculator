package savings;

public class AprilSavings extends Calculations {
  public double getAverageBalance(double highYieldPrinciple) {
    double averageBalance = 0;
    int days = 1;
    int daysInMonth = 0;
    while (days <= 30) {
      if (days == 1) {
        daysInMonth = days;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
      }
      if (days == 13) {
        days++;
        days -= daysInMonth;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 13;
        daysInMonth = 13;
      }
      if (days == 27) {
        days++;
        days -= daysInMonth;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 27;
        daysInMonth = 27;
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
