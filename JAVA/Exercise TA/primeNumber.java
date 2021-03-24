public class primeNumber {
    public static void main(String[] args) {


        for (int a = 1; a < 501; a++ )
            if (primeChecker(a)) {
                System.out.println(a + " is a prime number.");
            } else {
                System.out.println(a + " is NOT a prime number.");
            }
    }

    public static boolean primeChecker(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
