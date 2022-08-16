package Ass_4;

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
	private Address officialAddress;
	Customer(){
		
	}
	Customer(String customerName, Address residentialAddress,Address officialAddress){
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
	}
	
	public Address getOfficialAddress() {
		return officialAddress;
	}
	public void setOfficialAddress(String addressLine,String city) {
		Address address = new Address(addressLine, city);
		this.officialAddress = address;
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
				+ "Residential Address : "+getresidentialAddress().getAddressDetails()+"\r\n"
				+ "Official Address : "+getOfficialAddress().getAddressDetails();
		return re;
	}
	
}

public class TestCustomer {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setcustomerName("Nagesh");
		customer.setresidentialAddress("Baradawan","Raigarh");
		customer.setOfficialAddress("Baradawan2","Raigarh2");
		System.out.println(customer.getCustomerDetails());
		
		Address address = new Address("Mumbai","Maharastra");
		Address address2 = new Address("Mumbai2","Maharastra2");
		Customer customer2 = new Customer("Nagesh2",address,address2);
		System.out.println(customer2.getCustomerDetails());

	}

}

