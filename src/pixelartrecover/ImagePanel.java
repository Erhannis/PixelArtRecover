/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pixelartrecover;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author mewer
 */
public class ImagePanel extends javax.swing.JPanel {

    /**
     * Creates new form ImagePanel
     */
    public ImagePanel() {
        initComponents();
    }

    private Image image;
    
    public void setImage(Image image) {
        if (this.image != image) {
            this.image = image;
            int width = image.getWidth(null);
            int height = image.getHeight(null);
            Dimension size = this.getMinimumSize();
            size.setSize(width, height);
            this.setMinimumSize(size);
            this.setPreferredSize(size);
            this.invalidate();
            this.repaint();
        }
    }
    
    public Image getImage() {
        return image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.drawImage(image, 0, 0, this);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
