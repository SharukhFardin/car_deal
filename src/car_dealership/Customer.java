package car_dealership;

public class Customer {
	
	private String CustName;
	private String address;
	private double cashOnHand;
	
	
	public String getName() {
		return CustName;
	}


	public void setName(String name, String CustName) {
		this.CustName = CustName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getCashOnHand() {
		return cashOnHand;
	}


	public void setCaseOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}


	public Customer(String name, String address, double caseOnHand) {
		super();
		this.CustName = name;
		this.address = address;
		this.cashOnHand = caseOnHand;
		System.out.println("Customer Created");
	}
	
	public void printCustomerInfo() {
		System.out.println("Name of the Customer is "+CustName);
		System.out.println("Address of the Customer is "+address);
	}


	public void purchaseCar(Vehicle Lamborgini, Employee sharukh, boolean b) {
		// TODO Auto-generated method stub
		sharukh.handleCustomer(this, b ,Lamborgini );
	}


	//public void purchasCar(Vehicle vehicle, Employee emp, boolean finance);
}
