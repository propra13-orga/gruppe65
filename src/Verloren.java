


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;




public class Verloren extends JFrame implements ActionListener  {

	private JButton neustart;
	private JButton ende;
	
	
	public static void main(String[] args) {
		
		Verloren frame = new Verloren("Verloren");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		
		
		frame.setLayout(null);
		frame.setVisible(true);

	}
	
	public Verloren(String title) {
		super(title);
		
		neustart= new JButton("Neuer Versuch");
		neustart.setBounds(220,40,160,40);
		neustart.addActionListener(this);
		add(neustart);
		
		
		ende= new JButton("Aufhoeren");
		ende.setBounds(220,120,160,40);
		ende.addActionListener(this);
		add(ende);

}
      public static void fenster() {
	    
		Game fenster = new Game();
      }


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()== neustart){
			fenster();
		}
		if(e.getSource()== ende){
			System.exit(0);
		}
	}
	}
