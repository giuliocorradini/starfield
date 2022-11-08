import java.awt.Dimension;
import javax.swing.JFrame;

public class Starfield extends JFrame {
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
    }
}
