package model;

import java.util.Scanner;

/**
 *
 * @author XZeroMarx
 */
public class Main {
    public static void main(String[] args) {
        
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
        int calculoAB = (BX - AX) + (BY - AY);
        System.out.println(calculoAB);
        System.out.println();
        double AB2 = Math.pow(calculoAB, 2);
        double ABR= Math.sqrt(AB2);//Donde Math.pow es elevar un numero al cuadrado.
        System.out.println(AB2);
        System.out.println(ABR);
        System.out.println("==============");
        //BC
        int calculoBC = (CX - DX) + (CY + BY);
        System.out.println(calculoBC);
        System.out.println();
        double BC2 = Math.pow(calculoBC, 2);
        double BCR= Math.sqrt(BC2);
        System.out.println(BC2);
        System.out.println(BCR);
        System.out.println("==============");
        //CD
        int calculoCD = (DX - CX) + (DY - CY);
        System.out.println(calculoCD);
        System.out.println();
        double CD2 = Math.pow(calculoCD, 2);
        double CDR= Math.sqrt(CD2);
        System.out.println(CD2);
        System.out.println(CDR);
        System.out.println("==============");
        //AD
        int calculoAD = (DX - AX) + (DY - AY);
        System.out.println(calculoAD);
        System.out.println();
        double AD2 = Math.pow(calculoAD, 2);
        double ADR= Math.sqrt(AD2);
        System.out.println(ADR);
        System.out.println(AD2);
        System.out.println("==============");

        
    }
    
}
