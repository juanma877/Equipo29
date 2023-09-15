/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package equipo29.vistas;

import equipo29.Conexion.AlumnoData;
import equipo29.Conexion.InscripcionData;
import equipo29.Data.Alumno;
import equipo29.Data.Materia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20352555674
 */
public class Inscripciones extends javax.swing.JInternalFrame {
    private InscripcionData ins;
    private AlumnoData ad;
    public static ArrayList<Alumno> alumnos1 = new ArrayList<>();
    public static List<Materia> materias1 = new ArrayList<>();
    private final DefaultComboBoxModel combo = new DefaultComboBoxModel();
    private final DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form Inscripciones
     */
    public Inscripciones(InscripcionData ins,AlumnoData ad) {
       
        initComponents();
        armarCombo();
        armarCabecera();
        this.ins=ins;
        this.ad=ad;
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

        setTitle("Inscripciones");

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de inscriociones");

        jLabel2.setText("Seleccione alumno");

        alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alumnosMouseClicked(evt);
            }
        });

        jLabel3.setText("Listado de materias");

        inscriptas.setBackground(new java.awt.Color(0, 153, 102));
        inscriptas.setText("Materias inscriptas");
        inscriptas.setBorder(null);
        inscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscriptasActionPerformed(evt);
            }
        });

        noinscriptas.setBackground(new java.awt.Color(0, 153, 102));
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

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setText("Inscribir");

        jButton2.setBackground(new java.awt.Color(0, 153, 102));
        jButton2.setText("Anular");

        jButton3.setBackground(new java.awt.Color(0, 153, 102));
        jButton3.setText("Salir");
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inscriptas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(noinscriptas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(58, 58, 58)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noinscriptas)
                    .addComponent(inscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18))
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

    private void alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumnosMouseClicked
        
        
        if(noinscriptas.isSelected()){
            
        }
    }//GEN-LAST:event_alumnosMouseClicked

    private void noinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noinscriptasActionPerformed
        Alumno al = (Alumno) alumnos.getSelectedItem();
       
        if(noinscriptas.isSelected()){
            materias1 = ins.obtenerMateriasNOCursadas(al.getIdAlumno());
             cargarDatos();
            inscriptas.setEnabled(false);
           
        }else{
            borrarFilas();
            inscriptas.setEnabled(true);
        }
        
        
    }//GEN-LAST:event_noinscriptasActionPerformed

    private void inscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscriptasActionPerformed
        Alumno al = (Alumno) alumnos.getSelectedItem();
       
        if(inscriptas.isSelected()){
            materias1 = ins.obtenerMateriasCursadas(al.getIdAlumno());
             cargarDatos();
            
           noinscriptas.setEnabled(false);
        }else{
            borrarFilas();
            noinscriptas.setEnabled(true);
        }
        
    }//GEN-LAST:event_inscriptasActionPerformed


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
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton noinscriptas;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
     
     private void armarCombo() {
        AlumnoData al = new AlumnoData();
      
        for (Alumno alum : al.listarAlumnos()) {
          alumnos.addItem(alum);
        }
        
    }
     private void armarCabecera(){
        modelo.addColumn("idMateria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        tabla.setModel(modelo);
    }
     
         private void cargarDatos() { //Esta lista de alumnos puede provenir de la BD o cargada por parámetros
       for(Materia mat: materias1){
        modelo.addRow(new Object[]{mat.getIdMateria(),mat.getNombre(),mat.getAño()});
        

        
    }
     }
         private void borrarFilas(){
    int f=tabla.getRowCount()-1;
    for(;f>=0;f--){
        modelo.removeRow(f);
    }
}
 }



