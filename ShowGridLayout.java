package FrameExamples;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowGridLayout extends JFrame{
	
	public ShowGridLayout() {
		
		Container cont = getContentPane(); // alan içerisini farklı renklere boyayabilmemizi sağlıyor
		cont.setBackground(Color.GRAY); // renk ayarını yaptık
		setLayout(new GridLayout(4,2,10,5)); // 3 satır - 2 sütün, yatay aralık 10 dike aralık 5 birim
	
		JLabel jli= new JLabel("Ad");
		jli.setFont(new Font("Courier",Font.BOLD, 16)); // yazı tip, yazı boyutu ve yazı stili ayarını yaptık
		jli.setToolTipText("Adınızı giriniz ");
		jli.setForeground(Color.yellow); // yazının rengini ayarladık
		cont.add(jli);
		cont.add(new JTextField(8));
		
		jli= new JLabel("Soyad");
		jli.setFont(new Font("Courier",Font.BOLD, 16));
		jli.setToolTipText("Soyadınızı giriniz ");
		jli.setForeground(Color.yellow);
		cont.add(jli);
		cont.add(new JTextField(8));
		
		jli= new JLabel("Yaş");
		jli.setFont(new Font("Courier",Font.BOLD, 16));
		jli.setToolTipText("Yaşınızı giriniz ");
		jli.setForeground(Color.yellow);
		cont.add(jli);
		cont.add(new JTextField(8));
		
		jli= new JLabel("Cinsiyet");
		jli.setFont(new Font("Courier",Font.BOLD, 16));
		jli.setToolTipText("Cinsiyetinizi giriniz ");
		jli.setForeground(Color.yellow);
		cont.add(jli);
		cont.add(new JTextField(8));
	}

	public static void main(String[] args) {
		
		ShowGridLayout cerceve = new ShowGridLayout(); // metotu çağırdık
		cerceve.setTitle("My Frame");
		cerceve.setLocation(1000,300);
		cerceve.setSize(400, 125);
		cerceve.setVisible(true);
		cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
