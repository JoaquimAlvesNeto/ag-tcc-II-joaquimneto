/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import classes.ElementoGA;
import classes.GA;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Cesar-pc-SEMEC
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        x = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        y = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        z = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        painel1 = new javax.swing.JPanel();
        painel2 = new javax.swing.JPanel();
        painel3 = new javax.swing.JPanel();
        painel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("ALGORITMO GENÉTICO");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("PARÂMETROS");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Nº GERAÇÕES");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("TAMANHO DA POPULAÇÃO");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("TX. MUTAÇÃO");

        jButton1.setText("EXECUTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        painel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );

        painel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );

        painel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout painel3Layout = new javax.swing.GroupLayout(painel3);
        painel3.setLayout(painel3Layout);
        painel3Layout.setHorizontalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        painel3Layout.setVerticalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        painel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout painel4Layout = new javax.swing.GroupLayout(painel4);
        painel4.setLayout(painel4Layout);
        painel4Layout.setHorizontalGroup(
            painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        painel4Layout.setVerticalGroup(
            painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("STRING RESULTANTE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(painel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(painel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void gerarGraficoTurmaA(int a, int b, int c, int d, int e){
        
        DefaultPieDataset dpd = new DefaultPieDataset();
        dpd.setValue("Abertura a Experiência", a);
        dpd.setValue("Amabilidade", b);
        dpd.setValue("Conscienciosidade", c);
        dpd.setValue("Extroversão", d);
        dpd.setValue("Neuroticismo", e);
        
        JFreeChart grafico = ChartFactory.createPieChart("Distribuição da Turma A", dpd, true, true, false);
        
        ChartPanel cp = new ChartPanel(grafico, true); //criei o painel de grafico colocando meu grafico previamente gerado
        cp.setSize(painel1.getWidth(),painel1.getHeight()); //setei o tamanho do grafico conforme o painel que usarei
        cp.setVisible(true); 
        painel1.removeAll(); //removi todos os componentes que podem estar no meu painel
        painel1.add(cp);
        painel1.revalidate(); // revalidei meu painel, para que ele se atualize
        painel1.repaint();
        
    }
    
    public void gerarGraficoTurmaB(int a, int b, int c, int d, int e){
        
        DefaultPieDataset dpd = new DefaultPieDataset();
        dpd.setValue("Abertura a Experiência", a);
        dpd.setValue("Amabilidade", b);
        dpd.setValue("Conscienciosidade", c);
        dpd.setValue("Extroversão", d);
        dpd.setValue("Neuroticismo", e);
        
        JFreeChart grafico = ChartFactory.createPieChart("Distribuição da Turma B", dpd, true, true, false);
        
        ChartPanel cp = new ChartPanel(grafico, true); //criei o painel de grafico colocando meu grafico previamente gerado
        cp.setSize(painel2.getWidth(),painel2.getHeight()); //setei o tamanho do grafico conforme o painel que usarei
        cp.setVisible(true); 
        painel2.removeAll(); //removi todos os componentes que podem estar no meu painel
        painel2.add(cp);
        painel2.revalidate(); // revalidei meu painel, para que ele se atualize
        painel2.repaint();
        
    }
    
    public void gerarGraficoTurmaC(int a, int b, int c, int d, int e){
        
        DefaultPieDataset dpd = new DefaultPieDataset();
        dpd.setValue("Abertura a Experiência", a);
        dpd.setValue("Amabilidade", b);
        dpd.setValue("Conscienciosidade", c);
        dpd.setValue("Extroversão", d);
        dpd.setValue("Neuroticismo", e);
        
        JFreeChart grafico = ChartFactory.createPieChart("Distribuição da Turma C", dpd, true, true, false);
        
        ChartPanel cp = new ChartPanel(grafico, true); //criei o painel de grafico colocando meu grafico previamente gerado
        cp.setSize(painel3.getWidth(),painel3.getHeight()); //setei o tamanho do grafico conforme o painel que usarei
        cp.setVisible(true); 
        painel3.removeAll(); //removi todos os componentes que podem estar no meu painel
        painel3.add(cp);
        painel3.revalidate(); // revalidei meu painel, para que ele se atualize
        painel3.repaint();
        
    }
    
    public void gerarGraficoTurmaD(int a, int b, int c, int d, int e){
        
        DefaultPieDataset dpd = new DefaultPieDataset();
        dpd.setValue("Abertura a Experiência", a);
        dpd.setValue("Amabilidade", b);
        dpd.setValue("Conscienciosidade", c);
        dpd.setValue("Extroversão", d);
        dpd.setValue("Neuroticismo", e);
        
        JFreeChart grafico = ChartFactory.createPieChart("Distribuição da Turma D", dpd, true, true, false);
        
        ChartPanel cp = new ChartPanel(grafico, true); //criei o painel de grafico colocando meu grafico previamente gerado
        cp.setSize(painel4.getWidth(),painel4.getHeight()); //setei o tamanho do grafico conforme o painel que usarei
        cp.setVisible(true); 
        painel4.removeAll(); //removi todos os componentes que podem estar no meu painel
        painel4.add(cp);
        painel4.revalidate(); // revalidei meu painel, para que ele se atualize
        painel4.repaint();
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String valor;
        
        int n_gerac = Integer.parseInt(x.getText());
        int t_pop = Integer.parseInt(y.getText());
        double tx_mut = Double.parseDouble(z.getText());
        
        GA meuGA = new GA(n_gerac,t_pop,tx_mut);
        try {
            ElementoGA c = meuGA.executa();
            gerarGraficoTurmaA(c.getPerfilA_turma_A(), c.getPerfilB_turma_A(), c.getPerfilC_turma_A(),
                               c.getPerfilD_turma_A(), c.getPerfilE_turma_A());
            gerarGraficoTurmaB(c.getPerfilA_turma_B(), c.getPerfilB_turma_B(), c.getPerfilC_turma_B(),
                               c.getPerfilD_turma_B(), c.getPerfilE_turma_B());
            gerarGraficoTurmaC(c.getPerfilA_turma_C(), c.getPerfilB_turma_C(), c.getPerfilC_turma_C(),
                               c.getPerfilD_turma_C(), c.getPerfilE_turma_C());
            gerarGraficoTurmaD(c.getPerfilA_turma_D(), c.getPerfilB_turma_D(), c.getPerfilC_turma_D(),
                               c.getPerfilD_turma_D(), c.getPerfilE_turma_D());
            this.resultado.setText(c.getValor());
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JPanel painel4;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField x;
    private javax.swing.JTextField y;
    private javax.swing.JTextField z;
    // End of variables declaration//GEN-END:variables
}