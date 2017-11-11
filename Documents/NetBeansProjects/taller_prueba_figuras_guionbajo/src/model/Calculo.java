package model;


public class Calculo {

    int AX, AY, BX, BY, CX, CY, DX, DY;
    
    String[] Coordenadasp1, Coordenadasp2, Coordenadasp3, Coordenadasp4 = new String [3];
    double raizAB, raizBC, raizCD, raizAD;

    //definicion punto1
    public void punto1(String punto1) {
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
    }

    //definicion punto2
    public void punto2(String punto2) {
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
    }

    //definicion punto3
    public void punto3(String punto3) {
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
    }

    //definicion punto4
    public void punto4(String punto4) {
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

    }
    
    public String getPerimetro(){
        double perimetro = raizAB + raizBC + raizCD + raizAD;
        String perimetroTexto =String.valueOf(perimetro) ;
        return perimetroTexto;
    }
    

}
