/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author alehe
 */
public class casino extends javax.swing.JFrame {
    //*****************************************EXTRAS**********************************************************************
    //Poner fono en el Jpane
    FondoPanel fondo = new FondoPanel();

    //Musica al iniciar
    private final File archivowav = new File(FileSystems.getDefault().getPath("").toAbsolutePath() + "/src/musica/no pares.wav");;
    private Clip clip;
    private AudioInputStream audioInputStream;
    
    //Musica al ganar
    private final File archivowav2 = new File(FileSystems.getDefault().getPath("").toAbsolutePath() + "/src/musica/siu.wav");;
    private Clip clip2;
    private AudioInputStream audioInputStream2;
    
    //Musica al perder
    private final File archivowav3 = new File(FileSystems.getDefault().getPath("").toAbsolutePath() + "/src/musica/nogod.wav");;
    private Clip clip3;
    private AudioInputStream audioInputStream3;
    
    //***********************************************************************************************************************
    
    //Iniciamos los hilos
    Hilo miHilo1 = new Hilo();
    Hilo miHilo2 = new Hilo();
    Hilo miHilo3 = new Hilo();
    
    //Variables para guardar los random
    int random1 = 0;
    int random2 = 0;
    int random3 = 0;
    
    public casino() {
        //mostrar fondo Jpane
        this.setContentPane(fondo);
        initComponents();
        
        //Hilo por ventana
        miHilo1.window = 1;
        miHilo1.start();
        miHilo2.window = 2;
        miHilo2.start();
        miHilo3.window = 3;
        miHilo3.start();
    }
    

    //Clase hilo
    public class Hilo extends Thread {
	public int window = 0;
	public boolean run = false;
        //public int random1 = 0;
        //public int random2 = 0;
        //public int random3 = 0;
        
        //Iniciar hilo
	public void startRunning(){
	run = true;
	}
        
        //Detener Hilo
	public void stopRunning(){
	run = false;
	}
        
        //Obtener numero random
        public int getRandom() {
            int random = (int) (Math.random() * 3 + 1);
            return random;
        }
        
        //Correr hilos
        @Override
        public void run() {
            Image img;
            //Ventana 1, colocar imagenes random en la label 1
            while (window == 1) {
                while (run) {
                    if (this.getRandom() == 1) { 
                        random1 = 1;
                        img = new ImageIcon(this.getClass().getResource("/img/meme4.jpg")).getImage();}
                    else if (this.getRandom() == 2){ 
                        random1 = 2;
                        img = new ImageIcon(this.getClass().getResource("/img/memeSO2.jpg")).getImage();}
                    else {
                        random1 = 3;
                        img = new ImageIcon(this.getClass().getResource("/img/memeSO3.jpg")).getImage();}
                    meme4.setIcon(new ImageIcon(img));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            //Ventana 2, colocar imagenes random en la label 2
            while (window == 2) {
                while (run) {
                    if (this.getRandom() == 1){ 
                        random2 = 1;
                        img = new ImageIcon(this.getClass().getResource("/img/meme4.jpg")).getImage();}
                    else if (this.getRandom() == 2){
                        random2 = 2;
                        img = new ImageIcon(this.getClass().getResource("/img/memeSO2.jpg")).getImage();}
                    else{
                        random2 = 3;
                        img = new ImageIcon(this.getClass().getResource("/img/memeSO3.jpg")).getImage();}
                    meme2.setIcon(new ImageIcon(img));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            //Ventana 3, colocar imagenes random en la label 3
            while (window == 3) {
                while (run) {
                    if (this.getRandom() == 1){ 
                        random3 = 1;
                        img = new ImageIcon(this.getClass().getResource("/img/meme4.jpg")).getImage();}
                    else if (this.getRandom() == 2) {
                        random3 = 2;
                        img = new ImageIcon(this.getClass().getResource("/img/memeSO2.jpg")).getImage();}
                    else {
                        random3 = 3;
                        img = new ImageIcon(this.getClass().getResource("/img/memeSO3.jpg")).getImage();}
                    meme3.setIcon(new ImageIcon(img));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                    }
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

        jPanel1 = new FondoPanel();
        meme3 = new javax.swing.JLabel();
        stop1 = new javax.swing.JButton();
        stop3 = new javax.swing.JButton();
        stop2 = new javax.swing.JButton();
        start = new javax.swing.JButton();
        stopall = new javax.swing.JButton();
        meme2 = new javax.swing.JLabel();
        meme4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casino");
        setResizable(false);

        meme3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/memeSO3.jpg"))); // NOI18N
        meme3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        stop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton-detener.png"))); // NOI18N
        stop1.setBorder(null);
        stop1.setBorderPainted(false);
        stop1.setContentAreaFilled(false);
        stop1.setFocusPainted(false);
        stop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop1ActionPerformed(evt);
            }
        });

        stop3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton-detener.png"))); // NOI18N
        stop3.setBorder(null);
        stop3.setBorderPainted(false);
        stop3.setContentAreaFilled(false);
        stop3.setFocusPainted(false);
        stop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop3ActionPerformed(evt);
            }
        });

