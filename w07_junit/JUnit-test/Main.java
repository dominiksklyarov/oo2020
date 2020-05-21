public class Main {
  public static void main(String[] args) {

    SalaryCalculation calc = new SalaryCalculation();
    calc.setCompanyExpenses(1500.00);
    System.out.println(calc.getWorkerNetSalary());
    System.out.println(calc.getWorkerBrutoSalary());
    TestRunner tr = new TestRunner();
    tr.main();
  }
}