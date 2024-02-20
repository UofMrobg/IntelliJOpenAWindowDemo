import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TestForm");
        frame.setContentPane(new TestForm().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set the size of the window
        //frame.pack(); // fit the contents (tiny mode!)
        frame.setSize(300, 200); // or choose a size that should work
        frame.setVisible(true);
    }
}
