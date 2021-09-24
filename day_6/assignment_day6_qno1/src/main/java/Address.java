
public class Address {
private String state;
private int pinNo;
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPinNo() {
	return pinNo;
}
public void setPinNo(int pinNo) {
	this.pinNo = pinNo;
}
@Override
public String toString() {
	return "Address [state=" + state + ", pinNo=" + pinNo + "]";
}

}
