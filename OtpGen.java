import java.util.Random;

public class OtpGen {
  public static void main(String[] args) {
    int length = 4;
    System.out.println(generateOTP(length));
  }

  public static String generateOTP(int len) {
    String numbers = "0123456789";
    StringBuilder otp = new StringBuilder();
    Random rndm_method = new Random();
    for (int i = 0; i < len; i++) {
      otp.append(numbers.charAt(rndm_method.nextInt(numbers.length())));
    }
    return otp.toString();
  }
}