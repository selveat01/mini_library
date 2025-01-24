/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package minilibrary;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author wardi
 */
public class MiniLibraryGUI extends javax.swing.JFrame {

    /**
     * Creates new form MiniLibraryGUI
     */
    ArrayList<Book> bookList = new ArrayList<>();
    BorrowerTableModel tableModel;
    private MiniLibrary librarysystem;

    public MiniLibraryGUI() {
        initComponents();

        librarysystem = new MiniLibrary();

        tableModel = new BorrowerTableModel();
        ViewBorrowerDetailTable.setModel(tableModel);

        String placeholder = "Search The Book Now!";
        SearchText.setText(placeholder);
        SearchText.setForeground(Color.GRAY);

        SearchText.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                if (SearchText.getText().equals(placeholder)) {
                    SearchText.setText(" ");
                    SearchText.setForeground(Color.BLACK);
                }

            }

            @Override
            public void focusLost(FocusEvent e
            ) {
                if (SearchText.getText().isEmpty()) {
                    SearchText.setText(placeholder);
                    SearchText.setForeground(Color.GRAY);
                }
            }
        }
        );

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        MiniLibraryAllPageLayeredPanel = new javax.swing.JTabbedPane();
        VisitorPanel = new javax.swing.JPanel();
        AddNewVisitorBTN = new javax.swing.JButton();
        ViewVisitorBTN = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        BorrowAndReturnPanel = new javax.swing.JPanel();
        javax.swing.JLayeredPane AddNewVisitorDetailsForm = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BorrowerName = new javax.swing.JTextField();
        BorrowerNumberID = new javax.swing.JTextField();
        DetailsAddNewBorrower = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        BookTitleBorrowList = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewBorrowerDetailTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        BookHomePanel = new javax.swing.JPanel();
        SearchText = new javax.swing.JTextField();
        GoBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AddBookBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        HomeImage = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.lightGray);
        setMaximumSize(new java.awt.Dimension(1000, 1000));

        MiniLibraryAllPageLayeredPanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        AddNewVisitorBTN.setText("Add New Visitor");
        AddNewVisitorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewVisitorBTNActionPerformed(evt);
            }
        });

        ViewVisitorBTN.setText("Visitor Details");
        ViewVisitorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewVisitorBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout VisitorPanelLayout = new javax.swing.GroupLayout(VisitorPanel);
        VisitorPanel.setLayout(VisitorPanelLayout);
        VisitorPanelLayout.setHorizontalGroup(
            VisitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisitorPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(VisitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewVisitorBTN)
                    .addComponent(AddNewVisitorBTN))
                .addGap(79, 79, 79)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        VisitorPanelLayout.setVerticalGroup(
            VisitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisitorPanelLayout.createSequentialGroup()
                .addGroup(VisitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VisitorPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(AddNewVisitorBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ViewVisitorBTN))
                    .addGroup(VisitorPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        MiniLibraryAllPageLayeredPanel.addTab("VISITOR", VisitorPanel);

        AddNewVisitorDetailsForm.setBackground(new java.awt.Color(0, 0, 255));
        AddNewVisitorDetailsForm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddNewVisitorDetailsForm.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                AddNewVisitorDetailsFormComponentHidden(evt);
            }
        });

        jLabel3.setText("Name:");

        jLabel5.setText("Number ID:");

        jLabel6.setText("Book Title to Borrow:");

        BorrowerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowerNameActionPerformed(evt);
            }
        });

        BorrowerNumberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowerNumberIDActionPerformed(evt);
            }
        });

        DetailsAddNewBorrower.setText("Add");
        DetailsAddNewBorrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsAddNewBorrowerActionPerformed(evt);
            }
        });

        BookTitleBorrowList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(BookTitleBorrowList);

        jLabel7.setText("Total Price:");

        AddNewVisitorDetailsForm.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddNewVisitorDetailsForm.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddNewVisitorDetailsForm.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddNewVisitorDetailsForm.setLayer(BorrowerName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddNewVisitorDetailsForm.setLayer(BorrowerNumberID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddNewVisitorDetailsForm.setLayer(DetailsAddNewBorrower, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddNewVisitorDetailsForm.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddNewVisitorDetailsForm.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AddNewVisitorDetailsForm.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AddNewVisitorDetailsFormLayout = new javax.swing.GroupLayout(AddNewVisitorDetailsForm);
        AddNewVisitorDetailsForm.setLayout(AddNewVisitorDetailsFormLayout);
        AddNewVisitorDetailsFormLayout.setHorizontalGroup(
            AddNewVisitorDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewVisitorDetailsFormLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(AddNewVisitorDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddNewVisitorDetailsFormLayout.createSequentialGroup()
                        .addComponent(DetailsAddNewBorrower)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddNewVisitorDetailsFormLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewVisitorDetailsFormLayout.createSequentialGroup()
                        .addGroup(AddNewVisitorDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(AddNewVisitorDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BorrowerNumberID)
                            .addComponent(BorrowerName))))
                .addGap(27, 27, 27))
        );
        AddNewVisitorDetailsFormLayout.setVerticalGroup(
            AddNewVisitorDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewVisitorDetailsFormLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(AddNewVisitorDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BorrowerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddNewVisitorDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BorrowerNumberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(AddNewVisitorDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DetailsAddNewBorrower)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        ViewBorrowerDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No. ID", "Name", "Borrowed Book"
            }
        ));
        jScrollPane1.setViewportView(ViewBorrowerDetailTable);
        if (ViewBorrowerDetailTable.getColumnModel().getColumnCount() > 0) {
            ViewBorrowerDetailTable.getColumnModel().getColumn(0).setMinWidth(80);
            ViewBorrowerDetailTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            ViewBorrowerDetailTable.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        javax.swing.GroupLayout BorrowAndReturnPanelLayout = new javax.swing.GroupLayout(BorrowAndReturnPanel);
        BorrowAndReturnPanel.setLayout(BorrowAndReturnPanelLayout);
        BorrowAndReturnPanelLayout.setHorizontalGroup(
            BorrowAndReturnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorrowAndReturnPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(AddNewVisitorDetailsForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BorrowAndReturnPanelLayout.setVerticalGroup(
            BorrowAndReturnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorrowAndReturnPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(BorrowAndReturnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(AddNewVisitorDetailsForm))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        MiniLibraryAllPageLayeredPanel.addTab("BORROW", BorrowAndReturnPanel);

        jTextField2.setText("Date");

        jTextField3.setText("Month");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText("Year");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(656, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(423, Short.MAX_VALUE))
        );

        MiniLibraryAllPageLayeredPanel.addTab("RETURN", jPanel5);

        BookHomePanel.setLayout(null);

        SearchText.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        SearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextActionPerformed(evt);
            }
        });
        BookHomePanel.add(SearchText);
        SearchText.setBounds(80, 270, 280, 34);

        GoBtn.setText("Go");
        GoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBtnActionPerformed(evt);
            }
        });
        BookHomePanel.add(GoBtn);
        GoBtn.setBounds(370, 270, 72, 34);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("New books? Click here!");
        BookHomePanel.add(jLabel1);
        jLabel1.setBounds(190, 330, 170, 20);

        AddBookBtn.setText("Add Book");
        AddBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookBtnActionPerformed(evt);
            }
        });
        BookHomePanel.add(AddBookBtn);
        AddBookBtn.setBounds(220, 360, 100, 29);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 3, 24)); // NOI18N
        jLabel2.setText("Welcome to Our Mini Library!");
        BookHomePanel.add(jLabel2);
        jLabel2.setBounds(100, 10, 340, 28);

        HomeImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\wardi\\OneDrive\\Dokumen\\NetBeansProjects\\MiniLibrary\\src\\minilibrary\\image\\Gallery of Cambridge Public Libr_1.jpg")); // NOI18N
        HomeImage.setText("ff");
        BookHomePanel.add(HomeImage);
        HomeImage.setBounds(110, 60, 300, 180);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        BookHomePanel.add(jLayeredPane2);
        jLayeredPane2.setBounds(480, 10, 470, 470);

        MiniLibraryAllPageLayeredPanel.addTab("BOOK", BookHomePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MiniLibraryAllPageLayeredPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(MiniLibraryAllPageLayeredPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextActionPerformed

    private void AddBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBookBtnActionPerformed

    private void GoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GoBtnActionPerformed

    private void AddNewVisitorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewVisitorBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddNewVisitorBTNActionPerformed

    private void ViewVisitorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewVisitorBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewVisitorBTNActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void AddNewVisitorDetailsFormComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_AddNewVisitorDetailsFormComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_AddNewVisitorDetailsFormComponentHidden

    private void DetailsAddNewBorrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsAddNewBorrowerActionPerformed
        // TODO add your handling code here:
        String BName = BorrowerName.getText();
        String BNumbIDStr = BorrowerNumberID.getText();

        int BNumbID;
        try {
            BNumbID = Integer.parseInt(BNumbIDStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number ID.");
            return;
        }

        List<String> selectedBookList = BookTitleBorrowList.getSelectedValuesList();

        if (selectedBookList.size() > 5) {
            JOptionPane.showMessageDialog(null, "Your about to borrow books has exceed the limit.");
            return;
        }

        Borrower newBorrower = new Borrower(BNumbID, BName);

        for (String book_title : selectedBookList) {
            Book book = librarysystem.findBookByTitle(book_title); // Assuming you have a library instance
            if (book != null) {
                if (!newBorrower.addBorrowedBooks(book)) {
                    JOptionPane.showMessageDialog(null, "Cannot borrow more than 5 books.");
                    return;
                }
            }
        }

        String selectedBooks = String.join(", ", selectedBookList);
        Object[] byRowData = {BName, BNumbID, selectedBooks};
        tableModel.addRow(byRowData);

        BorrowerTable borrowerTable = new BorrowerTable();
        try {
            borrowerTable.AddNewBorrower(newBorrower);
            JOptionPane.showMessageDialog(null, "Borrower added successfully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding borrower: " + e.getMessage());
        }

        BorrowerName.setText("");
        BorrowerNumberID.setText("");
        BookTitleBorrowList.clearSelection();
    }//GEN-LAST:event_DetailsAddNewBorrowerActionPerformed

    private void BorrowerNumberIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowerNumberIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrowerNumberIDActionPerformed

    private void BorrowerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrowerNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MiniLibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiniLibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiniLibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiniLibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MiniLibraryGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBookBtn;
    private javax.swing.JButton AddNewVisitorBTN;
    private javax.swing.JPanel BookHomePanel;
    private javax.swing.JList<String> BookTitleBorrowList;
    private javax.swing.JPanel BorrowAndReturnPanel;
    private javax.swing.JTextField BorrowerName;
    private javax.swing.JTextField BorrowerNumberID;
    private javax.swing.JButton DetailsAddNewBorrower;
    private javax.swing.JButton GoBtn;
    private javax.swing.JLabel HomeImage;
    private javax.swing.JTabbedPane MiniLibraryAllPageLayeredPanel;
    private javax.swing.JTextField SearchText;
    private javax.swing.JTable ViewBorrowerDetailTable;
    private javax.swing.JButton ViewVisitorBTN;
    private javax.swing.JPanel VisitorPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
