package grafico;

import javax.swing.*;
import java.awt.*;

public class Vector extends JPanel {

    public void Cuadrado(Graphics g) {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 510;
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, 0, 600);
        
        while (true) {
            if (x1 == 300 && x2 == 300) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.BLACK);
            }
            g.drawLine(x1, y1, x2, y2);
            x1 += 30;
            x2 += 30;

            if (x2 >= 630) {
                break;
            }
        }

        x1 = 0;
        y1 = 0;
        x2 = 600;
        y2 = 0;
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, 0, 500);
        while (true) {
            if (y1 == 300 && y2 == 300) {
                g.setColor(Color.RED);
            } else {
                
                g.setColor(Color.BLACK);
            
            }
            g.drawLine(x1, y1, x2, y2);
            y1 += 30;
            y2 += 30;

            if (y2 >= 630) {
                break;
            }
        }

    }

}
