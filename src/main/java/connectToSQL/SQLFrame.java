package connectToSQL;
import java.awt.*;
import javax.swing.JLabel;

public class SQLFrame {

	public static void main(String abc[]) {
		
		
		Frame F = new Frame("Save Marks");
		Panel P1 = new Panel();
		
		GridLayout GL = new GridLayout(4,2);
		
		P1.setLayout(GL);
		
		TextField regno = new TextField(3);
		TextField name = new TextField(20);
		TextField marks = new TextField(3);
		
		
		Label L1 = new Label("Regno");
		Label L2 = new Label("Name");
		Label L3 = new Label("Marks");
		Label L4 = new Label("");
	
		
		Button B0;
		
		JLabel error = new JLabel();
		
		error.setSize(50,10);
		
		B0 = new Button("Save");
		
		P1.add(L1);
		P1.add(regno);
		P1.add(L2);
		P1.add(name);
		P1.add(L3);
		P1.add(marks);
		P1.add(L4);
		P1.add(B0);
		
		
		F.add(P1, BorderLayout.CENTER);
	
		
			F.setSize(300,150);
			F.setVisible(true);
			
			SQLEventHandler event = new SQLEventHandler(regno, name, marks);
			
			
			B0.addActionListener(event);
	}
}
			