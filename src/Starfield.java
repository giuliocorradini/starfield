import java.awt.Dimension;
import java.util.Timer;

import javax.swing.JFrame;

public class Starfield extends JFrame {
    Timer t;
    Starplotter plotter;

    public static void main(String args[]) {
        Starfield frame = new Starfield();

        frame.setSize(600, 600);
        frame.setMinimumSize(new Dimension(200, 200));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    public Starfield() {
        super("Starfield");

        plotter = new Starplotter();
        this.add(plotter);

        t = new Timer();
        Navigator nv = new Navigator(plotter);
        t.scheduleAtFixedRate(nv, 0, 1000 / 60);
    }
}
