package Ass_1;


class Address{
	private String addressLine;
	private String city;
	
	Address(String addressLine, String city){
		this.addressLine = addressLine;
		this.city = city;
	}
	void setaddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	void setcity(String city) {
		this.city = city;
	}
	String getaddressLine() {
		return this.addressLine;
	}
	String getcity() {
		return this.city;
	}
	String getAddressDetails() {
		return getaddressLine() +", "+ getcity();
	}
}

class Customer{
	private String customerName;
	private Address residentialAddress;
	Customer(){
		
	}
	Customer(String customerName, Address residentialAddress){
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	
	void setcustomerName(String customerName) {
		this.customerName = customerName;
	}
	void setresidentialAddress(String addressLine,String city) {
		Address address = new Address(addressLine, city);
		this.residentialAddress = address;
		
	}
	
	String getcustomerName() {
		return this.customerName;
	}
	Address getresidentialAddress() {
		return this.residentialAddress;
	}
	String getCustomerDetails() {
		String re = "Customer : "+getcustomerName()+"\r\n"
				+ "Residential Address : "+getresidentialAddress().getAddressDetails();
		return re;
	}
	
}

public class TestCustomer {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setcustomerName("Nagesh");
		customer.setresidentialAddress("Baramkela","Raigarh");
		System.out.println(customer.getCustomerDetails());
		
		Address address = new Address("Mumbai","Maharastra");
		Customer customer2 = new Customer("Nagesh2",address);
		System.out.println(customer2.getCustomerDetails());

	}

}
