package seleniumtests;

import org.testng.annotations.Test;

public class GroupsinGroups {

	  
	 @Test(groups= {"Smoke"})  
	 public void test1()  
	 {  
	     System.out.println("test1");  
	 }  
	 @Test(groups= {"Regression"})  
	 public void test2()  
	 {  
	     System.out.println("test2");  
	 }  
	 @Test  
	 public void test3()  
	 {  
	     System.out.println("test3");  
	 }} 
