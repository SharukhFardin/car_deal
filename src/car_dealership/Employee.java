package car_dealership;

public class Employee {
	String Ename;
	String employeeID;
	
	
	public Employee(String ename, String employeeID) {
		super();
		Ename = ename;
		this.employeeID = employeeID;
	}


	public String getEname() {
		return Ename;
	}


	public void setEname(String ename) {
		Ename = ename;
	}

	
	public String getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	void handleCustomer(Customer cust,boolean finance, Vehicle vehicle) {
		if(finance==true) {
			double loanAmount = vehicle.getVprice() - cust.getCashOnHand();
			runCreditHistory(cust,loanAmount);
		}
		else if(vehicle.getVprice() <= cust.getCashOnHand()) {
			processTransaction(cust,vehicle);
		}
		else {
			System.out.println("Customer needs more money to purchase "+vehicle);
		}
	}
	
	public void runCreditHistory(Customer cust, double loanamount) {
		System.out.println("Ran credit history for customer...");
		System.out.println("Customer has been approved to purchase the vehicle.");
	}
	
	public void processTransaction(Customer cust,Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle : "+vehicle+"for the price "+vehicle.getVprice());
	}
}
