import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;




public class Gewinnerf extends JFrame implements ActionListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton neustart;
	private JButton ende;
	
	
	public static void main(Level.Label label) {
		
		Gewinnerf frame = new Gewinnerf("Gewonnen");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		
		
		frame.setLayout(null);
		frame.setVisible(true);

	}
	
	public Gewinnerf(String title) {
		super(title);
		
		neustart= new JButton("Nochmal");
		neustart.setBounds(220,40,160,40);
		neustart.addActionListener(this);
		add(neustart);
		
		
		ende= new JButton("Aufhoeren");
		ende.setBounds(220,120,160,40);
		ende.addActionListener(this);
		add(ende);

}
      public static void game() {
	    
    	  Player player = new Player(20,20,10);
  		Level fenster = new Level(player);
  		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		fenster.setSize(600,600);
  		fenster.setVisible(true);
  		fenster.setResizable(false);
  		
  }


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()== neustart){
			game();
		}
		if(e.getSource()== ende){
			System.exit(0);
		}
	}
	}