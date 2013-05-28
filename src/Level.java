

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Level extends JFrame {
	
	Label label;
	Player spieler;
	
	private boolean key_up = false;
	private boolean key_right = false;
	private boolean key_down = false;
	private boolean key_left = false;
	
	
	public Level(Player spieler){
		
		label = new Label();
		label.setBounds(0, 0, 600, 600);
		add(label);
		addKeyListener(new KeyHandler());
		this.spieler=spieler;
		spieler.lv2walls();
		
	}
	
	public boolean getUp() {
		return key_up;
	}
	
	public boolean getDown() {
		return key_down;
	}
	
	public boolean getRight() {
		return key_right;
	}
	
	public boolean getLeft() {
		return key_left;
	}
	
	public void repaintScreen(){
		label.repaint();
	}
	
	

	private class Label extends JLabel{
		@Override
		protected void paintComponent(Graphics g) {
			
			
			super.paintComponent(g);
			if (spieler.getLevelCounter()==1) {
				spieler.lv1walls();
			g.setColor(Color.BLACK);
			g.fillRect(100, 0, 500, 100);
			g.fillRect(0, 200, 250, 50);
			g.fillRect(400, 100, 200, 400);
			g.fillRect(150, 350, 250, 50);
			g.fillRect(0, 470, 250, 150);
			g.setColor(Color.PINK);
			g.fillRect(spieler.getPlayerBox().x, spieler.getPlayerBox().y, spieler.getPlayerBox().width, spieler.getPlayerBox().height);
			g.setColor(Color.RED);
			g.fillRect(300, 300, 20, 20);
			g.setColor(Color.GREEN);
			g.fillRect(530, 510, 40, 40);
			}
			if (spieler.getLevelCounter()==2) {
				
				g.setColor(Color.BLACK);
                g.fillRect(320, 70, 100, 100);
                g.fillRect(150, 0, 100, 300);
                g.fillRect(0, 0, 170,300);
                g.fillRect(500, 100, 100, 300);
                g.fillRect(300, 330, 100, 300);
                g.setColor(Color.RED);
                g.fillRect(170, 400, 40, 40);
                g.fillRect(485, 470, 40, 40);
                g.setColor(Color.PINK);
                g.fillRect(spieler.getPlayerBox().x, spieler.getPlayerBox().y, spieler.getPlayerBox().width, spieler.getPlayerBox().height);
    			g.setColor(Color.GREEN);
    			g.fillRect(0, 450, 40, 40);
			
			}
			
			if (spieler.getLevelCounter()==3){
				spieler.lv3walls();
			    g.setColor(Color.BLACK);
                g.fillRect(70, 50, 80, 550);
                g.fillRect(200, 300, 200, 400);
                g.fillRect(200, 200, 400, 60);
                g.fillRect(200, 40, 500, 100);
                g.setColor(Color.RED);
                g.fillRect(155, 155, 10, 10);
                g.fillRect(170, 220, 25, 10);
                g.setColor(Color.PINK);
                g.fillRect(spieler.getPlayerBox().x, spieler.getPlayerBox().y, spieler.getPlayerBox().width, spieler.getPlayerBox().height);
    			g.setColor(Color.GREEN);
    			g.fillRect(540, 520, 40, 40);
			}
	}
	}
	
	private class KeyHandler implements KeyListener {
			
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode()==KeyEvent.VK_UP) {
				key_up=true;
			}
			
			if (e.getKeyCode()==KeyEvent.VK_DOWN) {
				key_down=true;
			}
			
			if (e.getKeyCode()==KeyEvent.VK_LEFT) {
				key_left=true;
			}
			
			if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
				key_right=true;
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode()==KeyEvent.VK_UP) {
				key_up=false;
			}
			
			if (e.getKeyCode()==KeyEvent.VK_DOWN) {
				key_down=false;
			}
			
			if (e.getKeyCode()==KeyEvent.VK_LEFT) {
				key_left=false;
			}
			
			if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
				key_right=false;
			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
			
		}

		
	}
	
}