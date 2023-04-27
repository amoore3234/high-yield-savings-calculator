package savings;

public class JulySavings extends Calculations {
  
  public JulySavings() {
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
      if (days == 6) {
        days++;
        days -= dayCount;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 6;
        dayCount = 6;
      }
      if (days == 20) {
        days++;
        days -= dayCount;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 20;
        dayCount = 20;
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
    highYieldPrinciple += 2392.43;
    highYieldPrinciple += 2392.45;
    return highYieldPrinciple;
  }

  public double getHighYieldInterest(double highYieldPrinciple, double averageBalance, double highYieldInterest) {
    double n = 0.0;
    double interest = 0.0;
    double interestRate = 0.0422;
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
