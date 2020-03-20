public class PrimeNumber {
    public static void main(String[] args) {
        int range = 100;
        boolean isPrime = true;
        int number = 2;
        while (number < 100) {
            for (int index = 2; index <= Math.sqrt(number); index++) {
                if (number % index == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
            number++;
            isPrime = true;
        }
    }
}
