import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Perlin Noise Map");

        AppPanel appPanel = new AppPanel();
        window.add(appPanel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
