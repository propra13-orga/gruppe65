import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class frame extends JFrame implements ActionListener  {

	private JButton schliessen;
	private JButton einstellung;
	private JButton info;
	private JButton ende;
	
	
	public static void main(String[] args) {
		
		frame frame = new frame("Men�");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		
		
		frame.setLayout(null);
		frame.setVisible(true);

	}
	
	public frame(String title) {
		super(title);
		
		schliessen= new JButton("Spiel starten");
		schliessen.setBounds(120,40,160,40);
		schliessen.addActionListener(this);
		add(schliessen);
		
		
		einstellung= new JButton("Einstellungen");
		einstellung.setBounds(120,120,160,40);
		einstellung.addActionListener(this);
		add(einstellung);
		
		info= new JButton("Credits");
		info.setBounds(120,200,160,40);
		info.addActionListener(this);
		add(info);
		
		ende= new JButton("Ende");
		ende.setBounds(120,280,160,40);
		ende.addActionListener(this);
		add(ende);
		
		
			
	}
	
	
	public static void fenster() {
		JFrame fenster = new JFrame();
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(650,350);
		fenster.setVisible(true);
			
		}
		
		//public static void auswahl(){
			
		//}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()== schliessen){
			fenster();
		}
		
		if (e.getSource()== info){
			
			Object[] options = {"OK"};
			
			JOptionPane.showOptionDialog(null, "programmiert von gruppe65(Regina oder sp�ter beliebigen Namen einf�gen ","Information", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
			
		}
		
		if (e.getSource()== einstellung ){
		
		// auswahl();
			
		}
		
		if(e.getSource()== ende){
			System.exit(0);
		}
		
	}

}
