import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MyJPanel extends JPanel {
	
	Color mpbgc = Color.black;	//mpbgc = myPanelBackGroundColor
	Color mpbc = Color.green;	// mpbc = myPanelBroderColor
	private int xPosition,yPosition,width,height;
	MyJPanel(int x, int y, int w, int h){
		
		this.xPosition = x;
		this.yPosition = y;
		this.width = w;
		this.height = h;
		
		this.setBounds(x, y, w, h);
		this.setBackground(mpbgc);
		this.setOpaque(true);
		this.setLayout(null);
		this.setBorder(new LineBorder (mpbc));
		
	}
	public int getxPosition() {
		return xPosition;
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public int getyPosition() {
		return yPosition;
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}
