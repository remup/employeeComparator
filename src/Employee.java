public class Employee {
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String name;
	public int age;
	public String address;
	public Employee(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if(other.name.equals(this.name)) {
			return true;
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
