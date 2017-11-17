package grafico;

import javax.swing.*;
import java.awt.*;

public class Vector extends JPanel {

    public void Plano(Graphics g) {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 510;
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, 0, 630);

        while (true) {
            if (x1 == 300 && x2 == 300) {
                g.setColor(Color.BLACK);
            } else {
                g.setColor(Color.GRAY);
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
        x2 = 630;
        y2 = 0;
        g.setColor(Color.gray);
        g.drawLine(0, 0, 0, 500);
        while (true) {
            if (y1 == 300 && y2 == 300) {
                g.setColor(Color.black);
            } else {

                g.setColor(Color.gray);

            }
            g.drawLine(x1, y1, x2, y2);
            y1 += 30;
            y2 += 30;

            if (y2 >= 630) {
                break;
            }
        }

    }

    public void DibujarPlanoYFigura(double xx1, double yy1, double xx2, double yy2, Graphics g) {
        //Plano
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 610;
        g.setColor(Color.gray);
        g.drawLine(0, 0, 0, 630);

        while (true) {
            if (x1 == 300 && x2 == 300) {
                g.setColor(Color.BLACK);
            } else {
                g.setColor(Color.GRAY);
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
        x2 = 630;
        y2 = 0;
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, 0, 500);
        while (true) {
            if (y1 == 300 && y2 == 300) {
                g.setColor(Color.GRAY);
            } else {

                g.setColor(Color.BLACK);

            }
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
            y1 += 30;
            y2 += 30;

            if (y2 >= 630) {
                break;
            }
            
        }
        //Plano

        //figura
        g.setColor(Color.magenta);
        g.drawLine(300, 300, ((int)xx2*30 + 300), (int)yy2*30 + 300);
        //figura
    }
}
