

import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame; 



public class Frame extends JFrame implements ActionListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton schliessen;
	private JButton einstellung;
	private JButton info;
	private JButton ende;
    
	
	
	public static void main(String[] args) {
		
		Frame frame = new Frame("Menü");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		//frame.setBackground(new java.awt.Color(23,233,33));
		
		
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
	
	
    public static void game() {
    	
	    Player player = new Player(20,20,20);
		Level fenster = new Level(player);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(600,600);
		fenster.setVisible(true);
		fenster.setResizable(false);
		
		/**boolean alive = true;
		
		while (alive) {
			alive = player.getAlive();
			//player.update(fenster.getUp(),fenster.getDown(), fenster.getRight(), fenster.getLeft());**/
			fenster.repaintScreen();
			
		
			
			
			
			/**try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}}
		Verloren.main(null);**/
		
		
		//fenster.getContentPane();
		//fenster.add(new Label());
		
}
		
	
			
				
		
	
		
		public static void auswahl(){
			
		}
	

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
		
		 //auswahl();//auswahl kommt im im zweiten Meilenstein, aufjedenfall später sonst wird die Zeit knapp
			
		}
		
		if(e.getSource()== ende){
			System.exit(0);
		}
		}	
	

}
