package com.example.demo.model;



public class products  implements java.io.Serializable{

	private Integer productID;
	private String productName;
	public products(Integer productID, String productName) {
		this.productID = productID;
		this.productName = productName;
	}
	public products() {
	}
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "products [productID=" + productID + ", productName=" + productName + "]";
	}
	
}
