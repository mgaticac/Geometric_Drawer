package model;

public class Calculo {

    int AX, AY, BX, BY, CX, CY, DX, DY;
    boolean error = false;

    String[] Coordenadasp1, Coordenadasp2, Coordenadasp3, Coordenadasp4 = new String[3];
    double raizAB, raizBC, raizCD, raizAD, raizAC;

    //definicion punto1Cuadrado
    public void punto1Cuadrado(String punto1) {
        try {
            Coordenadasp1 = punto1.split(",");
            AX = Integer.parseInt(Coordenadasp1[0]);
            AY = Integer.parseInt(Coordenadasp1[1]);
            //AB
            int restaABX = (BX - AX);
            int restaABY = (BY - AY);
            double ABX2 = Math.pow(restaABX, 2);
            double ABY2 = Math.pow(restaABY, 2);
            double suma = ABX2 + ABY2;
            raizAB = Math.sqrt(Math.round(suma));

        } catch (Exception e) {
            error = true;
        }
    }

    //definicion punto2Cuadrado
    public void punto2Cuadrado(String punto2) {
        try {
            Coordenadasp2 = punto2.split(",");
            BX = Integer.parseInt(Coordenadasp2[0]);
            BY = Integer.parseInt(Coordenadasp2[1]);
            //BC
            int restaBCX = (CX - BX);
            int restaBCY = (CY - BY);
            double BCX2 = Math.pow(restaBCX, 2);
            double BCY2 = Math.pow(restaBCY, 2);
            double suma2 = BCX2 + BCY2;
            raizBC = Math.sqrt(Math.round(suma2));
        } catch (Exception e) {
            error = true;
        }

    }

    //definicion punto3Cuadrado
    public void punto3Cuadrado(String punto3) {
        try {
            Coordenadasp3 = punto3.split(",");
            CX = Integer.parseInt(Coordenadasp3[0]);
            CY = Integer.parseInt(Coordenadasp3[1]);
            //CD
            int restaCDX = (CX - DX);
            int restaCDY = (CY - DY);
            double CDX2 = Math.pow(restaCDX, 2);
            double CDY2 = Math.pow(restaCDY, 2);
            double suma3 = CDX2 + CDY2;
            raizCD = Math.sqrt(suma3);
        } catch (Exception e) {
            error = true;
        }

    }

    //definicion punto4Cuadrado
    public void punto4Cuadrado(String punto4) {
        try {
            Coordenadasp4 = punto4.split(",");
            DX = Integer.parseInt(Coordenadasp4[0]);
            DY = Integer.parseInt(Coordenadasp4[1]);
            //AD
            int restaADX = (AX - DX);
            int restaADY = (AY - DY);

            double ADX2 = Math.pow(restaADX, 2);
            double ADY2 = Math.pow(restaADY, 2);
            double suma4 = ADX2 + ADY2;
            raizAD = Math.sqrt(suma4);
        } catch (Exception e) {
            error = true;
        }

    }

    
    public void punto1Triangulo(String punto1) {
        try {
            Coordenadasp1 = punto1.split(",");
            AX = Integer.parseInt(Coordenadasp1[0]);
            AY = Integer.parseInt(Coordenadasp1[1]);
            //AB
            int restaABX = (BX - AX);
            int restaABY = (BY - AY);
            double ABX2 = Math.pow(restaABX, 2);
            double ABY2 = Math.pow(restaABY, 2);
            double suma = ABX2 + ABY2;
            raizAB = Math.sqrt(Math.round(suma));

        } catch (Exception e) {
            error = true;
        }
    }

    public void punto2Triangulo(String punto2) {
        try {
            Coordenadasp2 = punto2.split(",");
            BX = Integer.parseInt(Coordenadasp2[0]);
            BY = Integer.parseInt(Coordenadasp2[1]);
            //BC
            int restaBCX = (CX - BX);
            int restaBCY = (CY - BY);
            double BCX2 = Math.pow(restaBCX, 2);
            double BCY2 = Math.pow(restaBCY, 2);
            double suma2 = BCX2 + BCY2;
            raizBC = Math.sqrt(Math.round(suma2));

        } catch (Exception e) {
            error = true;
        }
    }

    public void punto3Triangulo(String punto3) {
        try {
            Coordenadasp3 = punto3.split(",");
            CX = Integer.parseInt(Coordenadasp3[0]);
            CY = Integer.parseInt(Coordenadasp3[1]);
            //AC
            int restaCDX = (CX - DX);
            int restaCDY = (CY - DY);
            double CDX2 = Math.pow(restaCDX, 2);
            double CDY2 = Math.pow(restaCDY, 2);
            double suma3 = CDX2 + CDY2;
            raizAC = Math.sqrt(suma3);

        } catch (Exception e) {
            error = true;
        }
    }

    public String getPerimetroCuadrado() {
        double perimetro = raizAB + raizBC + raizCD + raizAD;
        Math.round(perimetro);

        String perimetroTexto = String.valueOf(perimetro);

        return perimetroTexto;
    }
    
    public String getPerimetroTriangulo(){
        double perimetro= raizAB+raizBC+raizAC;
        Math.round(perimetro);
        
        String perimetroTexto=(String.valueOf(perimetro));
        
        return perimetroTexto;
    }

    public boolean isError() {
        return error;
    }

    public double getRaizAB() {
        return raizAB;
    }

    public double getRaizBC() {
        return raizBC;
    }

    public double getRaizCD() {
        return raizCD;
    }

    public double getRaizAD() {
        return raizAD;
    }

    public double getRaizAC() {
        return raizAC;
    }
    
}
