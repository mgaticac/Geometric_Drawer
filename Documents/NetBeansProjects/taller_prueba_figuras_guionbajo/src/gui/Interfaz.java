package gui;

import javax.swing.JOptionPane;
import model.Calculo;

/**
 *
 * @author XZeroMarx
 */
public class Interfaz extends javax.swing.JFrame {

    int cantPuntos;

    public Interfaz() {
        initComponents();
    }

    //codigo propio
    //codigo propio
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaCalc = new javax.swing.JFrame();
        txtPunto1 = new javax.swing.JTextField();
        txtPunto2 = new javax.swing.JTextField();
        txtPunto3 = new javax.swing.JTextField();
        txtPunto4 = new javax.swing.JTextField();
        lblB1 = new javax.swing.JLabel();
        lblB2 = new javax.swing.JLabel();
        lblB3 = new javax.swing.JLabel();
        lblB4 = new javax.swing.JLabel();
        btnIdentificar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        panelDibujar = new javax.swing.JPanel();
        lblResultado1 = new javax.swing.JLabel();
        areaNota = new javax.swing.JTextArea();
        ventanaPrinc = new javax.swing.JPanel();
        cmbOpciones = new javax.swing.JComboBox<>();
        btnProceder = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        bar1 = new javax.swing.JProgressBar();

