import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calller {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        x obj=new x();
    }

}
class x extends JFrame{
    int i;
    JProgressBar progressBar;
    public x(){
     JButton label = new JButton("Click Me");
    progressBar = new JProgressBar(0,20);

    Timer t= new Timer(400, this::actionPerformed);

        label.setBounds(100, 100, 100, 30);
        progressBar.setBounds(50, 150, 200, 30); // Set bounds for the progress bar
        add(label);
        add(progressBar);
        label.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.start();
//                new addsub();
//                dispose();
//                System.out.println("Button Clicked!");
            }
        });


        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

        if (i==20){
            new addsub();
            dispose();
        }
        i++;
        progressBar.setValue(i);
    }
}
