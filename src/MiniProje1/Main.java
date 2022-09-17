package MiniProje1;

public class Main {

	public static void main(String[] args) {
		// bug
		int number = 2;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		if (number < 1) {
			System.out.println("Geçersiz sayý ! ");
		}
		if (number == 1) {
			System.out.println("Sayý asal deðildir ! ");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayý asaldýr. ");
		} else {
			System.out.println("Sayý asal deðildir. ");
		}

	}

}
