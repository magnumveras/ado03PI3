/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.magno.senac;

import java.util.Random;

/**
 *
 * @author Magno
 */
public class Exercicio5 extends javax.swing.JFrame {

    /** Creates new form Exercicio5 */
    public Exercicio5() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGGrupo1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LBLEscolhaU = new javax.swing.JLabel();
        LBLEscolhaC = new javax.swing.JLabel();
        LBLPontosUsu = new javax.swing.JLabel();
        LBLPontosPc = new javax.swing.JLabel();
        RBPedra = new javax.swing.JRadioButton();
        RBPapel = new javax.swing.JRadioButton();
        RBTesoura = new javax.swing.JRadioButton();
        BTJogar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        LBLEmpate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Exercício 5"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Você");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Computador");

        LBLEscolhaU.setText("Escolha Usuário ");

        LBLEscolhaC.setText("Escolha Computador");

        LBLPontosUsu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLPontosUsu.setText("0");

        LBLPontosPc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLPontosPc.setText("0");

        BGGrupo1.add(RBPedra);
        RBPedra.setText("Pedra");

        BGGrupo1.add(RBPapel);
        RBPapel.setText("Papel");

        BGGrupo1.add(RBTesoura);
        RBTesoura.setText("Tesoura");

        BTJogar.setText("JOGAR");
        BTJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTJogarActionPerformed(evt);
            }
        });

        jLabel5.setText("Emptate");

        LBLEmpate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLEmpate.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LBLEscolhaU)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLEscolhaC)
                        .addGap(19, 19, 19)))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(RBPedra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RBPapel)
                .addGap(68, 68, 68)
                .addComponent(RBTesoura)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(BTJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(LBLPontosUsu)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(LBLEmpate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel5)
                        .addGap(55, 55, 55)
                        .addComponent(LBLPontosPc)))
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBPedra)
                    .addComponent(RBPapel)
                    .addComponent(RBTesoura))
                .addGap(18, 18, 18)
                .addComponent(BTJogar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLEscolhaU)
                    .addComponent(LBLEscolhaC))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLPontosUsu)
                    .addComponent(LBLPontosPc)
                    .addComponent(jLabel5))
                .addGap(3, 3, 3)
                .addComponent(LBLEmpate))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int resultadoUsuario(){
        int usuario = 0;
        
        if(RBPedra.isSelected()){
            usuario = 1;
        }else if(RBPapel.isSelected()){
            usuario = 2;
        }else if (RBTesoura.isSelected()){
            usuario = 3;
        }
        
        return usuario;
    }
    
    public int resultadoComputador(){
         //Instância da Classe Randomica
        Random r = new Random();
        
         //Gera números aleatorios entre 1 e 3
        int computador = r.nextInt(3) + 1;
        
        return computador;
    }
    
    public int jogarPPT(int usuario, int computador){
        int resultado = 0;
        //Pedra 1, Papel 2, Tesoura 3
        //Usuario 1, Computador 2, Empate 0
        
        //Empate
        if((usuario == 1)&&(computador == 1)){
            resultado = 0;
        //Empate
        }else if((usuario == 2)&&(computador == 2)){
            resultado = 0;
        //Empate
        }else if((usuario == 3)&&(computador == 3)){
            resultado = 0;
        //Pedra e Papel
        }else if((usuario == 1)&&(computador == 2)){
            resultado = 2;
        //Pedra e Tesoura
        }else if((usuario == 1)&&(computador == 3)){
            resultado = 1;
        //Papel e Pedra
        }else if((usuario == 2)&&(computador == 1)){
            resultado = 1;
        //Papel e Tesoura
        }else if((usuario == 2)&&(computador == 3)){
            resultado = 2;
        //Tesoura e Pedra
        }else if((usuario == 3)&&(computador == 1)){
            resultado = 2;
        //Tesoura e Papel
        }else if((usuario == 3)&&(computador == 2)){
            resultado = 1;
        }
        
        
        
        return resultado;
    }
    
    private void BTJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTJogarActionPerformed
        // TODO add your handling code here:
        int escolhaU, escolhaC;
        int resultado; 
        escolhaU = resultadoUsuario();
        escolhaC = resultadoComputador();
        
        resultado = jogarPPT(escolhaU, escolhaC);
        
        if(escolhaU == 1){
            LBLEscolhaU.setText("Pedra");
        }else if(escolhaU == 2){
            LBLEscolhaU.setText("Papel");
        }else if(escolhaU == 3){
            LBLEscolhaU.setText("Tesoura");
        }
        
        if(escolhaC == 1){
            LBLEscolhaC.setText("Pedra");
        }else if(escolhaC == 2){
            LBLEscolhaC.setText("Papel");
        }else if(escolhaC == 3){
            LBLEscolhaC.setText("Tesoura");
        }
        
        if(resultado == 0){
            LBLEmpate.setText(String.valueOf(Integer.parseInt(LBLEmpate.getText()) + 1));
        }else if(resultado == 1){
            LBLPontosUsu.setText(String.valueOf(Integer.parseInt(LBLPontosUsu.getText()) + 1));
        }else if(resultado == 2){
            LBLPontosPc.setText(String.valueOf(Integer.parseInt(LBLPontosPc.getText()) + 1));
        }
    }//GEN-LAST:event_BTJogarActionPerformed

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
            java.util.logging.Logger.getLogger(Exercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGGrupo1;
    private javax.swing.JButton BTJogar;
    private javax.swing.JLabel LBLEmpate;
    private javax.swing.JLabel LBLEscolhaC;
    private javax.swing.JLabel LBLEscolhaU;
    private javax.swing.JLabel LBLPontosPc;
    private javax.swing.JLabel LBLPontosUsu;
    private javax.swing.JRadioButton RBPapel;
    private javax.swing.JRadioButton RBPedra;
    private javax.swing.JRadioButton RBTesoura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}