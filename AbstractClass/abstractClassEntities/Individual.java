package abstractClassEntities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}


	public Individual(String name, Double anualIncome, Double healthSpending) {
		super(name, anualIncome);
		this.healthExpenditures = healthSpending;
	}


	public Double getHealthSpending() {
		return healthExpenditures;
	}


	public void setHealthSpending(Double healthSpending) {
		this.healthExpenditures = healthSpending;
	}


	@Override
	public Double taxAmount() {
		double tax = 0.0;
		
		if(getAnualIncome() < 20000) {
			
			tax += getAnualIncome()*0.15;
		}
		else {
			
			tax += getAnualIncome()*0.25;
			
		}
		
		if(healthExpenditures > 0) {
			tax -= healthExpenditures*0.5; 
		}
		
		return tax;
	}

	
	
}
