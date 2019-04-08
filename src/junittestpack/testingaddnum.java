package junittestpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testingaddnum {

	@Test
	public void test() {
		junittest j =new junittest();
		int result=j.addnumber(10,20);
		assertEquals(30,result);
	}

}
