package savings;

import java.text.DecimalFormat;

public class FebruarySavings extends Calculations {

  public FebruarySavings() {
  }

  public void februarySavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple,
      double interest, double highYieldPrinciple, double newAverageBalance, double totalInterestPaid) {
    double monthInDays = 28;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    double interestRate = 0.0393;
    while (days <= 28) {
      if (days == 1) {
        daysInMonth = days;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
      }
      if (days == 2) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.44;
        days = 2;
        daysInMonth = 2;
      }
      if (days == 16) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.44;
        days = 16;
        daysInMonth = 16;
      }
      if (days == 28) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        newHighYieldPrinciple += highYieldPrinciple;
        days = 28;
      }
      days++;
    }
    interest = averageDays * 12;
    interestFinal = interestRate / 12;
    newAverageBalance = newHighYieldPrinciple;
    newHighYieldPrinciple /= days - 1;
    highYieldInterest = newHighYieldPrinciple * (Math.pow(1 + interestFinal, interest));
    highYieldInterest -= newHighYieldPrinciple;
    newAverageBalance += highYieldInterest;
    highYieldPrinciple += highYieldInterest;
    newHighYieldPrinciple += highYieldInterest;
    newAverageBalance /= days - 1;
    totalInterestPaid += highYieldInterest;
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    System.out.println("*********************February Balance*******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    System.out.println();
    days = 1;
  }

  public double getAverageBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double averageBalance,
      double newAverageBalance, double interest, double highYieldPrinciple, double updatedAverageBalance, double totalInterestPaid) {
        while (days <= 28) {
          if (days == 1) {
            daysInMonth = days;
            newAverageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
          }
          if (days == 2) {
            days++;
            days -= daysInMonth;
            newAverageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
            highYieldPrinciple += 2392.44;
            days = 2;
            daysInMonth = 2;
          }
          if (days == 16) {
            days++;
            days -= daysInMonth;
            newAverageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
            highYieldPrinciple += 2392.44;
            days = 16;
            daysInMonth = 16;
          }
          if (days == 28) {
            days++;
            days -= daysInMonth;
            newAverageBalance = calculateDailyPrinciple(days, averageBalance, highYieldPrinciple);
            newAverageBalance += highYieldPrinciple;
            days = 28;
          }
          days++;
    }
    return newAverageBalance;
  }

  public double getHighYieldPrinciple(int days, int daysInMonth, double interestFinal, double highYieldInterest, double averageBalance,
  double newAverageBalance, double interest, double highYieldPrinciple, double updatedAverageBalance, double totalInterestPaid) {
    double accInterest = getHighYieldInterest(daysInMonth, interest, averageBalance, interestFinal, totalInterestPaid, updatedAverageBalance, highYieldInterest, newAverageBalance);
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
    return highYieldPrinciple + accInterest;
  }

  public double getUpdatedAverageBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double averageBalance,
  double newAverageBalance, double interest, double highYieldPrinciple, double updatedAverageBalance, double totalInterestPaid) {
    double updatedBalance = getAverageBalance(days, daysInMonth, interestFinal, highYieldInterest, averageBalance, newAverageBalance, interest, highYieldPrinciple, updatedAverageBalance, totalInterestPaid);
    double finalInterest = getHighYieldInterest(daysInMonth, interest, averageBalance, interestFinal, totalInterestPaid, updatedAverageBalance, highYieldInterest, newAverageBalance);
    return updatedBalance + finalInterest;
  }

  public double getHighYieldInterest(int days, double interest, double averageDays, double interestFinal, double interestRate, double averageBalance, double highYieldInterest, double newAverageBalance) {
    averageBalance = getAverageBalance(days, days, interestFinal, highYieldInterest, averageBalance, newAverageBalance, interestFinal, highYieldInterest, newAverageBalance, interestRate);
    interest = averageDays * 12;
    interestFinal = interestRate / 12;
    newAverageBalance = averageBalance;
    averageBalance /= days - 1;
    highYieldInterest = averageBalance * (Math.pow(1 + interestFinal, interest));
    highYieldInterest -= averageBalance;
    return highYieldInterest;
  }
    
}
