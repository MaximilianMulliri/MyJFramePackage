import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public class MyJButton extends JButton implements ActionListener{
	
	Font myButtonFont = new Font("Lucida console",Font.PLAIN,20); 	
	
	Color mBtnBackgroundColor = Color.black,							
		  mBtnForegroundColor = Color.gray,								
		  mBtnBorderColor = Color.green;	

	Border mbb = BorderFactory.createLineBorder(mBtnBorderColor,1);
	
	private int xPosition,yPosition,
				width = 80,
				height=20;
	
	private String myButtonText;
	
	MyJButton(int xPosition, int yPosition, String myButtonText){
		
		this.setSize(this.xPosition = xPosition,this.yPosition = yPosition);
		this.setText(this.myButtonText = myButtonText);
		this.setFont(new Font("Lucida console",Font.PLAIN,20));
		this.setBackground(mBtnBackgroundColor);
		this.setForeground(mBtnForegroundColor);
		this.setFocusable(false);			
		this.setBorder(mbb);
		this.addActionListener(this);
		
	}

	public Color getmBtnBackgroundColor() {
		return mBtnBackgroundColor;
	}

	public void setmBtnBackgroundColor(Color mBtnBackgroundColor) {
		this.mBtnBackgroundColor = mBtnBackgroundColor;
	}

	public Color getmBtnForegroundColor() {
		return mBtnForegroundColor;
	}

	public void setmBtnForegroundColor(Color mBtnForegroundColor) {
		this.mBtnForegroundColor = mBtnForegroundColor;
	}

	public Color getmBtnBorderColor() {
		return mBtnBorderColor;
	}

	public void setmBtnBorderColor(Color mBtnBorderColor) {
		this.mBtnBorderColor = mBtnBorderColor;
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
