

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Level extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label label;
	Player spieler;
	
	
	
	public Level(Player spieler){
		
		label = new Label();
		label.setBounds(0, 0, 600, 600);
		Thread th = new Thread(label);
		th.start();
		add(label);
		addKeyListener(label);
		this.spieler=spieler;
		spieler.lv2walls();
		
		
			
		}
		
	
	
	
public boolean hoch, runter, links, rechts;
	public class Label extends JPanel implements Runnable, KeyListener{
		
		/**
		 * 
		 */
		public static final long serialVersionUID = 1L;
		
		Player p = new Player(20, 20, 10);
		
		
		//Gegner ge = new Gegner(20,20,10);/**Bsp.:später für bewegliche Gegner**/

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
			g.drawImage(p.img, spieler.getPlayerBox().x, spieler.getPlayerBox().y, /**spieler.getPlayerBox().width, spieler.getPlayerBox().height**/null);
			//g.setColor(Color.PINK);
			//g.fillOval(spieler.getPlayerBox().x, spieler.getPlayerBox().y, spieler.getPlayerBox().width, spieler.getPlayerBox().height);
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
                g.drawImage(p.img, spieler.getPlayerBox().x, spieler.getPlayerBox().y, /**spieler.getPlayerBox().width, spieler.getPlayerBox().height**/null);
                //g.setColor(Color.PINK);
                //g.fillRect(spieler.getPlayerBox().x, spieler.getPlayerBox().y, spieler.getPlayerBox().width, spieler.getPlayerBox().height);
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
                g.drawImage(p.img, spieler.getPlayerBox().x, spieler.getPlayerBox().y, /**spieler.getPlayerBox().width, spieler.getPlayerBox().height**/null);
                //g.setColor(Color.PINK);
                //g.fillRect(spieler.getPlayerBox().x, spieler.getPlayerBox().y, spieler.getPlayerBox().width, spieler.getPlayerBox().height);
    			g.setColor(Color.GREEN);
    			g.fillRect(540, 520, 40, 40);
			}
	}
		

		@Override
		public void run() {
			
			while(true){
				if (links == true){
					spieler.getPlayerBox().x--;
					if (spieler.getPlayerBox().x < 0){
						spieler.getPlayerBox().x++;
					}
				}
				if (rechts == true){
					spieler.getPlayerBox().x++;
					if (spieler.getPlayerBox().x > 550){
						spieler.getPlayerBox().x--;
					}
				}
				if (hoch == true){
					spieler.getPlayerBox().y--;
					if (spieler.getPlayerBox().y < 0){
						spieler.getPlayerBox().y++;
					}
				}
				if (runter == true){
					spieler.getPlayerBox().y++;
					if (spieler.getPlayerBox().y > 518){
						spieler.getPlayerBox().y--;
					}
				}
				
				
				repaint();
				try{
					Thread.sleep(10);}
				 catch (InterruptedException e){
					 e.printStackTrace();
				 }
				

				}
			}
			

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == 37){
				links = true;
			}
			if(e.getKeyCode() == 38){
				hoch = true;
			}
			if(e.getKeyCode() == 39){
				rechts = true;
			}
			if(e.getKeyCode() == 40){
				runter = true;
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			if(e.getKeyCode() == 37){
				links = false;
			}
			if(e.getKeyCode() == 38){
				hoch = false;
			}
			if(e.getKeyCode() == 39){
				rechts = false;
			}
			if(e.getKeyCode() == 40){
				runter = false;
			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
			
		}
	}
	
}