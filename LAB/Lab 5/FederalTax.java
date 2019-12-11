import java.text.*;
public class FederalTax{
	private double taxableIncome;
	private final double TAX_BRACKET_1 = 22100;//class constant for tax brackets
	private final double TAX_BRACKET_2 = 53500;
	private final double TAX_BRACKET_3 = 115000;
	private final double TAX_BRACKET_4 = 250000;
	private final double TAX_PERCENT_1 = 0.15;//class constants for percents
	private final double TAX_PERCENT_2 = 0.28;
	private final double TAX_PERCENT_3 = 0.31;
	private final double TAX_PERCENT_4 = 0.36;
	private final double TAX_PERCENT_5 = 0.396;
	private final double TAX_BASE_1 = 0;//class constant for base amount
	private final double TAX_BASE_2 = 3315;
	private final double TAX_BASE_3 = 12107;
	private final double TAX_BASE_4 = 31172;
	private final double TAX_BASE_5 = 79772;
	private final NumberFormat DOLLAR = NumberFormat.getCurrencyInstance();//dollar format
	public FederalTax(){//default constructor
		taxableIncome = 0;
	}
	public FederalTax(double income){//non default
		if (income >= 0){//verifies that taxable income is non negative otherwise assigns zero
			taxableIncome = income;
		}
		else{
			taxableIncome = 0;
		}
	}
	public double getTaxableIncome(){//accessor
		return taxableIncome;
	}
	public void changeTaxableIncome(double newIncome){
		if (newIncome >= 0){//verifies that taxable income is non negative otherwise assigns zero
			taxableIncome = newIncome;
		}
		else{
			taxableIncome = 0;
		}
	}
	public double taxPaid(){
		if (0 <= taxableIncome && taxableIncome <= TAX_BRACKET_1){//tax bracket 1
			return (TAX_BASE_1 + (taxableIncome * TAX_PERCENT_1));
		}
		else if(TAX_BRACKET_1 <= taxableIncome && taxableIncome <= TAX_BRACKET_2){//tax bracket 2
			return (TAX_BASE_2 + (taxableIncome * TAX_PERCENT_2));
		}
		else if(TAX_BRACKET_2 <= taxableIncome && taxableIncome <= TAX_BRACKET_3){//bracket 3
			return (TAX_BASE_3 + (taxableIncome * TAX_PERCENT_3));
		}
		else if(TAX_BRACKET_3 <= taxableIncome && taxableIncome <= TAX_BRACKET_4){//bracket 4
			return (TAX_BASE_4 + (taxableIncome * TAX_PERCENT_4));
		}
		else if(taxableIncome > TAX_BRACKET_4){//bracket 5
			return (TAX_BASE_5 + (taxableIncome * TAX_PERCENT_5));
		}
		else{
			return 0;
		}
	}
	public String toString(){
		return ("Taxable Income:" + DOLLAR.format(taxableIncome) + " Tax Paid:" + DOLLAR.format(taxPaid()));//outputs the tax paid in dollar format
	}
}