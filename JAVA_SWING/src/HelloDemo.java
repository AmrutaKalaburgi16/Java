import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloDemo {
    private JPanel Main;
    private JLabel Name;
    private JTextField txt;
    private JButton submitButton;
    private JTextPane textPane1;


    public HelloDemo() {

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txt.getText();
                textPane1.setText("Hello, " + name + "!");
            }
        });

    }
    public static void main(String[] args){
        JFrame frame = new JFrame("HelloDemo");


        frame.setContentPane(new HelloDemo().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
