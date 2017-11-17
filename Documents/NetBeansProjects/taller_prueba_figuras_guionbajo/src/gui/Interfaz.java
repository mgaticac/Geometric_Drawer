package gui;

import grafico.Vector;
import java.awt.Graphics;
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
        lblResultado1 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        btnIdentificar = new javax.swing.JButton();
        btnEliminarPuntos = new javax.swing.JButton();
        areaNota = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        panelDibujar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ventanaExtra = new javax.swing.JInternalFrame();
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ventanaEstadisticas = new javax.swing.JInternalFrame();
        btnFinalizar = new javax.swing.JButton();
        contTrapezoides = new javax.swing.JTextField();
        contTrapecios = new javax.swing.JTextField();
        contRoboides = new javax.swing.JTextField();
        contRombos = new javax.swing.JTextField();
        contRectangulos = new javax.swing.JTextField();
        contCuadrados = new javax.swing.JTextField();
        contTrianguloEquilatero = new javax.swing.JTextField();
        contTrianguloiEscalenos = new javax.swing.JTextField();
        contTrianguloisoceles1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ventanaPrinc = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnProceder = new javax.swing.JButton();
        cmbOpciones = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        ventanaCalc.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ventanaCalc.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPunto1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 255), 3, true));
        txtPunto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPunto1ActionPerformed(evt);
            }
        });
        ventanaCalc.getContentPane().add(txtPunto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 110, 20));

        txtPunto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 3));
        ventanaCalc.getContentPane().add(txtPunto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 111, -1));

        txtPunto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 3));
        ventanaCalc.getContentPane().add(txtPunto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 111, -1));

        txtPunto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 3));
        txtPunto4.setCaretColor(new java.awt.Color(51, 51, 0));
        txtPunto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPunto4ActionPerformed(evt);
            }
        });
        ventanaCalc.getContentPane().add(txtPunto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 111, -1));

        lblB1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        lblB1.setForeground(new java.awt.Color(51, 0, 51));
        lblB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB1.setText("punto 1");
        ventanaCalc.getContentPane().add(lblB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 20));

        lblB2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        lblB2.setForeground(new java.awt.Color(51, 0, 51));
        lblB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB2.setText("punto 2");
        ventanaCalc.getContentPane().add(lblB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 20));

        lblB3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        lblB3.setForeground(new java.awt.Color(51, 0, 51));
        lblB3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB3.setText("punto 3");
        ventanaCalc.getContentPane().add(lblB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 21));

        lblB4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        lblB4.setForeground(new java.awt.Color(51, 0, 51));
        lblB4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB4.setText("punto 4");
        ventanaCalc.getContentPane().add(lblB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 20));

        lblResultado1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblResultado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado1.setText("Perimetro :");
        ventanaCalc.getContentPane().add(lblResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 200, 30));

        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("--------------------------");
        ventanaCalc.getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 150, 30));

        btnIdentificar.setBackground(new java.awt.Color(153, 255, 255));
        btnIdentificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIdentificar.setText("Identificar");
        btnIdentificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdentificarActionPerformed(evt);
            }
        });
        ventanaCalc.getContentPane().add(btnIdentificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 120, -1));

        btnEliminarPuntos.setBackground(new java.awt.Color(153, 255, 255));
        btnEliminarPuntos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminarPuntos.setText("Eliminar los puntos Seleccionados");
        btnEliminarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPuntosActionPerformed(evt);
            }
        });
        ventanaCalc.getContentPane().add(btnEliminarPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 240, -1));

        areaNota.setEditable(false);
        areaNota.setBackground(new java.awt.Color(204, 204, 204));
        areaNota.setColumns(20);
        areaNota.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        areaNota.setRows(5);
        areaNota.setText("NOTA: Solo puede ingresar\nnumeros menores o iguales\na 20.\n\n\nEJ: \" 20,20 (Maximo) \" \n    \" 0,0(Minimo) \".\n\n");
        areaNota.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)));
        ventanaCalc.getContentPane().add(areaNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 250, 140));

        btnRegresar.setBackground(new java.awt.Color(153, 255, 255));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        ventanaCalc.getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, -1, -1));

        cb1.setBackground(new java.awt.Color(51, 0, 255));
        cb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        ventanaCalc.getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 20, -1));

        cb2.setBackground(new java.awt.Color(51, 0, 255));
        cb2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255)));
        ventanaCalc.getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 20, -1));

        cb3.setBackground(new java.awt.Color(51, 0, 255));
        cb3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255)));
        ventanaCalc.getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 20, -1));

        cb4.setBackground(new java.awt.Color(51, 0, 255));
        cb4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255)));
        ventanaCalc.getContentPane().add(cb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 20, -1));

        panelDibujar.setBackground(new java.awt.Color(204, 204, 255));
        panelDibujar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDibujar.setMaximumSize(new java.awt.Dimension(30000, 30000));
        panelDibujar.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel4.setText("INGRESE COORDENADAS");

        javax.swing.GroupLayout panelDibujarLayout = new javax.swing.GroupLayout(panelDibujar);
        panelDibujar.setLayout(panelDibujarLayout);
        panelDibujarLayout.setHorizontalGroup(
            panelDibujarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDibujarLayout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        panelDibujarLayout.setVerticalGroup(
            panelDibujarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDibujarLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        ventanaCalc.getContentPane().add(panelDibujar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 610, 520));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/figures.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 670));

        ventanaCalc.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 660));

        ventanaExtra.setPreferredSize(new java.awt.Dimension(592, 320));
        ventanaExtra.setVisible(true);
        ventanaExtra.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Continuar");
        ventanaExtra.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 140, -1));

        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        ventanaExtra.getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("             Ingrese altura");
        ventanaExtra.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 170, -1));

        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        ventanaExtra.getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 150, 20));

        jLabel9.setBackground(new java.awt.Color(204, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("       Ingresar vector de traslación");
        ventanaExtra.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 260, 30));

        jTextField4.setEditable(false);
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        ventanaExtra.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 90, -1));

        jTextField3.setEditable(false);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        ventanaExtra.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 90, -1));

        jTextField2.setEditable(false);
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        ventanaExtra.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 90, -1));

        jTextField1.setEditable(false);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        ventanaExtra.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel8.setText("punto 4");
        ventanaExtra.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel7.setText("punto 3");
        ventanaExtra.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel6.setText("punto 2");
        ventanaExtra.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel5.setText("punto 1");
        ventanaExtra.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/figures.jpg"))); // NOI18N
        ventanaExtra.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 320));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ventanaExtra.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 546, 926, -1));

        ventanaEstadisticas.setVisible(true);
        ventanaEstadisticas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFinalizar.setBackground(new java.awt.Color(204, 255, 255));
        btnFinalizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFinalizar.setText("Finalizar");
        ventanaEstadisticas.getContentPane().add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 120, -1));

        contTrapezoides.setEditable(false);
        contTrapezoides.setBackground(new java.awt.Color(255, 255, 255));
        contTrapezoides.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contTrapezoides.setText("           0");
        contTrapezoides.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        ventanaEstadisticas.getContentPane().add(contTrapezoides, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 100, -1));

        contTrapecios.setEditable(false);
        contTrapecios.setBackground(new java.awt.Color(255, 255, 255));
        contTrapecios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contTrapecios.setText("           0");
        contTrapecios.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contTrapecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contTrapeciosActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contTrapecios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 100, -1));

        contRoboides.setEditable(false);
        contRoboides.setBackground(new java.awt.Color(255, 255, 255));
        contRoboides.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contRoboides.setText("           0");
        contRoboides.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contRoboides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contRoboidesActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contRoboides, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 100, -1));

        contRombos.setEditable(false);
        contRombos.setBackground(new java.awt.Color(255, 255, 255));
        contRombos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contRombos.setText("           0");
        contRombos.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contRombos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contRombosActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contRombos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, -1));

        contRectangulos.setEditable(false);
        contRectangulos.setBackground(new java.awt.Color(255, 255, 255));
        contRectangulos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contRectangulos.setText("           0");
        contRectangulos.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contRectangulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contRectangulosActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contRectangulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 100, -1));

        contCuadrados.setEditable(false);
        contCuadrados.setBackground(new java.awt.Color(255, 255, 255));
        contCuadrados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contCuadrados.setText("           0");
        contCuadrados.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        ventanaEstadisticas.getContentPane().add(contCuadrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, -1));

        contTrianguloEquilatero.setEditable(false);
        contTrianguloEquilatero.setBackground(new java.awt.Color(255, 255, 255));
        contTrianguloEquilatero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contTrianguloEquilatero.setText("           0");
        contTrianguloEquilatero.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        ventanaEstadisticas.getContentPane().add(contTrianguloEquilatero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 100, -1));

        contTrianguloiEscalenos.setEditable(false);
        contTrianguloiEscalenos.setBackground(new java.awt.Color(255, 255, 255));
        contTrianguloiEscalenos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contTrianguloiEscalenos.setText("           0");
        contTrianguloiEscalenos.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contTrianguloiEscalenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contTrianguloiEscalenosActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contTrianguloiEscalenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, -1));

        contTrianguloisoceles1.setEditable(false);
        contTrianguloisoceles1.setBackground(new java.awt.Color(255, 255, 255));
        contTrianguloisoceles1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contTrianguloisoceles1.setText("           0");
        contTrianguloisoceles1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contTrianguloisoceles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contTrianguloisoceles1ActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contTrianguloisoceles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 100, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Trapezoide");
        ventanaEstadisticas.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 80, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Trapecio");
        ventanaEstadisticas.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Romboide");
        ventanaEstadisticas.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Rombo");
        ventanaEstadisticas.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Rectángulo");
        ventanaEstadisticas.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Cuadrado");
        ventanaEstadisticas.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Triángulo Escalenos");
        ventanaEstadisticas.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Triángulo Isóceles");
        ventanaEstadisticas.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Triángulo Equilátero");
        ventanaEstadisticas.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 20));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/figures.jpg"))); // NOI18N
        jLabel20.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel20.setMinimumSize(new java.awt.Dimension(900, 900));
        jLabel20.setPreferredSize(new java.awt.Dimension(1000, 1000));
        ventanaEstadisticas.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 520));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ventanaEstadisticas.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProceder.setBackground(new java.awt.Color(153, 255, 204));
        btnProceder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnProceder.setText("Proceder");
        btnProceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcederActionPerformed(evt);
            }
        });
        jPanel1.add(btnProceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 100, -1));

        cmbOpciones.setBackground(new java.awt.Color(153, 255, 204));
        cmbOpciones.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione.", "3 Puntos", "4 Puntos" }));
        cmbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOpcionesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 240, -1));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 110, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("                        Identificador de figuras geometricas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 60, 470, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/e0b133d203ae68dc61d0ac7436fc518e--drawing-letters-elements-of-art.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 450, 300));

        javax.swing.GroupLayout ventanaPrincLayout = new javax.swing.GroupLayout(ventanaPrinc);
        ventanaPrinc.setLayout(ventanaPrincLayout);
        ventanaPrincLayout.setHorizontalGroup(
            ventanaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaPrincLayout.setVerticalGroup(
            ventanaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        getContentPane().add(ventanaPrinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnIdentificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdentificarActionPerformed
        Graphics p = panelDibujar.getGraphics();
        Vector v = new Vector();
        v.Plano(p);
        Calculo calculo = new Calculo();
        int conttrianguloEq = 0;
        int conttrianguloIs = 0;
        int conttrianguloEs = 0;
        int conttrapecio = 0;
        int contcua = 0;
        int contrect = 0;
        int contromboide = 0;
        int conttrapezoide = 0;
        int contrombo = 0;
        try {
            contcua = Integer.parseInt(contCuadrados.getText());
            contrect = Integer.parseInt(contRectangulos.getText());
            contromboide = Integer.parseInt(contRoboides.getText());
            contrombo = Integer.parseInt(contRombos.getText());
            conttrapecio = Integer.parseInt(contTrapecios.getText());
            conttrapezoide = Integer.parseInt(contTrapezoides.getText());
            conttrianguloEq = Integer.parseInt(contTrianguloEquilatero.getText());
            conttrianguloIs = Integer.parseInt(contTrianguloiEscalenos.getText());
            conttrianguloEs = Integer.parseInt(contTrianguloiEscalenos.getText());
        } catch (NumberFormatException numberFormatException) {
        }
        if (cantPuntos == 4) {
            //Separacion de coordenadas Strings y se convierten a double guardandolas en variables
            double ax = 0;
            double ay = 0;
            double bx = 0;
            double by = 0;
            double cx = 0;
            double cy = 0;
            double dx = 0;
            double dy = 0;
            try {
                String[] coordenada1;
                coordenada1 = txtPunto1.getText().split(",");
                ax = Double.valueOf(coordenada1[0]);
                ay = Double.valueOf(coordenada1[1]);
                
                String[] coordenada2;
                coordenada2 = txtPunto2.getText().split(",");
                bx = Double.valueOf(coordenada2[0]);
                by = Double.valueOf(coordenada2[1]);
                
                String[] coordenada3;
                coordenada3 = txtPunto3.getText().split(",");
                cx = Double.valueOf(coordenada3[0]);
                cy = Double.valueOf(coordenada3[1]);
                
                String[] coordenada4;
                coordenada4 = txtPunto4.getText().split(",");
                dx = Double.valueOf(coordenada4[0]);
                dy = Double.valueOf(coordenada4[1]);
            } catch (NumberFormatException numberFormatException) {
            }

            if (calculo.isError() == false) {
                lblResultado.setText(calculo.getPerimetroCuadrado());

            } else if (calculo.isError() == true) {
                JOptionPane.showMessageDialog(null, "[ERROR] No ingresó un dato en un campo,\n o ingresó un caractér no permitido.");
            }

            if (calculo.isError() == false && ax >= -20 && ay >= -20 && bx >= -20 && by >= -20 && cx >= -20 && cy >= -20 && dx >= -20 && dy >= -20
                    && ax <= 20 && ay <= 20 && bx <= 20 && by <= 20 && cx <= 20 && cy <= 20 && dx <= 20 && dy <= 20) {
                calculo.punto1Cuadrado(ax, ay, bx, by);
                calculo.punto2Cuadrado(bx, by, cx, cy);
                calculo.punto3Cuadrado(cx, cy, dx, dy);
                calculo.punto4Cuadrado(dx, dy, ax, ay);
            } else {
                JOptionPane.showMessageDialog(null, "Los numeros ingresados no cumplen con los requisitos");

            }

            v.DibujarPlanoYFigura(300, 300, ax, ay, p);

        } else if (cantPuntos == 3) {
            double ax = 0;
            double ay = 0;
            double bx = 0;
            double by = 0;
            double cx = 0;
            double cy = 0;
            try {
                String[] coordenada1;
                coordenada1 = txtPunto1.getText().split(",");
                ax = Double.valueOf(coordenada1[0]);
                ay = Double.valueOf(coordenada1[1]);
                
                String[] coordenada2;
                coordenada2 = txtPunto2.getText().split(",");
                bx = Double.valueOf(coordenada2[0]);
                by = Double.valueOf(coordenada2[1]);
                
                String[] coordenada3;
                coordenada3 = txtPunto3.getText().split(",");
                cx = Double.valueOf(coordenada3[0]);
                cy = Double.valueOf(coordenada3[1]);
            } catch (NumberFormatException numberFormatException) {
            }

            if (ax >= -20 && ay >= -20 && bx >= -20 && by >= -20 && cx >= -20 && cy >= -20
                    && ax <= 20 && ay <= 20 && bx <= 20 && by <= 20 && cx <= 20 && cy <= 20) {
                calculo.punto1Triangulo(ax, ay, bx, by);
                calculo.punto2Triangulo(bx, by, cx, cy);

                calculo.punto3Triangulo(cx, cy, ax, ay);

            } else {
                JOptionPane.showMessageDialog(null, "Los numeros ingresados no cumplen con los requisitos");

            }

            if (calculo.isError() == false) {
                lblResultado.setText(calculo.getPerimetroTriangulo());
            } else {
                JOptionPane.showMessageDialog(null, "[ERROR] No ingresó un dato en un campo,\n o ingresó un caractér no permitido.");
            }
        }

        if (cantPuntos == 3) {
            //si todos son iguales
            if (calculo.getResultadoTAB() == calculo.getResultadoTBC()
                    && calculo.getResultadoTBC() == calculo.getResultadoTAC()
                    && calculo.getResultadoTAC() == calculo.getResultadoTAB()) {

                p = panelDibujar.getGraphics();
                v = new Vector();
                v.Plano(p);
                System.out.println("Triangulo Equilatero");
                conttrianguloEq += 1;
                contTrianguloEquilatero.setText(String.valueOf(conttrianguloEq));
            } else if (calculo.getResultadoTAB() == calculo.getResultadoTBC()
                    || calculo.getResultadoTBC() == calculo.getResultadoTAC()
                    || calculo.getResultadoTAC() == calculo.getResultadoTAB()) {
                p = panelDibujar.getGraphics();
                v = new Vector();
                v.Plano(p);
                System.out.println("Triangulo Isoceles");
                
                conttrianguloIs += 1;
                
                contTrianguloisoceles1.setText(String.valueOf(conttrianguloIs));
            } else {
                System.out.println("triangulo escaleno");
                conttrianguloEs += 1;
                
                contTrianguloiEscalenos.setText(String.valueOf(conttrianguloEs));
            }

        }
        if (cantPuntos == 4) {
            boolean trapecio = false;
            boolean cuadrado = false;
            boolean rombo = false;
            boolean rectangulo = false;
            boolean romboide = false;
            boolean trapezoide = false;

            if ((calculo.getResultadoAB() == calculo.getResultadoCD())
                    && (calculo.getResultadoCD() == calculo.getResultadoAD())
                    && (calculo.getResultadoAD() == calculo.getResultadoAB())) {
                if ((calculo.getA() - Math.floor(calculo.getA())) == (double) 0.0) {
                    cuadrado = true;
                } else {
                    rombo = true;
                }

            } else if (calculo.getResultadoAB() == calculo.getResultadoCD()
                    && calculo.getResultadoAD() == calculo.getResultadoBC()
                    && calculo.getResultadoAB() != calculo.getResultadoAD()
                    && calculo.getResultadoCD() != calculo.getResultadoBC()
                    && calculo.getResultadoAB() != calculo.getResultadoBC()
                    && calculo.getResultadoCD() != calculo.getResultadoAD()) {
                if ((calculo.getA() - Math.floor(calculo.getA()) == 0)) {
                    rectangulo = true;
                } else {
                    romboide = true;
                }
            } else if ((calculo.getResultadoAB() * 2) == (calculo.getResultadoCD() - calculo.getResultadoAB())
                    || (calculo.getResultadoAD() * 2) == (calculo.getResultadoBC() - calculo.getResultadoAD())) {
                trapecio = true;
            }
            if (trapecio == false && cuadrado == false && rectangulo == false && rombo == false && romboide == false) {
                trapezoide = true;
            }

            if (trapecio == true) {
                System.out.println("Trapecio");
                conttrapecio += 1;
                contTrapecios.setText(String.valueOf(conttrapecio));
            } else if (cuadrado == true) {
                System.out.println("cuadrado");
                contcua += 1;
                
                contCuadrados.setText(String.valueOf(contcua));
            } else if (rectangulo == true) {
                System.out.println("rectangulo");
                contrect += 1;
                contRectangulos.setText(String.valueOf(contrect));
            } else if (romboide == true) {
                System.out.println("romboide");
                contromboide+=1;
                
                contRoboides.setText(String.valueOf(contromboide));
            } else if (trapezoide == true) {
                System.out.println("trapezoide");
                conttrapezoide+=1;
                
                contTrapezoides.setText(String.valueOf(conttrapezoide));
            } else if (rombo == true) {
                System.out.println("Rombo");
                contrombo+=1;
                
                contRombos.setText(String.valueOf(contrombo));
            } else {
                System.err.println("[Error]NO SE DETECTO NINGUNA FIGURA, LO SENTIMOS");
            }

        }
    }//GEN-LAST:event_btnIdentificarActionPerformed

    private void txtPunto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPunto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPunto4ActionPerformed

    private void txtPunto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPunto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPunto1ActionPerformed

    private void btnProcederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcederActionPerformed

        if (cantPuntos == 3) {
            lblB4.setVisible(false);
            txtPunto4.setVisible(false);
            cb4.setVisible(false);
            ventanaCalc.setBounds(ventanaPrinc.getX(), ventanaPrinc.getY(), 950, 700);
            ventanaCalc.setVisible(true);
            ventanaCalc.setFocusable(true);
            lblResultado1.setText("Perimetro Triangulo: ");
            Graphics p = panelDibujar.getGraphics();
            Vector v = new Vector();
            v.Plano(p);

        } else if (cantPuntos == 4) {
            cb4.setVisible(true);
            ventanaCalc.setBounds(ventanaPrinc.getX(), ventanaPrinc.getY(), 950, 700);
            ventanaCalc.setVisible(true);
            ventanaCalc.setFocusable(true);
            lblResultado1.setText("Perimetro Cuadrado: ");

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion porfavor.");
        }


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

    private void btnEliminarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPuntosActionPerformed
        if (cb1.isSelected()) {
            txtPunto1.setText("");
            cb1.setSelected(false);
        }
        if (cb2.isSelected()) {
            txtPunto2.setText("");
            cb2.setSelected(false);
        }
        if (cb3.isSelected()) {
            txtPunto3.setText("");
            cb3.setSelected(false);
        }
        if (cb4.isSelected()) {
            txtPunto4.setText("");
            cb4.setSelected(false);
        }

    }//GEN-LAST:event_btnEliminarPuntosActionPerformed

    private void contTrapeciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contTrapeciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contTrapeciosActionPerformed

    private void contRoboidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contRoboidesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contRoboidesActionPerformed

    private void contRombosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contRombosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contRombosActionPerformed

    private void contRectangulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contRectangulosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contRectangulosActionPerformed

    private void contTrianguloiEscalenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contTrianguloiEscalenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contTrianguloiEscalenosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ventanaEstadisticas.setVisible(true);
        ventanaEstadisticas.setFocusCycleRoot(true);
        

    }//GEN-LAST:event_btnSalirActionPerformed

    private void contTrianguloisoceles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contTrianguloisoceles1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contTrianguloisoceles1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }

        });
        //codigo a ejecutarse al comienzo
        Interfaz i = new Interfaz();
        i.ventanaCalc.setBounds(100, 100, 1240, 1240);

        //termino de codigo
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaNota;
    private javax.swing.JButton btnEliminarPuntos;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnIdentificar;
    private javax.swing.JButton btnProceder;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JComboBox<String> cmbOpciones;
    private javax.swing.JTextField contCuadrados;
    private javax.swing.JTextField contRectangulos;
    private javax.swing.JTextField contRoboides;
    private javax.swing.JTextField contRombos;
    private javax.swing.JTextField contTrapecios;
    private javax.swing.JTextField contTrapezoides;
    private javax.swing.JTextField contTrianguloEquilatero;
    private javax.swing.JTextField contTrianguloiEscalenos;
    private javax.swing.JTextField contTrianguloisoceles1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
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
    private javax.swing.JInternalFrame ventanaEstadisticas;
    private javax.swing.JInternalFrame ventanaExtra;
    private javax.swing.JPanel ventanaPrinc;
    // End of variables declaration//GEN-END:variables
}
