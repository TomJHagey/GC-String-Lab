import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringCalcTest {

	@Test
	void testAdd0() {
		String number = "";
		StringCalc.add(number);

		String expected = "0";
		String actual = StringCalc.add(number);

		assertEquals(expected, actual);

	}

	@Test
	void testAdd7() {
		String number = "7";
		StringCalc.add(number);

		String expected = "7";
		String actual = StringCalc.add(number);

		assertEquals(expected, actual);

	}

	@Test
	void testAdd100() {
		String number = "100";
		StringCalc.add(number);

		String expected = "100";
		String actual = StringCalc.add(number);

		assertEquals(expected, actual);

	}

	@Test
	void testAdd2() {
		String number = "2";
		StringCalc.add(number);

		String expected = "2";
		String actual = StringCalc.add(number);

		assertEquals(expected, actual);

	}

	@Test
	void testAdd111() {
		String number = "111";
		StringCalc.add(number);

		String expected = "111";
		String actual = StringCalc.add(number);

		assertEquals(expected, actual);
	}

	@Test
	void testAdd123() {
		String number = "123";
		StringCalc.add(number);

		String expected = "123";
		String actual = StringCalc.add(number);

		assertEquals(expected, actual);
	}

	@Test
	void testAdd5() {
		String number = "5";
		StringCalc.add(number);

		String expected = "5";
		String actual = StringCalc.add(number);

		assertEquals(expected, actual);
	}

	@Test
	void testAdd9() {
		String number = "9";
		StringCalc.add(number);

		String expected = "9";
		String actual = StringCalc.add(number);

		assertEquals(expected, actual);
	}

	@Test
	void testAdd12345() {
		String number = "12345";
		StringCalc.add(number);

		String expected = "12345";
		String actual = StringCalc.add(number);

		assertEquals(expected, actual);
	}

	@Test
	void testAdd67() {
		String number = "67";
		StringCalc.add(number);

		String expected = "67";
		String actual = StringCalc.add(number);

		assertEquals(expected, actual);
	}

	@Test
	void testAdd99() {
		String number = "99";
		StringCalc.add(number);

		String expected = "99";
		String actual = StringCalc.add(number);

		assertEquals(expected, actual);
	}

	@Test
	void testAdd4() {
		String number = "4";
		StringCalc.add(number);

		String expected = "4";
		String actual = StringCalc.add(number);

		assertEquals(expected, actual);
	}
}