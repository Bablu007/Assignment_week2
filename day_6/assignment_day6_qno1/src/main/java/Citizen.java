
public class Citizen {
private String name;
private String contactNumber;
private String emailId;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
@Override
public String toString() {
	return "Citizen [name=" + name + ", contactNumber=" + contactNumber + ", emailId=" + emailId + "]";
}

}
