package testprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.program.FactorialApi;

public class TestFactorial {
  @Test
  public void testFactorail() {
	  int expectedOutput=720;
	  FactorialApi f=new FactorialApi(6);
	  
	  int actualOutput=f.factorail();
	  Assert.assertEquals(actualOutput, expectedOutput);
  }
}
