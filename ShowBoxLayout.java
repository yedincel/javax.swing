package FrameExamples;
import javax.swing.*; // tüm javax swing kütüphanesini çağırmaya yarar

public class ShowBoxLayout extends JFrame{
	
	public static void main(String[] args) {
		
		ShowBoxLayout cerceve = new ShowBoxLayout();
		cerceve.setTitle("Box Layout");
		cerceve.setLocation(500,100);
		cerceve.setSize(400, 400);
		cerceve.setVisible(true);
		cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //X_AXIS olarak yapılırsa yatay konumlandırır   
		
		panel.add(new JButton("bir"));
		panel.add(new JButton("iki"));
		panel.add(new JButton("üç"));
		panel.add(new JButton("dört"));
		panel.setToolTipText("My Panel");
		
		cerceve.getContentPane().add(panel);
	}

}
