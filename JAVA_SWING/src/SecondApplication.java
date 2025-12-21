import javax.swing.*;
import java.awt.*;

public class SecondApplication {
    public static void main(String[]  args){
        addition obj=new addition();
        addsub obj1=new addsub();

    }
}
class addition {
    JFrame frm=new JFrame("Addition");
    JLabel lbl1=new JLabel("First Number");
    JLabel lbl2=new JLabel("Second Number");

    JTextField txt1=new JTextField();
    JTextField txt2=new JTextField();
    JTextField txt3=new JTextField();
    JButton btn=new JButton("Add");
    public addition(){
        frm.setSize(400,400);
        frm.setVisible(true);
        frm.setLayout(null);

        lbl1.setBounds(50,50,100,30);
        txt1.setBounds(150,50,150,30);

        lbl2.setBounds(50,100,100,30);
        txt2.setBounds(150,100,150,30);

        btn.setBounds(150,150,100,30);
        txt3.setBounds(150,200,150,30);

        frm.add(lbl1);
        frm.add(txt1);
        frm.add(lbl2);
        frm.add(txt2);
        frm.add(btn);
        frm.add(txt3);

        btn.addActionListener(e -> {
            int num1=Integer.parseInt(txt1.getText());
            int num2=Integer.parseInt(txt2.getText());
            int sum=num1+num2;
            txt3.setText(String.valueOf(sum));
        });
    }
}

class addsub extends JFrame {

    JLabel lbl1=new JLabel("First Number");
    JLabel lbl2=new JLabel("Second Number");
   JTextField txt1=new JTextField();
    JTextField txt2=new JTextField();
    JTextField txt3=new JTextField();

    // Similar structure for subtraction can be implemented here
    public addsub(){

        // Implementation goes here
        JButton btnadd=new JButton("Add");
        JButton btnSub=new JButton("Subtract");
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        setVisible(true);
        setSize(400,400);
        add(lbl1);

        add(txt1);
        add(lbl2);
        add(txt2);
        add(btnSub);
        add(btnadd);
        add(txt3);
        txt1.setPreferredSize(new Dimension(150, 30));
        txt2.setPreferredSize(new Dimension(150, 30));
        txt3.setPreferredSize(new Dimension(150, 30));
//        lbl1.setBounds(50,50,100,30);
//        txt1.setBounds(150,50,150,30);
//        lbl2.setBounds(50,100,100,30);
//        txt2.setBounds(150,100,150,30);
//        txt3.setBounds(150,200,150,30);
//        btnadd.setBounds(50,250,100,30);
//        btnSub.setBounds(200,250,100,30);
        btnSub.addActionListener(e -> {
            // Subtraction logic
            int num1=Integer.parseInt(txt1.getText());
            int num2=Integer.parseInt(txt2.getText());
            int diff=num1-num2;
            txt3.setText(String.valueOf(diff));
        });
        btnadd.addActionListener(
                e -> {
                    int num1=Integer.parseInt(txt1.getText());
                    int num2=Integer.parseInt(txt2.getText());
                    int sum=num1+num2;
                    txt3.setText(String.valueOf(sum));
                }
        );

    }
}
