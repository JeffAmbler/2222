import static org.junit.Assert.*;

import org.junit.Test;

public class TestLargest {

	private Largest temp1;
	@Test
	public void test() {
	testPositive();
	testNegative();
	testMixes();
	}
	public void testPositive(){
	        int[] arr = new int[5];
	        arr[0] = 8;
	        arr[1] = 9;
	        arr[2] = 7;
	        arr[3] = 10;
	        arr[4] = 2;
	        Largest temp1 = new Largest();
	        int maxValue = temp1.largest(arr);
	        assertTrue("10 is the max value", 10==maxValue);
	        assertFalse("2 is false", 2==maxValue);
	        
	}
	        
	       
	/** add tests to check for this unit test **/    
	
		public void testNegative(){
			int[] arr = new int[5];
			 arr[0] = -8;
			 arr[1] = -9;
			 arr[2] = -7;
			 arr[3] = -10;
			 arr[4] = -2;
			 Largest temp1 = new Largest();
			 int maxValue = temp1.largest(arr);
			 assertTrue("-2 is the max value", -2==maxValue);
			assertFalse("-10 is false", -10==maxValue);
			 }
	  
	    
	public void testMixes(){
			 int[] arr = new int[5];
			 arr[0] = -8;
			 arr[1] = 9;
			 arr[2] = -7;
			 arr[3] = -10;
			 arr[4] = 0;
			 Largest temp1 = new Largest();
			 int maxValue = temp1.largest(arr);
			 assertTrue("9 is the max value", 9==maxValue);
			 assertFalse("-10 is false", -10==maxValue);
			 }
}





