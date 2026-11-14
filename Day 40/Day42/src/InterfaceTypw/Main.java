package InterfaceTypw;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address= new Address("1st main","Second main","Banglore");
		Employee emp = new Employee("Akash","Kod123",address);
		Employee emp1 =(Employee)emp.clone();
        System.out.println(emp1.empCode);
	}

}
