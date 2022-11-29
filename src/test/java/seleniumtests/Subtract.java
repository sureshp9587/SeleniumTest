package seleniumtests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Subtract {
	
		 @Test
		 @Parameters({"A","B"})
		 public void add(int C, int D) {
			 int subtract = C-D;
			 System.out.println("Subtraction of two numbers : " +subtract);
		 }}
	

