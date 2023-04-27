import java.text.DecimalFormat;

import savings.AprilSavings;
import savings.AugustSavings;
import savings.FebruarySavings;
import savings.JanuarySavings;
import savings.JulySavings;
import savings.JuneSavings;
import savings.MarchSavings;
import savings.MaySavings;
import savings.NovemberSavings;
import savings.OctoberSavings;
import savings.SeptemberSavings;

public class CompoundInterest {

  private double principle;
  private double payment;
  private double highYieldPayment;
  private double highYieldPrinciple;
  private double newAverageBalance;
  private double totalInterestPaid;
  private double rate;
  private int n;
  private int days;

  public CompoundInterest() {
    principle = 5000;
    highYieldPrinciple = 13804.13;
    totalInterestPaid = 0.0;
    newAverageBalance = 0.0;
    payment = 100;
    highYieldPayment = 2392.40;
    rate = 0.0393;
    n = 365;
    days = 1;
  }

  public void calculateDailyCompoundInterest() {
    double finalInterest = 0.0;
    double dailyInterest = rate/n;
    for (int i = 1; i <= 1; i++) {
      while (days <= 31) {
        newPrinciple(finalInterest, principle, dailyInterest);
        days++;
      }
      principle += payment;
      System.out.println("January Balance: " + principle);
      days = 1;
      while (days <= 28) {
        if (days == 2) {
          principle += payment;
        }
        newPrinciple(finalInterest, principle, dailyInterest);
        days++;
      }
      System.out.println("February Balance: " + principle);
      days = 1;
      while (days <= 31) {
        if (days == 17) {
          principle += payment;
        }
        newPrinciple(finalInterest, principle, dailyInterest);
        days++;
      }
      System.out.println("March Balance: " + principle);
      days = 1;
      while (days <= 30) {
        if (days == 17) {
          principle += payment;
        }
        newPrinciple(finalInterest, principle, dailyInterest);
        days++;
      }
      System.out.println("April Balance: " + principle);
      days = 1;
      while (days <= 31) {
        if (days == 17) {
          principle += payment;
        }
        newPrinciple(finalInterest, principle, dailyInterest);
        days++;
      }
      System.out.println("May Balance: " + principle);
      days = 1;
      while (days <= 30) {
        if (days == 17) {
          principle += payment;
        }
        newPrinciple(finalInterest, principle, dailyInterest);
        days++;
      }
      System.out.println("June Balance: " + principle);
      days = 1;
      while (days <= 31) {
        if (days == 17) {
          principle += payment;
        }
        newPrinciple(finalInterest, principle, dailyInterest);
        days++;
      }
      System.out.println("July Balance: " + principle);
      days = 1;
      while (days <= 31) {
        if (days == 17) {
          principle += payment;
        }
        newPrinciple(finalInterest, principle, dailyInterest);
        days++;
      }
      System.out.println("August Balance: " + principle);
      days = 1;
      while (days <= 30) {
        if (days == 17) {
          principle += payment;
        }
        newPrinciple(finalInterest, principle, dailyInterest);
        days++;
      }
      System.out.println("Semptember Balance: " + principle);
      days = 1;
      while (days <= 31) {
        if (days == 17) {
          principle += payment;
        }
        newPrinciple(finalInterest, principle, dailyInterest);
        days++;
      }
      System.out.println("October Balance: " + principle);
      days = 1;
      while (days <= 30) {
        if (days == 17) {
          principle += payment;
        }
        newPrinciple(finalInterest, principle, dailyInterest);
        days++;
      }
      System.out.println("November Balance: " + principle);
      days = 1;
      while (days <= 31) {
        if (days == 17) {
          principle += payment;
        }
        newPrinciple(finalInterest, principle, dailyInterest);
        days++;
      }
      System.out.println("December Balance: " + principle);
      System.out.println();
      days = 1;
    }
  }

