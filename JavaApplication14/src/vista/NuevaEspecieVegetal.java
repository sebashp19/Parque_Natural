/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import parquenatural.Animal;
import parquenatural.Vegetal;

/**
 *
 * @author law
 */
public class NuevaEspecieVegetal extends javax.swing.JFrame {

    /**
     * Creates new form NuevaEspecieAnimal
     */
    
    private Vegetal nuevaEspecie = new Vegetal();
    
    public NuevaEspecieVegetal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lab_titulo = new javax.swing.JLabel();
        lab_nombre_cientifico = new javax.swing.JLabel();
        lab_nombre = new javax.swing.JLabel();
        lab_numero_especies = new javax.swing.JLabel();
        campo_nombre_cient = new javax.swing.JTextField();
        campo_nombre_comun = new javax.swing.JTextField();
        campo_perido_flora = new javax.swing.JTextField();
        bor_guardarEspecie = new javax.swing.JButton();
        bot_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lab_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lab_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_titulo.setText("Añadir especie vegetal");

        lab_nombre_cientifico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lab_nombre_cientifico.setText("Nombre cientifico:");

        lab_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lab_nombre.setText("Nombre común:");

        lab_numero_especies.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lab_numero_especies.setText("Periodo de floración");

        campo_nombre_cient.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campo_nombre_comun.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campo_perido_flora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bor_guardarEspecie.setText("Guardar Especie");
        bor_guardarEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bor_guardarEspecieActionPerformed(evt);
            }
        });

        bot_cancelar.setText("Cancelar");
        bot_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lab_nombre_cientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campo_nombre_cient, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lab_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campo_nombre_comun))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lab_numero_especies, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campo_perido_flora)))
                .addContainerGap())
            .addComponent(bor_guardarEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bot_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(lab_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_nombre_cientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_nombre_cient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_nombre_comun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_numero_especies, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_perido_flora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(bor_guardarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bot_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bor_guardarEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bor_guardarEspecieActionPerformed
        String nom_cie = campo_nombre_cient.getText();
        String nom_com = campo_nombre_comun.getText();
        String per_flo = campo_perido_flora.getText();
        
        if(nom_com.equals("") || nom_cie.equals("")){
            JOptionPane.showMessageDialog(this, "Por favor completa todos los campos", "Datos imcompletos", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
                if(per_flo.equals("")){
                    nuevaEspecie.setFloracion(false);
                }else{
                    nuevaEspecie.setFloracion(true);
                    nuevaEspecie.setPer_floracion(per_flo);
                }
                
                
                nuevaEspecie.setNomcin(nom_cie);
                nuevaEspecie.setNomvul(nom_com);
                
                JOptionPane.showMessageDialog(this, "La nueva especie fue almacenada correctamente en el area", "Especie almacenada", JOptionPane.INFORMATION_MESSAGE);

                
            
            
            
            
        }
    }//GEN-LAST:event_bor_guardarEspecieActionPerformed

    private void bot_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bot_cancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bor_guardarEspecie;
    private javax.swing.JButton bot_cancelar;
    private javax.swing.JTextField campo_nombre_cient;
    private javax.swing.JTextField campo_nombre_comun;
    private javax.swing.JTextField campo_perido_flora;
    private javax.swing.JLabel lab_nombre;
    private javax.swing.JLabel lab_nombre_cientifico;
    private javax.swing.JLabel lab_numero_especies;
    private javax.swing.JLabel lab_titulo;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
