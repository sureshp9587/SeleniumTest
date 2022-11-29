package seleniumtests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {
		 @Test
		 @Parameters({"A","B"})
		 public void add(int C, int D) {
			 int multiply = C*D;
			 System.out.println("Multiplication of two numbers : " +multiply);
		 }}

