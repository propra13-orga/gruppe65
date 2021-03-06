import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;




public class Level2 extends JFrame implements ActionListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton neustart;
	private JButton ende;
	
	
	public static void main() {
		
		Level2 frame = new Level2("Next Level");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		
		
		frame.setLayout(null);
		frame.setVisible(true);

	}
	
	public Level2(String title) {
		super(title);
		
		neustart= new JButton("Naechster Raum");
		neustart.setBounds(120,40,160,40);
		neustart.addActionListener(this);
		add(neustart);
		
		
		ende= new JButton("Aufhoeren");
		ende.setBounds(120,120,160,40);
		ende.addActionListener(this);
		add(ende);

}
      public static void game() {
	    
    	Player player = new Player(540,40,30);
  		Raum2 fenster = new Raum2(player);
  		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		fenster.setSize(600,600);
  		fenster.setVisible(true);
  		fenster.setResizable(false);
  		
  }


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()== neustart){
			game();
			dispose();
		}
		if(e.getSource()== ende){
			System.exit(0);
		}
	}
	}