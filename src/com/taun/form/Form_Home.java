package com.taun.form;

import com.taun.model.Model_Card;
import com.taun.model.StatusType;
import com.taun.swing.ScrollBar;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/taun/icon/stock.png")), "Stock Total", "$200000", "Increased by 60%"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/taun/icon/profit.png")), "Total Profit", "$15000", "Increased by 25%"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/taun/icon/flag.png")), "Unique Visitors", "$300000", "Increased by 70%"));
        //  add row table
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.gray);
        JPanel p = new JPanel();
        p.setBackground(Color.BLACK);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        table.addRow(new Object[]{"Mario Saeed", "marioo22@gmail.com", "Admin", "2 Aug,2025", StatusType.PENDING});
        table.addRow(new Object[]{"Sami Sami", "samisemsem@gmail.com", "Editor", "2 Aug,2025", StatusType.APPROVED});
        table.addRow(new Object[]{"Hanfi El daramaly", "hanfielDaramaly@gmail.com", "Subscriber", "4 Aug,2025", StatusType.APPROVED});
        table.addRow(new Object[]{"Melegy", "melegy@gmail.com", "Admin", "3 Aug,2025", StatusType.REJECT});
        table.addRow(new Object[]{"Marawan Mohsen", "marawanmohsen@gmail.com", "Admin", "3 Aug,2025", StatusType.PENDING});
        table.addRow(new Object[]{"Dahshan ALI Dahshan", "aliDahshan@gmail.com", "Editor", "3 Aug,2025", StatusType.APPROVED});
        table.addRow(new Object[]{"Fahd El Otaiby", "fahdelotaibi@gmail.com", "Subscriber", "3 Aug,2025", StatusType.APPROVED});
        table.addRow(new Object[]{"Ali AL Qahtany", "alialQahtany2929@gmail.com", "Admin", "3 Aug,2025", StatusType.REJECT});
        table.addRow(new Object[]{"Hassan Abdealziz Taun", "hassanabdelaziz944@gmail.com", "The UI-DashBoard Designer", "3 Aug,2025", StatusType.PENDING});
        table.addRow(new Object[]{"Hamdy El Ashaari", "HamdyAlAshari@gmail.com", "Admin", "3 Aug,2025", StatusType.PENDING});
        table.addRow(new Object[]{"Yousef Fawaz", "youseffawaz@gmail.com", "Editor", "3 Aug,2025", StatusType.APPROVED});
        table.addRow(new Object[]{"Mohamed El-SiSi", "mohamedelcc@gmail.com", "Subscriber", "3 Aug,2025", StatusType.APPROVED});
        table.addRow(new Object[]{"Mubarak Ali", "mubarakmubarak@gmail.com", "Admin", "3 Aug,2025", StatusType.APPROVED});
        table.addRow(new Object[]{"Hawary hero", "hereos@gmail.com", "Admin", "3 Aug,2025", StatusType.PENDING});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new com.taun.component.Card();
        card2 = new com.taun.component.Card();
        card3 = new com.taun.component.Card();
        panelBorder1 = new com.taun.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.taun.swing.Table();

        setBackground(new java.awt.Color(242, 242, 242));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(51, 153, 0));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(0, 102, 204));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(204, 204, 0));
        card3.setColor2(new java.awt.Color(102, 102, 0));
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Standard Table Design");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "User Type", "Joined", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spTable))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.taun.component.Card card1;
    private com.taun.component.Card card2;
    private com.taun.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private com.taun.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.taun.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
