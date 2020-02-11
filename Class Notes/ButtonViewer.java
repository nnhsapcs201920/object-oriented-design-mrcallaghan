import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * Thisi class demos how to install an action listener
 *
 * @author mcallaghan
 * @version 11feb2020
 */
public class ButtonViewer
{
    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 100;
    
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    
    /**
     * Constructor for objects of class ButtonViewer
     */
    public ButtonViewer()
    {
        // 1. define and set up the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.frame.add(this.panel);
        
        this.button = new JButton("Click Me!");  // label the button
        this.panel.add(this.button);
        
        // 2. create listener object
        ClickListener listener = new ClickListener();
        
        // 3. register listener object with component that generates events
        this.button.addActionListener(listener);
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }

}
