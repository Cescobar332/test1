package com.example.test1;

import java.util.Scanner;
public class HelloApplication {

    public static void main(String[] args) {
        System.out.println("Por favor ingrese el precio del videojuego: ");
        Scanner scan = new Scanner(System.in);
        float videojuego = scan.nextFloat();
        System.out.println("El precio del videojuego es: " + videojuego);
        float result = videojuego - ((videojuego * 13)/100);
        double IVA = 0.19;
        System.out.println("El precio del videojuego con el IVA: " + (videojuego+(videojuego*IVA)));
        System.out.println("El precio final del videojuego sería: "+ (result+(result*IVA)));
    }
}