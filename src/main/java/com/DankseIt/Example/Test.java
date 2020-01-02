package com.DankseIt.Example;

import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Test {
public static void main(String[] args) {
	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

	User user = (User) context.getBean("user");
	System.out.println(user.getCar().toString());
	context.close();
}
}
