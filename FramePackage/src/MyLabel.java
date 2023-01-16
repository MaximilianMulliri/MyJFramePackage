import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MyLabel extends JLabel {
	
	MyLabel(){
		this.setBackground( new Color(0x0f0f0f));
		this.setFont(new Font("Lucida console",Font.PLAIN,14));
		this.setForeground(new Color(0x1bec00));
		this.setOpaque(true);
	}

}
