import javax.swing.*;
import java.awt.*;

public class AppPanel extends JPanel {
//    Screen Settings
    final int originalTileSize = 16;
    final int scale = 3;

    final int tileSize = originalTileSize*scale;

//    How many tiles should we display?
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

// Panel Constructor

    public AppPanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void paint(Graphics g) {
        for (int x = 0; x <= screenWidth; x += tileSize)
            for (int y = 0; y <= screenHeight; y += tileSize)
                g.drawRect(x, y, tileSize, tileSize);
    }

}

