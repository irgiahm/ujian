package UasIrgiahmad;

import java.util.Scanner;

public class BanyakTeksPanjang5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countPanjang5 = 0;

        System.out.println("Masukkan 10 teks:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Teks ke-" + i + ": ");
            String teks = input.nextLine();

            if (teks.length() == 5) {
                countPanjang5++;
            }
        }

        System.out.println("Banyak teks panjang 5 karakter: " + countPanjang5);
    }
}

