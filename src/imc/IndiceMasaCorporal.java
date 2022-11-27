
package imc;

import javax.swing.JOptionPane;


public class IndiceMasaCorporal extends javax.swing.JFrame {

    
    public IndiceMasaCorporal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaEdad = new javax.swing.JLabel();
        etiquetaPeso = new javax.swing.JLabel();
        etiquetaTalla = new javax.swing.JLabel();
        etiquetaImc = new javax.swing.JLabel();
        etiquetaClasificacion = new javax.swing.JLabel();
        botonResultados = new javax.swing.JButton();
        cajaNombre = new javax.swing.JTextField();
        cajaEdad = new javax.swing.JTextField();
        cajaPeso = new javax.swing.JTextField();
        cajaTalla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Datos ");

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaNombre.setText("Nombre: ");

        etiquetaEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaEdad.setText("Edad: ");

        etiquetaPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaPeso.setText("Peso: ");

        etiquetaTalla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaTalla.setText("Talla: ");

        etiquetaImc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        etiquetaClasificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        botonResultados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonResultados.setText("Obtener resultados");
        botonResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResultadosActionPerformed(evt);
            }
        });

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        cajaEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTalla)
                            .addComponent(etiquetaPeso)
                            .addComponent(etiquetaEdad)
                            .addComponent(etiquetaNombre)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cajaNombre)
                            .addComponent(cajaEdad)
                            .addComponent(cajaPeso)
                            .addComponent(cajaTalla))
                        .addGap(129, 129, 129))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etiquetaClasificacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(etiquetaImc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaNombre)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(etiquetaEdad))
                    .addComponent(cajaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPeso)
                    .addComponent(cajaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTalla)
                    .addComponent(cajaTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(botonResultados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(etiquetaImc, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResultadosActionPerformed
        String nombre = cajaNombre.getText();
        String p = cajaPeso.getText();
        String t = cajaTalla.getText();
        
        double peso = Double.parseDouble(p);
        double talla = Double.parseDouble(t);
        
        double imc = peso / Math.pow(talla, 2);
        
        IndiceMasaCorporal.etiquetaImc.setText("Señor(a) "+nombre+" su IMC es: "+imc);
        
        if (imc < 18.5) {
            IndiceMasaCorporal.etiquetaClasificacion.setText("Su Clasificacion es: Peso inferior al normal ");
        }else if(imc >= 18.5 & imc <= 24.9){
            IndiceMasaCorporal.etiquetaClasificacion.setText("Su Clasificacion es: Normal ");
        }else if(imc >= 25 & imc <=29.9){
            IndiceMasaCorporal.etiquetaClasificacion.setText("Su Clasificacion es: Peso superior al normal ");
        }else {
            IndiceMasaCorporal.etiquetaClasificacion.setText("Su Clasificacion es: Obesidad ");
        }
        
        

    }//GEN-LAST:event_botonResultadosActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaEdadActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndiceMasaCorporal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonResultados;
    private javax.swing.JTextField cajaEdad;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPeso;
    private javax.swing.JTextField cajaTalla;
    public static javax.swing.JLabel etiquetaClasificacion;
    private javax.swing.JLabel etiquetaEdad;
    public static javax.swing.JLabel etiquetaImc;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPeso;
    private javax.swing.JLabel etiquetaTalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
