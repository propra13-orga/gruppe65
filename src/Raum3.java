
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Raum3 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label label;
	Player spieler;
	//boolean quit = false;
	
	
	public Raum3 (Player spieler){
		
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
		
		Player p = new Player(20, 520, 25);

		
		//Gegner ge = new Gegner(20,20,10);/**Bsp.:später für bewegliche Gegner**/

		
		protected void paintComponent(Graphics g) {
			
			
			super.paintComponent(g);
			if (spieler.getLevelCounter()==1) {
				spieler.lv3walls();
				
				Rectangle s = new Rectangle (spieler.getPlayerBox().x, spieler.getPlayerBox().y,25,25);
				Rectangle w1 = new Rectangle (70, 50, 40, 450);
				Rectangle w2 = new Rectangle (200, 400, 200, 300);
				Rectangle w3 = new Rectangle (200, 200, 400, 60);
				Rectangle w4 = new Rectangle (200, 40, 500, 100);
				
				g.setColor(Color.BLACK);
                g.fillRect(w1.x, w1.y, w1.width, w1.height);
                g.fillRect(w2.x, w2.y, w2.width, w2.height);
                g.fillRect(w3.x, w3.y, w3.width, w3.height);
                g.fillRect(w4.x, w4.y, w4.width, w4.height);
                g.setColor(Color.RED);
                g.fillRect(155, 155, 10, 10);
                g.fillRect(170, 220, 25, 10);
                g.drawImage(p.img, spieler.getPlayerBox().x, spieler.getPlayerBox().y,null);
                //g.setColor(Color.PINK);
                //g.fillRect(spieler.getPlayerBox().x, spieler.getPlayerBox().y, spieler.getPlayerBox().width, spieler.getPlayerBox().height);
    			g.setColor(Color.GREEN);
    			g.fillRect(540, 520, 40, 40);
    			
    			if( spieler.getPlayerBox().intersects(w1)){
					//g.drawString("Kollision",70,50);
    				spieler.getPlayerBox().x--;
    				//if(spieler.getPlayerBox().x> 120){
    					//spieler.getPlayerBox().x++;
    				//}
    				spieler.getPlayerBox().y++;
				}
    			if( spieler.getPlayerBox().intersects(w2)){
					//g.drawString("Kollision",200,400);
    				spieler.getPlayerBox().x--;
    				//if(spieler.getPlayerBox().x> 120){
    					//spieler.getPlayerBox().x++;
    				//}
    				spieler.getPlayerBox().y++;
				}
    			if( spieler.getPlayerBox().intersects(w3)){
					//g.drawString("Kollision",200,200);
    				spieler.getPlayerBox().x--;
    				//if(spieler.getPlayerBox().x> 120){
    					//spieler.getPlayerBox().x++;
    				//}
    				spieler.getPlayerBox().y++;
				}
    			if( spieler.getPlayerBox().intersects(w4)){
					//g.drawString("Kollision",200,40);
    				spieler.getPlayerBox().x--;
    				//if(spieler.getPlayerBox().x> 120){
    					//spieler.getPlayerBox().x++;
    				//}
    				spieler.getPlayerBox().y++;
				}
    			
    			repaint();
			
			}
			
			/**if (quit==true){
				g.drawString("Weiter spielen (R)", 250, 100);
				g.drawString("Hauptmenue (M)", 250, 100);
				g.drawString("Beenden (Q)", 250, 100);
				if (quit==false){
					//?//g.clear();
					
				}**/
	
			}
		

		@Override
		public void run() {
			
			while(true){
				if (links == true){
					spieler.getPlayerBox().x--;
					if (spieler.getPlayerBox().x< 0){
						spieler.getPlayerBox().x++;
					}
					
						
				}
				if (rechts == true){
					spieler.getPlayerBox().x++;
					if (spieler.getPlayerBox().x > 550){
						spieler.getPlayerBox().x--;
						/*if (spieler.getPlayerBox().x > 199 && spieler.getPlayerBox().x<= 600 && spieler.getPlayerBox().y>= 99 && spieler.getPlayerBox().y<= 100 ){
							spieler.getPlayerBox().x--;*/
						
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
					if (spieler.getPlayerBox().y > 520){
						spieler.getPlayerBox().y--;
					}
					
				if (spieler.getPlayerBox().x >= 145 && spieler.getPlayerBox().x<= 165 && spieler.getPlayerBox().y>= 145 && spieler.getPlayerBox().y<= 165 ){
					//System.exit(0);
					Verloren.main(null);
					break;}
				if (spieler.getPlayerBox().x >= 145 && spieler.getPlayerBox().x<= 195 && spieler.getPlayerBox().y>= 210 && spieler.getPlayerBox().y<= 230 ){
					//System.exit(0);
					Verloren.main(null);
					break;
				}
				
				if (spieler.getPlayerBox().x >= 500 && spieler.getPlayerBox().x<= 580 && spieler.getPlayerBox().y>= 480 && spieler.getPlayerBox().y<= 560 ){
					//System.exit(0);
					//Raum2.main();
				      Gewinnerf.main(null);
					break;
				}
				/**if (spieler.getPlayerBox().x > 400  && spieler.getPlayerBox().x< 600  && spieler.getPlayerBox().y> 0 && spieler.getPlayerBox().y< 100 ){
					spieler.getPlayerBox().x--;
					spieler.getPlayerBox().y++;
				}**/
					
				
					
				//Kollision
					/**if(spieler.intersects(spieler.lv1walls())){
						Verloren.main(null);
					}**/
					
					//escape
				      /**if(e.isrunter(e.KEY_ESCAPE)){
				    	  quit = true;
				      } //später, wenn man auf Escape klickt, kommt ein Auswahlmenü
				
				       if(input.isrunter(Input.KEY_R)){
				          quit= false;
				       if(input.isrunter(Input.KEY_M)){
				          
				       if(input.isrunter(Input.KEY_Q)){
				          System.exit(0);
				**/ //Was im Auswahlmenue passieren soll
				}
				
				repaint();
				try{
					Thread.sleep(10);}
				 catch (InterruptedException e){
					 e.printStackTrace();
				 }
				

				}}


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
