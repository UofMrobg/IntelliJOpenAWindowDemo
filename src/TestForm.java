import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

public class TestForm {
    private JButton button1;
    public JPanel contentPane;

    public TestForm() {
        button1.addKeyListener(new KeyAdapter() {
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("here");
            }
        });
    }
}
