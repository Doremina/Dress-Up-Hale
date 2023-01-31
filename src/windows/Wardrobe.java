package windows;
import java.awt.*;
import javax.swing.*;

public class Wardrobe {
	
	public Wardrobe() {
		
		/*
		fotoðraf katmanlarý eklenecek
		butonlar gruplara konulacak - elbiselere dikkat et
		butonlara action listener eklenecek, deselect olduðunda var olan katmanlarýn visibility'i false yapmayý unutma
		*/
		JFrame wardrobeFrame = new JFrame();
		wardrobeFrame.setResizable(false);
		wardrobeFrame.setBounds(0, 0, 1920, 1080); 
		
		JPanel contentPane = new JPanel();
		contentPane.setSize(1920, 1080);
		wardrobeFrame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel haleWardrobe = new JPanel();
		haleWardrobe.setBounds(47, 102, 1758, 817);
		contentPane.add(haleWardrobe);
		haleWardrobe.setLayout(null);
		
		JLabel haleArt = new JLabel("New label");
		haleArt.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/hale.png")));
		haleArt.setBounds(0, 0, 444, 817);
		haleWardrobe.add(haleArt);
		
		JPanel dressesPanel = new JPanel();
		dressesPanel.setBounds(567, 0, 1181, 151);
		haleWardrobe.add(dressesPanel);
		dressesPanel.setLayout(null);
		
		JRadioButton dress1 = new JRadioButton("New radio button");
		dress1.setBounds(107, 49, 111, 23);
		dressesPanel.add(dress1);
		
		JRadioButton dress2 = new JRadioButton("New radio button");
		dress2.setBounds(403, 49, 111, 23);
		dressesPanel.add(dress2);
		
		JRadioButton dress3 = new JRadioButton("New radio button");
		dress3.setBounds(589, 88, 111, 23);
		dressesPanel.add(dress3);
		
		JRadioButton dress4 = new JRadioButton("New radio button");
		dress4.setBounds(732, 61, 111, 23);
		dressesPanel.add(dress4);
		
		JRadioButton dress5 = new JRadioButton("New radio button");
		dress5.setBounds(930, 49, 111, 23);
		dressesPanel.add(dress5);
		
		JPanel shirtsPanel = new JPanel();
		shirtsPanel.setBounds(566, 230, 1182, 153);
		haleWardrobe.add(shirtsPanel);
		shirtsPanel.setLayout(null);
		
		JRadioButton shirt1 = new JRadioButton("New radio button");
		shirt1.setBounds(73, 74, 111, 23);
		shirtsPanel.add(shirt1);
		
		JRadioButton shirt2 = new JRadioButton("New radio button");
		shirt2.setBounds(253, 54, 111, 23);
		shirtsPanel.add(shirt2);
		
		JRadioButton shirt3 = new JRadioButton("New radio button");
		shirt3.setBounds(460, 89, 111, 23);
		shirtsPanel.add(shirt3);
		
		JRadioButton shirt4 = new JRadioButton("New radio button");
		shirt4.setBounds(632, 54, 111, 23);
		shirtsPanel.add(shirt4);
		
		JRadioButton shirt5 = new JRadioButton("New radio button");
		shirt5.setBounds(915, 74, 111, 23);
		shirtsPanel.add(shirt5);
		
		JPanel pantsPanel = new JPanel();
		pantsPanel.setBounds(571, 431, 1177, 169);
		haleWardrobe.add(pantsPanel);
		pantsPanel.setLayout(null);
		
		JRadioButton pants1 = new JRadioButton("New radio button");
		pants1.setBounds(87, 57, 111, 23);
		pantsPanel.add(pants1);
		
		JRadioButton pants2 = new JRadioButton("New radio button");
		pants2.setBounds(333, 75, 111, 23);
		pantsPanel.add(pants2);
		
		JRadioButton pants3 = new JRadioButton("New radio button");
		pants3.setBounds(686, 57, 111, 23);
		pantsPanel.add(pants3);
		
		JRadioButton pants4 = new JRadioButton("New radio button");
		pants4.setBounds(804, 57, 111, 23);
		pantsPanel.add(pants4);
		
		JRadioButton pants5 = new JRadioButton("New radio button");
		pants5.setBounds(946, 75, 111, 23);
		pantsPanel.add(pants5);
		
		JPanel shoesPanel = new JPanel();
		shoesPanel.setBounds(571, 624, 1177, 169);
		haleWardrobe.add(shoesPanel);
		shoesPanel.setLayout(null);
		
		JRadioButton shoes1 = new JRadioButton("New radio button");
		shoes1.setBounds(114, 86, 111, 23);
		shoesPanel.add(shoes1);
		
		JRadioButton shoes2 = new JRadioButton("New radio button");
		shoes2.setBounds(300, 86, 111, 23);
		shoesPanel.add(shoes2);
		
		JRadioButton shoes3 = new JRadioButton("New radio button");
		shoes3.setBounds(485, 68, 111, 23);
		shoesPanel.add(shoes3);
		
		JRadioButton shoes4 = new JRadioButton("New radio button");
		shoes4.setBounds(705, 86, 111, 23);
		shoesPanel.add(shoes4);
		
		JRadioButton shoes5 = new JRadioButton("New radio button");
		shoes5.setBounds(880, 68, 111, 23);
		shoesPanel.add(shoes5);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		backgroundLabel.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/background 1920x1080.png")));
		backgroundLabel.setBounds(0, 0, 1906, 1043);
		contentPane.add(backgroundLabel);
	}
}
