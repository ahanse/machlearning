
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.*;
import weka.gui.visualize.Plot2D;
import weka.gui.visualize.PlotData2D;
import weka.core.Instances;

public class MainPanel extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JButton openButton;
    private JFileChooser fc;
    private Instances instances;
    private Plot2D plot;
	
	public MainPanel() {     
       setTitle("AdaBoost example");
       setSize(600, 400);
       setLocationRelativeTo(null);
       fc = new JFileChooser();
       
       Container pane = this.getContentPane();
       pane.setLayout(new BoxLayout(pane, BoxLayout.LINE_AXIS));
       
       createPlot(pane);
       pane.add(Box.createRigidArea(new Dimension(0,5)));  
       createOptionPane(pane);
       
       setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }
	
	private void createPlot(Container container)
	{
		plot = new Plot2D();
		
		container.add(plot);
	}
	
	private void createOptionPane(Container container)
	{
	       openButton = new JButton("Open Dataset");
	       openButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	       openButton.addActionListener(this);
	       container.add(openButton);
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

	@Override
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openButton) {
            int returnVal = fc.showOpenDialog(MainPanel.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
				try {
					BufferedReader reader = new BufferedReader(new FileReader(file));
					instances = new Instances(reader);
					plot.addPlot(new PlotData2D(instances));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                //This is where a real application would open the file.
            } else {
            }
        }
	}
}
