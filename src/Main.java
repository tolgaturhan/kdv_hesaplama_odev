import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tutar,toplam,kdv,kdvOran = 0.18,kdvOran2 = 0.08;

        System.out.print("Lütfen Tutarı Giriniz: ");
        tutar = scan.nextDouble();

        if (tutar < 1000) {
            kdv = tutar * kdvOran;
        }
            else{
                kdv = tutar * kdvOran2;
            }

        toplam = tutar + kdv;
        System.out.println("Kdv Hariç Fiyat: " + tutar);
        System.out.println("Kdv Tutarı: " + kdv);
        System.out.println("Kdv Dahil Fiyat: " + toplam);
    }
}
