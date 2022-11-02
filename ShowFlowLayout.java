package FrameExamples;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowFlowLayout extends JFrame{

	public ShowFlowLayout(){
	
		//setLayout(new FlowLayout(FlowLayout.LEFT, 10,20));
		//setLayout(new FlowLayout(FlowLayout.RIGHT, 10,20));
		setLayout(new FlowLayout(FlowLayout.CENTER, 10,20));
		add(new JLabel("Ad"));
		add(new JTextField(8));
		add(new JLabel("Soyad"));
		add(new JTextField(8));
		add(new JLabel("Yaş"));
		add(new JTextField(8));
		add(new JLabel("Cinsiyet"));
		add(new JTextField(8));
	}
	
	public static void main(String[] args) {
		
		ShowFlowLayout cerceve = new ShowFlowLayout();
		cerceve.setTitle("My Frame");
		cerceve.setLocation(1000,100);
		cerceve.setSize(300, 150);
		cerceve.setVisible(true);
		cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
