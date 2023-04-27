
import savings.AprilSavings;
import savings.AugustSavings;
import savings.DailyCompoundInterest;
import savings.DecemberSavings;
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

  public CompoundInterest() {
    principle = 5000;
    payment = 100;
  }

  public void calculateDailyCompoundInterest() {
    final DailyCompoundInterest dailyCompoundInterest = new DailyCompoundInterest();
    dailyCompoundInterest.dailyCompoundInterestCalculation(principle, payment);
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
    DecemberSavings decemberSavings = new DecemberSavings();

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

    double decemberHighYieldInterest = 0.0;
    double decemberNewAverageBalance = 0.0;
    double decemberHighYieldPrinciple = 0.0;
    double totalInterestPaid = 0.0;
    double beginningOfTheYearBalance = 13804.13;
 
    for (int i = 1; i <= 1; i++) {
      int year = 2022 + i;
      System.out.println("Year " + year);
      //January savings balance
      januaryHighYieldPrinciple = januarySavings.getHighYieldPrinciple(beginningOfTheYearBalance);
      januaryNewAverageBalance = januarySavings.getAverageBalance(beginningOfTheYearBalance);
      januaryHighYieldInterest = januarySavings.getHighYieldInterest(beginningOfTheYearBalance, januaryNewAverageBalance, januaryHighYieldInterest);
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

      //December savings balance
      decemberHighYieldPrinciple = decemberSavings.getHighYieldPrinciple(novemberHighYieldPrinciple);
      decemberNewAverageBalance = decemberSavings.getAverageBalance(novemberHighYieldPrinciple);
      decemberHighYieldInterest = decemberSavings.getHighYieldInterest(novemberHighYieldPrinciple, decemberNewAverageBalance, decemberHighYieldInterest);
      decemberHighYieldPrinciple += decemberHighYieldInterest;
      decemberNewAverageBalance = decemberSavings.getUpdatedAverageBalance(decemberNewAverageBalance, decemberHighYieldInterest, 30);
      totalInterestPaid += decemberHighYieldInterest;
      decemberSavings.getReport("December", decemberNewAverageBalance, decemberHighYieldInterest, totalInterestPaid, decemberHighYieldPrinciple);

      beginningOfTheYearBalance = decemberHighYieldPrinciple;
    }
  }
}
