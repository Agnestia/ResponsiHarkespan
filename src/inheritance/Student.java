package inheritance;

import java.util.Scanner;

public class Student extends Person {
    private String nim;

    public Student(Scanner scanner) {
        super(scanner);
        System.out.println("Masukkan nim: ");
        nim = scanner.nextLine();
    }

    public void hitungPembayaran(Scanner scanner) {
        System.out.println("Masukkan biaya SPP: ");
        int spp = scanner.nextInt();
        System.out.println("Masukkan biaya SKS: ");
        int sks = scanner.nextInt();
        System.out.println("Masukkan biaya Modul: ");
        int modul = scanner.nextInt();
        int total = spp + sks + modul;
        System.out.println("Total tagihan: " + total);
    }
}