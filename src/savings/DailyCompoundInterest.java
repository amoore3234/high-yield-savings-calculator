package savings;

import java.text.DecimalFormat;

public class DailyCompoundInterest {
  
  public DailyCompoundInterest() {
  }

  public void dailyCompoundInterestCalculation(double principle, double payment) {
    double rate = 0.0393;
    double n = 365;
    double days = 1;
    double interest = 0.0;
    double dailyInterest = rate/n;
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    for (int i = 1; i <= 1; i++) {
      while (days <= 31) {
        principle = newPrinciple(principle, interest, principle, dailyInterest);
        days++;
      }
      principle += payment;
      System.out.println("January Balance: " + decimalFormat.format(principle));
      days = 1;
      while (days <= 28) {
        if (days == 2) {
          principle += payment;
        }
        principle = newPrinciple(principle, interest, principle, dailyInterest);
        days++;
      }
      System.out.println("February Balance: " + decimalFormat.format(principle));
      days = 1;
      while (days <= 31) {
        if (days == 17) {
          principle += payment;
        }
        principle = newPrinciple(principle, interest, principle, dailyInterest);
        days++;
      }
      System.out.println("March Balance: " + decimalFormat.format(principle));
      days = 1;
      while (days <= 30) {
        if (days == 17) {
          principle += payment;
        }
        principle = newPrinciple(principle, interest, principle, dailyInterest);
        days++;
      }
      System.out.println("April Balance: " + decimalFormat.format(principle));
      days = 1;
      while (days <= 31) {
        if (days == 17) {
          principle += payment;
        }
        principle = newPrinciple(principle, interest, principle, dailyInterest);
        days++;
      }
      System.out.println("May Balance: " + decimalFormat.format(principle));
      days = 1;
      while (days <= 30) {
        if (days == 17) {
          principle += payment;
        }
        principle = newPrinciple(principle, interest, principle, dailyInterest);
        days++;
      }
      System.out.println("June Balance: " + decimalFormat.format(principle));
      days = 1;
      while (days <= 31) {
        if (days == 17) {
          principle += payment;
        }
        principle = newPrinciple(principle, interest, principle, dailyInterest);
        days++;
      }
      System.out.println("July Balance: " + decimalFormat.format(principle));
      days = 1;
      while (days <= 31) {
        if (days == 17) {
          principle += payment;
        }
        principle = newPrinciple(principle, interest, principle, dailyInterest);
        days++;
      }
      System.out.println("August Balance: " + decimalFormat.format(principle));
      days = 1;
      while (days <= 30) {
        if (days == 17) {
          principle += payment;
        }
        principle = newPrinciple(principle, interest, principle, dailyInterest);
        days++;
      }
      System.out.println("Semptember Balance: " + decimalFormat.format(principle));
      days = 1;
      while (days <= 31) {
        if (days == 17) {
          principle += payment;
        }
        principle = newPrinciple(principle, interest, principle, dailyInterest);
        days++;
      }
      System.out.println("October Balance: " + decimalFormat.format(principle));
      days = 1;
      while (days <= 30) {
        if (days == 17) {
          principle += payment;
        }
        principle = newPrinciple(principle, interest, principle, dailyInterest);
        days++;
      }
      System.out.println("November Balance: " + decimalFormat.format(principle));
      days = 1;
      while (days <= 31) {
        if (days == 17) {
          principle += payment;
        }
        principle = newPrinciple(principle, interest, principle, dailyInterest);
        days++;
      }
      System.out.println("December Balance: " + decimalFormat.format(principle));
      System.out.println();
      days = 1;
    }
  }

  private double newPrinciple(double principle, double interest, double balance, double dailyInterest) {
    interest = balance * dailyInterest;
    return principle += interest;
  }
}
