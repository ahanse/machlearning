
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainPanel extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public MainPanel() {
        
       setTitle("AdaBoost example");
       setSize(600, 400);
       setLocationRelativeTo(null);
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
