package FrameExamples;
import javax.swing.*;
import java.awt.*;

public class ShowMicrowave extends JFrame{

		public ShowMicrowave() {
			
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(4,3));
			
			for(int i=1; i<=9; i++)
			{
				panel.add(new JButton(" "+ i));
			}
			
			panel.add(new JButton(" " + 0));
			panel.add(new JButton("Başlat"));
			panel.add(new JButton("Durdur"));
			
			JPanel panel2 = new JPanel(new BorderLayout());
			panel2.add(new JTextField("   SÜREYİ AYARLAYINIZ   "), BorderLayout.NORTH);
			panel2.add(panel, BorderLayout.CENTER);
			
			add(panel2, BorderLayout.EAST);
			add(new JButton("Yiyecekler Burada"), BorderLayout.CENTER);
			
		}
		
		public static void main(String[] args) {
			
			ShowMicrowave cerceve = new ShowMicrowave();
			cerceve.setTitle("Microwave");
			cerceve.setLocation(500,100);
			cerceve.setSize(800, 500);
			cerceve.setVisible(true);
			cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
