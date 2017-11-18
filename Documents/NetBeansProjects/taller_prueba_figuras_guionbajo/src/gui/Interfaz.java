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
        btnIdentificar = new javax.swing.JButton();
        btnEliminarPuntos = new javax.swing.JButton();
        areaNota = new javax.swing.JTextArea();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        panelDibujar = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblperimetro = new javax.swing.JLabel();
        lblResultado1 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblResultado2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnTraslacion = new javax.swing.JButton();
        fondoA = new javax.swing.JLabel();
        ventanaEstadisticas = new javax.swing.JFrame();
        contTrapezoides = new javax.swing.JTextField();
        contTrapecios = new javax.swing.JTextField();
        contRoboides = new javax.swing.JTextField();
        contRombos = new javax.swing.JTextField();
        contRectangulos = new javax.swing.JTextField();
        contCuadrados = new javax.swing.JTextField();
        contTrianguloEquilatero = new javax.swing.JTextField();
        contTrianguloiEscalenos = new javax.swing.JTextField();
        contTrianguloisoceles1 = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JToggleButton();
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
        ventanaExtra = new javax.swing.JFrame();
        ventanaPanel = new javax.swing.JPanel();
        btnRegr = new javax.swing.JButton();
        btnCalculoTralacion = new javax.swing.JButton();
        txtVtraslacion = new javax.swing.JTextField();
        lblVect = new javax.swing.JLabel();
        p4 = new javax.swing.JTextField();
        p3 = new javax.swing.JTextField();
        p2 = new javax.swing.JTextField();
        p1 = new javax.swing.JTextField();
        lblp4 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        lblp1 = new javax.swing.JLabel();
        lblfnd = new javax.swing.JLabel();
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
        areaNota.setText("NOTA: Solo puede ingresar\nnumeros menores o iguales\na 10.\n\n\nEJ: \" 10,10 (Maximo) \" \n    \" -10,-10(Minimo) \".\n\n");
        areaNota.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)));
        ventanaCalc.getContentPane().add(areaNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 250, 140));

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

        javax.swing.GroupLayout panelDibujarLayout = new javax.swing.GroupLayout(panelDibujar);
        panelDibujar.setLayout(panelDibujarLayout);
        panelDibujarLayout.setHorizontalGroup(
            panelDibujarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        panelDibujarLayout.setVerticalGroup(
            panelDibujarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        ventanaCalc.getContentPane().add(panelDibujar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 600, 600));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblperimetro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblperimetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblperimetro.setText("Perimetro :");
        jPanel2.add(lblperimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 90, 30));

        lblResultado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado1.setText("--------------------------");
        jPanel2.add(lblResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 150, 20));

        lblArea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArea.setText("Area :");
        jPanel2.add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 80, 30));

        lblResultado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado2.setText("--------------------------");
        jPanel2.add(lblResultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 150, 20));

        btnRegresar.setBackground(new java.awt.Color(153, 255, 255));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));

        btnTraslacion.setBackground(new java.awt.Color(153, 255, 255));
        btnTraslacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTraslacion.setText("Continuar");
        btnTraslacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraslacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnTraslacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 90, -1));

        fondoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/figures.jpg"))); // NOI18N
        jPanel2.add(fondoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 830));

        ventanaCalc.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 660));

        ventanaEstadisticas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contTrapezoides.setEditable(false);
        contTrapezoides.setBackground(new java.awt.Color(255, 255, 255));
        contTrapezoides.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contTrapezoides.setText("0");
        contTrapezoides.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contTrapezoides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contTrapezoidesActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contTrapezoides, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 40, -1));

        contTrapecios.setEditable(false);
        contTrapecios.setBackground(new java.awt.Color(255, 255, 255));
        contTrapecios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contTrapecios.setText("0");
        contTrapecios.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contTrapecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contTrapeciosActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contTrapecios, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 40, -1));

        contRoboides.setEditable(false);
        contRoboides.setBackground(new java.awt.Color(255, 255, 255));
        contRoboides.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contRoboides.setText("0");
        contRoboides.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contRoboides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contRoboidesActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contRoboides, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 40, -1));

        contRombos.setEditable(false);
        contRombos.setBackground(new java.awt.Color(255, 255, 255));
        contRombos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contRombos.setText("0");
        contRombos.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contRombos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contRombosActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contRombos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 40, -1));

        contRectangulos.setEditable(false);
        contRectangulos.setBackground(new java.awt.Color(255, 255, 255));
        contRectangulos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contRectangulos.setText("0");
        contRectangulos.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contRectangulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contRectangulosActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contRectangulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 40, -1));

        contCuadrados.setEditable(false);
        contCuadrados.setBackground(new java.awt.Color(255, 255, 255));
        contCuadrados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contCuadrados.setText("0");
        contCuadrados.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        ventanaEstadisticas.getContentPane().add(contCuadrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 40, -1));

        contTrianguloEquilatero.setEditable(false);
        contTrianguloEquilatero.setBackground(new java.awt.Color(255, 255, 255));
        contTrianguloEquilatero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contTrianguloEquilatero.setText("0");
        contTrianguloEquilatero.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        ventanaEstadisticas.getContentPane().add(contTrianguloEquilatero, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 40, -1));

        contTrianguloiEscalenos.setEditable(false);
        contTrianguloiEscalenos.setBackground(new java.awt.Color(255, 255, 255));
        contTrianguloiEscalenos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contTrianguloiEscalenos.setText("0");
        contTrianguloiEscalenos.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contTrianguloiEscalenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contTrianguloiEscalenosActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contTrianguloiEscalenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 40, -1));

        contTrianguloisoceles1.setEditable(false);
        contTrianguloisoceles1.setBackground(new java.awt.Color(255, 255, 255));
        contTrianguloisoceles1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contTrianguloisoceles1.setText("0");
        contTrianguloisoceles1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 255)));
        contTrianguloisoceles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contTrianguloisoceles1ActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(contTrianguloisoceles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 40, -1));

        btnFinalizar.setBackground(new java.awt.Color(142, 255, 255));
        btnFinalizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        ventanaEstadisticas.getContentPane().add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 270, 80));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Trapezoide");
        ventanaEstadisticas.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 80, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Trapecio");
        ventanaEstadisticas.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Romboide");
        ventanaEstadisticas.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 80, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Rombo");
        ventanaEstadisticas.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 90, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Rectángulo");
        ventanaEstadisticas.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 90, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Cuadrado");
        ventanaEstadisticas.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Triángulo Escalenos");
        ventanaEstadisticas.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 120, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Triángulo Isóceles");
        ventanaEstadisticas.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 110, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Triángulo Equilátero");
        ventanaEstadisticas.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 140, 20));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/figures.jpg"))); // NOI18N
        jLabel20.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel20.setMinimumSize(new java.awt.Dimension(900, 900));
        jLabel20.setPreferredSize(new java.awt.Dimension(1000, 1000));
        ventanaEstadisticas.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 560));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ventanaEstadisticas.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ventanaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegr.setBackground(new java.awt.Color(204, 240, 240));
        btnRegr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegr.setText("Regresar");
        btnRegr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegrActionPerformed(evt);
            }
        });
        ventanaPanel.add(btnRegr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        btnCalculoTralacion.setBackground(new java.awt.Color(204, 255, 255));
        btnCalculoTralacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCalculoTralacion.setText("Continuar");
        btnCalculoTralacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoTralacionActionPerformed(evt);
            }
        });
        ventanaPanel.add(btnCalculoTralacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 90, 30));

        txtVtraslacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        txtVtraslacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVtraslacionActionPerformed(evt);
            }
        });
        ventanaPanel.add(txtVtraslacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 140, 30));

        lblVect.setBackground(new java.awt.Color(204, 255, 255));
        lblVect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVect.setText("       Ingresar vector de traslación");
        ventanaPanel.add(lblVect, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 230, 20));

        p4.setEditable(false);
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });
        ventanaPanel.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 80, 20));

        p3.setEditable(false);
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        ventanaPanel.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 20));

        p2.setEditable(false);
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        ventanaPanel.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, 20));

        p1.setEditable(false);
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        ventanaPanel.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 80, 20));

        lblp4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblp4.setText("punto 4");
        ventanaPanel.add(lblp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 20));

        lblp3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblp3.setText("punto 3");
        ventanaPanel.add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, 30));

        lblp2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblp2.setText("punto 2");
        ventanaPanel.add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 30));

        lblp1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblp1.setText("punto 1");
        ventanaPanel.add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 30));

        lblfnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/figures.jpg"))); // NOI18N
        lblfnd.setFocusCycleRoot(true);
        ventanaPanel.add(lblfnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 430));

        javax.swing.GroupLayout ventanaExtraLayout = new javax.swing.GroupLayout(ventanaExtra.getContentPane());
        ventanaExtra.getContentPane().setLayout(ventanaExtraLayout);
        ventanaExtraLayout.setHorizontalGroup(
            ventanaExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(ventanaExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventanaExtraLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ventanaExtraLayout.setVerticalGroup(
            ventanaExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(ventanaExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventanaExtraLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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
        
        ventanaCalc.setVisible(false);
        txtPunto1.setText("");
        txtPunto2.setText("");
        txtPunto3.setText("");
        txtPunto4.setText("");
        lblResultado1.setText("-----------------------");
        cmbOpciones.setSelectedIndex(0);
        lblB4.setVisible(true);
        txtPunto4.setVisible(true);
        ventanaPrinc.setFocusCycleRoot(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnIdentificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdentificarActionPerformed

        Graphics p = panelDibujar.getGraphics();
        Vector v = new Vector();

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
        } catch (Exception numberFormatException) {
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
            } catch (Exception numberFormatException) {

            }

            if (calculo.isError() == false) {
                lblResultado1.setText(calculo.getPerimetroCuadrado());

            } else if (calculo.isError() == true) {
                JOptionPane.showMessageDialog(null, "[ERROR] No ingresó un dato en un campo,\n o ingresó un caractér no permitido.");
            }

            if (calculo.isError() == false && ax >= -10 && ay >= -10 && bx >= -10 && by >= -10 && cx >= -10 && cy >= -10 && dx >= -10 && dy >= -10
                    && ax <= 10 && ay <= 10 && bx <= 10 && by <= 10 && cx <= 10 && cy <= 10 && dx <= 10 && dy <= 10) {
                calculo.punto1Cuadrado(ax, ay, bx, by);
                calculo.punto2Cuadrado(bx, by, cx, cy);
                calculo.punto3Cuadrado(cx, cy, dx, dy);
                calculo.punto4Cuadrado(dx, dy, ax, ay);
                v.DibujarPlanoYCuadrado(ax, ay, bx, by, cx, cy, dx, dy, p);
            } else {
                JOptionPane.showMessageDialog(null, "Los numeros ingresados no cumplen con los requisitos");

            }

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
            } catch (Exception numberFormatException) {
            }

            if (ax >= -10 && ay >= -10 && bx >= -10 && by >= -10 && cx >= -10 && cy >= -10
                    && ax <= 10 && ay <= 10 && bx <= 10 && by <= 10 && cx <= 10 && cy <= 10) {
                calculo.punto1Triangulo(ax, ay, bx, by);
                calculo.punto2Triangulo(bx, by, cx, cy);
                calculo.punto3Triangulo(cx, cy, ax, ay);

                v.DibujarPlanoYTriangulo(ax, ay, bx, by, cx, cy, p);

            } else {
                JOptionPane.showMessageDialog(null, "Los numeros ingresados no cumplen con los requisitos");

            }

            if (calculo.isError() == false) {
                lblResultado1.setText(calculo.getPerimetroTriangulo());

            } else {
                JOptionPane.showMessageDialog(null, "[ERROR] No ingresó un dato en un campo,\n o ingresó un caractér no permitido.");
            }

        }

        if (cantPuntos == 3) {
            //si todos son iguales
            if (calculo.getResultadoTAB() == calculo.getResultadoTBC()
                    && calculo.getResultadoTBC() == calculo.getResultadoTAC()
                    && calculo.getResultadoTAC() == calculo.getResultadoTAB()) {
                System.out.println("Triangulo Equilatero");
                lblResultado2.setText(calculo.getAreaTrianguloEquilatero());
                conttrianguloEq += 1;
                contTrianguloEquilatero.setText(String.valueOf(conttrianguloEq));
            } else if (calculo.getResultadoTAB() == calculo.getResultadoTBC()
                    || calculo.getResultadoTBC() == calculo.getResultadoTAC()
                    || calculo.getResultadoTAC() == calculo.getResultadoTAB()) {

                System.out.println("Triangulo Isoceles");
                conttrianguloIs += 1;
                lblResultado2.setText(calculo.getAreaTrianguloIsosceles());

                contTrianguloisoceles1.setText(String.valueOf(conttrianguloIs));
            } else {
                System.out.println("triangulo escaleno");
                lblResultado2.setText(calculo.getAreaTrianguloEscaleno());
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
                lblResultado2.setText(calculo.getAreaTrapecio());
                contTrapecios.setText(String.valueOf(conttrapecio));
            } else if (cuadrado == true) {
                System.out.println("cuadrado");
                contcua += 1;
                lblResultado2.setText(calculo.getAreaCuadrado());
                contCuadrados.setText(String.valueOf(contcua));
            } else if (rectangulo == true) {
                System.out.println("rectangulo");
                contrect += 1;
                contRectangulos.setText(String.valueOf(contrect));
                lblResultado2.setText(calculo.getAreaRectangulo());
            } else if (romboide == true) {
                System.out.println("romboide");
                lblResultado2.setText(calculo.getAreaRomboide());
                contromboide += 1;

                contRoboides.setText(String.valueOf(contromboide));
            } else if (trapezoide == true) {
                System.out.println("trapezoide");
                //REEDUROOO
                conttrapezoide += 1;

                contTrapezoides.setText(String.valueOf(conttrapezoide));
            } else if (rombo == true) {
                System.out.println("Rombo");
                lblResultado2.setText(calculo.getAreaRombo());
                contrombo += 1;
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
            lblperimetro.setText("Perimetro Triangulo: ");

        } else if (cantPuntos == 4) {
            cb4.setVisible(true);
            ventanaCalc.setBounds(ventanaPrinc.getX(), ventanaPrinc.getY(), 950, 700);
            ventanaCalc.setVisible(true);
            ventanaCalc.setFocusable(true);
            lblperimetro.setText("Perimetro Cuadrado: ");

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
        ventanaEstadisticas.setFocusable(true);
        ventanaEstadisticas.setVisible(true);
        ventanaEstadisticas.setBounds(0, 0, 690, 550);
        ventanaPrinc.setVisible(false);


    }//GEN-LAST:event_btnSalirActionPerformed

    private void contTrianguloisoceles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contTrianguloisoceles1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contTrianguloisoceles1ActionPerformed

    private void btnTraslacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraslacionActionPerformed

        ventanaExtra.setBounds(0, 0, 620, 460);
        ventanaExtra.setFocusCycleRoot(true);
        ventanaExtra.setVisible(true);
        p1.setText(txtPunto1.getText());
        p2.setText(txtPunto2.getText());
        p3.setText(txtPunto3.getText());
        p4.setText(txtPunto4.getText());
        if (cantPuntos == 3) {
            lblp4.setVisible(false);
            p4.setVisible(false);
        }

    }//GEN-LAST:event_btnTraslacionActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void contTrapezoidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contTrapezoidesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contTrapezoidesActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed

    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed

    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed

    }//GEN-LAST:event_p3ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed

    }//GEN-LAST:event_p4ActionPerformed

    private void btnCalculoTralacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoTralacionActionPerformed

        String[] c1;
        String[] c2;
        String[] c3;
        String[] c4;
        String[] c0;
        double pa1, pa2, pb1, pb2, pc1, pc2, pd1, pd2, v1, v2;

        if (cantPuntos == 3) {
            c0 = txtVtraslacion.getText().split(",");
            v1 = Double.valueOf(c0[0]);
            v2 = Double.valueOf(c0[1]);
            c1 = p1.getText().split(",");
            pa1 = Double.valueOf(c1[0]) + v1;
            pa2 = Double.valueOf(c1[1]) + v2;

            c2 = p2.getText().split(",");
            pb1 = Double.valueOf(c2[0]) + v1;
            pb2 = Double.valueOf(c2[1]) + v2;

            c3 = p3.getText().split(",");
            pc1 = Double.valueOf(c3[0]) + v1;
            pc2 = Double.valueOf(c3[1]) + v2;

            p1.setText(pa1 + "," + pa2);
            p2.setText(pb1 + "," + pb2);
            p3.setText(pc1 + "," + pc2);

        } else if (cantPuntos == 4) {
            c0 = txtVtraslacion.getText().split(",");
            v1 = Double.valueOf(c0[0]);
            v2 = Double.valueOf(c0[1]);
            c1 = p1.getText().split(",");
            pa1 = Double.valueOf(c1[0]) + v1;
            pa2 = Double.valueOf(c1[1]) + v2;

            c2 = p2.getText().split(",");
            pb1 = Double.valueOf(c2[0]) + v1;
            pb2 = Double.valueOf(c2[1]) + v2;

            c3 = p3.getText().split(",");
            pc1 = Double.valueOf(c3[0]) + v1;
            pc2 = Double.valueOf(c3[1]) + v2;

            c4 = p4.getText().split(",");
            pd1 = Double.valueOf(c4[0]) + v1;
            pd2 = Double.valueOf(c4[1]) + v2;

            p1.setText(pa1 + "," + pa2);
            p2.setText(pb1 + "," + pb2);
            p3.setText(pc1 + "," + pc2);
            p4.setText(pd1 + "," + pd2);

        }


    }//GEN-LAST:event_btnCalculoTralacionActionPerformed

    private void txtVtraslacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVtraslacionActionPerformed

    }//GEN-LAST:event_txtVtraslacionActionPerformed

    private void btnRegrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegrActionPerformed

        String[] c1;
        String[] c2;
        String[] c3;
        String[] c4;
        String[] c0;
        double pa1, pa2, pb1, pb2, pc1, pc2, pd1, pd2, v1, v2;

        if (cantPuntos == 3) {
            c0 = txtVtraslacion.getText().split(",");
            v1 = Double.valueOf(c0[0]);
            v2 = Double.valueOf(c0[1]);
            c1 = p1.getText().split(",");
            pa1 = Double.valueOf(c1[0]) + v1;
            pa2 = Double.valueOf(c1[1]) + v2;

            c2 = p2.getText().split(",");
            pb1 = Double.valueOf(c2[0]) + v1;
            pb2 = Double.valueOf(c2[1]) + v2;

            c3 = p3.getText().split(",");
            pc1 = Double.valueOf(c3[0]) + v1;
            pc2 = Double.valueOf(c3[1]) + v2;

            txtPunto1.setText(pa1 + "," + pa2);
            txtPunto2.setText(pb1 + "," + pb2);
            txtPunto3.setText(pc1 + "," + pc2);

        } else if (cantPuntos == 4) {
            c0 = txtVtraslacion.getText().split(",");
            v1 = Double.valueOf(c0[0]);
            v2 = Double.valueOf(c0[1]);
            c1 = p1.getText().split(",");
            pa1 = Double.valueOf(c1[0]) + v1;
            pa2 = Double.valueOf(c1[1]) + v2;

            c2 = p2.getText().split(",");
            pb1 = Double.valueOf(c2[0]) + v1;
            pb2 = Double.valueOf(c2[1]) + v2;

            c3 = p3.getText().split(",");
            pc1 = Double.valueOf(c3[0]) + v1;
            pc2 = Double.valueOf(c3[1]) + v2;

            c4 = p4.getText().split(",");
            pd1 = Double.valueOf(c4[0]) + v1;
            pd2 = Double.valueOf(c4[1]) + v2;

            txtPunto1.setText(pa1 + "," + pa2);
            txtPunto2.setText(pb1 + "," + pb2);
            txtPunto3.setText(pc1 + "," + pc2);
            txtPunto4.setText(pd1 + "," + pd2);

        }

        ventanaExtra.setVisible(false);
        p1.setText("");
        p2.setText("");
        p3.setText("");
        p4.setText("");
        txtVtraslacion.setText("");

    }//GEN-LAST:event_btnRegrActionPerformed

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
    private javax.swing.JButton btnCalculoTralacion;
    private javax.swing.JButton btnEliminarPuntos;
    private javax.swing.JToggleButton btnFinalizar;
    private javax.swing.JButton btnIdentificar;
    private javax.swing.JButton btnProceder;
    private javax.swing.JButton btnRegr;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTraslacion;
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
    private javax.swing.JLabel fondoA;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblB1;
    private javax.swing.JLabel lblB2;
    private javax.swing.JLabel lblB3;
    private javax.swing.JLabel lblB4;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JLabel lblResultado2;
    private javax.swing.JLabel lblVect;
    private javax.swing.JLabel lblfnd;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    private javax.swing.JLabel lblp4;
    private javax.swing.JLabel lblperimetro;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p3;
    private javax.swing.JTextField p4;
    private javax.swing.JPanel panelDibujar;
    private javax.swing.JTextField txtPunto1;
    private javax.swing.JTextField txtPunto2;
    private javax.swing.JTextField txtPunto3;
    private javax.swing.JTextField txtPunto4;
    private javax.swing.JTextField txtVtraslacion;
    private javax.swing.JFrame ventanaCalc;
    private javax.swing.JFrame ventanaEstadisticas;
    private javax.swing.JFrame ventanaExtra;
    private javax.swing.JPanel ventanaPanel;
    private javax.swing.JPanel ventanaPrinc;
    // End of variables declaration//GEN-END:variables
}
