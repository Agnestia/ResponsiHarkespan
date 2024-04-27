package inheritance;

import java.util.Scanner;

public class InheritMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student mahasiswa = new Student(scanner);

        mahasiswa.identity();
        mahasiswa.displayHobby();

        mahasiswa.hitungPembayaran(scanner);

        scanner.close();
    }
}