        stop2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton-detener.png"))); // NOI18N
        stop2.setBorder(null);
        stop2.setBorderPainted(false);
        stop2.setContentAreaFilled(false);
        stop2.setFocusPainted(false);
        stop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop2ActionPerformed(evt);
            }
        });

        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/start.jpg"))); // NOI18N
        start.setBorder(null);
        start.setBorderPainted(false);
        start.setContentAreaFilled(false);
        start.setFocusPainted(false);
        start.setFocusable(false);
        start.setOpaque(true);
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        stopall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stop.jpg"))); // NOI18N
        stopall.setBorder(null);
        stopall.setBorderPainted(false);
        stopall.setContentAreaFilled(false);
        stopall.setFocusPainted(false);
        stopall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopallActionPerformed(evt);
            }
        });

        meme2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/memeSO2.jpg"))); // NOI18N
        meme2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        meme4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/meme4.jpg"))); // NOI18N
        meme4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(meme4)
                .addGap(35, 35, 35)
                .addComponent(meme2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(meme3)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(stop1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231)
                .addComponent(stop2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stop3)
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(start)
                .addGap(140, 140, 140)
                .addComponent(stopall)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meme3)
                    .addComponent(meme2)
                    .addComponent(meme4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(stop3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(stop2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(start)
                    .addComponent(stopall))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        //Inicia los hilos
        miHilo1.startRunning();
        miHilo2.startRunning();
        miHilo3.startRunning();
        
        //Inicia la musica
        this.play();
        //Habilita o deshabilita botones
        stopall.setEnabled(true);
        start.setEnabled(false);
    }//GEN-LAST:event_startActionPerformed

    private void stopallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopallActionPerformed
        //Detiene a los hilos
        miHilo1.stopRunning();
        miHilo2.stopRunning();
        miHilo3.stopRunning();
        //Detiene la musica
        this.Stop();
        
        //Determina si las imagenes son iguales
        if (random1 == random2){
            if(random2 == random3){
                //System.out.println("Gano");
                //Reproduce al bicho
                this.play2();
                JOptionPane.showMessageDialog(this, "         $$$1,000,000$$$\n               ¡GANADOR!");
            }
            else{
                //System.out.println("Perdió");
                //Reproduce nooo
                this.play3();
            }
        }
        else {
            //System.out.println("Perdió");
            //Reproduce nooo
            this.play3();
        }
        
        //Habilita o deshabilita botones
        start.setEnabled(true);
        stopall.setEnabled(false);
        /*if (miHilo1.random1 == miHilo2.random2){
            if(miHilo2.random2 == miHilo3.random3){
                System.out.println("Gano");
            }
        }*/
    }//GEN-LAST:event_stopallActionPerformed

    private void stop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop2ActionPerformed
        //Detiene el hilo 2
        miHilo2.stopRunning();
        
        //Verifica que todos los hilos esten detenidos
        if (miHilo1.run == false) {
            if (miHilo3.run == false) {
                //Detiene la musica
                this.Stop();
                start.setEnabled(true);
                
                //Determina si las imagenes son iguales
                if (random1 == random2) {
                    if (random2 == random3) {
                        //System.out.println("Gano");
                        //Reproduce al bicho
                        this.play2();
                        JOptionPane.showMessageDialog(this, "         $$$1,000,000$$$\n               ¡GANADOR!");
                    }
                    else {
                        //System.out.println("Perdió");
                        //Reproduce al bicho
                        this.play3();
                    }
                }
                else {
                    //System.out.println("Perdió");
                    //Reproduce al bicho
                    this.play3();
                }
                
            }
        }
    }//GEN-LAST:event_stop2ActionPerformed

    private void stop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop3ActionPerformed
        //Detiene el hilo 3
        miHilo3.stopRunning();
        
        //Verifica que todos los hilos esten detenidos
        if (miHilo1.run == false) {
            if (miHilo2.run == false) {
                //Detiene la musica
                this.Stop();
                start.setEnabled(true);
                
                //Determina si las imagenes son iguales
                if (random1 == random2) {
                    if (random2 == random3) {
                        //System.out.println("Gano");
                        //Reproduce al bicho
                        this.play2();
                        JOptionPane.showMessageDialog(this, "         $$$1,000,000$$$\n               ¡GANADOR!");
                    }
                    else {
                        //System.out.println("Perdió");
                        //Reproduce nooo
                        this.play3();
                    }
                }
                else {
                    //System.out.println("Perdió");
                    //Reproduce nooo
                    this.play3();
                }
                
            }
        }
    }//GEN-LAST:event_stop3ActionPerformed

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked

    }//GEN-LAST:event_startMouseClicked

    private void stop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop1ActionPerformed
        //Detiene el hilo 1
        miHilo1.stopRunning();

        //Verifica que todos los hilos esten detenidos
        if (miHilo2.run == false) {
            if (miHilo3.run == false) {
                //Detiene musica
                this.Stop();
                start.setEnabled(true);

                //Determina si las imagenes son iguales
                if (random1 == random2) {
                    if (random2 == random3) {
                        //System.out.println("Gano");
                        //Reproduce al bicho
                        this.play2();
                        JOptionPane.showMessageDialog(this, "         $$$1,000,000$$$\n               ¡GANADOR!");
                    }
                    else {
                        //System.out.println("Perdió");
                        //Reproduce al nooooo
                        this.play3();
                    }
                }
                else {
                    //System.out.println("Perdió");
                    //Reproduce noooo
                    this.play3();
                }

            }
        }
    }//GEN-LAST:event_stop1ActionPerformed

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
            java.util.logging.Logger.getLogger(casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new casino().setVisible(true);
            }
        });
    }
    
    //Función para reproducir musica
    private void play(){
        try {
            audioInputStream = AudioSystem.getAudioInputStream(archivowav);            
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);            
            clip.start();
        } catch (LineUnavailableException | IOException| UnsupportedAudioFileException e) {
            System.err.println(e.getMessage());
        }
    }
    
    //Funcion para reproducir al bicho
    private void play2(){
        try {
            audioInputStream2 = AudioSystem.getAudioInputStream(archivowav2);            
            clip2 = AudioSystem.getClip();
            clip2.open(audioInputStream2);            
            clip2.start();
        } catch (LineUnavailableException | IOException| UnsupportedAudioFileException e) {
            System.err.println(e.getMessage());
        }
    }
    
    //Funcion para reproducir al bicho
    private void play3(){
        try {
            audioInputStream3 = AudioSystem.getAudioInputStream(archivowav3);            
            clip3 = AudioSystem.getClip();
            clip3.open(audioInputStream3);            
            clip3.start();
        } catch (LineUnavailableException | IOException| UnsupportedAudioFileException e) {
            System.err.println(e.getMessage());
        }
    }
    
    //Función para detener musica
    private void Stop(){
        clip.stop();
    }
    
    //Clase para poner el fondo
    private static class FondoPanel extends JPanel {

        private Image imagen;

        public FondoPanel() {

        }

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/memefondo.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel meme2;
    private javax.swing.JLabel meme3;
    private javax.swing.JLabel meme4;
    private javax.swing.JButton start;
    private javax.swing.JButton stop1;
    private javax.swing.JButton stop2;
    private javax.swing.JButton stop3;
    private javax.swing.JButton stopall;
    // End of variables declaration//GEN-END:variables
}
