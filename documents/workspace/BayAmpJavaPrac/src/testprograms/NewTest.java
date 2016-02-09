package testprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.program.PrimeNumberOrNot;

public class NewTest {
  @Test
  public void f() {
	  PrimeNumberOrNot p = new PrimeNumberOrNot(23);
	  boolean actualOutput=p.checkPrime();
	  boolean expectedOutput=true;
	  Assert.assertEquals(actualOutput, expectedOutput);	  
  }
}
