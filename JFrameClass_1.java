package FrameExamples;
import javax.swing.JFrame;

public class JFrameClass_1 {

	public static void main(String[] args) {
		
		JFrame cerceve = new JFrame ("Cerceve");
		//cerceve.setLocationRelativeTo(null);
		cerceve.setLocation(1000,100);
		cerceve.setSize(400, 500);
		cerceve.setVisible(true);
		cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
