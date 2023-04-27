package savings;

public class MarchSavings extends Calculations {
  
  public MarchSavings() {
  }

  public double getAverageBalance(double highYieldPrinciple) {
    double averageBalance = 0;
    int days = 1;
    int dayCount = 0;
    while (days <= 31) {
      if (days == 1) {
        dayCount = days;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
      }
      if (days == 2) {
        days++;
        days -= dayCount;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 2;
        dayCount = 2;
      }
      if (days == 9) {
        days++;
        days -= dayCount;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2889.00;
        days = 9;
        dayCount = 9;
      }
      if (days == 16) {
        days++;
        days -= dayCount;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 16;
        dayCount = 16;
      }
      if (days == 30) {
        days++;
        days -= dayCount;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 30;
        dayCount = 30;
      }
      if (days == 31) {
        days++;
        days -= dayCount;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        averageBalance += highYieldPrinciple;
        days = 31;
      }
      days++;
    }
    return averageBalance;
  }

  public double getHighYieldPrinciple(double highYieldPrinciple) {
    highYieldPrinciple += 2392.45;
    highYieldPrinciple += 2889.00;
    highYieldPrinciple += 2392.43;
    highYieldPrinciple += 2392.45;
    return highYieldPrinciple;
  }

  public double getHighYieldInterest(double highYieldPrinciple, double averageBalance, double highYieldInterest) {
    double n = 0.0;
    double interest = 0.0;
    double interestRate = 0.0393;
    double monthInDays = 31;
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
