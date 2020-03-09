/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.view;

import java.awt.Color;

import tetris.model.Tetromino;

/**
 *
 * @author Jacob Cohen
 */
public class NextPanel extends javax.swing.JPanel {

	private static final long serialVersionUID = -6245049217748052426L;
	
	/**
     * Creates new form HoldPanel
     */
    public NextPanel(Color background) {
    	setBackground(background);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        nextLabel = new javax.swing.JLabel();
        tetrominoPanel = new TetrominoPanel();

        nextLabel.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        nextLabel.setForeground(new java.awt.Color(255, 255, 255));
        nextLabel.setText("NEXT");

        javax.swing.GroupLayout tetrominoPanelLayout = new javax.swing.GroupLayout(tetrominoPanel);
        tetrominoPanel.setLayout(tetrominoPanelLayout);
        tetrominoPanelLayout.setHorizontalGroup(
            tetrominoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        tetrominoPanelLayout.setVerticalGroup(
            tetrominoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tetrominoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tetrominoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    public void setTetromino(Tetromino tetro)
    {
    	tetrominoPanel.setTetromino(tetro);
    	tetrominoPanel.repaint();
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel nextLabel;
    private TetrominoPanel tetrominoPanel;
    // End of variables declaration                   
}
