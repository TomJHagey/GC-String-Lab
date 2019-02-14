
public class StringCalc {

	public static String add(String number) {
		String sumOfNumbers = "";
		
		int i = Integer.parseInt("0" + number);
		sumOfNumbers = Integer.toString(i);
		
		return sumOfNumbers;
	}
}


