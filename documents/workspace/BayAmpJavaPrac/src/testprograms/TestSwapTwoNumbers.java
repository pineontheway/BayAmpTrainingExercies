package testprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.program.SwappingTwoNumbers;

public class TestSwapTwoNumbers {
  @Test
  public void f() {
	  String expectedoutput="3 2";
	  SwappingTwoNumbers s= new SwappingTwoNumbers();
	  String ActualOutput=s.swapNumbers(2,3);
	  Assert.assertEquals(expectedoutput, ActualOutput);
	  
  }
}
