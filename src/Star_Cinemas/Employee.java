package Star_Cinemas;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
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
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
        selectEmployee();
    }

    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;

    String url = "jdbc:derby://localhost:1527/StarCinemasDB";
    String usernameDerby = "Jacob";
    String passwordDerby = "1234";

    public void selectEmployee() {
        try
        {
            conn = DriverManager.getConnection(url, usernameDerby, passwordDerby);
            statement = conn.createStatement();
            resultSet = statement.executeQuery("Select * from " + usernameDerby + ".EMPLOYEETABLE");
            employeeTable.setModel(DbUtils.resultSetToTableModel(resultSet));
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

        jPanel1 = new javax.swing.JPanel();
        exitEmployee = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        employeeID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employeeName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        employeePassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        employeePosition = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        employeeGender = new javax.swing.JComboBox<>();
        addEmployee = new javax.swing.JButton();
        clearEmployee = new javax.swing.JButton();
        editEmployee = new javax.swing.JButton();
        deleteEmployee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Menu3 = new javax.swing.JLabel();
        productPanelJump = new javax.swing.JLabel();
        employeeJump = new javax.swing.JLabel();
        logoutJump = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 48, 215));
        jPanel1.setPreferredSize(new java.awt.Dimension(919, 990));
        jPanel1.setRequestFocusEnabled(false);

        exitEmployee.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        exitEmployee.setForeground(new java.awt.Color(255, 153, 204));
        exitEmployee.setText("X");
        exitEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitEmployeeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Oriya MN", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 204));
        jLabel2.setText("Star Cinemas");

        jLabel4.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 204));
        jLabel4.setText("Manage Employees");

        employeeID.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        employeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 204));
        jLabel3.setText("EmployeeID");

        employeeName.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        employeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 204));
        jLabel5.setText("Name");

        employeePassword.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        employeePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeePasswordActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 204));
        jLabel7.setText("Password");
        jLabel7.setToolTipText("");

        employeePosition.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        employeePosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeePositionActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 204));
        jLabel8.setText("Position");

        jLabel9.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 204));
        jLabel9.setText("Gender");

        employeeGender.setFont(new java.awt.Font("Oriya MN", 0, 14)); // NOI18N
        employeeGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        employeeGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeGenderActionPerformed(evt);
            }
        });

        addEmployee.setBackground(new java.awt.Color(18, 30, 49));
        addEmployee.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        addEmployee.setForeground(new java.awt.Color(255, 153, 204));
        addEmployee.setText("Add");
        addEmployee.setToolTipText("");
        addEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployeeMouseClicked(evt);
            }
        });
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });

        clearEmployee.setBackground(new java.awt.Color(18, 30, 49));
        clearEmployee.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        clearEmployee.setForeground(new java.awt.Color(255, 153, 204));
        clearEmployee.setText("Clear");
        clearEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearEmployeeMouseClicked(evt);
            }
        });
        clearEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEmployeeActionPerformed(evt);
            }
        });

        editEmployee.setBackground(new java.awt.Color(18, 30, 49));
        editEmployee.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        editEmployee.setForeground(new java.awt.Color(255, 153, 204));
        editEmployee.setText("Edit");
        editEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEmployeeMouseClicked(evt);
            }
        });
        editEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeActionPerformed(evt);
            }
        });

        deleteEmployee.setBackground(new java.awt.Color(18, 30, 49));
        deleteEmployee.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        deleteEmployee.setForeground(new java.awt.Color(255, 153, 204));
        deleteEmployee.setText("Delete");
        deleteEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteEmployeeMouseClicked(evt);
            }
        });
        deleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeActionPerformed(evt);
            }
        });

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Password", "Position", "Gender"
            }
        ));
        employeeTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        employeeTable.setRowHeight(50);
        employeeTable.setSelectionBackground(new java.awt.Color(255, 153, 204));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(31, 31, 31)
                                    .addComponent(employeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(employeePosition, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(290, 290, 290)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel7))))
                                        .addGap(31, 31, 31)
                                        .addComponent(employeePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(74, 74, 74)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(293, 293, 293))
                                            .addComponent(employeeGender, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(editEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(74, 74, 74)
                                            .addComponent(deleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(clearEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(398, 398, 398))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exitEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeePosition, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(240, 990));

        Menu3.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        Menu3.setForeground(new java.awt.Color(102, 48, 215));
        Menu3.setText("Menu");

        productPanelJump.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        productPanelJump.setForeground(new java.awt.Color(102, 48, 215));
        productPanelJump.setText("Products");
        productPanelJump.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productPanelJumpMouseClicked(evt);
            }
        });

        employeeJump.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        employeeJump.setForeground(new java.awt.Color(102, 48, 215));
        employeeJump.setText("Employees");
        employeeJump.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeJumpMouseClicked(evt);
            }
        });

        logoutJump.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        logoutJump.setForeground(new java.awt.Color(102, 48, 215));
        logoutJump.setText("Log out");
        logoutJump.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutJumpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(employeeJump)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(Menu3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(productPanelJump))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(logoutJump)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(Menu3)
                .addGap(69, 69, 69)
                .addComponent(productPanelJump)
                .addGap(42, 42, 42)
                .addComponent(employeeJump)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutJump)
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
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

    private void employeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeIDActionPerformed

    private void employeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNameActionPerformed

    private void employeePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeePasswordActionPerformed

    private void employeePositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeePositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeePositionActionPerformed

    private void employeeGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeGenderActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void clearEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearEmployeeActionPerformed

    private void editEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editEmployeeActionPerformed

    private void deleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteEmployeeActionPerformed

    private void addEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeeMouseClicked

        if (employeeID.getText().isEmpty() || employeeName.getText().isEmpty() || employeePassword.getText().isEmpty()
                || employeePosition.getText().isEmpty() || employeeGender.getSelectedItem().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Employee Missing Information!");
        } else
        {
            try
            {
                conn = DriverManager.getConnection(url, usernameDerby, passwordDerby);
                PreparedStatement add = conn.prepareStatement("insert into EMPLOYEETABLE values(?, ?, ?, ?, ?)");

                add.setInt(1, Integer.valueOf(employeeID.getText()));
                add.setString(2, employeeName.getText());
                add.setString(3, employeePassword.getText());
                add.setString(4, employeePosition.getText());
                add.setString(5, employeeGender.getSelectedItem().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Employee Successfully Added!");
                System.out.println("Employee Added!");
                conn.close();
                selectEmployee();

            } catch (SQLException ex)
            {
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_addEmployeeMouseClicked

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        int tableSelection = employeeTable.getSelectedRow();
        employeeID.setText(model.getValueAt(tableSelection, 0).toString());
        employeeName.setText(model.getValueAt(tableSelection, 1).toString());
        employeePassword.setText(model.getValueAt(tableSelection, 2).toString());
        employeePosition.setText(model.getValueAt(tableSelection, 3).toString());
        employeeGender.setSelectedItem(model.getValueAt(tableSelection,4).toString());
    }//GEN-LAST:event_employeeTableMouseClicked

    private void clearEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearEmployeeMouseClicked
        // TODO add your handling code here:
        employeeID.setText("");
        employeeName.setText("");
        employeePassword.setText("");
        employeePosition.setText("");
    }//GEN-LAST:event_clearEmployeeMouseClicked

    private void deleteEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteEmployeeMouseClicked
        // TODO add your handling code here:
        if (employeeID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Employee to be Deleted!");
        } else
        {
            try
            {
                conn = DriverManager.getConnection(url, usernameDerby, passwordDerby);
                String employeeSelection = employeeID.getText();
                String deleteQuery = "Delete from JACOB.EMPLOYEETABLE where EMPLOYEEID=" + employeeSelection;
                Statement delete = conn.createStatement();
                delete.executeUpdate(deleteQuery);
                selectEmployee();
                JOptionPane.showMessageDialog(this, "Selected Employee Deleted!");

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deleteEmployeeMouseClicked

    private void editEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmployeeMouseClicked
        // TODO add your handling code here:
        if (employeeID.getText().isEmpty() || employeeName.getText().isEmpty() || employeePassword.getText().isEmpty()
                || employeePosition.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Employee Missing Information!");
        } else
        {
            try
            {
                conn = DriverManager.getConnection(url, usernameDerby, passwordDerby);
                String editQuery = "Update JACOB.EMPLOYEETABLE set EMPLOYEENAME='" + employeeName.getText() + "'" + ",EMPLOYEEPASSWORD='" + employeePassword.getText() + "'" + ",EMPLOYEEPOSITION='" + employeePosition.getText() + "'" + ",EMPLOYEEGENDER='" + employeeGender.getSelectedItem().toString() + "'" + "where EMPLOYEEID=" + employeeID.getText();
                Statement edit = conn.createStatement();
                edit.executeUpdate(editQuery);
                JOptionPane.showMessageDialog(this, "Selected Employee Edited!");
                selectEmployee();

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_editEmployeeMouseClicked

    private void exitEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitEmployeeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitEmployeeMouseClicked

    private void productPanelJumpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPanelJumpMouseClicked
        // TODO add your handling code here:
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productPanelJumpMouseClicked

    private void employeeJumpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeJumpMouseClicked
        // TODO add your handling code here:
        new Employee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employeeJumpMouseClicked

    private void logoutJumpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutJumpMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutJumpMouseClicked

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu3;
    private javax.swing.JButton addEmployee;
    private javax.swing.JButton clearEmployee;
    private javax.swing.JButton deleteEmployee;
    private javax.swing.JButton editEmployee;
    private javax.swing.JComboBox<String> employeeGender;
    private javax.swing.JTextField employeeID;
    private javax.swing.JLabel employeeJump;
    private javax.swing.JTextField employeeName;
    private javax.swing.JTextField employeePassword;
    private javax.swing.JTextField employeePosition;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel exitEmployee;
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
    private javax.swing.JLabel logoutJump;
    private javax.swing.JLabel productPanelJump;
    // End of variables declaration//GEN-END:variables
}
