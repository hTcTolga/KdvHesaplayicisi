import java.util.Scanner;
 public class KdvTutari{
    public static void main(String[] args) {
        // 0-1000 tl arası kdv 0.18, 1000 ve üzeri fiyatlarda 0.08 olarak kdv tutarını hesapla.

        Scanner input = new Scanner(System.in);
        double tutar, KdvOrani, KdvliFiyat, sonuc1;

        System.out.print("Tutar Giriniz:");
        tutar = input.nextDouble();

        KdvOrani = 1000 >= tutar ? 0.18 : 0.08;
        System.out.println("Kdv Oranı: " + KdvOrani);

        KdvliFiyat = (tutar * KdvOrani) + tutar;
        System.out.println("Kdvli fiyat:" + KdvliFiyat);

        sonuc1 = tutar * KdvOrani;
        System.out.println("Kdvli Tutarı: " + sonuc1);
    }
}

