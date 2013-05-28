

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;



public class Frame extends JFrame implements ActionListener  {

	private JButton schliessen;
	private JButton einstellung;
	private JButton info;
	private JButton ende;
	static Game g = new Game();
	
	
	public static void main(String[] args) {
		
		Frame frame = new Frame("Menü");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		
		
		frame.setLayout(null);
		frame.setVisible(true);

	}
	
	public Frame(String title) {
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
		fenster.setSize(630,630);
		fenster.setVisible(true);
		//fenster.add(new level();)
		
		
		}
			
				
		
	
		
		public static void auswahl(){
			
		}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()== schliessen){
			fenster();
		}
		
		if (e.getSource()== info){
			
			Object[] options = {"OK"};
			
			JOptionPane.showOptionDialog(null, "programmiert von gruppe65","Information", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
			
		}
		
		if (e.getSource()== einstellung ){
		
		 auswahl();
			
		}
		
		if(e.getSource()== ende){
			System.exit(0);
		}
		
	}

}
