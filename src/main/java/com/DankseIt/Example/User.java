package com.DankseIt.Example;

public class User {
Car car;

public Car getCar() {
	return car;
}

public void setCar(Car car) {
	this.car = car;
}

@Override
public String toString() {
	return "User [car=" + car + "]";
}

}
