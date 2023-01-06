public class SeniorCustomer extends Customer{

	private String Sale;
	private double discount;

	public SeniorCustomer (String name, int amount, String Sale) {

		super(name, amount);
		this.Sale = Sale;
    }
	public double calculateBill()
	{
		discount = 2000*0.20;
		return (discount);
	}
	public String getSale() {
		return Sale;
	}

	public void setSale (String Sale) { 
	    this.Sale = Sale;
	}
}

	
