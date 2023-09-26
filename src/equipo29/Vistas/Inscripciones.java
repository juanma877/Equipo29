/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo29.vistas;

import equipo29.Conexion.AlumnoData;
import equipo29.Conexion.InscripcionData;
import equipo29.Data.Alumno;
import equipo29.Data.Inscripcion;
import equipo29.Data.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20352555674
 */
public class Inscripciones extends javax.swing.JInternalFrame {

    private InscripcionData ins;
    private AlumnoData ad;
    private ArrayList<Alumno> alumnos1 = new ArrayList<>();
    private List<Materia> materias1 = new ArrayList<>();
    private final DefaultComboBoxModel combo = new DefaultComboBoxModel();
    private DefaultTableModel modelo = new DefaultTableModel() { //Sobreescribimos un método de DefaultTableModel para que las celdas no sean editables
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    /**
     * Creates new form Inscripciones
     */
    public Inscripciones(InscripcionData ins, AlumnoData ad) {

        initComponents();
        armarCombo();
        armarCabecera();
        this.ins = ins;
        this.ad = ad;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        alumnos = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        inscriptas = new javax.swing.JRadioButton();
        noinscriptas = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane3.setViewportView(jTextPane1);

        setTitle("Inscripciones");

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Formulario de inscripciones");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione alumno");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Listado de materias");

        inscriptas.setBackground(new java.awt.Color(153, 255, 204));
        inscriptas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        inscriptas.setForeground(new java.awt.Color(0, 0, 0));
        inscriptas.setText("Materias inscriptas");
        inscriptas.setBorder(null);
        inscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscriptasActionPerformed(evt);
            }
        });

        noinscriptas.setBackground(new java.awt.Color(153, 255, 204));
        noinscriptas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        noinscriptas.setForeground(new java.awt.Color(0, 0, 0));
        noinscriptas.setText("Materias no inscriptas");
        noinscriptas.setBorder(null);
        noinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noinscriptasActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo29/Imagenes/btn_agregar.png"))); // NOI18N
        jButton1.setToolTipText("Inscribir");
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo29/Imagenes/btn_agregarro.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo29/Imagenes/btn_anular.png"))); // NOI18N
        jButton2.setToolTipText("Anular");
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo29/Imagenes/btn_anularro.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo29/Imagenes/btn_salir.png"))); // NOI18N
        jButton3.setToolTipText("Salir");
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/equipo29/Imagenes/btn_salirro.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(inscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noinscriptas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 191, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscriptas)
                    .addComponent(noinscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void noinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noinscriptasActionPerformed
        Alumno al = (Alumno) alumnos.getSelectedItem();
        borrarFilas();
        if (noinscriptas.isSelected()) {
            materias1 = ins.obtenerMateriasNOCursadas(al.getIdAlumno());
            cargarDatos(materias1);
            inscriptas.setEnabled(false);

        } else {

            inscriptas.setEnabled(true);
        }


    }//GEN-LAST:event_noinscriptasActionPerformed

    private void inscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscriptasActionPerformed
        Alumno al = (Alumno) alumnos.getSelectedItem();
        //List<Materia> materias2 = new ArrayList<>();
        borrarFilas();
        if (inscriptas.isSelected()) {
            materias1 = ins.obtenerMateriasCursadas(al.getIdAlumno());
            cargarDatos(materias1);

            noinscriptas.setEnabled(false);
        } else {

            noinscriptas.setEnabled(true);
        }

    }//GEN-LAST:event_inscriptasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (tabla.getSelectedRow() != -1) {
            Alumno al = (Alumno) alumnos.getSelectedItem();
            Materia mat = new Materia(Integer.parseInt(modelo.getValueAt(tabla.getSelectedRow(), 0).toString()), modelo.getValueAt(tabla.getSelectedRow(), 1).toString(), Integer.parseInt(modelo.getValueAt(tabla.getSelectedRow(), 2).toString()), true);
            Inscripcion insc = new Inscripcion(al, mat);
            ins.guardarInscripcion(insc);
            noinscriptasActionPerformed(evt);
            noinscriptas.setSelected(false);
            inscriptas.setEnabled(true);
            noinscriptas.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione alguna de las opciones");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (tabla.getSelectedRow() != -1) {
            Alumno al = (Alumno) alumnos.getSelectedItem();
            int idmat = Integer.parseInt(modelo.getValueAt(tabla.getSelectedRow(), 0).toString());
            ins.borrarInscripcionMateriaAlumno(al.getIdAlumno(), idmat);
            inscriptasActionPerformed(evt);
            inscriptas.setSelected(false);
            inscriptas.setEnabled(true);
            noinscriptas.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione alguna de las opciones");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox alumnos;
    private javax.swing.JRadioButton inscriptas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JRadioButton noinscriptas;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void armarCombo() {
        AlumnoData al = new AlumnoData();

        for (Alumno alum : al.listarAlumnos()) {
            alumnos.addItem(alum);
        }

    }

    private void armarCabecera() {
        modelo.addColumn("idMateria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        tabla.setModel(modelo);
    }

    private void cargarDatos(List<Materia> materias1) { //Esta lista de alumnos puede provenir de la BD o cargada por parámetros
        for (Materia mat : materias1) {
            modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAño()});

        }
    }

    private void borrarFilas() {
        int f = tabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
