import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

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


    private SpravceHer data = new SpravceHer();
    private int aktualniIndex = 0;

    public int getAktualniIndex() {
        return aktualniIndex;
    }

    public void setAktualniIndex(int aktualniIndex) {
        this.aktualniIndex = aktualniIndex;
    }




    public HelloFrame(){
        initComponents();
        loadData();

        btPrevious.addActionListener(e -> posunIndex(1));
        btNext.addActionListener(e -> posunIndex(-1));

    }

    private void posunIndex(int oKolik) {
        int puvodni = aktualniIndex;
        aktualniIndex += oKolik;
        if (aktualniIndex >= 0 && aktualniIndex < data.size()) {
            prekresliData();
        } else {
            aktualniIndex = puvodni;
        }
    }

    private void loadData() {
        data.add(new Hra("Pokus",  true, 1));
        data.add(new Hra("Druhá",  false, 2));
    }
    private void initComponents(){
        setContentPane(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);

prekresliData();

    }



    private void prekresliData() {
       Hra aktualniHra = data.get(aktualniIndex);
        textField1.setText(aktualniHra.getNazev());
       jeHraKoupenaCheckBox.setSelected(aktualniHra.isJeHraKoupena());
        if (aktualniHra.getOblibenost() == 1) bt1.setSelected(true);
        else if (aktualniHra.getOblibenost() == 2) bt1.setSelected(true);
        else if (aktualniHra.getOblibenost() == 3) bt1.setSelected(true);
    }

}
