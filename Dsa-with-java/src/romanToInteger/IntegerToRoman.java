package romanToInteger;

public class IntegerToRoman {

	public static void main(String[] args) {

		int n = 125;

		intToRom(n);
	}

	private static void intToRom(int n) {
		int x=n;
		int[] num = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romValue = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder rom = new StringBuilder();
		for (int i = 0; i < num.length; i++) {
			while (n >= num[i]) {
				n = n - num[i];
				rom.append(romValue[i]);
			}
		}
		
		System.out.println("Integer "+x+" = "+rom.toString());
	}

}
