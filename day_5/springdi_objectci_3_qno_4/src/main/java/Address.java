public class Address {  
private String city;  
private String state;  
private String country;  

  
public Address(String city, String state, String country) {  
    super();  
    this.city = city;  
    this.state = state;  
    this.country = country; 
    
    System.out.println("Address(String city, String state, String country) invoked");
}  
  
public String toString(){  
    return "\nAddress contents:\n"+city+" "+state+" "+country;  
}  
}
