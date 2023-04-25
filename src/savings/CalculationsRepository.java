package savings;

public interface CalculationsRepository {
  
  double calculateDailyPrinciple(int daysOfMonth, double newHighYieldBalance, double highYieldBalance);

  void getReport(String monthName, double highYieldInterest, double highYieldPrinciple, double newAverageBalance, double totalInterestPaid);

  double getUpdatedAverageBalance(double averageBalance, double highYieldInterest, double monthInDays);
}