  public void calculateHighYieldSavings() {
    JanuarySavings januarySavings = new JanuarySavings();
    FebruarySavings februarySavings = new FebruarySavings();
    MarchSavings marchSavings = new MarchSavings();
    AprilSavings aprilSavings = new AprilSavings();
    MaySavings maySavings = new MaySavings();
    JuneSavings juneSavings = new JuneSavings();
    JulySavings julySavings = new JulySavings();
    AugustSavings augustSavings = new AugustSavings();
    SeptemberSavings septemberSavings = new SeptemberSavings();
    OctoberSavings octoberSavings = new OctoberSavings();
    NovemberSavings novemberSavings = new NovemberSavings();

    double januaryHighYieldInterest = 0.0;
    double januaryNewAverageBalance = 0.0;
    double januaryHighYieldPrinciple = 0.0;

    double februaryHighYieldInterest = 0.0;
    double februaryNewAverageBalance = 0.0;
    double februaryHighYieldPrinciple = 0.0;
    
    double marchHighYieldInterest = 0.0;
    double marchNewAverageBalance = 0.0;
    double marchHighYieldPrinciple = 0.0;

    double aprilHighYieldInterest = 0.0;
    double aprilNewAverageBalance = 0.0;
    double aprilHighYieldPrinciple = 0.0;

    double mayHighYieldInterest = 0.0;
    double mayNewAverageBalance = 0.0;
    double mayHighYieldPrinciple = 0.0;

    double juneHighYieldInterest = 0.0;
    double juneNewAverageBalance = 0.0;
    double juneHighYieldPrinciple = 0.0;

    double julyHighYieldInterest = 0.0;
    double julyNewAverageBalance = 0.0;
    double julyHighYieldPrinciple = 0.0;

    double augustHighYieldInterest = 0.0;
    double augustNewAverageBalance = 0.0;
    double augustHighYieldPrinciple = 0.0;

    double septemberHighYieldInterest = 0.0;
    double septemberNewAverageBalance = 0.0;
    double septemberHighYieldPrinciple = 0.0;

    double octoberHighYieldInterest = 0.0;
    double octoberNewAverageBalance = 0.0;
    double octoberHighYieldPrinciple = 0.0;

    double novemberHighYieldInterest = 0.0;
    double novemberNewAverageBalance = 0.0;
    double novemberHighYieldPrinciple = 0.0;
    double totalInterestPaid = 0.0;
    double beginningBalance = 13804.13;
 
    for (int i = 1; i <= 1; i++) {
      int year = 2022 + i;
      System.out.println("Year " + year);
      //January savings balance
      januaryHighYieldPrinciple = januarySavings.getHighYieldPrinciple(beginningBalance);
      januaryNewAverageBalance = januarySavings.getAverageBalance(beginningBalance);
      januaryHighYieldInterest = januarySavings.getHighYieldInterest(beginningBalance, januaryNewAverageBalance, januaryHighYieldInterest);
      januaryHighYieldPrinciple += januaryHighYieldInterest;
      januaryNewAverageBalance = januarySavings.getUpdatedAverageBalance(januaryNewAverageBalance, januaryHighYieldInterest, 31);
      totalInterestPaid += januaryHighYieldInterest;
      januarySavings.getReport("January", januaryNewAverageBalance, januaryHighYieldInterest ,totalInterestPaid, januaryHighYieldPrinciple);

      //February savings balance
      februaryHighYieldPrinciple = februarySavings.getHighYieldPrinciple(januaryHighYieldPrinciple);
      februaryNewAverageBalance = februarySavings.getAverageBalance(januaryHighYieldPrinciple);
      februaryHighYieldInterest = februarySavings.getHighYieldInterest(januaryHighYieldPrinciple, februaryNewAverageBalance, februaryHighYieldInterest);
      februaryHighYieldPrinciple += februaryHighYieldInterest;
      februaryNewAverageBalance = februarySavings.getUpdatedAverageBalance(februaryNewAverageBalance, februaryHighYieldInterest, 28);
      totalInterestPaid += februaryHighYieldInterest;
      februarySavings.getReport("February", februaryNewAverageBalance, februaryHighYieldInterest, totalInterestPaid, februaryHighYieldPrinciple);

      //March savings balance
      marchHighYieldPrinciple = marchSavings.getHighYieldPrinciple(februaryHighYieldPrinciple);
      marchNewAverageBalance = marchSavings.getAverageBalance(februaryHighYieldPrinciple);
      marchHighYieldInterest = marchSavings.getHighYieldInterest(februaryHighYieldPrinciple, marchNewAverageBalance, marchHighYieldInterest);
      marchHighYieldPrinciple += marchHighYieldInterest;
      marchNewAverageBalance = marchSavings.getUpdatedAverageBalance(marchNewAverageBalance, marchHighYieldInterest, 31);
      totalInterestPaid += marchHighYieldInterest;
      marchSavings.getReport("March", marchNewAverageBalance, marchHighYieldInterest, totalInterestPaid, marchHighYieldPrinciple);

      //April savings balance
      aprilHighYieldPrinciple = aprilSavings.getHighYieldPrinciple(marchHighYieldPrinciple);
      aprilNewAverageBalance = aprilSavings.getAverageBalance(marchHighYieldPrinciple);
      aprilHighYieldInterest = aprilSavings.getHighYieldInterest(marchHighYieldPrinciple, aprilNewAverageBalance, aprilHighYieldInterest);
      aprilHighYieldPrinciple += aprilHighYieldInterest;
      aprilNewAverageBalance = aprilSavings.getUpdatedAverageBalance(aprilNewAverageBalance, aprilHighYieldInterest, 31);
      totalInterestPaid += aprilHighYieldInterest;
      aprilSavings.getReport("April", aprilNewAverageBalance, aprilHighYieldInterest, totalInterestPaid, aprilHighYieldPrinciple);

      //May savings balance
      mayHighYieldPrinciple = maySavings.getHighYieldPrinciple(aprilHighYieldPrinciple);
      mayNewAverageBalance = maySavings.getAverageBalance(aprilHighYieldPrinciple);
      mayHighYieldInterest = maySavings.getHighYieldInterest(aprilHighYieldPrinciple, mayNewAverageBalance, mayHighYieldInterest);
      mayHighYieldPrinciple += mayHighYieldInterest;
      mayNewAverageBalance = maySavings.getUpdatedAverageBalance(mayNewAverageBalance, mayHighYieldInterest, 31);
      totalInterestPaid += mayHighYieldInterest;
      maySavings.getReport("May", mayNewAverageBalance, mayHighYieldInterest, totalInterestPaid, mayHighYieldPrinciple);

      //June savings balance
      juneHighYieldPrinciple = juneSavings.getHighYieldPrinciple(mayHighYieldPrinciple);
      juneNewAverageBalance = juneSavings.getAverageBalance(mayHighYieldPrinciple);
      juneHighYieldInterest = juneSavings.getHighYieldInterest(mayHighYieldPrinciple, juneNewAverageBalance, juneHighYieldInterest);
      juneHighYieldPrinciple += juneHighYieldInterest;
      juneNewAverageBalance = juneSavings.getUpdatedAverageBalance(juneNewAverageBalance, juneHighYieldInterest, 30);
      totalInterestPaid += juneHighYieldInterest;
      juneSavings.getReport("June", juneNewAverageBalance, juneHighYieldInterest, totalInterestPaid, juneHighYieldPrinciple);

      //July savings balance
      julyHighYieldPrinciple = julySavings.getHighYieldPrinciple(juneHighYieldPrinciple);
      julyNewAverageBalance = julySavings.getAverageBalance(juneHighYieldPrinciple);
      julyHighYieldInterest = julySavings.getHighYieldInterest(juneHighYieldPrinciple, julyNewAverageBalance, julyHighYieldInterest);
      julyHighYieldPrinciple += julyHighYieldInterest;
      julyNewAverageBalance = julySavings.getUpdatedAverageBalance(julyNewAverageBalance, julyHighYieldInterest, 30);
      totalInterestPaid += julyHighYieldInterest;
      julySavings.getReport("July", julyNewAverageBalance, julyHighYieldInterest, totalInterestPaid, julyHighYieldPrinciple);

      //August savings balance
      augustHighYieldPrinciple = augustSavings.getHighYieldPrinciple(julyHighYieldPrinciple);
      augustNewAverageBalance = augustSavings.getAverageBalance(julyHighYieldPrinciple);
      augustHighYieldInterest = augustSavings.getHighYieldInterest(julyHighYieldPrinciple, augustNewAverageBalance, augustHighYieldInterest);
      augustHighYieldPrinciple += augustHighYieldInterest;
      augustNewAverageBalance = augustSavings.getUpdatedAverageBalance(augustNewAverageBalance, augustHighYieldInterest, 30);
      totalInterestPaid += augustHighYieldInterest;
      augustSavings.getReport("August", augustNewAverageBalance, augustHighYieldInterest, totalInterestPaid, augustHighYieldPrinciple);

      //September savings balance
      septemberHighYieldPrinciple = septemberSavings.getHighYieldPrinciple(augustHighYieldPrinciple);
      septemberNewAverageBalance = septemberSavings.getAverageBalance(augustHighYieldPrinciple);
      septemberHighYieldInterest = septemberSavings.getHighYieldInterest(augustHighYieldPrinciple, septemberNewAverageBalance, septemberHighYieldInterest);
      septemberHighYieldPrinciple += septemberHighYieldInterest;
      septemberNewAverageBalance = septemberSavings.getUpdatedAverageBalance(septemberNewAverageBalance, septemberHighYieldInterest, 30);
      totalInterestPaid += septemberHighYieldInterest;
      septemberSavings.getReport("September", septemberNewAverageBalance, septemberHighYieldInterest, totalInterestPaid, septemberHighYieldPrinciple);

      //October savings balance
      octoberHighYieldPrinciple = octoberSavings.getHighYieldPrinciple(septemberHighYieldPrinciple);
      octoberNewAverageBalance = octoberSavings.getAverageBalance(septemberHighYieldPrinciple);
      octoberHighYieldInterest = octoberSavings.getHighYieldInterest(septemberHighYieldPrinciple, octoberNewAverageBalance, octoberHighYieldInterest);
      octoberHighYieldPrinciple += octoberHighYieldInterest;
      octoberNewAverageBalance = octoberSavings.getUpdatedAverageBalance(octoberNewAverageBalance, octoberHighYieldInterest, 30);
      totalInterestPaid += octoberHighYieldInterest;
      octoberSavings.getReport("October", octoberNewAverageBalance, octoberHighYieldInterest, totalInterestPaid, octoberHighYieldPrinciple);

      //November savings balance
      novemberHighYieldPrinciple = novemberSavings.getHighYieldPrinciple(octoberHighYieldPrinciple);
      novemberNewAverageBalance = novemberSavings.getAverageBalance(octoberHighYieldPrinciple);
      novemberHighYieldInterest = novemberSavings.getHighYieldInterest(octoberHighYieldPrinciple, novemberNewAverageBalance, novemberHighYieldInterest);
      novemberHighYieldPrinciple += novemberHighYieldInterest;
      novemberNewAverageBalance = novemberSavings.getUpdatedAverageBalance(novemberNewAverageBalance, novemberHighYieldInterest, 30);
      totalInterestPaid += novemberHighYieldInterest;
      novemberSavings.getReport("November", novemberNewAverageBalance, novemberHighYieldInterest, totalInterestPaid, novemberHighYieldPrinciple);

      //highYieldPrinciple = februarySavings.getHighYieldPrinciple(days, daysInMonth, interestfinal, highYieldInterest, averageBalance, newAverageBalance, interest, newHighYieldPrinciple, updatedAverageBalance, totalInterestPaid);
      // februarySavingsBalance(days, daysInMonth, interestfinal, highYieldInterest, newHighYieldPrinciple, interest);
      // marchSavingsBalance(days, daysInMonth, interestfinal, highYieldInterest, newHighYieldPrinciple, interest);
      // aprilSavingsBalance(days, daysInMonth, interestfinal, highYieldInterest, newHighYieldPrinciple, interest);
      // maySavingsBalance(days, daysInMonth, interestfinal, highYieldInterest, newHighYieldPrinciple, interest);
      // juneSavingsBalance(days, daysInMonth, interestfinal, highYieldInterest, newHighYieldPrinciple, interest);
      // julySavingsBalance(days, daysInMonth, interestfinal, highYieldInterest, newHighYieldPrinciple, interest);
      // augustSavingsBalance(days, daysInMonth, interestfinal, highYieldInterest, newHighYieldPrinciple, interest);
      // septemberSavingsBalance(days, daysInMonth, interestfinal, highYieldInterest, newHighYieldPrinciple, interest);
      // octoberSavingsBalance(days, daysInMonth, interestfinal, highYieldInterest, newHighYieldPrinciple, interest);
      // novemberSavingsBalance(days, daysInMonth, interestfinal, highYieldInterest, newHighYieldPrinciple, interest);
      // decemberSavingsBalance(days, daysInMonth, interestfinal, highYieldInterest, newHighYieldPrinciple, interest);
    }
  }

