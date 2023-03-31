package com.java11.practice;

import java.util.List;

//Collections : of(), immutable,intrinsic and native
public class Feature2 extends Object{

	List<String> list = List.of("foo", "bar", "baz");

	Object[] strings1 = list.toArray();//? data type is string?

	String[] strings2a = list.toArray(new String[list.size()]);
	String[] strings2b = list.toArray(new String[0]);
	//create a list of numbers/integers 
	//convert it to Array
	//fetch the last element of the array
	
}
