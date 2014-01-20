
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import weka.gui.visualize.Plot2D;

public class MainPanel extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainPanel() {
        
       setTitle("AdaBoost example");
       setSize(600, 400);
       setLocationRelativeTo(null);
       
       Container pane = this.getContentPane();
       
       createPlot(pane);
       JButton button = new JButton("test");
       button.setAlignmentX(Component.CENTER_ALIGNMENT);
       pane.add(button);
       
       setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }
	
	private void createPlot(Container container)
	{
		Plot2D plot = new Plot2D();
		
		
		container.add(plot);
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
