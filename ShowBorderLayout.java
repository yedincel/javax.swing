package FrameExamples;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class ShowBorderLayout extends JFrame {
	
	public ShowBorderLayout(){
		
		setLayout( new BorderLayout(5,5));
		add(new JButton("Doğu"), BorderLayout.EAST);
		add(new JButton("Güney"), BorderLayout.SOUTH);
		add(new JButton("Batı"), BorderLayout.WEST);
		add(new JButton("Kuzey"), BorderLayout.NORTH);
		add(new JButton("Merkez"), BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		
		ShowBorderLayout cerceve = new ShowBorderLayout();
		cerceve.setTitle("My Frame");
		cerceve.setLocation(1000,100);
		cerceve.setSize(350, 150);
		cerceve.setVisible(true);
		cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
