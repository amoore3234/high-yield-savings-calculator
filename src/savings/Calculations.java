package savings;

import java.text.DecimalFormat;

abstract class Calculations implements CalculationsRepository {

  @Override
  public double calculateDailyPrinciple(int dayCount, double newHighYieldBalance, double highYieldBalance) {
    while (dayCount > 1) {
      newHighYieldBalance += highYieldBalance;
      dayCount--;
    }
    return newHighYieldBalance;
  }

  @Override
  public void getReport(String monthName, double newAverageBalance, double highYieldInterest,
      double totalInterestPaid, double highYieldPrinciple) {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    System.out.println("********************* " + monthName + " Balance *******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    System.out.println();
  }

  @Override
  public double getUpdatedAverageBalance(double averageBalance, double highYieldInterest, double monthInDays) {
    averageBalance += highYieldInterest;
    averageBalance /= monthInDays;
    return averageBalance;
  }
    
}
