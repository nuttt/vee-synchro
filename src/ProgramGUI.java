/* 
* synchro
* 5431038821  
* Ms.Vibhavee Trairattanapa 
*/
import java.awt.*;
import javax.swing.*;

public class ProgramGUI {
	FactoryBelt factory;
	LogisticBelt logistic1;
	LogisticBelt logistic2;
	JTextField textBelt01;
	JTextField textBelt02;
	JTextField textFactory;
	
	public ProgramGUI() {
		super();
		JFrame.setDefaultLookAndFeelDecorated(false);
		JFrame frame = new JFrame("Logistic Simulation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = frame.getContentPane();
		cp.setLayout(new BorderLayout());
		textBelt01 = new JTextField("Belt1",20);
		textBelt02 = new JTextField("Belt2",20);
		textFactory = new JTextField("Factory",20);
		cp.add(textBelt01,BorderLayout.WEST);
		cp.add(textBelt02,BorderLayout.EAST);
		cp.add(textFactory,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
	}
	
	public void setText(String text,int k){
		if(k==0)
			textFactory.setText(text);
		else if(k==1)
			textBelt01.setText(text);
		else if(k==2)
			textBelt02.setText(text);
	}
}
