import javax.swing.*;

public class Mouselistner {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        MouseListnerExample mle=new MouseListnerExample();
    }

}
class MouseListnerExample extends JFrame {
    public MouseListnerExample() {
        JLabel label = new JLabel("Click Me");
        label.setBounds(100, 100, 100, 30);
        add(label);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);


        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JOptionPane.showMessageDialog(null, "Label Clicked!");
            }
        });
    }


}
