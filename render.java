import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;




public class render extends JPanel{
    public JFrame createWindow(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1920, 1080);
        frame.getContentPane().add(new render());
        frame.setTitle("Gabriel");
        frame.setResizable(true);
        return(frame);
    }

    public void paint(Graphics g){
       g.fillRect(300, 300, 300, 300); 
       g.setColor(Color.green);

    }

    public static void main(String[] args) {
        render rd = new render();
        rd.createWindow();
    }
}
