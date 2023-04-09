import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		dosyaİslemleri dosya = new dosyaİslemleri();
		String dosyam= "C:\\Users\\remle\\OneDrive\\Masaüstü\\Kullanıcılar.txt";
		dosya.dosyaOku(dosyam);
		dosya.dosyaYaz(dosyam, "# Elite Uyeler #"+'\n'+'\n'+"# Genel Uyeler #");
		System.out.println("1- Elite Uye ekleme\n2- Genel Uye ekleme\n3- Mail gonderme");
		Scanner scanner = new Scanner(System.in);
		int secenek = scanner.nextInt();
		if (secenek == 1) {
			dosya.dosyaOku(dosyam);
			dosya.dosyaYaz(dosyam, "\nSerpil"+'\t'+"Üstebay"+'\t'+"deneme@deneme.com\n");
		}
		if (secenek == 2) {
			dosya.dosyaOku(dosyam);
			dosya.dosyaYaz(dosyam, "\nSerpil"+'\t'+"Üstebay"+'\t'+"deneme@deneme.com\n");
		}
		if (secenek == 3) {
			
		}
		else {
			System.out.println("Yanlis bir ifade kullandiniz !");
			}
	}
}