  private void newPrinciple(double interest, double balance, double dailyInterest) {
    interest = balance * dailyInterest;
    principle += interest;
  }

  private double calculateDailyPrinciple(int daysOfMonth, double newHighYieldBalance, double highYieldBalance) {
    while (daysOfMonth > 1) {
      newHighYieldBalance += highYieldBalance;
      daysOfMonth--;
    }
    return newHighYieldBalance;
  }

  private void januarySavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple, double interest) {
    double monthInDays = 31;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    double interestRate = 0.0393;
    while (days <= 31) {
      if (days == 1) {
        daysInMonth = days;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
      }
      if (days == 5) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2655.75;
        days = 5;
        daysInMonth = 5;
      }
      if (days == 18) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2000.00;
        days = 18;
        daysInMonth = 18;
      }
      if (days == 19) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.44;
        days = 19;
        daysInMonth = 19;
      }
      if (days == 25) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple -= 100;
        days = 25;
        daysInMonth = 25;
      }
      if (days == 27) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 741.06;
        days = 27;
        daysInMonth = 27;
      }
      if (days == 31) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        newHighYieldPrinciple += highYieldPrinciple;
        days = 31;
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
    System.out.println("*********************January Balance*******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    System.out.println();
    days = 1;
  }

  private void februarySavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple, double interest) {
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

  private void marchSavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple, double interest) {
    double monthInDays = 31;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    double interestRate = 0.0393;
    while (days <= 31) {
      if (days == 1) {
        daysInMonth = days;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
      }
      if (days == 2) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 2;
        daysInMonth = 2;
      }
      if (days == 9) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2889.00;
        days = 9;
        daysInMonth = 9;
      }
      if (days == 16) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 16;
        daysInMonth = 16;
      }
      if (days == 30) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 30;
        daysInMonth = 30;
      }
      if (days == 31) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        newHighYieldPrinciple += highYieldPrinciple;
        days = 31;
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
    System.out.println("*********************March Balance*******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    System.out.println();
    days = 1;
  }

  private void aprilSavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple, double interest) {
    double monthInDays = 30;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    double interestRate = .0422;
    while (days <= 30) {
      if (days == 1) {
        daysInMonth = days;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
      }
      if (days == 13) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 13;
        daysInMonth = 13;
      }
      if (days == 27) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 27;
        daysInMonth = 27;
      }
      if (days == 30) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        newHighYieldPrinciple += highYieldPrinciple;
        days = 30;
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
    System.out.println("*********************April Balance*******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    System.out.println();
    days = 1;
  }

  private void maySavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple, double interest) {
    double monthInDays = 31;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    double interestRate = .0422;
    while (days <= 31) {
      if (days == 1) {
        daysInMonth = days;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
      }
      if (days == 11) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 11;
        daysInMonth = 11;
      }
      if (days == 25) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 25;
        daysInMonth = 25;
      }
      if (days == 31) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        newHighYieldPrinciple += highYieldPrinciple;
        days = 31;
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
    System.out.println("*********************May Balance*******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    System.out.println();
    days = 1;
  }

  private void juneSavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple, double interest) {
    double monthInDays = 30;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    double interestRate = .0422;
    while (days <= 30) {
      if (days == 1) {
        daysInMonth = days;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
      }
      if (days == 8) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 8;
        daysInMonth = 8;
      }
      if (days == 22) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 22;
        daysInMonth = 22;
      }
      if (days == 30) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        newHighYieldPrinciple += highYieldPrinciple;
        days = 30;
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
    System.out.println("*********************June Balance*******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    days = 1;
  }

  private void julySavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple, double interest) {
    double monthInDays = 31;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    double interestRate = .0422;
    while (days <= 31) {
      if (days == 1) {
        daysInMonth = days;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
      }
      if (days == 6) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 6;
        daysInMonth = 6;
      }
      if (days == 20) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 20;
        daysInMonth = 20;
      }
      if (days == 31) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        newHighYieldPrinciple += highYieldPrinciple;
        days = 31;
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
    System.out.println("*********************July Balance*******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    System.out.println();
    days = 1;
  }

  private void augustSavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple, double interest) {
    double monthInDays = 31;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    double interestRate = .0422;
    while (days <= 31) {
      if (days == 1) {
        daysInMonth = days;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
      }
      if (days == 3) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 3;
        daysInMonth = 3;
      }
      if (days == 17) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 17;
        daysInMonth = 17;
      }
      if (days == 31) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        newHighYieldPrinciple += highYieldPrinciple;
        days = 31;
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
    System.out.println("*********************August Balance*******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    System.out.println();
    days = 1;
  }

  private void septemberSavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple, double interest) {
    double monthInDays = 30;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    double interestRate = .0422;
    while (days <= 30) {
      if (days == 1) {
        daysInMonth = days;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
      }
      if (days == 14) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        days = 14;
        daysInMonth = 14;
      }
      if (days == 28) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        days = 28;
        daysInMonth = 28;
      }
      if (days == 30) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        newHighYieldPrinciple += highYieldPrinciple;
        days = 30;
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
    System.out.println("*********************September Balance*******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    System.out.println();
    days = 1;
  }

  private void octoberSavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple, double interest) {
    double monthInDays = 31;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    double interestRate = .0422;
    while (days <= 31) {
      if (days == 1) {
        daysInMonth = days;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
      }
      if (days == 12) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 12;
        daysInMonth = 12;
      }
      if (days == 26) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 26;
        daysInMonth = 26;
      }
      if (days == 31) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        newHighYieldPrinciple += highYieldPrinciple;
        days = 31;
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
    System.out.println("*********************October Balance*******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    System.out.println();
    days = 1;
  }

  private void novemberSavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple, double interest) {
    double monthInDays = 30;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    double interestRate = .0422;
    while (days <= 30) {
      if (days == 1) {
        daysInMonth = days;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
      }
      if (days == 9) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 9;
        daysInMonth = 9;
      }
      if (days == 23) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 23;
        daysInMonth = 23;
      }
      if (days == 30) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        newHighYieldPrinciple += highYieldPrinciple;
        days = 30;
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
    System.out.println("*********************November Balance*******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    System.out.println();
    days = 1;
  }

  private void decemberSavingsBalance(int days, int daysInMonth, double interestFinal, double highYieldInterest, double newHighYieldPrinciple, double interest) {
    double monthInDays = 31;
    double daysInYears = 365;
    double averageDays = monthInDays / daysInYears;
    double interestRate = .0422;
    while (days <= 31) {
      if (days == 1) {
        daysInMonth = days;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
      }
      if (days == 7) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.43;
        days = 7;
        daysInMonth = 7;
      }
      if (days == 23) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        highYieldPrinciple += 2392.45;
        days = 23;
        daysInMonth = 23;
      }
      if (days == 31) {
        days++;
        days -= daysInMonth;
        newHighYieldPrinciple = calculateDailyPrinciple(days, newHighYieldPrinciple, highYieldPrinciple);
        newHighYieldPrinciple += highYieldPrinciple;
        days = 31;
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
    System.out.println("*********************December Balance*******************************");
    System.out.println("Average Monthly Balance: " + decimalFormat.format(newAverageBalance));
    System.out.println("Interest Paid for the Month: " + decimalFormat.format(highYieldInterest));
    System.out.println("Total Interest Paid: " + decimalFormat.format(totalInterestPaid));
    System.out.println("Monthly Balance: " + decimalFormat.format(highYieldPrinciple));
    System.out.println();
    days = 1;
  }
}
