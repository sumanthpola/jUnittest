package junittestpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testaddstr {

	@Test
	public void test() {
		junittest j =new junittest();
		String result=j.addstr("abcd","efgh");
		assertEquals("abcdefgh",result);
	}

}
