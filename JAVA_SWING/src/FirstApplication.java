
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class FirstApplication {

    JLabel label = new JLabel("Name");
    JLabel label1 = new JLabel("Mobile Number");
    JLabel label2 = new JLabel("Email");
    JLabel label3 = new JLabel("Password");
    JTextField text = new JTextField();
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JPasswordField pass = new JPasswordField();

    JButton button = new JButton("Submit");

    JTextPane textPane = new JTextPane();
    public FirstApplication(){

        JFrame frame = new JFrame("First Application");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);

        label.setBounds(50,50,100,30);
        text.setBounds(150,50,150,30);

        label1.setBounds(50,100,100,30);
        text1.setBounds(150,100,150,30);

        label2.setBounds(50,150,100,30);
        text2.setBounds(150,150,150,30);

        label3.setBounds(50,200,100,30);
        pass.setBounds(150,200,150,30);

        button.setBounds(150,250,100,30);
        textPane.setBounds(50,300,300,100);
        frame.add(label);
        frame.add(text);
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(label3);
        frame.add(pass);
        frame.add(button);
        frame.add(textPane);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = text.getText();
                String mobile = text1.getText();
                String email = text2.getText();
                String password = Arrays.toString(pass.getPassword());
                textPane.setText("Name: " + name + "\nMobile Number: " + mobile + "\nEmail: " + email + "\nPassword: " + password);
                System.out.println("Name: " + name);
                System.out.println("Mobile Number: " + mobile);
                System.out.println("Email: " + email);
                System.out.println("Password: " + password);
            }
        });
    }
         public static void main(String[] args) {
        System.out.println("Hello, World!");
        FirstApplication app = new FirstApplication();

        }

    }
