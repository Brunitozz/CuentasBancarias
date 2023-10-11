/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BancoInterbank;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Banco extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    Cuenta[] cuentas; //tamaño de 10
    int num; //contador
    public Banco() {
        this.setContentPane(fondo);
        cuentas = new Cuenta[1000];
        num = 0;
        initComponents();
        jRadioPlazo.setSelected(true);
        jRadioCorriente.setSelected (false);
        jCheckBoxConstructor.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelSaldo = new javax.swing.JLabel();
        jLabelSobregiro = new javax.swing.JLabel();
        jLabelPeriodo = new javax.swing.JLabel();
        jLabelMonto = new javax.swing.JLabel();
        jTextNumero = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextSobregiro = new javax.swing.JTextField();
        jTextSaldo = new javax.swing.JTextField();
        jTextPeriodo = new javax.swing.JTextField();
        jTextMonto = new javax.swing.JTextField();
        jLabelTipoCuenta = new javax.swing.JLabel();
        jRadioPlazo = new javax.swing.JRadioButton();
        jRadioCorriente = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBoxConstructor = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNumero.setBackground(null);
        jLabelNumero.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(0, 86, 158));
        jLabelNumero.setText("Cuenta:");
        jLabelNumero.setOpaque(true);

        jLabelNombre.setBackground(null);
        jLabelNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 86, 158));
        jLabelNombre.setText("Nombre:");
        jLabelNombre.setOpaque(true);

        jLabelSaldo.setBackground(null);
        jLabelSaldo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jLabelSaldo.setForeground(new java.awt.Color(0, 86, 158));
        jLabelSaldo.setText("Saldo:");
        jLabelSaldo.setOpaque(true);

        jLabelSobregiro.setBackground(null);
        jLabelSobregiro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jLabelSobregiro.setForeground(new java.awt.Color(0, 86, 158));
        jLabelSobregiro.setText("Sobregiro:");
        jLabelSobregiro.setOpaque(true);

        jLabelPeriodo.setBackground(null);
        jLabelPeriodo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jLabelPeriodo.setForeground(new java.awt.Color(0, 86, 158));
        jLabelPeriodo.setText("Periodo:");
        jLabelPeriodo.setOpaque(true);

        jLabelMonto.setBackground(null);
        jLabelMonto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jLabelMonto.setForeground(new java.awt.Color(0, 86, 158));
        jLabelMonto.setText("Monto:");
        jLabelMonto.setOpaque(true);

        jTextNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumeroActionPerformed(evt);
            }
        });

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jTextSobregiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSobregiroActionPerformed(evt);
            }
        });

        jTextSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSaldoActionPerformed(evt);
            }
        });

        jTextPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPeriodoActionPerformed(evt);
            }
        });

        jLabelTipoCuenta.setText("Tipo de Cuenta");

        jRadioPlazo.setText("Plazo");
        jRadioPlazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPlazoActionPerformed(evt);
            }
        });

        jRadioCorriente.setText("Corriente");
        jRadioCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCorrienteActionPerformed(evt);
            }
        });

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBoxConstructor.setText("Constructor");
        jCheckBoxConstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxConstructorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTipoCuenta)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jRadioPlazo)
                            .addGap(27, 27, 27)
                            .addComponent(jRadioCorriente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBoxConstructor))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelMonto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelPeriodo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelSobregiro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextSobregiro, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelSaldo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelNombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelNumero)
                            .addGap(52, 52, 52)
                            .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSaldo)
                    .addComponent(jTextSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSobregiro)
                    .addComponent(jTextSobregiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeriodo)
                    .addComponent(jTextPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMonto)
                    .addComponent(jTextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabelTipoCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioPlazo)
                    .addComponent(jRadioCorriente)
                    .addComponent(jCheckBoxConstructor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        num = num + 1;
        try {
            if (num >= cuentas.length) {
                throw new IllegalArgumentException("Arreglo lleno");
            } else {
                long numero = Long.parseLong(jTextNumero.getText());
                String nombre = jTextNombre.getText();
                double saldo = Double.parseDouble(jTextSaldo.getText());
                Date fechaApertura = new Date(); // Obtener la fecha actual
                if (jRadioCorriente.isSelected()) {
                    if (jCheckBoxConstructor.isSelected()) {
                        cuentas[num] = new Corriente(numero, nombre, saldo, fechaApertura);
                    } else {
                        double sobregiro = Double.parseDouble(jTextSobregiro.getText());
                        cuentas[num] = new Corriente(sobregiro, numero, nombre, saldo, fechaApertura);
                    }
                } else {
                    int periodo = Integer.parseInt(jTextPeriodo.getText());
                    cuentas[num] = new Plazo(numero, nombre, saldo, fechaApertura, periodo);
                }
            }
        } catch (IllegalArgumentException rangoExcepcion) {
            num = cuentas.length;
            rangoExcepcion.getMessage();
        }
        // Boton AGREGAR
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioPlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPlazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioPlazoActionPerformed

    private void jCheckBoxConstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxConstructorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxConstructorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cadena = "";
    for (int i = 0; i < cuentas.length; i++) {
        if (cuentas[i] != null) {
            cadena += "Cuenta: " + cuentas[i].getNumero() +
                      "\n Cliente: " + cuentas[i].getNombreCliente() +
                      "\n Saldo: " + cuentas[i].getSaldo() +
                      "\n Fecha de Apertura: " + cuentas[i].getFechaApertura();
            
            if (cuentas[i] instanceof Plazo) {
                Plazo plazoCuenta = (Plazo) cuentas[i];
                cadena += "\n Meses: " + plazoCuenta.getPeriodosMeses() +
                          "\n Fecha Vencimiento: " + plazoCuenta.getFechaVencimiento();
            }
            
            if (cuentas[i] instanceof Corriente) {
                Corriente corrienteCuenta = (Corriente) cuentas[i];
                cadena += "\n Sobregiro: " + corrienteCuenta.getSobregiro();
            }
        }
    }
    JOptionPane.showMessageDialog(null, cadena);
    // Boton MOSTRAR 
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCorrienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioCorrienteActionPerformed

    private void jTextNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNumeroActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSaldoActionPerformed

    private void jTextSobregiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSobregiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSobregiroActionPerformed

    private void jTextPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPeriodoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxConstructor;
    private javax.swing.JLabel jLabelMonto;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JLabel jLabelSobregiro;
    private javax.swing.JLabel jLabelTipoCuenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioCorriente;
    private javax.swing.JRadioButton jRadioPlazo;
    private javax.swing.JTextField jTextMonto;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextPeriodo;
    private javax.swing.JTextField jTextSaldo;
    private javax.swing.JTextField jTextSobregiro;
    // End of variables declaration//GEN-END:variables
    
    class FondoPanel extends javax.swing.JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen =new ImageIcon(getClass().getResource("/Imagenes/BancoFisi.jpg")).getImage();
            g.drawImage(imagen,0, 0,getWidth(),getHeight(), this);
            
            setOpaque(false);
            super.paint(g);
        }
    }


}
