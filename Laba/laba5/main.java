import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.imageio.ImageIO;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String put = in.nextLine();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        BufferedImage image = ImageIO.read(new File(put));
        JPanel pane = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image,100, 100,null);

            }
        };

        frame.add(pane);
        frame.setVisible(true);

    }

}

