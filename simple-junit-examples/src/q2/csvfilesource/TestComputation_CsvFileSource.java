package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {

   // TODO: Write your answer to complete this test case
   @ParameterizedTest
   @CsvFileSource(resources = "computation_dataset.csv")
   public void testGetDiscount(int input1, int input2, int expectedResult) throws Exception {

	  Computation com = new Computation();
      int result = com.getDiscount(input1, input2);
      Assert.assertEquals(expectedResult, result);
      
   }
}