        ventanaCalc.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ventanaCalc.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPunto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPunto1ActionPerformed(evt);
            }
        });
        ventanaCalc.getContentPane().add(txtPunto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 110, 20));
        ventanaCalc.getContentPane().add(txtPunto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 111, -1));
        ventanaCalc.getContentPane().add(txtPunto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 111, -1));

        txtPunto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPunto4ActionPerformed(evt);
            }
        });
        ventanaCalc.getContentPane().add(txtPunto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 111, -1));

        lblB1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        lblB1.setForeground(new java.awt.Color(51, 0, 51));
        lblB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB1.setText("punto 1");
        ventanaCalc.getContentPane().add(lblB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 20));

        lblB2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        lblB2.setForeground(new java.awt.Color(51, 0, 51));
        lblB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB2.setText("punto 2");
        ventanaCalc.getContentPane().add(lblB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 20));

        lblB3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        lblB3.setForeground(new java.awt.Color(51, 0, 51));
        lblB3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB3.setText("punto 3");
        ventanaCalc.getContentPane().add(lblB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 21));

        lblB4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        lblB4.setForeground(new java.awt.Color(51, 0, 51));
        lblB4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB4.setText("punto 4");
        ventanaCalc.getContentPane().add(lblB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 20));

        btnIdentificar.setText("Identificar");
        btnIdentificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdentificarActionPerformed(evt);
            }
        });
        ventanaCalc.getContentPane().add(btnIdentificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 120, -1));

        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("-----------------------");
        ventanaCalc.getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 150, 30));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        ventanaCalc.getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, -1, -1));

        panelDibujar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelDibujarLayout = new javax.swing.GroupLayout(panelDibujar);
        panelDibujar.setLayout(panelDibujarLayout);
        panelDibujarLayout.setHorizontalGroup(
            panelDibujarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        panelDibujarLayout.setVerticalGroup(
            panelDibujarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        ventanaCalc.getContentPane().add(panelDibujar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 580, 510));

        lblResultado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado1.setText("Perimetro :");
        ventanaCalc.getContentPane().add(lblResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 200, 30));

        areaNota.setEditable(false);
        areaNota.setBackground(new java.awt.Color(240, 240, 240));
        areaNota.setColumns(20);
        areaNota.setRows(5);
        areaNota.setText("NOTA: Solo puede ingresar\nnumeros menores o iguales\na 20.\n\nEJ: \" 20,20 (Maximo) \" \n    \" 0,0(Minimo) \".");
        ventanaCalc.getContentPane().add(areaNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 240, 150));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbOpciones.setBackground(new java.awt.Color(204, 255, 204));
        cmbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione.", "3 puntos", "4 puntos" }));
        cmbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOpcionesActionPerformed(evt);
            }
        });

        btnProceder.setText("proceder");
        btnProceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcederActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(51, 51, 51));
        lbl1.setText("         Identificador de Figuras");

        lbl2.setBackground(new java.awt.Color(153, 255, 204));
        lbl2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 102, 102));
        lbl2.setText("       ingrese la cantidad de puntos");

        bar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout ventanaPrincLayout = new javax.swing.GroupLayout(ventanaPrinc);
        ventanaPrinc.setLayout(ventanaPrincLayout);
        ventanaPrincLayout.setHorizontalGroup(
            ventanaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaPrincLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(ventanaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaPrincLayout.createSequentialGroup()
                        .addComponent(bar1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaPrincLayout.createSequentialGroup()
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaPrincLayout.createSequentialGroup()
                        .addGroup(ventanaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnProceder)
                            .addGroup(ventanaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(113, 113, 113))))
        );
        ventanaPrincLayout.setVerticalGroup(
            ventanaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaPrincLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProceder)
                .addGap(56, 56, 56)
                .addComponent(bar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPunto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPunto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPunto4ActionPerformed

    private void btnIdentificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdentificarActionPerformed
        // TODO add your handling code here:

        Calculo calculo = new Calculo();

        if (cantPuntos == 4) {
            //Separacion de coordenadas Strings y se convierten a double guardandolas en variables
            String[] coordenada1;
            coordenada1 = txtPunto1.getText().split(",");
            double ax = Double.valueOf(coordenada1[0]);
            double ay = Double.valueOf(coordenada1[1]);

            String[] coordenada2;
            coordenada2 = txtPunto2.getText().split(",");
            double bx = Double.valueOf(coordenada2[0]);
            double by = Double.valueOf(coordenada2[1]);

            String[] coordenada3;
            coordenada3 = txtPunto3.getText().split(",");
            double cx = Double.valueOf(coordenada3[0]);
            double cy = Double.valueOf(coordenada3[1]);

            String[] coordenada4;
            coordenada4 = txtPunto4.getText().split(",");
            double dx = Double.valueOf(coordenada4[0]);
            double dy = Double.valueOf(coordenada4[1]);

            calculo.punto1Cuadrado(ax, ay, bx, by);

            calculo.punto2Cuadrado(bx, by, cx, cy);

            calculo.punto3Cuadrado(cx, cy, dx, dy);

            calculo.punto4Cuadrado(dx, dy, ax, ay);

            if (calculo.isError() == false) {
                lblResultado.setText(calculo.getPerimetroCuadrado());

            } else {
                JOptionPane.showMessageDialog(null, "[ERROR] No ingresó un dato en un campo,\n o ingresó un caractér no permitido.");
            }

        } else if (cantPuntos == 3) {

            String[] coordenada1;
            coordenada1 = txtPunto1.getText().split(",");
            double ax = Double.valueOf(coordenada1[0]);
            double ay = Double.valueOf(coordenada1[1]);

            String[] coordenada2;
            coordenada2 = txtPunto2.getText().split(",");
            double bx = Double.valueOf(coordenada2[0]);
            double by = Double.valueOf(coordenada2[1]);

            String[] coordenada3;
            coordenada3 = txtPunto3.getText().split(",");
            double cx = Double.valueOf(coordenada3[0]);
            double cy = Double.valueOf(coordenada3[1]);

            calculo.punto2Triangulo(bx, by, cx, cy);
            calculo.punto1Triangulo(ax, ay, bx, by);
            calculo.punto3Triangulo(cx, cy, ax, ay);

            if (calculo.isError() == false) {
                lblResultado.setText(calculo.getPerimetroTriangulo());
            } else {
                JOptionPane.showMessageDialog(null, "[ERROR] No ingresó un dato en un campo,\n o ingresó un caractér no permitido.");
            }
        }

        if (cantPuntos == 3) {
            //dos lados iguales
            if (calculo.getResultadoAB() == calculo.getResultadoBC()
                    || calculo.getResultadoBC() == calculo.getResultadoTAC()
                    || calculo.getResultadoAB() == calculo.getResultadoTAC()) {

                //todos iguales
                if (calculo.getResultadoAB() == calculo.getResultadoBC()
                        && calculo.getResultadoBC() == calculo.getResultadoTAC()
                        && calculo.getResultadoAB() == calculo.getResultadoTAC()) {

                    System.out.println("Triángulo Equilátero");

                }
                System.out.println("Triángulo Isósceles");
            } else {
                System.out.println("Triángulo Escaleno");
            }

        }
        if (cantPuntos == 4) {

            //cuadrado
        }else if ((calculo.getResultadoAB() == calculo.getResultadoCD())
                    && (calculo.getResultadoAD() == calculo.getResultadoBC())) {
                //rectangulo
                System.out.println("rectangulo");
            }
        


    }//GEN-LAST:event_btnIdentificarActionPerformed

    private void btnProcederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcederActionPerformed

        if (cantPuntos == 3) {
            lblB4.setVisible(false);
            txtPunto4.setVisible(false);
            ventanaCalc.setBounds(ventanaPrinc.getX(), ventanaPrinc.getY(), 950, 700);
            ventanaCalc.setVisible(true);
            ventanaCalc.setFocusable(true);
            lblResultado1.setText("Perimetro Triangulo: ");

        } else if (cantPuntos == 4) {
            ventanaCalc.setBounds(ventanaPrinc.getX(), ventanaPrinc.getY(), 950, 700);
            ventanaCalc.setVisible(true);
            ventanaCalc.setFocusable(true);
            lblResultado1.setText("Perimetro Cuadrado: ");
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion porfavor.");
        }

