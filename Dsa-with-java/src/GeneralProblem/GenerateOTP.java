package GeneralProblem;

public class GenerateOTP {

	public static int generateOTP() {

		int randomPin = (int) (Math.random() * 9000) + 1000;
//		String otp = String.valueOf(randomPin);
		return randomPin;
	}

	public static void main(String args[]) {
		int otpSting = generateOTP();
		System.out.println("OTP : " + otpSting);
	}
}
