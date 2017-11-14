package model;

import java.awt.Point;

public class Calculo {

    boolean error = false;
    
    
   double resultadoAB,resultadoBC, resultadoCD,resultadoAD,resultadoTAB,resultadoTBC, resultadoTAC;
    
    
    
    

    //definicion punto1Cuadrado
    public void punto1Cuadrado(double ax1, double ay1, double bx1, double by1) {
        try {
            double resta1 = ((double) bx1 - (double) ax1);
            double resta2 = ((double) by1 - (double) ay1);

            double elevado1 = Math.pow(resta1, 2);
            double elevado2 = Math.pow(resta2, 2);

            double suma = elevado1 + elevado2;

            double raiz = Math.sqrt(suma);
            resultadoAB = Math.abs(raiz);
            

        } catch (Exception e) {
            error = true;
        }
    }

    //definicion punto2Cuadrado
    public void punto2Cuadrado(double bx1, double by1, double cx1, double cy1) {
        try {
            double resta1 = ((double) cx1 - (double) bx1);
            double resta2 = ((double) cy1 - (double) by1);

            double elevado1 = Math.pow(resta1, 2);
            double elevado2 = Math.pow(resta2, 2);

            double suma = elevado1 + elevado2;

            double raiz = Math.sqrt(suma);
            resultadoBC = Math.abs(raiz);
            

        } catch (Exception e) {
            error = true;
        }

    }

    //definicion punto3Cuadrado
    public void punto3Cuadrado(double cx1, double cy1, double dx1, double dy1) {
        try {
            double resta1 = ((double) dx1 - (double) cx1);
            double resta2 = ((double) dy1 - (double) cy1);

            double elevado1 = Math.pow(resta1, 2);
            double elevado2 = Math.pow(resta2, 2);

            double suma = elevado1 + elevado2;

            double raiz = Math.sqrt(suma);
            resultadoCD = Math.abs(raiz);

            

        } catch (Exception e) {
            error = true;
        }

    }

    //definicion punto4Cuadrado
    public void punto4Cuadrado(double dx1, double dy1, double ax1, double ay1) {
        try {
            double resta1 = ((double) ax1 - (double) dx1);
            double resta2 = ((double) ay1 - (double) dy1);

            double elevado1 = Math.pow(resta1, 2);
            double elevado2 = Math.pow(resta2, 2);

            double suma = elevado1 + elevado2;

            double raiz = Math.sqrt(suma);
            resultadoAD = Math.abs(raiz);
            

        } catch (Exception e) {
            error = true;
        }

    }

    public void punto1Triangulo(double ax1, double ay1, double bx1, double by1) {
        try {
            double resta1 = ((double) bx1 - (double) ax1);
            double resta2 = ((double) by1 - (double) ay1);

            double elevado1 = Math.pow(resta1, 2);
            double elevado2 = Math.pow(resta2, 2);

            double suma = elevado1 + elevado2;

            double raiz = Math.sqrt(suma);
            resultadoTAB = Math.abs(raiz);
            System.out.println(resultadoTAB);
        } catch (Exception e) {
            error = true;
        }
    }

    public void punto2Triangulo(double bx1, double by1, double cx1, double cy1) {
        try {
            double resta1 = ((double) cx1 - (double) bx1);
            double resta2 = ((double) cy1 - (double) by1);

            double elevado1 = Math.pow(resta1, 2);
            double elevado2 = Math.pow(resta2, 2);

            double suma = elevado1 + elevado2;

            double raiz = Math.sqrt(suma);
            resultadoTBC = Math.abs(raiz);
            System.out.println(resultadoTBC);
        } catch (Exception e) {
            error = true;
        }
    }

    public void punto3Triangulo(double cx1, double cy1, double ax1, double ay1) {
        try {
            double resta1 = ((double) ax1 - (double) cx1);
            double resta2 = ((double) ay1 - (double) cy1);

            double elevado1 = Math.pow(resta1, 2);
            double elevado2 = Math.pow(resta2, 2);

            double suma = elevado1 + elevado2;

            double raiz = Math.sqrt(suma);
            resultadoTAC = Math.abs(raiz);
            System.out.println(resultadoTAC);
        } catch (Exception e) {
            error = true;
        }
    }

//    public String getPerimetroCuadrado() {
//
//    }
//
//    public String getPerimetroTriangulo() {
//
//    }
    public boolean isError() {
        return error;
    }

}
