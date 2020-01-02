package com.DankseIt.Example;

public class Car {
public String name;
public int perDayCost;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPerDayCost() {
	return perDayCost;
}
public void setPerDayCost(int perDayCost) {
	this.perDayCost = perDayCost;
}
@Override
public String toString() {
	return "Car [name=" + name + ", perDayCost=" + perDayCost + "]";
}

}
