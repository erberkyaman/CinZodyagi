import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        int year;
        String zodiac="";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Girin: ");
        year=input.nextInt();

        switch (year%12){
            case 0:
                zodiac="Maymun";
                break;
            case 1:
                zodiac="Horoz";
                break;
            case 2:
                zodiac="Köpek";
                break;
            case 3:
                zodiac="Domuz";
                break;
            case 4:
                zodiac="Fare";
                break;
            case 5:
                zodiac="Öküz";
                break;
            case 6:
                zodiac="Kaplan";
                break;
            case 7:
                zodiac="Tavşan";
                break;
            case 8:
                zodiac="Ejderha";
                break;
            case 9:
                zodiac="Yılan";
                break;
            case 10:
                zodiac="At";
                break;
            case 11:
                zodiac="Koyun";
                break;
        }
        System.out.print("Çin Zodyağı Burcunuz: "+ zodiac);
    }
}
