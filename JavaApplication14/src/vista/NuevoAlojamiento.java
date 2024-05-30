/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import parquenatural.Alojamiento;
import parquenatural.Animal;

/**
 *
 * @author law
 */
public class NuevoAlojamiento extends javax.swing.JFrame {

    /**
     * Creates new form NuevaEspecieAnimal
     */
    
    private Alojamiento nuevaAlojamiento = new Alojamiento();
    
    public NuevoAlojamiento() {
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
        lab_periodo_celo = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        campo_capacidad = new javax.swing.JTextField();
        campo_valor = new javax.swing.JTextField();
        campo_categoria = new javax.swing.JTextField();
        bor_guardarEspecie = new javax.swing.JButton();
        bot_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lab_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lab_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_titulo.setText("Añadir nuevo alojamiento");

        lab_nombre_cientifico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lab_nombre_cientifico.setText("Nombre:");

        lab_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lab_nombre.setText("Capacidad");

        lab_numero_especies.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lab_numero_especies.setText("Valor:");

        lab_periodo_celo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lab_periodo_celo.setText("Categoria");

        campo_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campo_capacidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campo_valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campo_categoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_categoria.setToolTipText("En formato (DD-MM-AAAA)");

        bor_guardarEspecie.setText("Guardar Alojamiento");
        bor_guardarEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bor_guardarEspecieActionPerformed(evt);
            }
        });

        bot_cancelar.setText("Cancelar");

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
                        .addComponent(campo_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lab_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campo_capacidad))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lab_numero_especies, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campo_valor))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lab_periodo_celo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campo_categoria)))
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
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_numero_especies, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_periodo_celo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bor_guardarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bot_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bor_guardarEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bor_guardarEspecieActionPerformed
        String nom_aloj = campo_nombre.getText();
        String cap_aloj = campo_capacidad.getText();
        String val_aloj = campo_valor.getText();
        String cat_aloj = campo_categoria.getText();
        
        if(nom_aloj.equals("") || cap_aloj.equals("") || val_aloj.equals("") || cat_aloj.equals("")){
            JOptionPane.showMessageDialog(this, "Por favor completa todos los campos", "Datos imcompletos", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            boolean guardado_correcto = true;
            ///JOptionPane.showMessageDialog(this, "La nueva especie fue almacenada correctamente en el area", "Especie almacenada", JOptionPane.INFORMATION_MESSAGE);
            int num_capacidad = 0;
            try{
                
                num_capacidad = Integer.parseInt(cap_aloj);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "El numero de la capacidad no es correcto", "Formato incorrecto", JOptionPane.INFORMATION_MESSAGE);
                guardado_correcto = false;
            }
            
            //VALIDAR FECHA AQUI
            /*if(guardado_correcto){
                String[] fecha_pre = fec_cel.split("-");
                fec_cel.
            }*/
            if(guardado_correcto){
                nuevaAlojamiento.setCapacidad(num_capacidad);
                nuevaAlojamiento.setNombre(nom_aloj);
                nuevaAlojamiento.setValor(val_aloj);
                nuevaAlojamiento.setCategoria(cat_aloj);
                
                
                JOptionPane.showMessageDialog(this, "La nueva especie fue almacenada correctamente en el area", "Especie almacenada", JOptionPane.INFORMATION_MESSAGE);
            }
                    
            
            
            
            
        }
    }//GEN-LAST:event_bor_guardarEspecieActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bor_guardarEspecie;
    private javax.swing.JButton bot_cancelar;
    private javax.swing.JTextField campo_capacidad;
    private javax.swing.JTextField campo_categoria;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_valor;
    private javax.swing.JLabel lab_nombre;
    private javax.swing.JLabel lab_nombre_cientifico;
    private javax.swing.JLabel lab_numero_especies;
    private javax.swing.JLabel lab_periodo_celo;
    private javax.swing.JLabel lab_titulo;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