//        ver como rellenar barra de carga
//        int n = 0;
//        bar1.setMinimum(0);
//        bar1.setMaximum(100);
//        while(true){
//            try {
//                Thread.sleep(ALLBITS);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
//                bar1.setValue(n+=10);
//                if(bar1.getValue()>= 100){
//                    break;
//                }
//            }
//        
//        }
    }//GEN-LAST:event_btnProcederActionPerformed

    private void cmbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOpcionesActionPerformed

        if (1 == (cmbOpciones.getSelectedIndex())) {
            cantPuntos = 3;
        } else if (2 == cmbOpciones.getSelectedIndex()) {
            cantPuntos = 4;
        } else {
            cantPuntos = 1;
        }

    }//GEN-LAST:event_cmbOpcionesActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ventanaPrinc.setFocusCycleRoot(true);
        ventanaCalc.setVisible(false);
        txtPunto1.setText("");
        txtPunto2.setText("");
        txtPunto3.setText("");
        txtPunto4.setText("");
        lblResultado.setText("-----------------------");
        cmbOpciones.setSelectedIndex(0);
        lblB4.setVisible(true);
        txtPunto4.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtPunto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPunto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPunto1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }

        });
        //codigo a ejecutarse al comienzo

        //termino de codigo
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaNota;
    private javax.swing.JProgressBar bar1;
    private javax.swing.JButton btnIdentificar;
    private javax.swing.JButton btnProceder;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbOpciones;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblB1;
    private javax.swing.JLabel lblB2;
    private javax.swing.JLabel lblB3;
    private javax.swing.JLabel lblB4;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JPanel panelDibujar;
    private javax.swing.JTextField txtPunto1;
    private javax.swing.JTextField txtPunto2;
    private javax.swing.JTextField txtPunto3;
    private javax.swing.JTextField txtPunto4;
    private javax.swing.JFrame ventanaCalc;
    private javax.swing.JPanel ventanaPrinc;
    // End of variables declaration//GEN-END:variables
}
