package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст: ");
        String text = sc.nextLine();
        String[] s = text.split(" ");
        System.out.println("Модель создана");
    }
}
