package savings;

public class SeptemberSavings extends Calculations {
  
  public SeptemberSavings() {
  }

  public double getAverageBalance(double highYieldPrinciple) {
    double averageBalance = 0;
    int days = 1;
    int dayCount = 0;
    while (days <= 30) {
      if (days == 1) {
        dayCount = days;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
      }
      if (days == 14) {
        days++;
        days -= dayCount;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        days = 14;
        dayCount = 14;
      }
      if (days == 28) {
        days++;
        days -= dayCount;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        days = 28;
        dayCount = 28;
      }
      if (days == 30) {
        days++;
        days -= dayCount;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        averageBalance += highYieldPrinciple;
        days = 30;
      }
      days++;
    }
    return averageBalance;
  }

  public double getHighYieldPrinciple(double highYieldPrinciple) {
    return highYieldPrinciple;
  }

  public double getHighYieldInterest(double highYieldPrinciple, double averageBalance, double highYieldInterest) {
    double n = 0.0;
    double interest = 0.0;
    double interestRate = 0.0422;
    double monthInDays = 30;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    n = averageDays * 12;
    interest = interestRate / 12;
    averageBalance /= monthInDays;
    highYieldInterest = averageBalance * (Math.pow(1 + interest, n));
    highYieldInterest -= averageBalance;
    return highYieldInterest;
  }
}
