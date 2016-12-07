/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iluminación.pkg3.pkg0;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    double Ancho;           //Ancho del espacio - Ingresado por el usuario [m]
    double Largo;           //Largo del espacio - Ingresado por el usuario [m]
    double AlturaTot;       //Altura total del espacio - Ingresado por el usuario [m]
    double AlturaTw;        //Altura del plano de trabajo - Ingresado por el usuario [m]
    double h;               //Altura de suspensión de las luminarias - Entre tw y plano de lumianrias [m]
    double k;               //Indice del local 
    double d;               //Distancia del plano de luminarias al techo
    double M;               //Factor de mantenimiento
    int Emed;               //Iluminancia media [Lux]
    int IRC;                //Índice de reproducción cromática
    String Tcolor;          //Temperatura de color
    String Espacio;         //Espacio Seleccionado

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        ConfigInicial();
        
    }
    
    //Método para crear y ajustar la ventana principal: Selecciona opciones por defecto y llena los ComboBox
public void ConfigInicial(){
    //Selecciona por defecto las opciones al iniciar el programa
        optDirecta.setSelected(true);
        optDebil.setSelected(true);
        optOptimo.setSelected(true);

}
 public void Retilap(){
 if (cboEspacios.getSelectedIndex()==0){ 
     Emed=100;
     IRC=40;
     Tcolor="Tonos Cálidos <3000K";
     Espacio="Áreas de circulación, corredores";
    }else if(cboEspacios.getSelectedIndex()==1){
     Emed=150;
     IRC=40;
     String Tcolor="Tonos Cálidos <3000K";
     String Espacio="Escaleras";
    }else if(cboEspacios.getSelectedIndex()==2){
     Emed=150;
     IRC=80;
     String Tcolor="Tonos Cálidos <3000K";
     String Espacio="Vestidores, baños, cuartos de servicio";
    }else if(cboEspacios.getSelectedIndex()==3){
     Emed=150;
     IRC=40;
     String Tcolor="Tonos Cálidos <3000K";
     String Espacio="Almácenes, bodegas";
    }else if(cboEspacios.getSelectedIndex()==4){
     Emed=500;
     IRC=80;
     String Tcolor="Tonos neutros 3300K - 5000K";
     String Espacio="Oficinas de tipo general, mecanografía y computación";
    }else if(cboEspacios.getSelectedIndex()==5){
     Emed=750;
     IRC=80;
     String Tcolor="Tonos neutros 3300K - 5000K";
     String Espacio="Oficinas abiertas";
    }else if(cboEspacios.getSelectedIndex()==6){
     Emed=750;
     IRC=90;
     String Tcolor="Tonos fríos >5000K";
     String Espacio="Oficinas de dibujo";
    }else if(cboEspacios.getSelectedIndex()==7){
     Emed=500;
     IRC=80;
     String Tcolor="Tonos neutros 3300K - 5000K";
     String Espacio="Salas de conferencia";
    }
 }
 public void FactorDeMantenimiento(){
     if (cboLuminaria.getSelectedIndex()==0){
           if(optDebil.isSelected()){
                if(optOptimo.isSelected()){
                M=0.87;
                } else {
                    M=0.58;
                }
           }else if(optMediano.isSelected()){
                if(optOptimo.isSelected()){
                M=0.8;
                } else {
                    M=0.53;
                }
           } else if(optFuerte.isSelected()){
                if(optOptimo.isSelected()){
                M=0.74;
                } else {
                    M=0.50;
                }
           }
        } else if (cboLuminaria.getSelectedIndex()==1){
           if(optDebil.isSelected()){
                if(optOptimo.isSelected()){
                M=0.95;
                } else {
                    M=0.64;
                }
           }else if(optMediano.isSelected()){
                if(optOptimo.isSelected()){
                M=0.87;
                } else {
                    M=0.59;
                }
           } else if(optFuerte.isSelected()){
                if(optOptimo.isSelected()){
                M=0.8;
                } else {
                    M=0.55;
                }
           }
        }else if (cboLuminaria.getSelectedIndex()==2){
           if(optDebil.isSelected()){
                if(optOptimo.isSelected()){
                M=0.835;
                } else {
                    M=0.545;
                }
           }else if(optMediano.isSelected()){
                if(optOptimo.isSelected()){
                M=0.77;
                } else {
                    M=0.515;
                }
           } else if(optFuerte.isSelected()){
                if(optOptimo.isSelected()){
                M=0.615;
                } else {
                    M=0.48;
                }
           }
        } else if (cboLuminaria.getSelectedIndex()==3){
           if(optDebil.isSelected()){
                if(optOptimo.isSelected()){
                M=0.815;
                } else {
                    M=0.53;
                }
           }else if(optMediano.isSelected()){
                if(optOptimo.isSelected()){
                M=0.755;
                } else {
                    M=0.505;
                }
           } else if(optFuerte.isSelected()){
                if(optOptimo.isSelected()){
                M=0.70;
                } else {
                    M=0.47;
                }
           }
        } else if (cboLuminaria.getSelectedIndex()==4){
           if(optDebil.isSelected()){
                if(optOptimo.isSelected()){
                M=0.83;
                } else {
                    M=0.56;
                }
           }else if(optMediano.isSelected()){
                if(optOptimo.isSelected()){
                M=0.77;
                } else {
                    M=0.51;
                }
           } else if(optFuerte.isSelected()){
                if(optOptimo.isSelected()){
                M=0.71;
                } else {
                    M=0.48;
                }
           }
        } else if (cboLuminaria.getSelectedIndex()==5){
           if(optDebil.isSelected()){
                if(optOptimo.isSelected()){
                M=0.785;
                } else {
                    M=0.52;
                }
           }else if(optMediano.isSelected()){
                if(optOptimo.isSelected()){
                M=0.725;
                } else {
                    M=0.49;
                }
           } else if(optFuerte.isSelected()){
                if(optOptimo.isSelected()){
                M=0.68;
                } else {
                    M=0.45;
                }
           }
        } else if (cboLuminaria.getSelectedIndex()==6){
           if(optDebil.isSelected()){
                if(optOptimo.isSelected()){
                M=0.88;
                } else {
                    M=0.74;
                }
           }else if(optMediano.isSelected()){
                if(optOptimo.isSelected()){
                M=0.82;
                } else {
                    M=0.7;
                }
           } else if(optFuerte.isSelected()){
                if(optOptimo.isSelected()){
                M=0.78;
                } else {
                    M=0.66;
                }
           }
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

        grupoSistIlum = new javax.swing.ButtonGroup();
        grupoEnsuciamiento = new javax.swing.ButtonGroup();
        grupoMantenimiento = new javax.swing.ButtonGroup();
        panelIngresoDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAncho = new javax.swing.JTextField();
        txtLargo = new javax.swing.JTextField();
        txtAlturaTot = new javax.swing.JTextField();
        txtAlturaTW = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        panelSeleccion = new javax.swing.JPanel();
        panelSistemaIluminación = new javax.swing.JPanel();
        optDirecta = new javax.swing.JRadioButton();
        optIndirecta = new javax.swing.JRadioButton();
        optDifusa = new javax.swing.JRadioButton();
        optSemidirecta = new javax.swing.JRadioButton();
        panelEnsuciamiento = new javax.swing.JPanel();
        optDebil = new javax.swing.JRadioButton();
        optMediano = new javax.swing.JRadioButton();
        optFuerte = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        optOptimo = new javax.swing.JRadioButton();
        optSinMantenimiento = new javax.swing.JRadioButton();
        panelLuminaria = new javax.swing.JPanel();
        cboLuminaria = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        cboEspacios = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelIngresoDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese las dimensiones del espacio"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ancho:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Largo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Altura total:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Altura plano de trabajo:");

        javax.swing.GroupLayout panelIngresoDatosLayout = new javax.swing.GroupLayout(panelIngresoDatos);
        panelIngresoDatos.setLayout(panelIngresoDatosLayout);
        panelIngresoDatosLayout.setHorizontalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAncho)
                    .addComponent(txtLargo)
                    .addComponent(txtAlturaTot)
                    .addComponent(txtAlturaTW, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        panelIngresoDatosLayout.setVerticalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoDatosLayout.createSequentialGroup()
                        .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoDatosLayout.createSequentialGroup()
                                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(txtLargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(txtAlturaTot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtAlturaTW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        panelSeleccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione las opciones que se ajusten a su espacio"));

        panelSistemaIluminación.setBorder(javax.swing.BorderFactory.createTitledBorder("Sistema de iluminación"));

        grupoSistIlum.add(optDirecta);
        optDirecta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optDirecta.setText("Directa");

        grupoSistIlum.add(optIndirecta);
        optIndirecta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optIndirecta.setText("Indirecta");

        grupoSistIlum.add(optDifusa);
        optDifusa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optDifusa.setText("Difusa");

        grupoSistIlum.add(optSemidirecta);
        optSemidirecta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optSemidirecta.setText("Semidirecta");

        javax.swing.GroupLayout panelSistemaIluminaciónLayout = new javax.swing.GroupLayout(panelSistemaIluminación);
        panelSistemaIluminación.setLayout(panelSistemaIluminaciónLayout);
        panelSistemaIluminaciónLayout.setHorizontalGroup(
            panelSistemaIluminaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSistemaIluminaciónLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSistemaIluminaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optDirecta)
                    .addComponent(optIndirecta)
                    .addComponent(optDifusa)
                    .addComponent(optSemidirecta))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelSistemaIluminaciónLayout.setVerticalGroup(
            panelSistemaIluminaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSistemaIluminaciónLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optDirecta)
                .addGap(3, 3, 3)
                .addComponent(optSemidirecta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optIndirecta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optDifusa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEnsuciamiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Ensuciamiento"));

        grupoEnsuciamiento.add(optDebil);
        optDebil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optDebil.setText("Debil");

        grupoEnsuciamiento.add(optMediano);
        optMediano.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optMediano.setText("Mediano");

        grupoEnsuciamiento.add(optFuerte);
        optFuerte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optFuerte.setText("Fuerte");

        javax.swing.GroupLayout panelEnsuciamientoLayout = new javax.swing.GroupLayout(panelEnsuciamiento);
        panelEnsuciamiento.setLayout(panelEnsuciamientoLayout);
        panelEnsuciamientoLayout.setHorizontalGroup(
            panelEnsuciamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnsuciamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnsuciamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optDebil)
                    .addComponent(optMediano)
                    .addComponent(optFuerte))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panelEnsuciamientoLayout.setVerticalGroup(
            panelEnsuciamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnsuciamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optDebil)
                .addGap(18, 18, 18)
                .addComponent(optMediano)
                .addGap(18, 18, 18)
                .addComponent(optFuerte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mantenimiento"));

        grupoMantenimiento.add(optOptimo);
        optOptimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optOptimo.setText("Mantenimiento óptimo");

        grupoMantenimiento.add(optSinMantenimiento);
        optSinMantenimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optSinMantenimiento.setText("Sin Mantenimiento programado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optOptimo)
                    .addComponent(optSinMantenimiento))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(optOptimo)
                .addGap(26, 26, 26)
                .addComponent(optSinMantenimiento)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        panelLuminaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de luminaria"));

        cboLuminaria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboLuminaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Incandescente Tradicional", "Incandescente Halogena", "Fluorescente Compacta", "Tubos Fluorescentes", "Sodio", "Halogenuros Metalicos", "LED" }));

        javax.swing.GroupLayout panelLuminariaLayout = new javax.swing.GroupLayout(panelLuminaria);
        panelLuminaria.setLayout(panelLuminariaLayout);
        panelLuminariaLayout.setHorizontalGroup(
            panelLuminariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLuminariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboLuminaria, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLuminariaLayout.setVerticalGroup(
            panelLuminariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLuminariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboLuminaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de espacio"));

        cboEspacios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboEspacios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áreas de circulación, corredores", "Escaleras", "Vestidores, baños, cuartos de servicio", "Almácenes, bodegas", "Oficinas de tipo general, mecanografía y computación", "Oficinas abiertas", "Oficinas de dibujo", "Salas de conferencia" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboEspacios, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSeleccionLayout = new javax.swing.GroupLayout(panelSeleccion);
        panelSeleccion.setLayout(panelSeleccionLayout);
        panelSeleccionLayout.setHorizontalGroup(
            panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelSeleccionLayout.createSequentialGroup()
                        .addComponent(panelSistemaIluminación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelEnsuciamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelLuminaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelSeleccionLayout.setVerticalGroup(
            panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelSistemaIluminación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelEnsuciamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelLuminaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnCalcular)))
                .addGap(18, 18, 18)
                .addComponent(panelSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnCalcular))
                    .addComponent(panelSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(242, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        String info=""; //String que va a contener los datos ingresados para
       // Verifica que se hayan digitado las dimensiones del espacio
       //asigna las variables si se han digitado los valores
       if(txtAncho.getText().equals("")){
       JOptionPane.showMessageDialog(null,"Digite el ancho de su espacio");
       } else if(txtLargo.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Digite el Largo de su espacio");
       } else if(txtAlturaTot.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Digite la Altura de su espacio");
       }else if(txtAlturaTW.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Digite la altura de su plano de trabajo");
       } else{
           Ancho=Double.parseDouble(txtAncho.getText());
           Largo=Double.parseDouble(txtLargo.getText());
           AlturaTot=Double.parseDouble(txtAlturaTot.getText());
           AlturaTw=Double.parseDouble(txtAlturaTW.getText());
           info="Ancho: "+Ancho+"\n";
           info=info+"Largo: "+Largo+"\n";
           info=info+"Altura total: "+AlturaTot+"\n";
           info=info+"Altura del plano de trabajo: "+AlturaTw+"\n";
           
           //calcula la altura de suspension y el indice del local
       if(optDirecta.isSelected()){
            h=0.8*(AlturaTot-AlturaTw);
            k=(Ancho*Largo)/(h*(Ancho+Largo));
            info=info+"K: "+k+"\n";
            info=info+"h: "+h+"\n";
       } else if(optSemidirecta.isSelected()){
            h=0.8*(AlturaTot-AlturaTw);
            k=(Ancho*Largo)/(h*(Ancho+Largo));
            info=info+"K: "+k+"\n";
            info=info+"h: "+h+"\n";
       } else if(optDifusa.isSelected()){
            h=0.8*(AlturaTot-AlturaTw);
            k=(Ancho*Largo)/(h*(Ancho+Largo));
            info=info+"K: "+k+"\n";
            info=info+"h: "+h+"\n";
       } else if(optIndirecta.isSelected()){
            d=0.25*(AlturaTot-AlturaTw);
            k=(3*Ancho*Largo)/(2*(h+AlturaTw)*(Ancho+Largo));
            info=info+"K: "+k+"\n";
            info=info+"d: "+d+"\n";
       }
       
           //Ejecuta el metodo de calculo del factor de mantenimiento
            FactorDeMantenimiento();
            info=info+"El factor de mantenimiento es: "+M+"\n";
            
            //Selecciona los valores recomendados por retilap para espacio seleccionado
            Retilap();
            info=info+"El espacio seleccionado es: "+Espacio+"\n";
            info=info+"La Iluminancia recomendada es: "+Emed+"\n";
            info=info+"Se recomienda un IRC de "+IRC+"\n";
            info=info+"Se recomienda una Temperatura de color con "+Tcolor+"\n";
            
           JOptionPane.showMessageDialog(null,info);
       }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cboEspacios;
    private javax.swing.JComboBox<String> cboLuminaria;
    private javax.swing.ButtonGroup grupoEnsuciamiento;
    private javax.swing.ButtonGroup grupoMantenimiento;
    private javax.swing.ButtonGroup grupoSistIlum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton optDebil;
    private javax.swing.JRadioButton optDifusa;
    private javax.swing.JRadioButton optDirecta;
    private javax.swing.JRadioButton optFuerte;
    private javax.swing.JRadioButton optIndirecta;
    private javax.swing.JRadioButton optMediano;
    private javax.swing.JRadioButton optOptimo;
    private javax.swing.JRadioButton optSemidirecta;
    private javax.swing.JRadioButton optSinMantenimiento;
    private javax.swing.JPanel panelEnsuciamiento;
    private javax.swing.JPanel panelIngresoDatos;
    private javax.swing.JPanel panelLuminaria;
    private javax.swing.JPanel panelSeleccion;
    private javax.swing.JPanel panelSistemaIluminación;
    private javax.swing.JTextField txtAlturaTW;
    private javax.swing.JTextField txtAlturaTot;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtLargo;
    // End of variables declaration//GEN-END:variables
}
