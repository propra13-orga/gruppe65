import javax.swing.JFrame;

public class Game {
	public static void main(String args[]){
		Player player = new Player(20,20,10);
		Level jf = new Level(player);
		jf.setVisible(true);
		jf.setSize(600,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		boolean alive = true;
		
		
		while (alive) {
			alive = player.getAlive();
			player.update(jf.getUp(),jf.getDown(), jf.getRight(), jf.getLeft());
			jf.repaintScreen();
			
		
			
			
			
			try {
				Thread.sleep(12);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		Verloren.main(null);
		
	}
 

}