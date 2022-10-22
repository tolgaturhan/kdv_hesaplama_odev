import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tutar,toplam,kdv,kdvOran = 0.18,kdvOran2 = 0.08;

        System.out.print("Lütfen Tutarı Giriniz: ");
        tutar = scan.nextDouble();

        if (tutar < 1000) {
            kdv = tutar * kdvOran;
            kdvOran = 18;
        }
            else{
                kdv = tutar * kdvOran2;
                kdvOran = 8;
            }

        toplam = tutar + kdv;
        System.out.println("Kdv Hariç Fiyat: " + tutar + " TL");
        System.out.println("Kdv Oranı: %" + kdvOran);
        System.out.println("Kdv Tutarı: " + kdv + " TL");
        System.out.println("Kdv Dahil Fiyat: " + toplam + " TL");
    }
}
