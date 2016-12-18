package TaxApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

/**
 * Created by arashparnia on 18/12/2016.
 */
public class MainFrame extends JFrame {



    public  MainFrame(){

        this.setJMenuBar(createMenuBar());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setTitle("TaxApp");




        JButton b1 = new JButton("TEST");
        JButton b2 = new JButton("TEST");
        JPanel main_panel = new JPanel();


        main_panel.add(b1);
        main_panel.add(b2);
        this.add(main_panel);





    }


    private JMenuBar createMenuBar(){
        JMenuBar menuBar;
        //Where the GUI is created:

        JMenu menu, submenu;
        JMenuItem file_menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

//Create the menu bar.
        menuBar = new JMenuBar();

//Build the first menu.
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "File Operations");
        menuBar.add(menu);

//a group of JMenuItems
        file_menuItem = new JMenuItem("A text-only menu item",
                KeyEvent.VK_T);
        file_menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        file_menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(file_menuItem);

        file_menuItem = new JMenuItem("Both text and icon",
                new ImageIcon("images/middle.gif"));
        file_menuItem.setMnemonic(KeyEvent.VK_B);
        menu.add(file_menuItem);

        file_menuItem = new JMenuItem(new ImageIcon("images/middle.gif"));
        file_menuItem.setMnemonic(KeyEvent.VK_D);
        menu.add(file_menuItem);

//a group of radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Another one");
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

//a group of check box menu items
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        menu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("Another one");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        menu.add(cbMenuItem);

//a submenu
        menu.addSeparator();
        submenu = new JMenu("A submenu");
        submenu.setMnemonic(KeyEvent.VK_S);

        file_menuItem = new JMenuItem("An item in the submenu");
        file_menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        submenu.add(file_menuItem);

        file_menuItem = new JMenuItem("Another item");
        submenu.add(file_menuItem);
        menu.add(submenu);

//Build second menu in the menu bar.
        menu = new JMenu("Another Menu");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);


return menuBar;
    }



}
