import java.awt.*;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import javax.swing.JPanel;
import java.util.Timer;

public class Starplotter extends JPanel {
    private Timer t;
    private Navigator nv;
    private List<Star> stars;

    public Starplotter() {
        super();

        stars = Collections.synchronizedList(new LinkedList<Star>());

        setBackground(Color.BLACK);
        setForeground(Color.WHITE);

        t = new Timer();
        nv = new Navigator(this);
        t.scheduleAtFixedRate(nv, 0, 1000 / 60);
    }

    public void paint(Graphics g) {
        super.paint(g);

        Dimension window_size = getSize();
        int x = window_size.width;
        int y = window_size.height;

        g.translate(x/2, y/2);

        nv.computePositions();

        for(Star s: stars) {
            g.fillRect(s.getX(), s.getY(), 2, 2);
        }
    }

    public List<Star> getStars() {
        return stars;
    }
}
