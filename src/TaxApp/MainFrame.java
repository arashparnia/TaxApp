package TaxApp;

import org.easyrules.api.RulesEngine;

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
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import static org.easyrules.core.RulesEngineBuilder.aNewRulesEngine;


/**
 * Created by arashparnia on 18/12/2016.
 */
public class MainFrame extends JFrame {



    public  MainFrame(){

        //this.setJMenuBar(createMenuBar());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setTitle("TaxApp");

        UIManager.getDefaults().put("TitledBorder.titleColor", Color.BLACK);
        Border raisedEtched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
        Border lowerEtched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        Font titleFont = UIManager.getFont("TitledBorder.font");

        JPanel main_panel = new JPanel();
        TitledBorder main_panel_TitledBorder = BorderFactory.createTitledBorder(raisedEtched, "VAT FORM");
        main_panel.setBorder(main_panel_TitledBorder);

        /*
        1 --> Goods or Services in the Netherlands
        2 -> Reverse-charge Mechanisms (note: domestic is left out)
        3 -> Goods an services to or in foreign countries
        4 -> Goods and services supplied to you
        5 - Input tax and small business scheme
        */


        JPanel rubriek_1 = new JPanel();
        rubriek_1.setToolTipText("Goods or Services in the Netherlands");
        TitledBorder rubriek_1_TitledBorder = BorderFactory.createTitledBorder(lowerEtched, "Goods or Services in the Netherlands");
//        rubriek_1_TitledBorder.setTitleJustification(TitledBorder.CENTER);
        rubriek_1.setBorder(rubriek_1_TitledBorder);

        JLabel rubriek_1a_label = new JLabel("High Tariff");
        rubriek_1a_label.setToolTipText("If you want to know which supplies of goods and services are subject to the high or low rate, you should visit our website and search for ‘btw-tarief ’ (VAT rate).");
        JTextField rubriek_1a_turnover_textField = new JTextField();
        JTextField rubriek_1a_vat_textField = new JTextField();

        JLabel rubriek_1b_label = new JLabel("Low Tariff");
        rubriek_1b_label.setToolTipText("If you want to know which supplies of goods and services are subject to the high or low rate, you should visit our website and search for ‘btw-tarief ’ (VAT rate).");
        JTextField rubriek_1b_turnover_textField = new JTextField();
        JTextField rubriek_1b_vat_textField = new JTextField();

        JLabel rubriek_1c_label = new JLabel("Other Tariff");
        rubriek_1c_label.setToolTipText("This question does not apply to you, as you are based abroad.");
        JTextField rubriek_1c_turnover_textField = new JTextField();
        JTextField rubriek_1c_vat_textField = new JTextField();

        JLabel rubriek_1d_label = new JLabel("Private use");
        rubriek_1d_label.setToolTipText("Only complete this question in the last tax return of the year. Specify the VAT that you must pay on the private use.");
        JTextField rubriek_1d_turnover_textField = new JTextField();
        JTextField rubriek_1d_vat_textField = new JTextField();

        JLabel rubriek_1e_label = new JLabel("No Tariff");
        rubriek_1e_label.setToolTipText("Enter the turnover for goods and services supplied by you in the Netherlands at 0%.");
        JTextField rubriek_1e_turnover_textField = new JTextField();

        rubriek_1.setLayout(new GridLayout(5,3));

        rubriek_1.add(rubriek_1a_label); rubriek_1.add(rubriek_1a_turnover_textField); rubriek_1.add(rubriek_1a_vat_textField);
        rubriek_1.add(rubriek_1b_label); rubriek_1.add(rubriek_1b_turnover_textField); rubriek_1.add(rubriek_1b_vat_textField);
        rubriek_1.add(rubriek_1c_label); rubriek_1.add(rubriek_1c_turnover_textField); rubriek_1.add(rubriek_1c_vat_textField);
        rubriek_1.add(rubriek_1d_label); rubriek_1.add(rubriek_1d_turnover_textField); rubriek_1.add(rubriek_1d_vat_textField);
        rubriek_1.add(rubriek_1e_label); rubriek_1.add(rubriek_1e_turnover_textField);



        JPanel rubriek_2 = new JPanel();
        rubriek_2.setToolTipText("Reverse-charge Mechanisms (note: domestic is left out)");
        TitledBorder rubriek_2_TitledBorder = BorderFactory.createTitledBorder(lowerEtched, "Reverse-charge Mechanisms (note: domestic is left out)");
//        rubriek_2_TitledBorder.setTitleJustification(TitledBorder.CENTER);
        rubriek_2.setBorder(rubriek_2_TitledBorder);


        JLabel rubriek_2a_label = new JLabel("reverse-charged VAT");
        rubriek_2a_label.setToolTipText("You should complete this question if a Dutch entrepreneur has supplied goods or services to you in the Netherlands for which the VAT has been reverse charged to you.");
        JTextField rubriek_2a_turnover_textField = new JTextField();
        JTextField rubriek_2a_vat_textField = new JTextField();

        rubriek_2.setLayout(new GridLayout(1,3));

        rubriek_2.add(rubriek_2a_label); rubriek_2.add(rubriek_2a_turnover_textField); rubriek_2.add(rubriek_2a_vat_textField);



        JPanel rubriek_3 = new JPanel();
        rubriek_3.setToolTipText("Goods an services to or in foreign countries");
        TitledBorder rubriek_3_TitledBorder = BorderFactory.createTitledBorder(lowerEtched, "Goods an services to or in foreign countries");
//        rubriek_3_TitledBorder.setTitleJustification(TitledBorder.CENTER);
        rubriek_3.setBorder(rubriek_3_TitledBorder);

        JLabel rubriek_3a_label = new JLabel("Supplies to non-EU");
        rubriek_3a_label.setToolTipText("Enter the turnover from goods that you exported from the Netherlands to non-EU countries. This includes goods placed under the customs warehousing procedure.");
        JTextField rubriek_3a_turnover_textField = new JTextField();

        JLabel rubriek_3b_label = new JLabel("Supplies to or services in EU");
        rubriek_3b_label.setToolTipText("Enter the amount of the goods supplied and services provided within the EU (your intra-Community transactions).");
        JTextField rubriek_3b_turnover_textField = new JTextField();

        JLabel rubriek_3c_label = new JLabel("Installation/distance sales within the EU");
        rubriek_3c_label.setToolTipText("assembly or installation of goods in another EU country, for which the goods are supplied from the Netherlands");
        JTextField rubriek_3c_turnover_textField = new JTextField();

        rubriek_3.setLayout(new GridLayout(3,2));

        rubriek_3.add(rubriek_3a_label); rubriek_3.add(rubriek_3a_turnover_textField);
        rubriek_3.add(rubriek_3b_label); rubriek_3.add(rubriek_3b_turnover_textField);
        rubriek_3.add(rubriek_3c_label); rubriek_3.add(rubriek_3c_turnover_textField);
        
        

        JPanel rubriek_4 = new JPanel();
        rubriek_4.setToolTipText("Goods and services supplied to you");
        TitledBorder rubriek_4_TitledBorder = BorderFactory.createTitledBorder(lowerEtched, "Goods or Services in the Netherlands");
//        rubriek_4_TitledBorder.setTitleJustification(TitledBorder.CENTER);
        rubriek_4.setBorder(rubriek_4_TitledBorder);

        JLabel rubriek_4a_label = new JLabel("Supplies/services from non-EU countries");
        rubriek_4a_label.setToolTipText("You imported goods into the Netherlands from outside the EU, using the reverse-charge mechanism on import.");
        JTextField rubriek_4a_turnover_textField = new JTextField();
        JTextField rubriek_4a_vat_textField = new JTextField();

        JLabel rubriek_4b_label = new JLabel("Supplies/services from EU countries");
        rubriek_4b_label.setToolTipText("If you want to know which supplies of goods and services are subject to the high or low rate, you should visit our website and search for ‘btw-tarief ’ (VAT rate).");
        JTextField rubriek_4b_turnover_textField = new JTextField();
        JTextField rubriek_4b_vat_textField = new JTextField();

        rubriek_4.setLayout(new GridLayout(2,2));

        rubriek_4.add(rubriek_4a_label); rubriek_4.add(rubriek_4a_turnover_textField);
        rubriek_4.add(rubriek_4b_label); rubriek_4.add(rubriek_4b_turnover_textField);

        JPanel rubriek_5 = new JPanel();
        rubriek_5.setToolTipText("Input tax and small business scheme");
        TitledBorder rubriek_5_TitledBorder = BorderFactory.createTitledBorder(lowerEtched, "Input tax and small business scheme");
//        rubriek_5_TitledBorder.setTitleJustification(TitledBorder.CENTER);
        rubriek_5.setBorder(rubriek_5_TitledBorder);

        JLabel rubriek_5a_label = new JLabel("VAT");
        rubriek_5a_label.setToolTipText("VAT charged to you by other entrepreneurs");
        JTextField rubriek_5a_vat_textField = new JTextField();

        JLabel rubriek_5b_label = new JLabel("Input tax and small business scheme");
        rubriek_5b_label.setToolTipText("");
        JTextField rubriek_5b_vat_textField = new JTextField();

        JLabel rubriek_5c_label = new JLabel("subtotal");
        rubriek_5c_label.setToolTipText("This question does not apply to you, as you are based abroad.");
        JTextField rubriek_5c_vat_textField = new JTextField();

        JLabel rubriek_5d_label = new JLabel("Tax relief under the small businesses scheme");
        rubriek_5d_label.setToolTipText("Only complete this question in the last tax return of the year. Specify the VAT that you must pay on the private use.");
        JTextField rubriek_5d_vat_textField = new JTextField();

        JLabel rubriek_5e_label = new JLabel("Estimate previous claims");
        rubriek_5e_label.setToolTipText("");
        JTextField rubriek_5e_vat_textField = new JTextField();

        JLabel rubriek_5f_label = new JLabel("Estimate current claim");
        rubriek_5f_label.setToolTipText("");
        JTextField rubriek_5f_vat_textField = new JTextField();

        JLabel rubriek_5g_label = new JLabel("Total");
        rubriek_5g_label.setToolTipText("");
        JTextField rubriek_5g_vat_textField = new JTextField();




        rubriek_5.setLayout(new GridLayout(7,2));

        rubriek_5.add(rubriek_5a_label);  rubriek_5.add(rubriek_5a_vat_textField);
        rubriek_5.add(rubriek_5b_label);  rubriek_5.add(rubriek_5b_vat_textField);
        rubriek_5.add(rubriek_5c_label);  rubriek_5.add(rubriek_5c_vat_textField);
        rubriek_5.add(rubriek_5d_label);  rubriek_5.add(rubriek_5d_vat_textField);
        rubriek_5.add(rubriek_5e_label);  rubriek_5.add(rubriek_5e_vat_textField);
        rubriek_5.add(rubriek_5f_label);  rubriek_5.add(rubriek_5f_vat_textField);
        rubriek_5.add(rubriek_5g_label);  rubriek_5.add(rubriek_5g_vat_textField);










        main_panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridheight = 5;
        c.gridx = 1;
        c.insets = new Insets(10,0,10,0);
        main_panel.add(rubriek_1,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridheight = 1;
        c.gridx = 1;
        c.insets = new Insets(10,0,10,0);
        main_panel.add(rubriek_2,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridheight = 3;
        c.gridx = 1;
        c.insets = new Insets(10,0,10,0);
        main_panel.add(rubriek_3,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridheight = 2;
        c.gridx = 1;
        c.insets = new Insets(10,0,10,0);
        main_panel.add(rubriek_4,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridheight = 7;
        c.gridx = 1;
        c.insets = new Insets(10,0,10,0);
        main_panel.add(rubriek_5,c);

        JButton b1 = new JButton("TEST");
        JButton b2 = new JButton("TEST");
        c.fill = GridBagConstraints.LINE_START;
        c.gridheight = 1;
        c.gridx = 1;
        c.insets = new Insets(10,0,10,0);
        main_panel.add(b1,c);


        this.add(main_panel);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("firing rules");
                // create a rules engine
                RulesEngine rulesEngine = aNewRulesEngine().build();
                //register the rule
                rulesEngine.registerRule(new KvkRule());
                //fire rules
                rulesEngine.fireRules();
            }
        });


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
