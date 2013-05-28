import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;




public class Gewinnerf extends JFrame implements ActionListener  {

	private JButton neustart;
	private JButton ende;
	
	
	public static void main(String[] args) {
		
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
      public static void fenster() {
	    
		//JFrame fenster = new JFrame(level);
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