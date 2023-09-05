package lab1;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import org.knowm.xchart.*;
/**
 *
 * @author kevin
 */
public class MainGUI extends javax.swing.JFrame {
    public MainGUI() {
        
        initComponents();
        lblSuccess.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddEmp = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblEmpleados = new javax.swing.JLabel();
        btnDelEmp = new javax.swing.JButton();
        btnName = new javax.swing.JButton();
        lblEmpleados1 = new javax.swing.JLabel();
        btnSalary = new javax.swing.JButton();
        lblVentas = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnDelSales = new javax.swing.JButton();
        btnAddSales = new javax.swing.JButton();
        lblVentas1 = new javax.swing.JLabel();
        btnAmount = new javax.swing.JButton();
        btnProfits = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblSuccess = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddEmp.setText("Agregar");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setText("Automóviles del Caribe S.A.");

        lblEmpleados.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lblEmpleados.setText("Registros de Empleados");

        btnDelEmp.setText("Eliminar");
        btnDelEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelEmpActionPerformed(evt);
            }
        });

        btnName.setText("Nombre");
        btnName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameActionPerformed(evt);
            }
        });

        lblEmpleados1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lblEmpleados1.setText("Ordenar por:");

        btnSalary.setText("Salario");
        btnSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaryActionPerformed(evt);
            }
        });

        lblVentas.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lblVentas.setText("Registros de Ventas");

        btnCreate.setText("Crear");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelSales.setText("Eliminar");
        btnDelSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelSalesActionPerformed(evt);
            }
        });

        btnAddSales.setText("Agregar");
        btnAddSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSalesActionPerformed(evt);
            }
        });

        lblVentas1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lblVentas1.setText("Relación de autos por:");

        btnAmount.setText("Cantidad");
        btnAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmountActionPerformed(evt);
            }
        });

        btnProfits.setText("Ganancias");
        btnProfits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfitsActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblSuccess.setForeground(new java.awt.Color(51, 255, 51));
        lblSuccess.setText("Archivo de Empleados ordenado con éxito.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEmpleados1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnDelEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalary, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelSales)
                            .addComponent(btnCreate)
                            .addComponent(btnAddSales))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProfits))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSuccess))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpleados)
                            .addComponent(lblVentas)
                            .addComponent(lblVentas1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddEmp)
                            .addComponent(btnCreate)
                            .addComponent(btnAmount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelEmp)
                            .addComponent(btnAddSales)
                            .addComponent(btnProfits))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpleados1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelSales))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalary))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2))
                .addGap(26, 26, 26)
                .addComponent(lblSuccess)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        Add2EmployeesFile f = new Add2EmployeesFile();
        f.setTitle("Añadir registros de empleados");
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        CreateSalesFile f = new CreateSalesFile();
        f.setTitle("Crear archivo de Ventas");
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnAddSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSalesActionPerformed
        Add2SalesFile f = new Add2SalesFile();
        f.setTitle("Añadir registros de ventas");
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddSalesActionPerformed

    private void btnDelSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelSalesActionPerformed
        DelFromSalesFile f = new DelFromSalesFile();
        f.setTitle("Eliminar registros de Ventas");
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDelSalesActionPerformed

    private void btnNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameActionPerformed
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblSuccess.setVisible(false);
            }
        });
        timer.setRepeats(false);
        lblSuccess.setVisible(true);
        timer.start();
        
    }//GEN-LAST:event_btnNameActionPerformed

    private void btnSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaryActionPerformed
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblSuccess.setVisible(false);
            }
        });
        timer.setRepeats(false);
        lblSuccess.setVisible(true);
        timer.start();
    }//GEN-LAST:event_btnSalaryActionPerformed

    private void btnDelEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelEmpActionPerformed
        DelFromEmployeesFile f = new DelFromEmployeesFile();
        f.setTitle("Eliminar registros de Empleados");
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDelEmpActionPerformed

    private void btnAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmountActionPerformed
        Chart4Amount f = new Chart4Amount();
        f.setTitle("Relación de autos por cantidad");
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAmountActionPerformed

    private void btnProfitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfitsActionPerformed
        Chart4Profits f = new Chart4Profits();
        f.setTitle("Relación de autos por ganancias");
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProfitsActionPerformed

    public static void main(String args[]) {
        try {
            FlatCarbonIJTheme.setup();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainGUI frame = new MainGUI();
                frame.setTitle("Automóviles del Caribe S.A.");
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnAddSales;
    private javax.swing.JButton btnAmount;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelEmp;
    private javax.swing.JButton btnDelSales;
    private javax.swing.JButton btnName;
    private javax.swing.JButton btnProfits;
    private javax.swing.JButton btnSalary;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblEmpleados1;
    private javax.swing.JLabel lblSuccess;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JLabel lblVentas1;
    // End of variables declaration//GEN-END:variables

}
