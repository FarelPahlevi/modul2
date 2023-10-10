import java.util.Scanner;

public class titikBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        titik t1 = new titik();
        titik t2 = new titik();
        int pilihan = -1;
        while (pilihan != 0) {
            System.out.println("MENU OPERASI TITIK");
            System.out.println("1. INISIALISASI TITIK");
            System.out.println("2. TAMPIL TITIK");
            System.out.println("3. PERKALIHAN SKALAR TITIK");
            System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
            System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6. JARAK ANTARA DUA TITIK");
            System.out.println("0. KELUAR");
            System.out.print("MASUKAN PILIHAN: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("MASUKAN KOORDINAT TITIK 1 (X Y): ");
                    int x1 = input.nextInt();
                    int y1 = input.nextInt();
                    t1.inisialisasiTitik(x1, y1);
                    System.out.print("MASUKAN KOORDINAT TITIK 2 (X Y): ");
                    int x2 = input.nextInt();
                    int y2 = input.nextInt();
                    t2.inisialisasiTitik(x2, y2);
                    break;
                case 2:
                    System.out.print("TITIK 1: ");
                    t1.tampilTitik();
                    System.out.print("TITIK 2: ");
                    t2.tampilTitik();
                    break;
                case 3:
                    System.out.print("MASUKAN SKALAR: ");
                    int skalar = input.nextInt();
                    t1.perkalihanSkalar(skalar);
                    t2.perkalihanSkalar(skalar);
                    break;
                case 4:
                    t1.pencerminanSumbuX();
                    t2.pencerminanSumbuX();
                    break;
                case 5:
                    t1.pencerminanSumbuY();
                    t2.pencerminanSumbuY();
                    break;
                case 6:
                    int jarak = t1.jarak(t2);
                    System.out.println("JARAK ANTARA TITIK 1 DAN TITIK 2: " + jarak);
                    break;
                case 0:
                    System.out.println("TERIMA KASIH");
                    break;
                default:
                    System.out.println("PILIHAN TIDAK VALID");
                    break;
            }
    }
}
}
//farel Pahlevi Azhar