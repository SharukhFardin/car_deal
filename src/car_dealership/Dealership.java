package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Employee sharukh = new Employee("Sharukh", "007");
		Vehicle vehicle = new Vehicle("Lamborgini", "Black", 13000);
		
		Customer cust= new Customer("Tom","America",12000.00);
		
		cust.printCustomerInfo();
		
		cust.purchaseCar(vehicle,sharukh,false);
		
		//cust.toString();
		

		
		//cust1.purchaseCar(vehicle,emp,false);

	}

}
