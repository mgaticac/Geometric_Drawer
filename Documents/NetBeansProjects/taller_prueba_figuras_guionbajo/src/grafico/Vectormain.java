
package grafico;
import javax.swing.*;//Crea ventana basica
import java.awt.*; //Modo grafico.


public class Vectormain {

    
    public static void main(String[] args) {
        //CREACIÓN DE VENTANA BASICA
        Vector vec= new Vector();
        
        JFrame vector = new JFrame("Dibujo");
        vector.setVisible(true);
        vector.setSize(500,500);
        vector.setLocationRelativeTo(null);
        vector.setBackground(Color.black);
        vector.add(vec);
        vector.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
