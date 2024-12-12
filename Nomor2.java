import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {

    static ArrayList<Integer> keranjangBelanja = new ArrayList<>();

    
    public static int hitungTotalBelanja() {
        int total = 0;
        for (int harga : keranjangBelanja) {
            total += harga;
        }
        return total;
    }

    public static int hitungDiskon(int totalBelanja) {

        if (totalBelanja < 50000) {
            return 0;
        } else if (totalBelanja >= 50000 && totalBelanja <= 100000) {
            return (int) (totalBelanja * 0.05);
        } else {
            return (int) (totalBelanja * 0.10);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        int[] hargaMenu = { 35000, 45000, 20000, 15000 };
        String[] namaMenu = { "Burger", "Steak", "Spaghetti", "Kentang" };

        while (true) {
            System.out.print("Masukan nama menu [Burger/Steak/Spaghetti/Kentang]:");
            String inputMenu = input.nextLine();

            int indexMenu = 0;
            for (int i = 0; i < namaMenu.length; i++) {
                if (namaMenu[i].equalsIgnoreCase(inputMenu)) {
                    indexMenu = i;
                }
            }
            keranjangBelanja.add(hargaMenu[indexMenu]);
            
            System.out.print("Input lagi (Y/N)?: ");
            String inputLagi = input.nextLine();
            if (inputLagi.equalsIgnoreCase("N")) {
                break;
            }
        }

        int totalBelanja = hitungTotalBelanja();
        int diskon = hitungDiskon(totalBelanja);
        int totalBayar = totalBelanja - diskon;

        System.out.println("Total item pesanan = " + keranjangBelanja.size());
        System.out.println("Total yang harus dibayar = " + totalBayar);
        /* Pekerjaan anda berakhir sini */
        System.out.println(Nomor2.class.getDeclaredMethods().length);
    }
}
