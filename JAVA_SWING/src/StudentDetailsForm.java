import javax.swing.*;

public class StudentDetailsForm {
    public static void main(String[] args) {
        System.out.println("Student Details Form");
        StudentDetails sd=new StudentDetails();
    }


}
class  StudentDetails extends JFrame {

        public StudentDetails() {
            JLabel nameLabel = new JLabel("Name:");
            JLabel ageLabel = new JLabel("Age:");
            JLabel gradeLabel = new JLabel("Grade:");
            JTextField nameField = new JTextField(20);
            JTextField ageField = new JTextField(20);
            JTextField gradeField = new JTextField(20);
            ButtonGroup genderGroup=new ButtonGroup();

            JRadioButton gender=new JRadioButton("Male");
            JRadioButton gen2=new JRadioButton("Female");
            genderGroup.add(gender);
            genderGroup.add(gen2);
            JCheckBox chkBox=new JCheckBox("Dance");
            JCheckBox musicBox=new JCheckBox("Music");
            JCheckBox artBox=new JCheckBox("Art");
            JButton submitButton = new JButton("Submit");
            JTextField resultField = new JTextField(30);

            setLayout(null);
            setVisible(true);
            setSize(400, 400);
            add(nameLabel);
            add(nameField);
            add(ageLabel);
            add(ageField);
            add(gradeLabel);
            add(gradeField);
            add(gender);
            add(gen2);
            add(submitButton);
            add(resultField);
            add(chkBox);
            add(musicBox);
            add(artBox);

            nameLabel.setBounds(50, 50, 100, 30);
            ageLabel.setBounds(50, 100, 100, 30);
            gradeLabel.setBounds(50, 150, 100, 30);
            nameField.setBounds(150, 50, 150, 30);
            ageField.setBounds(150, 100, 150, 30);
            gradeField.setBounds(150,150,130,30);
            gender.setBounds(150,200,100,30);
            gen2.setBounds(250,200,100,30);
            chkBox.setBounds(50,250,100,30);
            musicBox.setBounds(150,250,100,30);
            artBox.setBounds(250,250,100,30);
            submitButton.setBounds(150, 300, 150, 30);
            resultField.setBounds(50, 350, 300, 30);

            chkBox.addItemListener(e->
                    {
                        if (chkBox.isSelected()) {
                            System.out.println("Dance Selected");
                        } else {
                            System.out.println("Dance Deselected");
                        }
                    }
            );
            submitButton.addActionListener(q-> {

                        String name = nameField.getText();
                        int age = Integer.parseInt(ageField.getText());
                        String grade = gradeField.getText();
                        String gen;
                        if(gender.isSelected()){
                            gen = gender.getText();
                        }else{
                            gen=gen2.getText();
                        }
                        String hobbies="Hobbies: ";
                        if(chkBox.isSelected()){
                            System.out.println("Student likes Dance");
                            hobbies+= " Dance ";
                        }
                        if (musicBox.isSelected()){
                            System.out.println("Student likes Music");
                            hobbies+= " Music ";

                        }
                        if (artBox.isSelected()){
                            System.out.println("Student likes Art");
                                hobbies+= " Art ";
                        }

                        String result = "Name: " + name +
                                " | Age: " + age +
                                " | Grade: " + grade +
                                " | Gender: " + gen
                                + " | " + hobbies;

                        resultField.setText(result);



                    }
                    );
        }
        // Constructor logic here

        }