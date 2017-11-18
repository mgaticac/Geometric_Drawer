package grafico;

import javax.swing.*;
import java.awt.*;

public class Vector extends JPanel {

    public void Plano(Graphics g) {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 510;
        g.setColor(Color.WHITE);
        g.drawLine(0, 0, 0, 630);

        while (true) {
            if (x1 == 300 && x2 == 300) {
                g.setColor(Color.BLACK);
            } else {
                g.setColor(Color.WHITE);
            }
            g.drawLine(x1, y1, x2, y2);
            x1 += 30;
            x2 += 30;

            if (x2 >= 800) {
                break;
            }
        }

        x1 = 0;
        y1 = 0;
        x2 = 630;
        y2 = 0;
        g.setColor(Color.WHITE);
        g.drawLine(0, 0, 0, 500);
        while (true) {
            if (y1 == 300 && y2 == 300) {
                g.setColor(Color.BLACK);
            } else {

                g.setColor(Color.WHITE);

            }
            g.drawLine(x1, y1, x2, y2);
            y1 += 30;
            y2 += 30;

            if (y2 >= 800) {
                break;
            }
        }

    }

    public void DibujarPlanoYCuadrado(double ax1, double ay1, double bx1, double by1, double cx1, double cy1, double dx1, double dy1, Graphics g) {
        //Plano
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 630;
        g.setColor(Color.WHITE);
        g.drawLine(0, 0, 0, 600);

        while (true) {
            if (x1 == 300 && x2 == 300) {
                g.setColor(Color.BLACK);
            } else {
                g.setColor(Color.WHITE);
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
        g.setColor(Color.WHITE);
        g.drawLine(0, 0, 0, 600);
        while (true) {
            if (y1 == 300 && y2 == 300) {
                g.setColor(Color.BLACK);
            } else {

                g.setColor(Color.WHITE);

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
        g.setColor(Color.RED);
        g.drawLine(300 + (((int) ax1 * 30)), (300 - ((int) ay1 * 30)), 300 + (((int) bx1 * 30)), 300 - (((int) by1 * 30)));
        g.drawLine(300 + (((int) bx1 * 30)), (300 - ((int) by1 * 30)), 300 + (((int) cx1 * 30)), 300 - (((int) cy1 * 30)));
        g.drawLine(300 + (((int) cx1 * 30)), (300 - ((int) cy1 * 30)), 300 + (((int) dx1 * 30)), 300 - (((int) dy1 * 30)));
        g.drawLine(300 + (((int) dx1 * 30)), (300 - ((int) dy1 * 30)), 300 + (((int) ax1 * 30)), 300 - (((int) ay1 * 30)));
        //figura
    }

    public void DibujarPlanoYTriangulo(double ax1, double ay1, double bx1, double by1, double cx1, double cy1, Graphics g) {
        //Plano
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 630;
        g.setColor(Color.WHITE);
        g.drawLine(0, 0, 0, 600);

        while (true) {
            if (x1 == 300 && x2 == 300) {
                g.setColor(Color.BLACK);
            } else {
                g.setColor(Color.WHITE);
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
        g.setColor(Color.WHITE);
        g.drawLine(0, 0, 0, 600);
        while (true) {
            if (y1 == 300 && y2 == 300) {
                g.setColor(Color.BLACK);
            } else {

                g.setColor(Color.WHITE);

            }
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
            y1 += 30;
            y2 += 30;

            if (y2 >= 630) {
                break;
            }

        }
        

        //figura
        g.setColor(Color.RED);
        g.drawLine(300 + (((int) ax1 * 30)), (300 - ((int) ay1 * 30)), 300 + (((int) bx1 * 30)), 300 - (((int) by1 * 30)));
        g.drawLine(300 + (((int) bx1 * 30)), (300 - ((int) by1 * 30)), 300 + (((int) cx1 * 30)), 300 - (((int) cy1 * 30)));
        g.drawLine(300 + (((int) cx1 * 30)), (300 - ((int) cy1 * 30)), 300 + (((int) ax1 * 30)), 300 - (((int) ay1 * 30)));
        
        //figura
    }
    
}


