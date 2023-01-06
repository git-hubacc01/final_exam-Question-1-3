public abstract class  Customer { 
     protected String name;
     protected double amount;

	public Customer (String name, int amount) {
		this.name = name;
		this.amount = amount;
	}
    public abstract double calculateBill();
	
    public String getName() {
		return name;
    }
	public double getAmount() {
		return amount;
	}
 
	public void setName (String name) {
		this.name = name;
	}
	public void setAmount (double amount) {
        this.amount = amount;
	}
}

