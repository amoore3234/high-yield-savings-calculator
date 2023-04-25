package savings;

public class JanuarySavings extends Calculations {

  public JanuarySavings() {
  }

  // public double januarySavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double averageBalance,
  //     double newAverageBalance, double interest, double highYieldPrinciple, double updatedAverageBalance, double totalInterestPaid) {
  //   double monthInDays = 31;
  //   double daysInYears = 365;
  //   double averageDays = monthInDays / daysInYears;
  //   double interestRate = 0.0393;
  //   while (days <= 31) {
  //     if (days == 1) {
  //       daysInMonth = days;
  //       newAverageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
  //     }
  //     if (days == 5) {
  //       days++;
  //       days -= daysInMonth;
  //       newAverageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
  //       highYieldPrinciple += 2655.75;
  //       days = 5;
  //       daysInMonth = 5;
  //     }
  //     if (days == 18) {
  //       days++;
  //       days -= daysInMonth;
  //       newAverageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
  //       highYieldPrinciple += 2000.00;
  //       days = 18;
  //       daysInMonth = 18;
  //     }
  //     if (days == 19) {
  //       days++;
  //       days -= daysInMonth;
  //       newAverageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
  //       highYieldPrinciple += 2392.44;
  //       days = 19;
  //       daysInMonth = 19;
  //     }
  //     if (days == 25) {
  //       days++;
  //       days -= daysInMonth;
  //       newAverageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
  //       highYieldPrinciple -= 100;
  //       days = 25;
  //       daysInMonth = 25;
  //     }
  //     if (days == 27) {
  //       days++;
  //       days -= daysInMonth;
  //       newAverageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
  //       highYieldPrinciple += 741.06;
  //       days = 27;
  //       daysInMonth = 27;
  //     }
  //     if (days == 31) {
  //       days++;
  //       days -= daysInMonth;
  //       newAverageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
  //       newAverageBalance += highYieldPrinciple;
  //       days = 31;
  //     }
  //     days++;
  //   }
  //   highYieldInterest = getHighYieldInterest(totalInterestPaid, interestFinal, interestRate, newAverageBalance, highYieldInterest, newAverageBalance);
  //   highYieldInterest -= newAverageBalance;
  //   updatedAverageBalance += highYieldInterest;
  //   highYieldPrinciple += highYieldInterest;
  //   newAverageBalance += highYieldInterest;
  //   newAverageBalance /= days - 1;
  //   totalInterestPaid += highYieldInterest;
  //   days = 1;
  //   return highYieldPrinciple;
  // }

  public double getAverageBalance(double averageBalance, double highYieldPrinciple) {
    int days = 1;
    int daysInMonth = 0;
    while (days <= 31) {
      if (days == 1) {
        daysInMonth = days;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
      }
      if (days == 5) {
        days++;
        days -= daysInMonth;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2655.75;
        days = 5;
        daysInMonth = 5;
      }
      if (days == 18) {
        days++;
        days -= daysInMonth;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2000.00;
        days = 18;
        daysInMonth = 18;
      }
      if (days == 19) {
        days++;
        days -= daysInMonth;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 2392.44;
        days = 19;
        daysInMonth = 19;
      }
      if (days == 25) {
        days++;
        days -= daysInMonth;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple -= 100;
        days = 25;
        daysInMonth = 25;
      }
      if (days == 27) {
        days++;
        days -= daysInMonth;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        highYieldPrinciple += 741.06;
        days = 27;
        daysInMonth = 27;
      }
      if (days == 31) {
        days++;
        days -= daysInMonth;
        averageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
        averageBalance += highYieldPrinciple;
        days = 31;
      }
      days++;
    }
    return averageBalance;
  }

  public double getHighYieldPrinciple(double highYieldPrinciple) {
    int days = 1;
    while (days <= 31) {
      if (days == 5) {
        highYieldPrinciple += 2655.75;
      }
      if (days == 18) {
        highYieldPrinciple += 2000.00;
      }
      if (days == 19) {
        highYieldPrinciple += 2392.44;
      }
      if (days == 25) {
        highYieldPrinciple -= 100;
      }
      if (days == 27) {
        highYieldPrinciple += 741.06;
      }
      days++;
    }
    return highYieldPrinciple;
  }

  public double getHighYieldInterest(double highYieldPrinciple, double averageBalance, double highYieldInterest) {
    double interest = 0.0;
    double interestFinal = 0.0;
    double interestRate = 0.0393;
    double monthInDays = 31;
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
