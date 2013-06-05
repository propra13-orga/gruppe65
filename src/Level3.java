import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;




public class Level3 extends JFrame implements ActionListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton neustart;
	private JButton ende;
	
	
	public static void main() {
		
		Level3 frame = new Level3("Next Level");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		
		
		frame.setLayout(null);
		frame.setVisible(true);

	}
	
	public Level3(String title) {
		super(title);
		
		neustart= new JButton("Finaler Raum");
		neustart.setBounds(120,40,160,40);
		neustart.addActionListener(this);
		add(neustart);
		
		
		ende= new JButton("Aufhoeren");
		ende.setBounds(120,120,160,40);
		ende.addActionListener(this);
		add(ende);

}
      public static void game() {
	    
    	Player player = new Player(20,500,20);
  		Raum3 fenster = new Raum3(player);
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