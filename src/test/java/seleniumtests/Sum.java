package seleniumtests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Sum{
@Test
@Parameters({"A","B"})
	public  void add(int C, int D) {
		
		int sum = C+D;
		System.out.println("Sum of two numbers : " +sum);
	} }
 

	
