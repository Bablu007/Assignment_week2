import java.util.HashMap;
import java.util.Map;

public class Employee {
private String name;
private int id;
private int salary;
private Address address;
Map<String,Citizen>map=new HashMap<String,Citizen>();
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}



public Map<String, Citizen> getMap() {
	return map;
}
public void setMap(Map<String, Citizen> map) {
	this.map = map;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + ", map=" + map
			+ "]";
}


}
