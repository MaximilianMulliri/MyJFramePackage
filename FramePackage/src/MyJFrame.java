import java.awt.Color;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
	
	Color mfbgc = new Color(0x000000); //myFrameBackGroundColor
	
	private int xPosition,yPosition,width,height;
	private String frameTitel;
	MyJFrame(int x, int y, int w, int h,String ft){
		
		this.xPosition = x;
		this.yPosition = y;
		this.width = w;
		this.height = h;
		this.frameTitel = ft;
		
		this.setTitle(frameTitel);
		this.setBounds(xPosition, yPosition, width, height);
		this.getContentPane().setBackground(mfbgc);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
//		this.setLocationRelativeTo(null);
//		this.setResizable(false);
		this.setVisible(true);
	}

}
