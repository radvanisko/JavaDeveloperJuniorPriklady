package ulohy.bookcase.gui;


import org.w3c.dom.Text;
import ulohy.bookcase.model.KnihaObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ZadacieOkno extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;

    public ZadacieOkno() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {

        KnihaObject kniha=new KnihaObject();

        String textove;
        textove=textField1.getText();
        if (textove.equals("")) {}
        else
        {
            kniha.setMeno(textField1.getText());
            kniha.setAutor(textField2.getText());

            // osetrene vstupy pre ocakavany integer Rokvydania a Cena
            try {
                kniha.setRokvydania(Integer.parseInt(textField3.getText()));
            } catch (NumberFormatException e) {
                kniha.setRokvydania(0);
            }
            try {
                kniha.setCena(Integer.parseInt(textField4.getText()));
            } catch (NumberFormatException e) {
                kniha.setCena(0);
            }

            //todo potrebujem to dostať do tabulky
            System.out.println(kniha.getMeno());
            System.out.println(kniha.getAutor());
            System.out.println(kniha.getRokvydania());
            System.out.println(kniha.getCena());

        }

        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        ZadacieOkno dialog = new ZadacieOkno();
        dialog.pack();
        dialog.setVisible(true);
//        System.exit(0);
    }
}
