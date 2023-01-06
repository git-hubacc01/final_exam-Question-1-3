public class RegularCustomer extends Customer{

	private String Buy;
	private double amount;

    RegularCustomer (String name, int amount, String Buy) {

		super(name, amount);
		this.Buy= Buy;
    }
	public double calculateBill()
	{
		amount = 2000;
		return amount;
	}
	public String getBuy() {
		return Buy;
	}

	public void setBuy (String Buy) { 
	    this.Buy= Buy;
	}
}

	
