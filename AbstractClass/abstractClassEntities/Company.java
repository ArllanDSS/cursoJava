package abstractClassEntities;

public class Company extends TaxPayer{

	private Integer numberOfEmployees;
	
	
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployee) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployee;
	}


	public Integer numberOfEmployee() {
		return numberOfEmployees;
	}

	public void setEmployeeQuantity(Integer numberOfEmployee) {
		this.numberOfEmployees = numberOfEmployee;
	}

	@Override
	public Double taxAmount() {
		
		double tax = 0.0;
		
		if(numberOfEmployees > 10) {
			tax += getAnualIncome()*0.14; 
		}
		else {
			tax += getAnualIncome()*0.16; 
		}
		
		return tax;
	}

}
