package inheritance;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String address;
    protected String hobby;

    public Person(Scanner scanner) {
        System.out.println("Masukkan nama: ");
        name = scanner.nextLine();
        System.out.println("Masukkan alamat: ");
        address = scanner.nextLine();
        System.out.println("Masukkan hobi: ");
        hobby = scanner.nextLine();
    }

    public void identity() {
        System.out.println("Nama: " + name);
        System.out.println("Alamat: " + address);
    }

    public void displayHobby() {
        System.out.println("Hobi: " + hobby);
    }
}