package model;

import java.util.Scanner;

public class Calculo {

    public void vector() {
        int AX, AY, BX, BY, CX, CY, DX, DY;
        Scanner input = new Scanner(System.in);
        String[] Coordenadas;

        System.out.println("Ingrese puntos:");
        System.out.println("A(x,y)");
        Coordenadas = input.nextLine().split(",");
        AX = Integer.parseInt(Coordenadas[0]);
        AY = Integer.parseInt(Coordenadas[1]);

        System.out.println("B(x,y)");
        Coordenadas = input.nextLine().split(",");
        BX = Integer.parseInt(Coordenadas[0]);
        BY = Integer.parseInt(Coordenadas[1]);

        System.out.println("C(x,y)");
        Coordenadas = input.nextLine().split(",");
        CX = Integer.parseInt(Coordenadas[0]);
        CY = Integer.parseInt(Coordenadas[1]);

        System.out.println("D(x,y)");
        Coordenadas = input.nextLine().split(",");
        DX = Integer.parseInt(Coordenadas[0]);
        DY = Integer.parseInt(Coordenadas[1]);
        System.out.println("===================");
        System.out.println("CALCULOS");
        System.out.println("===================");

        //CALCULO SIMPLE.
        //AB
        int restaABX = (BX - AX);
        int restaABY = (BY - AY);
        System.out.println("Resta1 " + restaABX);
        System.out.println("Resta2 " + restaABY);
        double ABX2 = Math.pow(restaABX, 2);
        double ABY2 = Math.pow(restaABY, 2);
        System.out.println("Doble1 " + ABX2);
        System.out.println("Doble2 " + ABY2);
        double suma = ABX2 + ABY2;
        System.out.println("Suma " + suma);
        double raizAB = Math.sqrt(suma);
        System.out.println("raiz " +Math.round(raizAB));
        System.out.println();
        System.out.println("==============");
        //BC
        int restaBCX = (CX - BX);
        int restaBCY = (CY - BY);
        System.out.println("Resta1 " + restaBCX);
        System.out.println("Resta2 " + restaBCY);
        double BCX2 = Math.pow(restaBCX, 2);
        double BCY2 = Math.pow(restaBCY, 2);
        System.out.println("Doble1 " + BCX2);
        System.out.println("Doble2 " + BCY2);
        double suma2 = BCX2 + BCY2;
        System.out.println("Suma " + suma2);
        double raizBC = Math.sqrt(suma2);
        System.out.println("raiz " +Math.round(raizBC));
        System.out.println();
        System.out.println("==============");
        //CD
        int restaCDX = (CX - DX);
        int restaCDY = (CY - DY);
        System.out.println("Resta1 " + restaCDX);
        System.out.println("Resta2 " + restaCDY);
        double CDX2 = Math.pow(restaCDX, 2);
        double CDY2 = Math.pow(restaCDY, 2);
        System.out.println("Doble1 " + CDX2);
        System.out.println("Doble2 " + CDY2);
        double suma3 = CDX2 + CDY2;
        System.out.println("Suma " + suma3);
        double raizCD = Math.sqrt(suma3);
        System.out.println("raiz " +Math.round(raizCD));
        System.out.println();
        System.out.println("==============");
        //AC
        int restaADX = (AX - DX);
        int restaADY = (AY - DY);
        System.out.println("Resta1 " + restaADX);
        System.out.println("Resta2 " + restaADY);
        double ADX2 = Math.pow(restaADX, 2);
        double ADY2 = Math.pow(restaADY, 2);
        System.out.println("Doble1 " + ADX2);
        System.out.println("Doble2 " + ADY2);
        double suma4 = ADX2 + ADY2;
        System.out.println("Suma " + suma4);
        double raizAD = Math.sqrt(suma4);
        System.out.println("raiz "+Math.round(raizAD));
        
        System.out.println();
        System.out.println("==============");
        System.out.println("PERIMETRO");
        double perimetro=raizAB+raizBC+raizCD+raizAD;
        System.out.println("Perimetro"+Math.round(perimetro));

    }

}
