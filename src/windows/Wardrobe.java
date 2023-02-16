package windows;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Wardrobe {
	
	public Wardrobe() {
		
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
		
		JLabel pinkDress1 = new JLabel("");
		pinkDress1.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/pink dress1.png")));
		pinkDress1.setBounds(0, 0, 444, 817);
		pinkDress1.setVisible(false);
		
		JLabel greenDress1 = new JLabel("");
		greenDress1.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/green dress 1.png")));
		greenDress1.setBounds(0, 0, 444, 817);
		greenDress1.setVisible(false);
		
		JLabel pinkDress2 = new JLabel("");
		pinkDress2.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/pink dress 2.png")));
		pinkDress2.setBounds(0, 0, 444, 817);
		pinkDress2.setVisible(false);
		
		JLabel blueDress1 = new JLabel("");
		blueDress1.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/blue dress 1.png")));
		blueDress1.setBounds(0, 0, 444, 817);
		blueDress1.setVisible(false);
		
		JLabel yellowDress1 = new JLabel("");
		yellowDress1.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/yellow dress1.png")));
		yellowDress1.setBounds(0, 0, 444, 817);
		yellowDress1.setVisible(false);
		
		haleWardrobe.add(blueDress1);
		haleWardrobe.add(pinkDress1);
		haleWardrobe.add(yellowDress1);
		haleWardrobe.add(greenDress1);
		haleWardrobe.add(pinkDress2);
		
		
		JLabel haleArt = new JLabel("New label");
		haleArt.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/hale1.png")));
		haleArt.setBounds(0, 0, 444, 817);
		haleWardrobe.add(haleArt);
		
		JPanel dressesPanel = new JPanel();
		dressesPanel.setBounds(567, 0, 1020, 150);
		haleWardrobe.add(dressesPanel);
		dressesPanel.setLayout(null);
		
		/*
		 new function to set all dress, shoe ... visible false
		 */
		JRadioButton pinkDress1button = new JRadioButton("New radio button");
		pinkDress1button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yellowDress1.setVisible(false);
				greenDress1.setVisible(false);
				blueDress1.setVisible(false);
				pinkDress2.setVisible(false);
				
				pinkDress1.setVisible(true);
				
			}
		});
		pinkDress1button.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/pink dress1.png")));
		pinkDress1button.setBounds(6, 7, 238, 244);
		dressesPanel.add(pinkDress1button);
		
		JRadioButton yellowDress1button = new JRadioButton("New radio button");
		yellowDress1button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinkDress1.setVisible(false);
				yellowDress1.setVisible(false);
				greenDress1.setVisible(false);
				blueDress1.setVisible(false);
				pinkDress2.setVisible(false);
				
				
				yellowDress1.setVisible(true);
				
			}
		});
		yellowDress1button.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/yellow dress1.png")));
		yellowDress1button.setBounds(246, 7, 220, 202);
		dressesPanel.add(yellowDress1button);
		
		JRadioButton greenDress1button = new JRadioButton("New radio button");
		greenDress1button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinkDress1.setVisible(false);
				yellowDress1.setVisible(false);
				greenDress1.setVisible(false);
				blueDress1.setVisible(false);
				pinkDress2.setVisible(false);
				
				
				greenDress1.setVisible(true);
				
			}
		});
		greenDress1button.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/green dress 1.png")));
		greenDress1button.setBounds(470, 0, 220, 304);
		dressesPanel.add(greenDress1button);
		
		JRadioButton blueDress1button = new JRadioButton("New radio button");
		blueDress1button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinkDress1.setVisible(false);
				yellowDress1.setVisible(false);
				greenDress1.setVisible(false);
				blueDress1.setVisible(false);
				pinkDress2.setVisible(false);
				
				
				blueDress1.setVisible(true);
				
			}
		});
		blueDress1button.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/blue dress 1.png")));
		blueDress1button.setActionCommand("");
		blueDress1button.setBounds(692, 0, 207, 143);
		dressesPanel.add(blueDress1button);
		
		JRadioButton pinkDress2button = new JRadioButton("New radio button");
		pinkDress2button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinkDress1.setVisible(false);
				yellowDress1.setVisible(false);
				greenDress1.setVisible(false);
				blueDress1.setVisible(false);
				pinkDress2.setVisible(false);
				
				
				pinkDress2.setVisible(true);
				
			}
		});
		pinkDress2button.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/pink dress 2.png")));
		pinkDress2button.setBounds(851, 5, 163, 206);
		dressesPanel.add(pinkDress2button);
		
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
		//backgroundLabel.setIcon(new ImageIcon(Wardrobe.class.getResource("/sources/background 1920x1080.png")));
		backgroundLabel.setBounds(0, 0, 1906, 1043);
		contentPane.add(backgroundLabel);
		
		
		
		wardrobeFrame.setVisible(true);
		
	}
}
