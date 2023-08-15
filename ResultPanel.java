import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultPanel extends JPanel{

    public static JLabel resultLabel;

    ResultPanel(){
        //this.setBounds(0, 0, 350, 150);
        this.setPreferredSize(new Dimension(350, 150));
        this.setBackground(Color.LIGHT_GRAY);
        
        resultLabel = new JLabel("0");

        this.add(resultLabel);
        this.setVisible(true);
    }
}