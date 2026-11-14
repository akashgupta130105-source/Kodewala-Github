package InterfaceTypw;

public class Employee implements Cloneable{
	String name;
	String empCode;
	Address address;
	public Employee(String name, String empCode, Address address2) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address2;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
