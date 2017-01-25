package TaxApp;

import java.awt.EventQueue;
import javax.swing.JFrame;
/**
 * Created by arashparnia on 18/12/2016.
 */
public class Starter {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            //Create and set up the window.
            JFrame main_frame = new MainFrame();
            main_frame.setSize(1000, 1000);
//            main_frame.setExtendedState(main_frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            main_frame.setVisible(true);
        });

    }
}
