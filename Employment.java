public class Employment {
	double employmentIncome = 0;
	double salary = 0;
	double commission = 0;
	double bonus = 0;
	double benefitTotalAmt = 0;
	int benefits = 0;
	double expenseTotalAmt = 0;
	int expenses = 0;

	public void AddSal(double salary)	{
		this.salary = salary;
		this.employmentIncome += salary;
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
		this.benefitTotalAmt += taxableAmt;
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
