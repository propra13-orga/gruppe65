import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;



public class Player {
static int playerx;
static int playery;
static int levelCounter=1; //lvlcounter für übergang
boolean playerstate = true;
public static Rectangle playerBox;
static int lx;
static int ly;
static int stop=0;
Image img = new ImageIcon("res/figur.png").getImage();


static ArrayList<Rectangle>lv1 = new ArrayList<Rectangle>();
static ArrayList<Rectangle>lv2 = new ArrayList<Rectangle>();
static ArrayList<Rectangle>lv3 = new ArrayList<Rectangle>();




public void lv1walls() {

lv1.add(new Rectangle(100, 0, 500, 100));
lv1.add(new Rectangle(0, 200, 250, 50));
lv1.add(new Rectangle(400, 100, 200, 400));
lv1.add(new Rectangle(150, 350, 250, 50));
lv1.add(new Rectangle(0, 470, 250, 150));
}

public void lv2walls() {
lv2.add(new Rectangle (320, 70, 100, 100));
lv2.add(new Rectangle (150, 0, 100, 300));
lv2.add(new Rectangle (0, 0, 170, 300));
lv2.add(new Rectangle (500, 100, 100, 300));
lv2.add(new Rectangle (300, 330, 100, 300));
}

public void lv3walls() {
lv3.add(new Rectangle (70, 50, 40, 450));
lv3.add(new Rectangle (200, 400, 200, 300));
lv3.add(new Rectangle (200, 200, 400, 60));
lv3.add(new Rectangle (200, 40, 500, 100));

}

/*public boolean getAlive(){
	return alive;
}

public void setAlive(boolean b){
	alive = b;}*/

//Hier muss neu überlegt werden wegen Kollision


public Player(int x, int y, int size) {
	playerx=x;
	playery=y;
	playerBox=new Rectangle(x, y, size, size);


}

public int getLevelCounter() { //lvlcounter für übergang
	return levelCounter;
}

public Rectangle getPlayer() {
	return playerBox;
}

public static boolean collcheckR(){
	 if (levelCounter==1) {
		 for (Rectangle r :lv1) {
			 if (playerBox.x<r.x){
			 if(playerBox.intersects(r)) {
				 return true;
				 	}
			 	}
		 	}
	 }
	 if (levelCounter==2) {
		 for (Rectangle r :lv2) {
			 if (playerBox.x<r.x){
			 if(playerBox.intersects(r)) {
				 return true;
				 	}
			 	}
		 	}
	 }

	 if (levelCounter==3) {
		 for (Rectangle r :lv3) {
			 if (playerBox.x<r.x){
			 if(playerBox.intersects(r)) {
				 return true;
				 	}
			 	}
		 	}
	 }
	 return false;
	 }
/**
 * 
 * Kollisionsabfrage
 */
public static boolean collcheckL(){
	 if (levelCounter==1) {
		 for (Rectangle r :lv1) {
			 if (playerBox.x>r.x){
			 if(playerBox.intersects(r)) {
				 return true;
				 	}
			 	}
		 	}
	 }
	 if (levelCounter==2) {
		 for (Rectangle r :lv2) {
			 if (playerBox.x<r.x){
			 if(playerBox.intersects(r)) {
				 return true;
				 	}
			 	}
		 	}
	 }

	 if (levelCounter==3) {
		 for (Rectangle r :lv3) {
			 if (playerBox.x<r.x){
			 if(playerBox.intersects(r)) {
				 return true;
				 	}
			 	}
		 	}
	 }
	 return false;
	 }

public static boolean collcheckU(){
	 if (levelCounter==1) {
		 for (Rectangle r :lv1) {
			 if (playerBox.y>r.y){
			 if(playerBox.intersects(r)) {
				 return true;
				 	}
			 	}
		 	}
	 }
	 if (levelCounter==2) {
		 for (Rectangle r :lv2) {
			 if (playerBox.x<r.x){
			 if(playerBox.intersects(r)) {
				 return true;
				 	}
			 	}
		 	}
	 }
	 if (levelCounter==3) {
		 for (Rectangle r :lv3) {
			 if (playerBox.x<r.x){
			 if(playerBox.intersects(r)) {
				 return true;
				 	}
			 	}
		 	}
	 }
	 return false;
	 }

public static boolean collcheckD(){
	 if (levelCounter==1) {
		 for (Rectangle r :lv1) {
			 if (playerBox.y<r.y){
			 if(playerBox.intersects(r)) {
				 return true;
				 	}
			 	}
		 	}
	 }
	 if (levelCounter==2) {
		 for (Rectangle r :lv2) {
			 if (playerBox.x<r.x){
			 if(playerBox.intersects(r)) {
				 return true;
				 	}
			 	}
		 	}
	 }
	 if (levelCounter==3) {
		 for (Rectangle r :lv3) {
			 if (playerBox.x<r.x){
			 if(playerBox.intersects(r)) {
				 return true;
				 	}
			 	}
		 	}
	 }
	 return false;
	 }
/**
 * 
 * Was zu tun ist für den Fall, dass an eine Wand gestoßen wurde : Player update
 * 
 */
public static void update( boolean hoch, boolean runter, boolean links, boolean rechts) {

	lx=playerx;
	ly=playery; 

 if (hoch==true && collcheckU()==false) {
	 playery=playery-10;
 }
 
 if (runter==true && collcheckD()==false) {
	 playery=playery+10;
 }
 
 if (rechts==true && collcheckR()==false) {
	 playerx=playerx+10;
 }
 
 if (links==true && collcheckL()==false) {
	 playerx=playerx-10;
 }
 /**
 if (playery<0) {
	 playery=0;
 }
 
 if (playery>558) {
	 playery=558;
 }
 
 if (playerx<0) {
	 playerx=0;
 }
 
 if (playerx>584) {
	 playerx=584;
 }
 **/
 
 
 



 /*
 if(playerBox.intersects(150, 350, 250, 50)) {
	 if (down==true) {
		 playery=playery-5;
	 }
	 
 }
 
 */
 
 
 playerBox.x = playerx;
 playerBox.y = playery;
 if(playerBox.intersects(300,300,20,20) && levelCounter==1){
	 //setAlive(false);
	 Verloren.main(null);
 }
 if (playerBox.intersects(485,470,40,40) && levelCounter==2) {
	 //setAlive(false);
	 Verloren.main(null);
 }
 
 if (playerBox.intersects(170,400,40,40) && levelCounter==2) {
	 //setAlive(false);
	 Verloren.main(null);
 }
 
 if (playerBox.intersects(155,155,10,10) && levelCounter==3) {
	 //setAlive(false);
	 Verloren.main(null);
 }
 
 if (playerBox.intersects(170,220,25,10) && levelCounter==3) {
	 //setAlive(false);
	 Verloren.main(null);
 }

 
 if(playerBox.intersects(530, 510, 40, 40) && levelCounter==1) {
	 levelCounter=2;
 }
 
 if(playerBox.intersects(0, 450, 40, 40) && levelCounter==2) {
	 levelCounter=3;
 }
 if(playerBox.intersects(540, 520, 40, 40) && levelCounter==3 && stop==0) {
	 stop=stop+1;
	 Gewinnerf.main(null);

 }


 }



public Rectangle getPlayerBox() {
	return playerBox;
}

public void setX(int a) {
	playerx=a;
}

public void setY(int b) {
	playery=b;
}


}
