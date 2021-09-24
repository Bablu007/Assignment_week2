package com.eg2;

import org.springframework.stereotype.Component;

@Component
public class Cart {
private int value;
private String productName;
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}

}
