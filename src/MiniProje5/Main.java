package MiniProje5;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varM� = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				System.out.println("Say� mevcuttur");
				varM� = true;
				break;
			}
		}
		if(varM�) {
			System.out.println("Say� mevcuttur.");
		}else {
			System.out.println("Say� mevcut de�ildir.");
		}

	}

}
