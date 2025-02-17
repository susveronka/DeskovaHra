import javax.swing.*;

public class HelloFrame extends JFrame {
    private JTextField textField1;
    private JCheckBox jeHraKoupenaCheckBox;
    private JRadioButton bt1;
    private JRadioButton bt2;
    private JRadioButton bt3;
    private JLabel oblibenost;
    private JButton btNext;
    private JButton btPrevious;
    private JPanel panel;
    private JButton uložitZměnyButton;

private int aktualniIndex = 0;
private SpravceHer data = new SpravceHer();


    public HelloFrame(){
        initComponents();
        loadData();
       btPrevious.addActionListener(e -> posunIndex(1));

    }
    private void loadData(){ //
data.add(new Hra("hra", true, 1));
    }

    private void initComponents(){
        setContentPane(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        btPrevious.addActionListener(e -> prepnuti());
        btNext.addActionListener(e -> prepnutiZpet());


    }

    private void prepnuti(){

    }

    private void prepnutiZpet(){

    }

    private void prekresliData(){
        Hra aktualniHra = hry.get(aktualniIndex);
    }

}
