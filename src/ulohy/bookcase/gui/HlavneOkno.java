package ulohy.bookcase.gui;

import ulohy.bookcase.model.KnihaObject;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HlavneOkno {
    private JPanel panel1;
    private JButton nováKnihaButton;
    private JButton btn1Button;
    private JButton btn1Button1;
    private JButton btn1Button2;
    private JTable table1;
    private JPanel panel2;
    private JPanel panel3;
     public KnihaObject kniha=new KnihaObject();

    public HlavneOkno() {

         Object data[][] = { { "C1R1", "C2R1","C3R1","C4R1"},  { "", "", "",""} };
        Object columnNames[] = { "Názov knihy", "Autor", "Rok vydania","Cena"};
//        String[] columnNames = new String[] { "Názov knihy", "Autor", "Rok vydania","Cena"};

         JTableHeader header = table1.getTableHeader();
         table1 = new JTable(data, columnNames);

        panel3.setLayout(new BorderLayout());
        panel3.add(header, BorderLayout.NORTH);
        panel3.add(table1, BorderLayout.CENTER);

        DefaultTableModel daDefaultTableModel = new DefaultTableModel(0, 0);
        daDefaultTableModel.setColumnIdentifiers(columnNames);

        table1.setModel(daDefaultTableModel);

        JScrollPane scrollPane = new JScrollPane(table1);
//        scrollPane.setBounds(10, 38, 414, 212);
         panel3.add(scrollPane);


         // generovanie dummy riadkov
        for (int i = 2; i <40; i++) {

            daDefaultTableModel.addRow(new Object[] {"Test"+(i+1),"Test2","Test3","Test4"});


        }
//        table1.updateUI();


        nováKnihaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ZadacieOkno.main(null);

            }
        });
        btn1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                table1.updateUI();


            }
        });
    }

    public static void main(String[] args) {

        JFrame frame= new JFrame("Knižnica - Radvanisko");
        frame.setMinimumSize(new Dimension(500, 700));
        frame.setContentPane(new HlavneOkno().panel1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ArrayList<KnihaObject> zoznamknih = new ArrayList<KnihaObject>();





//        System.exit(0);




    }


}