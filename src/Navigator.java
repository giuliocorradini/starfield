import java.util.List;
import java.util.TimerTask;

public class Navigator extends TimerTask {
    private int frameCounter;
    private List<Star> stars;
    private Starplotter sp;

    public Navigator(Starplotter sp) {
        this.sp = sp;
        this.frameCounter = 0;
        this.stars = sp.getStars();
    }

    public void run() {
        updateFrame();
        sp.repaint();
    }

    public void computePositions() {
        for(Star s: stars)
        updateStarLocation(s);

        if(frameCounter % 20 == 0) {
            createStars();
        }
    }

    private void updateFrame() {
        frameCounter++;
        frameCounter %= 60;
    }

    private boolean isOutOfView(Star s) {
        return !sp.contains(s.getX() + sp.getWidth() / 2, s.getY() + sp.getHeight() / 2);
    }
    
    private void updateStarLocation(Star s) {
        s.setDistance(s.getDistance() + s.getSpeed());
        if(isOutOfView(s)) {
            this.stars.remove(s);
        }
    }

    private void createStars() {
        int n_new = (int)(Math.random() * 5);
        for(int i=0; i<n_new; i++) {
            Star ns = new Star(2 * Math.PI * Math.random(), 1 + Math.random());

            this.stars.add(ns);
        }
    }
}
