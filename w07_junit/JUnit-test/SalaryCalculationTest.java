import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SalaryCalculationTest {
   @Test
	
   public void testWorkerNetSalary() {
      SalaryCalculation calc = new SalaryCalculation();
      calc.setCompanyExpenses(1500.00);
      assertEquals(772.16, calc.getWorkerNetSalary(), 0.01);
   }
  @Test
   public void bruttoSalaryTest() {
     SalaryCalculation calc = new SalaryCalculation();
     calc.setCompanyExpenses(1500.00);
     assertEquals(965.20, calc.getWorkerBrutoSalary(), 0.01);
   }
}