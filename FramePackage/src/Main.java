import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  {

	
	
	public static void main(String[] args) {
		String name = "Max";
		MyInterface interFace = (x) ->{
		System.out.println(x);
		};

		MyJButton testBtn = new MyJButton(0,0,"Test");
		
		testBtn.addActionListener((x) -> {
			
		System.out.println("pew puw");
		System.out.println("Hello "+x);
		});
		
			
		MyJPanel panel = new MyJPanel(0,0,404,210);				//Memo: gap between Frame and JPanel = 16
		
		MyJFrame mainFrame = new MyJFrame(0,0,420,420,"MainFrame");
		
		mainFrame.add(panel);
		interFace.message(name);
		panel.add(testBtn);
	
	}


}
