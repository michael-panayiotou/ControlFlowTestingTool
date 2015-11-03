package cei521.controlflowtestingtool;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//this is just a comment
        

import java.awt.Color;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Riginos
 */
public class ControlFlowTestingToolUI extends javax.swing.JFrame {

    /**
     * Creates new form ControlFlowTestingToolUI
     */
    public ControlFlowTestingToolUI() {
        initComponents();
    }
    class HighLightSourceCode extends DefaultHighlighter.DefaultHighlightPainter
    {

        public HighLightSourceCode(Color color) {
            super(color);
        }
        
              
    }
    Highlighter.HighlightPainter myHighlightPainter = new HighLightSourceCode(Color.yellow);  
    
    public void removeHighlight(JTextComponent textComp) {
        Highlighter hilite = textComp.getHighlighter();
        Highlighter.Highlight[] hilites = hilite.getHighlights();
        
        for (int i = 0; i < hilites.length; i++) {
            if (hilites[i].getPainter() instanceof HighLightSourceCode) {
                hilite.removeHighlight(hilites[i]);
            }
        }
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        SourceCodeTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnWhile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnFor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIf = new javax.swing.JButton();
        btnSwitch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SourceCodeTextArea.setColumns(20);
        SourceCodeTextArea.setRows(5);
        jScrollPane1.setViewportView(SourceCodeTextArea);

        jLabel1.setText("Interactive Report Form");

        btnWhile.setText("while");
        btnWhile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhileActionPerformed(evt);
            }
        });

        jLabel2.setText("Loops:");

        jLabel3.setText(": 0");

        btnFor.setText("for");
        btnFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForActionPerformed(evt);
            }
        });

        jLabel4.setText(": 0");

        jLabel5.setText("Conditional Statements:");

        btnIf.setText("if");
        btnIf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIfActionPerformed(evt);
            }
        });

        btnSwitch.setText("switch");
        btnSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwitchActionPerformed(evt);
            }
        });

        jLabel6.setText(": 0");

        jLabel7.setText(": 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnFor)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnWhile)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSwitch)
                                            .addComponent(btnIf))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnWhile)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFor)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIf)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSwitch)
                            .addComponent(jLabel7))))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForActionPerformed
        // TODO add your handling code here:
        highlight(SourceCodeTextArea, "for");
    }//GEN-LAST:event_btnForActionPerformed

    private void btnSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwitchActionPerformed
        // TODO add your handling code here:
        highlight(SourceCodeTextArea, "switch");
    }//GEN-LAST:event_btnSwitchActionPerformed

    private void btnIfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIfActionPerformed
        // TODO add your handling code here:
        highlight(SourceCodeTextArea, "if");
    }//GEN-LAST:event_btnIfActionPerformed

    private void btnWhileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhileActionPerformed
           // TODO add your handling code here:
        highlight(SourceCodeTextArea, "while");
    }//GEN-LAST:event_btnWhileActionPerformed
      
    public void removeComments(JTextComponent textComp) {
        try {
            Document doc;
            doc = textComp.getDocument();
            String text = doc.getText(0, doc.getLength());
            String temptext = (text.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)",""));
            textComp.setText(temptext);
        } catch (Exception e) {
        }
        
        
    }
    
    
    public void highlight(JTextComponent textComp, String pattern) {
            
            removeComments(textComp);
            try {
                removeHighlight(textComp);
                Highlighter hilite = textComp.getHighlighter();
                Document doc;
                doc = textComp.getDocument();
                String text = doc.getText(0, doc.getLength());
                int pos = 0;
                
                while ((pos = text.toUpperCase().indexOf(pattern.toUpperCase(), pos)) >= 0) {
                    if(pos == 0){
                        if ((text.charAt(pos+pattern.length()) == ' ')||(text.charAt(pos+pattern.length()) == '(')||(text.charAt(pos+pattern.length()) == '\n')){
                          hilite.addHighlight(pos, pos+pattern.length(), myHighlightPainter);
                        }
                    }
                    else{
                        if (!(Character.isLetter(text.charAt(pos-1)))&&((text.charAt(pos+pattern.length()) == ' ')||(text.charAt(pos+pattern.length()) == '(')||(text.charAt(pos+pattern.length()) == '\n'))){
                          hilite.addHighlight(pos, pos+pattern.length(), myHighlightPainter);
                        }
                    }
                    pos += pattern.length();
                    
                }
            } catch (Exception e) {
                
            }
            
        }
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
            java.util.logging.Logger.getLogger(ControlFlowTestingToolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlFlowTestingToolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlFlowTestingToolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlFlowTestingToolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlFlowTestingToolUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea SourceCodeTextArea;
    private javax.swing.JButton btnFor;
    private javax.swing.JButton btnIf;
    private javax.swing.JButton btnSwitch;
    private javax.swing.JButton btnWhile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
