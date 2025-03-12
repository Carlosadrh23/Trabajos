package mario2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class ventana extends JFrame {

	public ventana() {
        this.setTitle("Mario Bros");
        this.setVisible(true);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        
        this.revalidate();
        this.repaint();
       
	}
	
	@Override
    public void paint(Graphics g){
		super.paint(g);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.decode("#2e14ed"));
        g2d.fillRect(0, 0, 800, 600);
        
        g2d.setColor(Color.BLACK);//fondo cuadritos
		g2d.setStroke(new BasicStroke(10));
		g2d.drawRect(0, 500, 1300, 100);
		
		g2d.setColor(Color.decode("#AF8260"));
		g2d.fillRect(0, 500, 1300, 100);
		
		g2d.setColor(Color.WHITE);//nubes
		g2d.fillRoundRect(40, 70, 140, 30, 50, 50);
		g2d.fillRoundRect(40, 110, 190, 30, 50, 50);
		g2d.fillRoundRect(300, 50, 190, 30, 50, 50);
		g2d.fillRoundRect(230, 200, 100, 30, 50, 50);
		g2d.fillRoundRect(180, 300, 100, 30, 50, 50);
		g2d.fillRoundRect(600, 150, 100, 30, 50, 50);
		g2d.fillRoundRect(600, 100, 150, 30, 50, 50);
		g2d.fillOval(100, 80, 10, 10);
		
		g2d.setColor(Color.decode("#A9B5DF"));//color principal
		g2d.fillRect(75, 225, 150, 270);
		g2d.fillOval(75, 170, 150, 110);
		
		
		
		g2d.setColor(Color.decode("#2D336B"));
		g2d.fillRect(-50, 396, 200, 100);
		g2d.fillOval(-50, 345, 200, 100);
		
		g2d.setColor(Color.decode("#A9B5DF"));//color principal
		g2d.fillRect(300, 225, 150, 270);
		g2d.fillOval(300, 170, 150, 110);
		
		g2d.fillRect(450, 145, 150, 350);
		g2d.fillOval(450, 95, 150, 110);
		
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(350, 250, 300, 30, 50, 50);
		g2d.fillRoundRect(550, 200, 200, 30, 50, 50);
		
		g2d.setColor(Color.decode("#2D336B"));
		g2d.fillRect(300, 396, 175, 100);
		g2d.fillOval(300, 345, 175, 100);
		
		g2d.fillRect(475, 250, 200, 246);
		g2d.fillOval(475, 200, 200, 100);
		
		g2d.setColor(Color.BLACK);//fondo cuadritos
		g2d.setStroke(new BasicStroke(7));
		g2d.drawRect(600, 445, 50, 50);
		g2d.drawRect(600, 390, 50, 50);
		g2d.drawRect(600, 335, 50, 50);
		g2d.drawRect(600, 280, 50, 50);
		g2d.drawRect(654, 280, 50, 50);//cuadro amarillo
		g2d.drawRect(707, 280, 50, 50);
		g2d.drawRect(760, 280, 50, 50);
		g2d.drawRect(700, 415, 140, 80);//tubo rosa
		g2d.fillRect(690, 414, 140, 85);
		g2d.drawRect(680, 350, 160, 62);

		g2d.drawRect(300, 370, 130, 125);
		g2d.fillRect(310, 370, 130, 130);
		g2d.drawRoundRect(285, 300, 160, 65, 20, 20);
		g2d.fillRoundRect(295, 300, 160, 75, 20, 20);
		
		
		g2d.setColor(Color.decode("#9AA6B2"));//cuadritos
		g2d.fillRect(600, 445, 50, 50);
		g2d.fillRect(600, 390, 50, 50);
		g2d.fillRect(600, 335, 50, 50);
		g2d.fillRect(600, 280, 50, 50);
		
		g2d.setColor(Color.decode("#F6DC43"));//cuadros amarillos
		g2d.fillRect(654, 280, 50, 50);
		g2d.fillRect(707, 280, 50, 50);
		g2d.fillRect(760, 280, 50, 50);
		
		g2d.setColor(Color.decode("#A0C878"));//tubo
		g2d.fillRect(700, 415, 140, 80);
		g2d.fillRect(680, 350, 160, 62);
		g2d.fillRect(300, 370, 130, 125);//tubo medio
		g2d.fillRoundRect(285, 300, 160, 65, 20, 20);
		g2d.setColor(Color.decode("#F7F7F7"));
		g2d.fillRect(725, 415, 20, 80);
		g2d.fillRect(710, 350, 20, 62);
		g2d.fillRect(695, 350, 100, 5);
		g2d.fillRect(315, 375, 20, 120);//tubo medio
		g2d.fillRect(300, 300, 20, 65);
		g2d.fillRoundRect(290, 300, 100, 5, 5, 5);
		
		g2d.setColor(Color.decode("#A0C878"));
		g2d.fillRect(410, 375, 20, 120);
		g2d.fillRoundRect(425, 300, 20, 65, 5, 5);
		
		
		g2d.setColor(Color.decode("#A0C878"));
		g2d.fillRect(695, 415, 10, 80);
		g2d.fillRect(680, 355, 10, 57);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(290, 365, 145, 10, 10, 10);

		try {
			BufferedImage image = ImageIO.read(new File("img/mario2.png"));
			g2d.drawImage(image, 180, 355, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			BufferedImage image = ImageIO.read(new File("img/planta2.png"));
			g2d.drawImage(image, 260, 180, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		g2d.setColor(Color.WHITE);
		g2d.fillOval(100, 200, 20, 35);
		g2d.fillOval(180, 300, 20, 35);
		g2d.fillOval(150, 230, 20, 35);
		g2d.fillOval(320, 230, 20, 35);
		g2d.fillOval(0, 400, 30, 60);
		g2d.fillOval(500, 250, 30, 60);
		g2d.fillOval(470, 130, 20, 35);
		g2d.fillRoundRect(-50, 200, 100, 30, 50, 50);
		g2d.fillRoundRect(0, 300, 150, 30, 50, 50);
	}
	
	
}
