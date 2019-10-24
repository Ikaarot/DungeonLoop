package view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ikaro
 */
public class CanvasTaverna extends javax.swing.JPanel {

Image fundo;
    
    public CanvasTaverna() {
        fundo = new ImageIcon(getClass().getResource("/assets/Cidade.png")).getImage();
        initComponents();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponents(g);
        int x = (this.getWidth() - fundo.getWidth(null));
        int y = (this.getHeight() - fundo.getHeight(null));
        g.drawImage(fundo, x, y, this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
