import java.lang.Math; 
class SalaryCalculation {

  double incomeTax, companyExpenses, socialTax, pensionTax, unemploymentTax;

  public SalaryCalculation()
  {
    incomeTax = 0.20;
    socialTax = 0.33;
    pensionTax = 0.02;
    unemploymentTax = 0.02;
  }

  public void setCompanyExpenses(double sum)
  {
    this.companyExpenses = sum;
  }

  public double getWorkerBrutoSalary()
  {
    return Math.round(companyExpenses * (1-socialTax) * (1-pensionTax) * (1-unemploymentTax)* 100.0) / 100.0;
  }

  public double getWorkerNetSalary()
  {
    return Math.round(this.getWorkerBrutoSalary() * (1-incomeTax)* 100.0) / 100.0;
  }

}