package model;

public class Calculo {

    boolean error = false;

    double resultadoAB, resultadoBC, resultadoCD, resultadoAD, resultadoTAB, resultadoTBC, resultadoTAC;
    double a, b,ar;
    double D=0, d=0,h=0;

    
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
            System.out.println(resultadoAB);

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
            System.out.println(resultadoBC);

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
            System.out.println(resultadoCD);

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
            System.out.println(resultadoAD);

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
            System.out.println("BC: "+resultadoTBC);
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
           
        } catch (Exception e) {
            error = true;
        }
    }

    public boolean isError() {
        return error;
    }

    public String getPerimetroCuadrado() {
        double perimetroCuadrado = resultadoAB + resultadoBC + resultadoCD + resultadoAD;
        a = perimetroCuadrado;
        String perimetroC = String.valueOf(perimetroCuadrado);
        return perimetroC;
    }

    public String getPerimetroTriangulo() {
        double perimetroTriangulo = resultadoTAB + resultadoTBC + resultadoTAC;
        b = perimetroTriangulo;
        String perimetroT = String.valueOf(perimetroTriangulo);
        return perimetroT;
    }
    
    public String getAreaCuadrado(){
        double area= resultadoAB*resultadoBC;
        ar=area;
        String areaC= String.valueOf(area);
        return areaC;
    }
    
    public String getAreaRectangulo(){
        double area= resultadoAB*resultadoBC;
        ar=area;
        String areaR= String.valueOf(area);
        return areaR;
    }
    public String getAreaRombo(){
        double area= D*d/2; //SE DEBE PEDIR INFORMACIÓN ADICIONAL AL USUARIO.
        ar=area;
        String areaRO= String.valueOf(area);
        return areaRO;
        
    }
    public String getAreaRomboide(){
        double area= resultadoAD*h;
        ar=area;
        String areaROM= String.valueOf(area);
        return areaROM;
    }
    public String getAreaTrapecio(){
        double area= (resultadoAD*resultadoBC)*h/2;
        ar=area;
        String areaTRA= String.valueOf(area);
        return areaTRA;
    }
//    public String getAreaTrapezoideAsimetrico{){
//        double area=(resultadoAB*/2)
//    }//OJO CON ESTO QUE ESTA REDURISIMO.
    
    public String getAreaTriangulo(){//Equilatero
        double altura= Math.sqrt(resultadoTAB*3)/2;
        double area= altura*Math.pow(resultadoTAB, 2);
        ar=area;
        String areaT= String.valueOf(area);
        return areaT;
    }
    public String getAreaTrianguloIsosceles(){
        double area= (resultadoTAB*(Math.sqrt(Math.pow(resultadoTAC, 2))-resultadoTAB/4))/2;
        //A partir de la multiplicación es la formula para determinar la altura.
        ar=area;
        String areaISOS= String.valueOf(area);
        return areaISOS;
        
    }
    public String getAreaTrianguloEscaleno(){
        double semiperimetro=resultadoTAB+resultadoTBC+resultadoTAC/2;// es lo mismo que decir perimetroT/2;
        double area= Math.sqrt((semiperimetro-resultadoTAB)*(semiperimetro-resultadoTBC)*(semiperimetro-resultadoTAC));
        ar=area;
        String areaESC= String.valueOf(area);
        return areaESC;
    }
    
    
    public double getResultadoAB() {
        return resultadoAB;
    }

    public double getResultadoBC() {
        return resultadoBC;
    }

    public double getResultadoCD() {
        return resultadoCD;
    }

    public double getResultadoAD() {
        return resultadoAD;
    }

    public double getResultadoTAB() {
        return resultadoTAB;
    }

    public double getResultadoTBC() {
        return resultadoTBC;
    }

    public double getResultadoTAC() {
        return resultadoTAC;
    }
    
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
    
}
