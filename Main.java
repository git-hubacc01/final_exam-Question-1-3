public class Main {

	public static void main(String[] args) {

		Customer customer;

		RegularCustomer regularcustomer = new RegularCustomer("Toni", 10, "Phone");
        customer = regularcustomer;
		System.out.println(customer.calculateBill()+" "+" is the total of " + customer.getName());

		SeniorCustomer seniorcustomer = new SeniorCustomer("Chuwii", 5, "Dress");
	    customer = seniorcustomer;
		System.out.println(customer.calculateBill()+" "+" is the total bill of " + customer.getName());
	}
}
