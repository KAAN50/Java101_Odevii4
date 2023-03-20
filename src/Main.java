import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double boy;
        double kilo;

        Scanner boyGir = new Scanner(System.in);
        System.out.println("Boy Gir (metre cinsinden): ");
        boy = boyGir.nextDouble();

        Scanner kiloGir = new Scanner(System.in);
        System.out.println("Kilo Gir: ");
        kilo = kiloGir.nextDouble();

        double indeks = kilo / ( boy * boy);
        System.out.println("Kitle Indeksi: "+indeks);
    }
}