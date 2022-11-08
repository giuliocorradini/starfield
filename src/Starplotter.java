import java.awt.*;
import javax.swing.JPanel;

public class Starplotter extends JPanel {
    private Star s;

    public Starplotter() {
        super();
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);

        s = new Star(Math.random());
    }

    public void paint(Graphics g) {
        super.paint(g);

        Dimension window_size = this.getParent().getSize();
        int x = window_size.width;
        int y = window_size.height;

        g.translate(x/2, y/2);

        s.setDistance(5);
        g.fillRect(s.getX(), s.getY(), 2, 2);
    }
}
