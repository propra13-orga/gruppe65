

import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame; 



public class Frame extends JFrame implements ActionListener  {

	/**
	 * Einfügen der Buttons
	 */
	private static final long serialVersionUID = 1L;
	private JButton schliessen;
	private JButton einstellung;
	private JButton info;
	private JButton ende;
    
	
	/**
	 * 
	 * Erstellung des Frames für das Menue
	 */
	public static void main(String[] args) {
		
		Frame frame = new Frame("Menü");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		//frame.setBackground(new java.awt.Color(23,233,33));
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);

	}
	/**
	 * 
	 * Buttons werden gesetzt und beschriftet + ActionListener wird hinzugefügt,
	 * damit auch etwas passiert, wenn auf den Button geklickt wird.
	 */
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
	
	/**
	 * Hier wird das Fenster geöffnet in dem das Spiel stattfindet 
	 */
    public static void game()  {
    	
    	
	    Player player = new Player(20,20,10);
		Level fenster = new Level(player);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(600,600);
		fenster.setVisible(true);
		fenster.setResizable(false);
		//player.getAlive();
		//fenster.repaint();
		}
		
	
			
				
		
	
		/**
		 * hier steht nachher das Auswahlmenue der Einstellungen
		 */
		public static void auswahl(){
			
		}
	
/**
 * gehört zum ActionListener; 
 * hier steht was geschehen soll, wenn auf den Button geklickt wird  
 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()== schliessen){
			game();
	
		}
		
		if (e.getSource()== info){
			
			Object[] options = {"OK"};
			
			JOptionPane.showOptionDialog(null, "programmiert von gruppe65","Information", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
			
		}
		
		if (e.getSource()== einstellung ){
		
		 //auswahl(); 
			
		}
		
		if(e.getSource()== ende){
			System.exit(0);
		}
		}	
	

}
