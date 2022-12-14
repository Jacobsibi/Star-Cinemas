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
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
        initComponents();
        selectCategory();
    }

    Database db = new Database();
    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public void selectCategory() {
        try
        {
            /*
            Initializes a database connection to output all categories from category table via 
            resultSet in table form using rs2xml. 
             */
            conn = db.establishConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("Select * from JACOB.CATEGORYTABLE");
            categoryTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex)
        {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel6 = new javax.swing.JPanel();
        logoutJump = new javax.swing.JLabel();
        billingPanelJump = new javax.swing.JLabel();
        moviePanelJump = new javax.swing.JLabel();
        productPanelJump = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exitCategory = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        categoryID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        categoryName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        categoryDescription = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        categoryType = new javax.swing.JComboBox<>();
        addCategory = new javax.swing.JButton();
        clearCategory = new javax.swing.JButton();
        editCategory = new javax.swing.JButton();
        deleteCategory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1159, 850));

        jPanel6.setBackground(new java.awt.Color(255, 153, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(240, 850));

        logoutJump.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        logoutJump.setForeground(new java.awt.Color(102, 48, 215));
        logoutJump.setText("Log out");
        logoutJump.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutJumpMouseClicked(evt);
            }
        });

        billingPanelJump.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        billingPanelJump.setForeground(new java.awt.Color(102, 48, 215));
        billingPanelJump.setText("       Billing");
        billingPanelJump.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billingPanelJumpMouseClicked(evt);
            }
        });

        moviePanelJump.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        moviePanelJump.setForeground(new java.awt.Color(102, 48, 215));
        moviePanelJump.setText("      Movies");
        moviePanelJump.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moviePanelJumpMouseClicked(evt);
            }
        });

        productPanelJump.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        productPanelJump.setForeground(new java.awt.Color(102, 48, 215));
        productPanelJump.setText("    Products");
        productPanelJump.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productPanelJumpMouseClicked(evt);
            }
        });

        Menu.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        Menu.setForeground(new java.awt.Color(102, 48, 215));
        Menu.setText("       Menu");
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(logoutJump)
                .addGap(51, 51, 51))
            .addComponent(billingPanelJump, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(moviePanelJump, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(productPanelJump, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(Menu)
                .addGap(142, 142, 142)
                .addComponent(billingPanelJump, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moviePanelJump, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productPanelJump, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(logoutJump)
                .addGap(156, 156, 156))
        );

        jPanel1.setBackground(new java.awt.Color(102, 48, 215));

        exitCategory.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        exitCategory.setForeground(new java.awt.Color(255, 153, 204));
        exitCategory.setText("X");
        exitCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitCategoryMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Oriya MN", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 204));
        jLabel2.setText("Star Cinemas");

        jLabel4.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 204));
        jLabel4.setText("Manage Categories");

        categoryID.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        categoryID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 204));
        jLabel3.setText("CategoryID");

        categoryName.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        categoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 204));
        jLabel5.setText("Name");

        categoryDescription.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        categoryDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryDescriptionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 204));
        jLabel7.setText("Description");

        jLabel9.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 204));
        jLabel9.setText("Type");
        jLabel9.setToolTipText("");

        categoryType.setFont(new java.awt.Font("Oriya MN", 0, 14)); // NOI18N
        categoryType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Beverage" }));
        categoryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryTypeActionPerformed(evt);
            }
        });

        addCategory.setBackground(new java.awt.Color(18, 30, 49));
        addCategory.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        addCategory.setForeground(new java.awt.Color(255, 153, 204));
        addCategory.setText("Add");
        addCategory.setToolTipText("");
        addCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCategoryMouseClicked(evt);
            }
        });
        addCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryActionPerformed(evt);
            }
        });

        clearCategory.setBackground(new java.awt.Color(18, 30, 49));
        clearCategory.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        clearCategory.setForeground(new java.awt.Color(255, 153, 204));
        clearCategory.setText("Clear");
        clearCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearCategoryMouseClicked(evt);
            }
        });
        clearCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCategoryActionPerformed(evt);
            }
        });

        editCategory.setBackground(new java.awt.Color(18, 30, 49));
        editCategory.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        editCategory.setForeground(new java.awt.Color(255, 153, 204));
        editCategory.setText("Edit");
        editCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editCategoryMouseClicked(evt);
            }
        });
        editCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCategoryActionPerformed(evt);
            }
        });

        deleteCategory.setBackground(new java.awt.Color(18, 30, 49));
        deleteCategory.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        deleteCategory.setForeground(new java.awt.Color(255, 153, 204));
        deleteCategory.setText("Delete");
        deleteCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteCategoryMouseClicked(evt);
            }
        });
        deleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCategoryActionPerformed(evt);
            }
        });

        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CategoryID", "Name", "Description", "Type"
            }
        ));
        categoryTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        categoryTable.setRowHeight(50);
        categoryTable.setSelectionBackground(new java.awt.Color(255, 153, 204));
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoryTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(226, 226, 226)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(319, 319, 319))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(addCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(editCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(categoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(categoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(232, 232, 232)
                                        .addComponent(categoryType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(deleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(clearCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(240, 240, 240)))
                        .addGap(53, 53, 53))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(666, 666, 666)
                .addComponent(categoryDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(369, 369, 369))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 221, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 900, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void categoryIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryIDActionPerformed

    private void categoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryNameActionPerformed

    private void categoryDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryDescriptionActionPerformed

    private void addCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCategoryActionPerformed

    private void clearCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearCategoryActionPerformed

    private void editCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editCategoryActionPerformed

    private void deleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCategoryActionPerformed

    private void logoutJumpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutJumpMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutJumpMouseClicked

    private void addCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCategoryMouseClicked
        // TODO add your handling code here:
        /**
         * if any category text field is empty, tell user category missing
         * information
         */
        if (categoryID.getText().isEmpty() || categoryName.getText().isEmpty() || categoryDescription.getText().isEmpty()
                || categoryType.getSelectedItem().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Category Missing Information!");
        } else
        {
            try
            {
                /*
            Initializes a database connection to add products to product table
                 */
                conn = db.establishConnection();
                PreparedStatement add = conn.prepareStatement("insert into CATEGORYTABLE values(?, ?, ?, ?)");

                add.setInt(1, Integer.valueOf(categoryID.getText()));
                add.setString(2, categoryName.getText().trim());
                add.setString(3, categoryDescription.getText().trim());
                add.setString(4, categoryType.getSelectedItem().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Category Successfully Added!");
                System.out.println("Category Added!");
                conn.close();
                selectCategory();

            } catch (SQLException ex)
            {
                /*
            Catch duplicate ID Error
                 */
                if (ex.getSQLState().startsWith("23"))
                {
                    JOptionPane.showMessageDialog(this, "Duplicate ID Exists, Enter Unique ID!");
                } else
                {
                    Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
                }
                /*
            Catch numberFormatException
                 */
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "Invalid Input!\n"
                        + "ID = Whole Numbers only\n"
                        + "Name = All characters\n"
                        + "Description = All characters\n");
            }
        }
    }//GEN-LAST:event_addCategoryMouseClicked

    private void categoryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryTypeActionPerformed

    private void editCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCategoryMouseClicked
        // TODO add your handling code here:
        /*
            If any category textfield is empty, inform user category missing information
         */
        if (categoryID.getText().isEmpty() || categoryName.getText().isEmpty() || categoryDescription.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Category Missing Information!");
        } else
        {
            try
            {
                /*
            Initializes a database connection to EDIT categories in category table
                 */
                conn = db.establishConnection();
                String editQuery = "Update JACOB.CATEGORYTABLE set CATEGORYNAME='" + categoryName.getText().trim() + "'" + ",CATEGORYDESCRIPTION='" + categoryDescription.getText().trim() + "'" + ",CATEGORYTYPE='" + categoryType.getSelectedItem().toString() + "'" + "where CATEGORYID=" + categoryID.getText();
                Statement edit = conn.createStatement();
                edit.executeUpdate(editQuery);
                JOptionPane.showMessageDialog(this, "Selected Category Edited!");
                selectCategory();

            } catch (SQLException ex)
            {
                if (ex.getSQLState().startsWith("23"))
                {
                    JOptionPane.showMessageDialog(this, "Duplicate ID Exists, Enter Unique ID!");
                } else
                {
                    Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "Invalid Input!\n"
                        + "ID = Whole Numbers only\n"
                        + "Name = All characters\n"
                        + "Description = All characters\n");
            }
        }
    }//GEN-LAST:event_editCategoryMouseClicked

    private void deleteCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCategoryMouseClicked
        // TODO add your handling code here:
        /*
            Initializes a database connection to DELETE categories from category table
         */
        if (categoryID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Category to be Deleted!");
        } else
        {
            try
            {

                conn = db.establishConnection();
                String categorySelection = categoryID.getText();
                String deleteQuery = "Delete from JACOB.CATEGORYTABLE where CATEGORYID=" + categorySelection;
                Statement delete = conn.createStatement();
                delete.executeUpdate(deleteQuery);
                selectCategory();
                JOptionPane.showMessageDialog(this, "Selected Category Deleted!");

            } catch (SQLException ex)
            {
                Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteCategoryMouseClicked

    private void clearCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearCategoryMouseClicked
        // TODO add your handling code here:
        /*
            Clear all category textfields
         */
        categoryID.setText("");
        categoryName.setText("");
        categoryDescription.setText("");
    }//GEN-LAST:event_clearCategoryMouseClicked

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
        // TODO add your handling code here:
        /*
            Category Panel textfields populated with Data from category Table
         */
        DefaultTableModel model = (DefaultTableModel) categoryTable.getModel();
        int tableSelection = categoryTable.getSelectedRow();
        categoryID.setText(model.getValueAt(tableSelection, 0).toString());
        categoryName.setText(model.getValueAt(tableSelection, 1).toString());
        categoryDescription.setText(model.getValueAt(tableSelection, 2).toString());
        categoryType.setSelectedItem(model.getValueAt(tableSelection, 3).toString());
    }//GEN-LAST:event_categoryTableMouseClicked

    private void exitCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitCategoryMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitCategoryMouseClicked

    private void billingPanelJumpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingPanelJumpMouseClicked
        // TODO add your handling code here:
        /*
            Open billingPanel when selected on menu
         */
        new BillingPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_billingPanelJumpMouseClicked

    private void moviePanelJumpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviePanelJumpMouseClicked
        // TODO add your handling code here:
        /*
            Open moviePanel when selected on menu
         */
        new MoviePanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_moviePanelJumpMouseClicked

    private void productPanelJumpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPanelJumpMouseClicked
        // TODO add your handling code here:
        /*
            Open products Panel when selected on menu
         */
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productPanelJumpMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        // TODO add your handling code here
        /*
            Open employeeMenuPanel when selected on menu
         */
        new EmployeeMenuPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuMouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu;
    private javax.swing.JButton addCategory;
    private javax.swing.JLabel billingPanelJump;
    private javax.swing.JTextField categoryDescription;
    private javax.swing.JTextField categoryID;
    private javax.swing.JTextField categoryName;
    private javax.swing.JTable categoryTable;
    private javax.swing.JComboBox<String> categoryType;
    private javax.swing.JButton clearCategory;
    private javax.swing.JButton deleteCategory;
    private javax.swing.JButton editCategory;
    private javax.swing.JLabel exitCategory;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutJump;
    private javax.swing.JLabel moviePanelJump;
    private javax.swing.JLabel productPanelJump;
    // End of variables declaration//GEN-END:variables
}
