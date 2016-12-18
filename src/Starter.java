import javax.swing.*;

/**
 * Created by arashparnia on 18/12/2016.
 */
public class Starter {
    public static void main(String[] args) {

        //Create and set up the window.
        JFrame main_frame = new MainFrame();
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        main_frame.setJMenuBar(main_frame.getJMenuBar());
        main_frame.setContentPane(main_frame.getContentPane());

        //Display the window.
        main_frame.setSize(450, 260);
        main_frame.setVisible(true);
    }
}
