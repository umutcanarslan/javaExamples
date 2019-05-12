package Games;

import java.util.Random;
import java.util.Scanner;

public class rpsGameTR {
	
	public static int robot;
	public static int rps;
	public static int win;
	public static int defeat;
	public static int draw;
	public static int newgame;

	static void checkIt() {
		if (rps == 1 && robot == 1)	{
			System.out.println("Rakibiniz de TAŞ gösterdi. Malesef Berabere Kaldınız.");
			draw++;
		} else if (rps == 1 && robot == 2) {
			System.out.println("Rakibiniz KAĞIT gösterdi. YENİLDİNİZ !");
			defeat++;
		} else if (rps == 1 && robot == 3) {
			System.out.println("Rakibiniz MAKAS gösterdi. TEBRİKLER KAZANDINIZ !");
			win++;
		} else if (rps == 2 && robot == 1) {
			System.out.println("Rakibiniz TAŞ gösterdi. TEBRİKLER KAZANDINIZ !");
			win++;
		} else if (rps == 2 && robot == 2) {
			System.out.println("Rakibiniz de KAĞIT gösterdi. Malesef Berabere Kaldınız.");
			draw++;
		} else if (rps == 2 && robot == 3) {
			System.out.println("Rakibiniz MAKAS gösterdi. YENİLDİNİZ !");
			defeat++;
		} else if (rps == 3 && robot == 1) {
			System.out.println("Rakibiniz TAŞ gösterdi. YENİLDİNİZ !");
			defeat++;
		} else if (rps == 3 && robot == 2) {
			System.out.println("Rakibiniz KAĞIT gösterdi. TEBRİKLER KAZANDINIZ !");
			win++;
		} else {
			System.out.println("Rakibiniz de MAKAS gösterdi. Malesef Berabere Kaldınız.");
			draw++;
		}
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int round;
		int choise;

		System.out.println("Lutfen Isminizi Giriniz = ");
		String name = input.nextLine();
		System.out.println("Taş - Kağıt - Makas Oyununa Hoşgeldin " + name + " :)");

		while(true)	{
			System.out.println("Oyunu Kaç El Oynamak İstersin ?");
			round = input.nextInt();
		
			win = 0;
			draw = 0;
			defeat = 0;

			for (int x = 0; x < round; x++)	{
				robot = random.nextInt(3) + 1; // taş(1), kağıt(2), makas(3)
				System.out.println("Seçimini Yap, TAŞ[1] KAĞIT[2] MAKAS[3]");
				rps = input.nextInt();

				if (rps == 1) {
					System.out.println("Seçimin = TAŞ");
				} else if (rps == 2) {
					System.out.println("Seçimin = KAĞIT");
				} else if	(rps == 3) {
					System.out.println("Seçimin = MAKAS");
				} else {
					System.out.println("Hatalı Seçim Yaptınız !");
					round++;
				}
				checkIt();
				System.out.println();
			}
			System.out.println("GALİBİYET = " + win + " " + "BERABERLİK = " + draw + " " + "YENİLGİ = " + defeat);
			System.out.println();
			System.out.println("Tekrar oynamak istermisiniz? EVET[1] HAYIR[2]");
			newgame = input.nextInt();

			if (newgame == 1) {
				
			} else if (newgame == 2) {
				System.out.println("İYİ GÜNLER " + name + " :)");
				break;
			} else {
				System.out.println("Hatalı seçimde bulundunuz. İyi günler.");
				break;
			}
		}
	}
}