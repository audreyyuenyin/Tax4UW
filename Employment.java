public class Employment {
	double employmentIncome;
	double salary;
	double commission;
	double bonus;
	double benefitTotalAmt;
	int benefits;
	double expenseTotalAmt;
	int expenses;

	public void AddSalary(double salary)	{
		this.salary = salary;
		this.employmentIncome += salary;
		System.out.println("Your employment income is currently $" + employmentIncome);
	}

	public void AddCom(double commission)	{
		this.commission = commission;
		this.employmentIncome += commission;
		System.out.println("Your employment income is currently $" + employmentIncome);
	}

	public void AddBonus(double bonus)	{
		this.bonus = bonus;
		this.employmentIncome += bonus;
		System.out.println("Your employment income is currently $" + employmentIncome);
	}

	public void Benefits(double taxableAmt)	{
		this.benefitTotalAmt += this.taxableAmt;
		this.benefits++; 
		this.employmentIncome += taxableAmt;
		System.out.println("Your employment income is currently $" + employmentIncome);	
	}

	public void Expenses(double deductAmt)	{
		this.expenseTotalAmt += deductAmt;
		this.expenses++;
		this.employmentIncome += deductAmt;
		System.out.println("Your employment income is currently $" + employmentIncome);
	}

	public void SumEmployment()	{
		System.out.println("Your employment income for tax purposes is $" + employmentIncome + ".");
		System.out.println("It includes " + this.benefits + " employment benefits valued at $" + this.benefitTotalAmt + ".");
		System.out.println("It also includes " + this.expenses + " employment-related expenses valued at $" + this.expenseTotalAmt + ".");
	}
}