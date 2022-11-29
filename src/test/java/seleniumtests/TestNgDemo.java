package seleniumtests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo {

@BeforeSuite
	public void method1() {
		
		System.out.println("Before suite");
	}
@BeforeTest	
public void method2() {
		
		System.out.println("Before Test");
	}
@Test
public void method3() {
	
	System.out.println("Test Case1");
}
@Test
public void method4() {
	
	System.out.println("Test Case2");
}
@AfterTest
public void method5() {
	
	System.out.println("After Test");
}
@AfterSuite
public void method6() {
	
	System.out.println("After suite");
}
	
}
