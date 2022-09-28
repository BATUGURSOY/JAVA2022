package ParametreliMethodlarıAnlamak;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		mesaj.substring(0, 2);// 0 dan 2 ye kadar yazdir.
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15, 7);
		System.out.println(sayi);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");

	}

	public static int topla(int sayi1, int sayi2) {// int ve string dereturn eklemen lazım.
		return sayi1 + sayi2;

	}

	public static String sehirVer() {//
		return "Ankara";
	}
}
