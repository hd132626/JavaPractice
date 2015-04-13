/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	_ CarTest
 * 
 * About :클래스 
 * Date : 2015.04.13
 * </pre>
 * @author : 정성민
 * @versiont : 1.0
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;

public String getCompany() {
	return company;
}

public String getModel() {
	return model;
}

public String getColor() {
	return color;
}

public int getMaxSpeed() {
	return maxSpeed;
}

public int getPrice() {
	return price;
}

public void setCompany(String newCompany) {
	company=newCompany;
}

public void setModel(String newModel) {
	model=newModel;
}

public void setColor(String newColor) {
	color=newColor;
}

public void setMaxSpeed(int newmaxSpeed) {
	maxSpeed=newmaxSpeed;
}

public void setPrice(int newPrice) {
	price=newPrice;
}

}