
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import weka.gui.visualize.Plot2d;

public class MainPanel extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainPanel() {
        
       setTitle("AdaBoost example");
       setSize(600, 400);
       setLocationRelativeTo(null);
       
       Container pane = this.getContentPane();
       
       JButton button = new JButton("test");
       button.setAlignmentX(Component.CENTER_ALIGNMENT);
       pane.add(button);
       
       setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	MainPanel ex = new MainPanel();
                ex.setVisible(true);
            }
        });
    }
}
