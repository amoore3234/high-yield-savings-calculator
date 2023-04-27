package savings;

public class JuneSavings extends Calculations {
  
  public JuneSavings() {
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
      if (days == 8) {
        days++;
        days -= dayCount;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 8;
        dayCount = 8;
      }
      if (days == 22) {
        days++;
        days -= dayCount;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 22;
        dayCount = 22;
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
    highYieldPrinciple += 2392.43;
    highYieldPrinciple += 2392.45;
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
