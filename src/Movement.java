import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Color;





public class Movement {
	// spielfeldgrenzen und startkoordinaten eintragen
int movement=5;
int playerx;
int playery;
int rightborder=600;
int leftborder=600;
int upborder=600;
int downborder=600;
KeyEvent k;
int oldplayerx;
int oldplayery;

public void setPlayerCoord(int x, int y) {
	playerx=x;
	playery=y;
	g.filledrect(playerx,playery,10,10);
}
//Kollisionsabfragen für Spielfeldrand

int left () {
	if (playerx+movement > rightborder) {
		return 0;
	     }
	return 1;
	}

int right () {
	if (playerx-movement < leftborder) {
		return 0;
	     }
	return 1;
	}

int up () {
	if (playerx+movement > upborder) {
		return 0;
	     }
	return 1;
	}

int down () {
	if (playerx-movement < downborder) {
		return 0;
	     }
	return 1;
	}
// Kollsisionsabfrage für Wände innerhalb des Feldes anhand der Spielfeldfarbe

boolean collisionCheck() {
	int localCheckRight=playerx+movement;
	int localCheckLeft=playerx-movement;
	int localCheckUp=playery+movement;
	int localCheckDown=playery-movement;
	
	
	return true;

}
	

	


// Bewegung, wenn keine Wände im Weg sind
void move(){
	
	int command = k.getKeyCode();
	if (command==KeyEvent.VK_UP && up()==1 && collisionCheck()==true) {
		playery=playery+movement;
	}
	
	if (command==KeyEvent.VK_DOWN && down()==1 && collisionCheck()==true) {
		playery=playery-movement;
	}
	
	if (command==KeyEvent.VK_LEFT && left()==1 && collisionCheck()==true) {
		playerx=playerx-movement;
	}
	
	if (command==KeyEvent.VK_RIGHT && right()==1 && collisionCheck()==true) {
		playerx=playerx+movement;
	}
	
	
	// Gegner - Kollisionsabfrage: beim setzen der gegner koordinaten speichern
	// (2 arrays, x und y?)
	//enemycheck(playerx,playery);
	
	// an neuen coordinaten neue figur zeichnen//
	g.setColor(Color.PINK);
	g.filledrect(playerx,playery,10,10);
	g.setColor(Color.WHITE);
	g.filledrect(oldplayerx,oldplayery,10,10);
	
		
		
		
	}
		
		
	
	
	}


/*
Rectangle walls = new Rectangle[];
g.filledrect(krams);
walls[0]=new Rectangle(krams);
g.filledrect(krams2);
walls[1]= new Rectangle(krams2);
[6]


public Rectangle get() {
	for (int counter =0; counter < walls.length; counter++) {
		return walls[counter];
	}
}

public void getwalls() {
	checkwalls = new Rectangle[];
	
}

*/

















































