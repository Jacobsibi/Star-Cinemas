/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Star_Cinemas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jacob.s
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        selectProduct();
    }

    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;

    String url = "jdbc:derby://localhost:1527/StarCinemasDB";
    String usernameDerby = "Jacob";
    String passwordDerby = "1234";

    public void selectProduct() {
        try
        {
            conn = DriverManager.getConnection(url, usernameDerby, passwordDerby);
            statement = conn.createStatement();
            resultSet = statement.executeQuery("Select * from " + usernameDerby + ".PRODUCTTABLE");
            productTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex)
        {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Menu = new javax.swing.JLabel();
        employeePanelJump = new javax.swing.JLabel();
        categoryPanelJump = new javax.swing.JLabel();
        logoutPanelJump = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exitProduct = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        productQuantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        productPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        productCategory = new javax.swing.JComboBox<>();
        addProduct = new javax.swing.JButton();
        clearProduct = new javax.swing.JButton();
        editProduct = new javax.swing.JButton();
        deleteProduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 153, 204));

        Menu.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        Menu.setForeground(new java.awt.Color(102, 48, 215));
        Menu.setText("Menu");

        employeePanelJump.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        employeePanelJump.setForeground(new java.awt.Color(102, 48, 215));
        employeePanelJump.setText("Employees");
        employeePanelJump.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeePanelJumpMouseClicked(evt);
            }
        });

        categoryPanelJump.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        categoryPanelJump.setForeground(new java.awt.Color(102, 48, 215));
        categoryPanelJump.setText("Categories");
        categoryPanelJump.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryPanelJumpMouseClicked(evt);
            }
        });

        logoutPanelJump.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        logoutPanelJump.setForeground(new java.awt.Color(102, 48, 215));
        logoutPanelJump.setText("Log out");
        logoutPanelJump.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelJumpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Menu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(categoryPanelJump)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logoutPanelJump)
                        .addGap(51, 51, 51))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(31, Short.MAX_VALUE)
                    .addComponent(employeePanelJump)
                    .addGap(16, 16, 16)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(Menu)
                .addGap(161, 161, 161)
                .addComponent(categoryPanelJump)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutPanelJump)
                .addGap(156, 156, 156))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(222, 222, 222)
                    .addComponent(employeePanelJump)
                    .addContainerGap(723, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(102, 48, 215));
        jPanel1.setPreferredSize(new java.awt.Dimension(919, 990));

        exitProduct.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        exitProduct.setForeground(new java.awt.Color(255, 153, 204));
        exitProduct.setText("X");
        exitProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitProductMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Oriya MN", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 204));
        jLabel2.setText("Star Cinemas");

        jLabel4.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 204));
        jLabel4.setText("Manage Products");

        productID.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        productID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 204));
        jLabel3.setText("ProductID");

        productName.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 204));
        jLabel5.setText("Name");

        productQuantity.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        productQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productQuantityActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 204));
        jLabel7.setText("Quantity");

        productPrice.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        productPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productPriceMouseClicked(evt);
            }
        });
        productPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productPriceActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 204));
        jLabel8.setText("Price");

        jLabel9.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 204));
        jLabel9.setText("Category");

        productCategory.setFont(new java.awt.Font("Oriya MN", 0, 14)); // NOI18N
        productCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Popcorn", "Hot Food", "Cold Drink", "Hot Drink", "Alcohol", "Confectionery" }));
        productCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productCategoryActionPerformed(evt);
            }
        });

        addProduct.setBackground(new java.awt.Color(18, 30, 49));
        addProduct.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        addProduct.setForeground(new java.awt.Color(255, 153, 204));
        addProduct.setText("Add");
        addProduct.setToolTipText("");
        addProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProductMouseClicked(evt);
            }
        });
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });

        clearProduct.setBackground(new java.awt.Color(18, 30, 49));
        clearProduct.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        clearProduct.setForeground(new java.awt.Color(255, 153, 204));
        clearProduct.setText("Clear");
        clearProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearProductMouseClicked(evt);
            }
        });
        clearProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearProductActionPerformed(evt);
            }
        });

        editProduct.setBackground(new java.awt.Color(18, 30, 49));
        editProduct.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        editProduct.setForeground(new java.awt.Color(255, 153, 204));
        editProduct.setText("Edit");
        editProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProductMouseClicked(evt);
            }
        });
        editProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProductActionPerformed(evt);
            }
        });

        deleteProduct.setBackground(new java.awt.Color(18, 30, 49));
        deleteProduct.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        deleteProduct.setForeground(new java.awt.Color(255, 153, 204));
        deleteProduct.setText("Delete");
        deleteProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProductMouseClicked(evt);
            }
        });
        deleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductActionPerformed(evt);
            }
        });

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ProductID", "Name", "Quantity", "Price", "Category"
            }
        ));
        productTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        productTable.setRowHeight(50);
        productTable.setSelectionBackground(new java.awt.Color(255, 153, 204));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(productID, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(385, 385, 385))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(271, 271, 271)
                        .addComponent(exitProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(productCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(74, 74, 74)
                                    .addComponent(deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(78, 78, 78)
                                    .addComponent(clearProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void productIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productIDActionPerformed

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameActionPerformed

    private void productQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productQuantityActionPerformed

    private void productPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPriceActionPerformed

    private void productCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productCategoryActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addProductActionPerformed

    private void clearProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearProductActionPerformed

    private void editProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editProductActionPerformed

    private void deleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteProductActionPerformed

    private void addProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProductMouseClicked
        // TODO add your handling code here:

        if (productID.getText().isEmpty() || productName.getText().isEmpty() || productQuantity.getText().isEmpty()
                || productPrice.getText().isEmpty() || productCategory.getSelectedItem().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Product Missing Information!");
        } else
        {
            try
            {
                conn = DriverManager.getConnection(url, usernameDerby, passwordDerby);
                PreparedStatement add = conn.prepareStatement("insert into PRODUCTTABLE values(?, ?, ?, ?, ?)");

                add.setInt(1, Integer.valueOf(productID.getText()));
                add.setString(2, productName.getText());
                add.setInt(3, Integer.parseInt(productQuantity.getText()));
                add.setDouble(4, Double.parseDouble(productPrice.getText()));
                add.setString(5, productCategory.getSelectedItem().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product Successfully Added!");
                System.out.println("Product Added!");
                conn.close();
                selectProduct();

            } catch (SQLException ex)
            {
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_addProductMouseClicked

    private void productPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPriceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_productPriceMouseClicked

    private void clearProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearProductMouseClicked
        // TODO add your handling code here:

        productID.setText("");
        productName.setText("");
        productQuantity.setText("");
        productPrice.setText("");
    }//GEN-LAST:event_clearProductMouseClicked

    private void deleteProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProductMouseClicked
        // TODO add your handling code here:
        if (productID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Product to be Deleted!");
        } else
        {
            try
            {
                conn = DriverManager.getConnection(url, usernameDerby, passwordDerby);
                String productSelection = productID.getText();
                String deleteQuery = "Delete from JACOB.PRODUCTTABLE where PRODUCTID=" + productSelection;
                Statement delete = conn.createStatement();
                delete.executeUpdate(deleteQuery);
                selectProduct();
                JOptionPane.showMessageDialog(this, "Selected Product Deleted!");

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deleteProductMouseClicked

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        int tableSelection = productTable.getSelectedRow();
        productID.setText(model.getValueAt(tableSelection, 0).toString());
        productName.setText(model.getValueAt(tableSelection, 1).toString());
        productQuantity.setText(model.getValueAt(tableSelection, 2).toString());
        productPrice.setText(model.getValueAt(tableSelection, 3).toString());
    }//GEN-LAST:event_productTableMouseClicked

    private void editProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProductMouseClicked
        // TODO add your handling code here:
        if (productID.getText().isEmpty() || productName.getText().isEmpty() || productQuantity.getText().isEmpty()
                || productPrice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Product Missing Information!");
        } else
        {
            try
            {
                conn = DriverManager.getConnection(url, usernameDerby, passwordDerby);
                String editQuery = "Update JACOB.PRODUCTTABLE set PRODUCTNAME='" + productName.getText() + "'" + ",PRODUCTQUANTITY=" + Integer.parseInt(productQuantity.getText()) + "" + ",PRODUCTPRICE=" + Double.parseDouble(productPrice.getText()) + "" + ",PRODUCTCATEGORY='" + productCategory.getSelectedItem().toString() + "'" + "where PRODUCTID=" + productID.getText();
                Statement edit = conn.createStatement();
                edit.executeUpdate(editQuery);
                JOptionPane.showMessageDialog(this, "Selected Product Edited!");
                selectProduct();

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_editProductMouseClicked

    private void exitProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitProductMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitProductMouseClicked

    private void employeePanelJumpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeePanelJumpMouseClicked
        // TODO add your handling code here:
        new Employee().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_employeePanelJumpMouseClicked

    private void categoryPanelJumpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryPanelJumpMouseClicked
        // TODO add your handling code here:
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categoryPanelJumpMouseClicked

    private void logoutPanelJumpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelJumpMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutPanelJumpMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu;
    private javax.swing.JButton addProduct;
    private javax.swing.JLabel categoryPanelJump;
    private javax.swing.JButton clearProduct;
    private javax.swing.JButton deleteProduct;
    private javax.swing.JButton editProduct;
    private javax.swing.JLabel employeePanelJump;
    private javax.swing.JLabel exitProduct;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logoutPanelJump;
    private javax.swing.JComboBox<String> productCategory;
    private javax.swing.JTextField productID;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPrice;
    private javax.swing.JTextField productQuantity;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
