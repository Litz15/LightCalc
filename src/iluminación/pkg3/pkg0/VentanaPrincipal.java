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
    double ReflecPiso;      //Reflectancia del piso
    double ReflecPared;     //Reflectancia de la pared
    double ReflecTecho;     //Reflectancia del techo
    String Color[]={"Blanco nuevo",
                    "Blanco viejo",
                    "Azul verde",
                    "Crema",
                    "Azul claro",
                    "Miel",
                    "Gris Claro",
                    "Gris Oscuro",
                    "Amarillo",
                    "Amarillo oscuro",
                    "Azul Oscuro",
                    "Cafe",
                    "Negro",
                    "Verde Oscuro"};
    String Acabado[]={"Blanco polarizado",
                    "Aluminio",
                    "Cantera clara",
                    "Cemento",
                    "Mármol blanco",
                    "Asfalto limpio",
                    "Adoquín de roca",
                    "Grava",
                    "Ladrillo claro",
                    "Ladrillo oscuro",};
    String Superficie[]={"Maple",
                    "Nogal",
                    "Caoba",
                    "Pino",
                    "Madera clara",
                    "Madera oscura"};
    String triada[]={"A","A","A"};

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
        optPisoColor.setSelected(true);
        optParedColor.setSelected(true);
        optTechoColor.setSelected(true);
        
    //Llena el combo de piso
        cboReflecPiso.removeAllItems();
        for(int i=0;i<Color.length;i++){
            cboReflecPiso.addItem(Color[i]);
    }
   
    //Llena el combo de pared
        cboReflecPared.removeAllItems();
        for(int i=0;i<Color.length;i++){
            cboReflecPared.addItem(Color[i]);
    }
        
    //Llena el combo de techo
        cboReflecTecho.removeAllItems();
        for(int i=0;i<Color.length;i++){
            cboReflecTecho.addItem(Color[i]);
    }
        
        

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
 public void ReflecPiso(){
        
    if(optPisoColor.isSelected()){
     if (cboReflecPiso.getSelectedIndex()==0){ 
            ReflecPiso=88;
           }else if(cboReflecPiso.getSelectedIndex()==1){
            ReflecPiso=76;
           }else if(cboReflecPiso.getSelectedIndex()==2){
            ReflecPiso=66;
           }else if(cboReflecPiso.getSelectedIndex()==3){
            ReflecPiso=80;
           }else if(cboReflecPiso.getSelectedIndex()==4){
            ReflecPiso=60;
           }else if(cboReflecPiso.getSelectedIndex()==5){
            ReflecPiso=69;
           }else if(cboReflecPiso.getSelectedIndex()==6){
            ReflecPiso=67;
           }else if(cboReflecPiso.getSelectedIndex()==7){
            ReflecPiso=25;
           }else if(cboReflecPiso.getSelectedIndex()==8){
            ReflecPiso=65;
           }else if(cboReflecPiso.getSelectedIndex()==9){
            ReflecPiso=50;
           }else if(cboReflecPiso.getSelectedIndex()==10){
            ReflecPiso=8;
           }else if(cboReflecPiso.getSelectedIndex()==11){
            ReflecPiso=10;
           }else if(cboReflecPiso.getSelectedIndex()==12){
            ReflecPiso=3;
           }else if(cboReflecPiso.getSelectedIndex()==13){
            ReflecPiso=7;
           }
    } else if(optPisoSuperficie.isSelected()){
        if (cboReflecPiso.getSelectedIndex()==0){ 
            ReflecPiso=43;
           }else if(cboReflecPiso.getSelectedIndex()==1){
            ReflecPiso=16;
           }else if(cboReflecPiso.getSelectedIndex()==2){
            ReflecPiso=12;
           }else if(cboReflecPiso.getSelectedIndex()==3){
            ReflecPiso=48;
           }else if(cboReflecPiso.getSelectedIndex()==4){
            ReflecPiso=40;
           }else if(cboReflecPiso.getSelectedIndex()==5){
            ReflecPiso=18;
           }
    } else if(optPisoAcabado.isSelected()){
        if (cboReflecPiso.getSelectedIndex()==0){ 
            ReflecPiso=78;
           }else if(cboReflecPiso.getSelectedIndex()==1){
            ReflecPiso=75;
           }else if(cboReflecPiso.getSelectedIndex()==2){
            ReflecPiso=18;
           }else if(cboReflecPiso.getSelectedIndex()==3){
            ReflecPiso=27;
           }else if(cboReflecPiso.getSelectedIndex()==4){
            ReflecPiso=45;
           }else if(cboReflecPiso.getSelectedIndex()==5){
            ReflecPiso=7;
           }else if(cboReflecPiso.getSelectedIndex()==6){
            ReflecPiso=17;
           }else if(cboReflecPiso.getSelectedIndex()==7){
            ReflecPiso=13;
           }else if(cboReflecPiso.getSelectedIndex()==8){
            ReflecPiso=40;
           }else if(cboReflecPiso.getSelectedIndex()==9){
            ReflecPiso=20;
           }
    }
 }
 public void ReflecPared(){
 if(optParedColor.isSelected()){
     if (cboReflecPared.getSelectedIndex()==0){ 
            ReflecPared=88;
           }else if(cboReflecPared.getSelectedIndex()==1){
            ReflecPared=76;
           }else if(cboReflecPared.getSelectedIndex()==2){
            ReflecPared=66;
           }else if(cboReflecPared.getSelectedIndex()==3){
            ReflecPared=80;
           }else if(cboReflecPared.getSelectedIndex()==4){
            ReflecPared=60;
           }else if(cboReflecPared.getSelectedIndex()==5){
            ReflecPared=69;
           }else if(cboReflecPared.getSelectedIndex()==6){
            ReflecPared=67;
           }else if(cboReflecPared.getSelectedIndex()==7){
            ReflecPared=25;
           }else if(cboReflecPared.getSelectedIndex()==8){
            ReflecPared=65;
           }else if(cboReflecPared.getSelectedIndex()==9){
            ReflecPared=50;
           }else if(cboReflecPared.getSelectedIndex()==10){
            ReflecPared=8;
           }else if(cboReflecPared.getSelectedIndex()==11){
            ReflecPared=10;
           }else if(cboReflecPared.getSelectedIndex()==12){
            ReflecPared=3;
           }else if(cboReflecPared.getSelectedIndex()==13){
            ReflecPared=7;
           }
    } else if(optParedSuperficie.isSelected()){
        if (cboReflecPared.getSelectedIndex()==0){ 
            ReflecPared=43;
           }else if(cboReflecPared.getSelectedIndex()==1){
            ReflecPared=16;
           }else if(cboReflecPared.getSelectedIndex()==2){
            ReflecPared=12;
           }else if(cboReflecPared.getSelectedIndex()==3){
            ReflecPared=48;
           }else if(cboReflecPared.getSelectedIndex()==4){
            ReflecPared=40;
           }else if(cboReflecPared.getSelectedIndex()==5){
            ReflecPared=18;
           }
    } else if(optParedAcabado.isSelected()){
        if (cboReflecPared.getSelectedIndex()==0){ 
            ReflecPared=78;
           }else if(cboReflecPared.getSelectedIndex()==1){
            ReflecPared=75;
           }else if(cboReflecPared.getSelectedIndex()==2){
            ReflecPared=18;
           }else if(cboReflecPared.getSelectedIndex()==3){
            ReflecPared=27;
           }else if(cboReflecPared.getSelectedIndex()==4){
            ReflecPared=45;
           }else if(cboReflecPared.getSelectedIndex()==5){
            ReflecPared=7;
           }else if(cboReflecPared.getSelectedIndex()==6){
            ReflecPared=17;
           }else if(cboReflecPared.getSelectedIndex()==7){
            ReflecPared=13;
           }else if(cboReflecPared.getSelectedIndex()==8){
            ReflecPared=40;
           }else if(cboReflecPared.getSelectedIndex()==9){
            ReflecPared=20;
           }
    }
 }
 public void ReflecTecho(){
  if(optTechoColor.isSelected()){
     if (cboReflecTecho.getSelectedIndex()==0){ 
            ReflecTecho=88;
           }else if(cboReflecTecho.getSelectedIndex()==1){
            ReflecTecho=76;
           }else if(cboReflecTecho.getSelectedIndex()==2){
            ReflecTecho=66;
           }else if(cboReflecTecho.getSelectedIndex()==3){
            ReflecTecho=80;
           }else if(cboReflecTecho.getSelectedIndex()==4){
            ReflecTecho=60;
           }else if(cboReflecTecho.getSelectedIndex()==5){
            ReflecTecho=69;
           }else if(cboReflecTecho.getSelectedIndex()==6){
            ReflecTecho=67;
           }else if(cboReflecTecho.getSelectedIndex()==7){
            ReflecTecho=25;
           }else if(cboReflecTecho.getSelectedIndex()==8){
            ReflecTecho=65;
           }else if(cboReflecTecho.getSelectedIndex()==9){
            ReflecTecho=50;
           }else if(cboReflecTecho.getSelectedIndex()==10){
            ReflecTecho=8;
           }else if(cboReflecTecho.getSelectedIndex()==11){
            ReflecTecho=10;
           }else if(cboReflecTecho.getSelectedIndex()==12){
            ReflecTecho=3;
           }else if(cboReflecTecho.getSelectedIndex()==13){
            ReflecTecho=7;
           }
    } else if(optTechoSuperficie.isSelected()){
        if (cboReflecTecho.getSelectedIndex()==0){ 
            ReflecTecho=43;
           }else if(cboReflecTecho.getSelectedIndex()==1){
            ReflecTecho=16;
           }else if(cboReflecTecho.getSelectedIndex()==2){
            ReflecTecho=12;
           }else if(cboReflecTecho.getSelectedIndex()==3){
            ReflecTecho=48;
           }else if(cboReflecTecho.getSelectedIndex()==4){
            ReflecTecho=40;
           }else if(cboReflecTecho.getSelectedIndex()==5){
            ReflecTecho=18;
           }
    } else if(optTechoAcabado.isSelected()){
        if (cboReflecTecho.getSelectedIndex()==0){ 
            ReflecTecho=78;
           }else if(cboReflecTecho.getSelectedIndex()==1){
            ReflecTecho=75;
           }else if(cboReflecTecho.getSelectedIndex()==2){
            ReflecTecho=18;
           }else if(cboReflecTecho.getSelectedIndex()==3){
            ReflecTecho=27;
           }else if(cboReflecTecho.getSelectedIndex()==4){
            ReflecTecho=45;
           }else if(cboReflecTecho.getSelectedIndex()==5){
            ReflecTecho=7;
           }else if(cboReflecTecho.getSelectedIndex()==6){
            ReflecTecho=17;
           }else if(cboReflecTecho.getSelectedIndex()==7){
            ReflecTecho=13;
           }else if(cboReflecTecho.getSelectedIndex()==8){
            ReflecTecho=40;
           }else if(cboReflecTecho.getSelectedIndex()==9){
            ReflecTecho=20;
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
        grupoPiso = new javax.swing.ButtonGroup();
        grupoPared = new javax.swing.ButtonGroup();
        grupoTecho = new javax.swing.ButtonGroup();
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
        panelMantenimiento = new javax.swing.JPanel();
        optOptimo = new javax.swing.JRadioButton();
        optSinMantenimiento = new javax.swing.JRadioButton();
        panelLuminaria = new javax.swing.JPanel();
        cboLuminaria = new javax.swing.JComboBox<>();
        panelEspacio = new javax.swing.JPanel();
        cboEspacios = new javax.swing.JComboBox<>();
        panelPiso = new javax.swing.JPanel();
        optPisoColor = new javax.swing.JRadioButton();
        optPisoSuperficie = new javax.swing.JRadioButton();
        optPisoAcabado = new javax.swing.JRadioButton();
        cboReflecPiso = new javax.swing.JComboBox<>();
        panelPared = new javax.swing.JPanel();
        optParedColor = new javax.swing.JRadioButton();
        optParedSuperficie = new javax.swing.JRadioButton();
        optParedAcabado = new javax.swing.JRadioButton();
        cboReflecPared = new javax.swing.JComboBox<>();
        panelTecho = new javax.swing.JPanel();
        optTechoColor = new javax.swing.JRadioButton();
        optTechoSuperficie = new javax.swing.JRadioButton();
        optTechoAcabado = new javax.swing.JRadioButton();
        cboReflecTecho = new javax.swing.JComboBox<>();

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

        panelMantenimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Mantenimiento"));

        grupoMantenimiento.add(optOptimo);
        optOptimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optOptimo.setText("Mantenimiento óptimo");

        grupoMantenimiento.add(optSinMantenimiento);
        optSinMantenimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optSinMantenimiento.setText("Sin Mantenimiento programado");

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optOptimo)
                    .addComponent(optSinMantenimiento))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantenimientoLayout.createSequentialGroup()
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

        panelEspacio.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de espacio"));

        cboEspacios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboEspacios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áreas de circulación, corredores", "Escaleras", "Vestidores, baños, cuartos de servicio", "Almácenes, bodegas", "Oficinas de tipo general, mecanografía y computación", "Oficinas abiertas", "Oficinas de dibujo", "Salas de conferencia" }));

        javax.swing.GroupLayout panelEspacioLayout = new javax.swing.GroupLayout(panelEspacio);
        panelEspacio.setLayout(panelEspacioLayout);
        panelEspacioLayout.setHorizontalGroup(
            panelEspacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspacioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboEspacios, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEspacioLayout.setVerticalGroup(
            panelEspacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspacioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPiso.setBorder(javax.swing.BorderFactory.createTitledBorder("Piso"));

        grupoPiso.add(optPisoColor);
        optPisoColor.setText("Color");
        optPisoColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optPisoColorActionPerformed(evt);
            }
        });

        grupoPiso.add(optPisoSuperficie);
        optPisoSuperficie.setText("Superficie");
        optPisoSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optPisoSuperficieActionPerformed(evt);
            }
        });

        grupoPiso.add(optPisoAcabado);
        optPisoAcabado.setText("Acabado");
        optPisoAcabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optPisoAcabadoActionPerformed(evt);
            }
        });

        cboReflecPiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelPisoLayout = new javax.swing.GroupLayout(panelPiso);
        panelPiso.setLayout(panelPisoLayout);
        panelPisoLayout.setHorizontalGroup(
            panelPisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPisoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPisoLayout.createSequentialGroup()
                        .addComponent(optPisoColor)
                        .addGap(45, 45, 45)
                        .addComponent(optPisoSuperficie)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboReflecPiso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(optPisoAcabado)
                .addGap(40, 40, 40))
        );
        panelPisoLayout.setVerticalGroup(
            panelPisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPisoLayout.createSequentialGroup()
                .addGroup(panelPisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optPisoColor)
                    .addComponent(optPisoSuperficie)
                    .addComponent(optPisoAcabado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboReflecPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        panelPared.setBorder(javax.swing.BorderFactory.createTitledBorder("Pared"));

        grupoPared.add(optParedColor);
        optParedColor.setText("Color");
        optParedColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optParedColorActionPerformed(evt);
            }
        });

        grupoPared.add(optParedSuperficie);
        optParedSuperficie.setText("Superficie");
        optParedSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optParedSuperficieActionPerformed(evt);
            }
        });

        grupoPared.add(optParedAcabado);
        optParedAcabado.setText("Acabado");
        optParedAcabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optParedAcabadoActionPerformed(evt);
            }
        });

        cboReflecPared.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelParedLayout = new javax.swing.GroupLayout(panelPared);
        panelPared.setLayout(panelParedLayout);
        panelParedLayout.setHorizontalGroup(
            panelParedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelParedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelParedLayout.createSequentialGroup()
                        .addComponent(optParedColor)
                        .addGap(45, 45, 45)
                        .addComponent(optParedSuperficie)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboReflecPared, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(optParedAcabado)
                .addGap(40, 40, 40))
        );
        panelParedLayout.setVerticalGroup(
            panelParedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParedLayout.createSequentialGroup()
                .addGroup(panelParedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optParedColor)
                    .addComponent(optParedSuperficie)
                    .addComponent(optParedAcabado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboReflecPared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        panelTecho.setBorder(javax.swing.BorderFactory.createTitledBorder("Techo"));

        grupoTecho.add(optTechoColor);
        optTechoColor.setText("Color");
        optTechoColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optTechoColorActionPerformed(evt);
            }
        });

        grupoTecho.add(optTechoSuperficie);
        optTechoSuperficie.setText("Superficie");
        optTechoSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optTechoSuperficieActionPerformed(evt);
            }
        });

        grupoTecho.add(optTechoAcabado);
        optTechoAcabado.setText("Acabado");
        optTechoAcabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optTechoAcabadoActionPerformed(evt);
            }
        });

        cboReflecTecho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelTechoLayout = new javax.swing.GroupLayout(panelTecho);
        panelTecho.setLayout(panelTechoLayout);
        panelTechoLayout.setHorizontalGroup(
            panelTechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTechoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTechoLayout.createSequentialGroup()
                        .addComponent(optTechoColor)
                        .addGap(45, 45, 45)
                        .addComponent(optTechoSuperficie)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboReflecTecho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(optTechoAcabado)
                .addGap(40, 40, 40))
        );
        panelTechoLayout.setVerticalGroup(
            panelTechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTechoLayout.createSequentialGroup()
                .addGroup(panelTechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optTechoColor)
                    .addComponent(optTechoSuperficie)
                    .addComponent(optTechoAcabado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboReflecTecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSeleccionLayout = new javax.swing.GroupLayout(panelSeleccion);
        panelSeleccion.setLayout(panelSeleccionLayout);
        panelSeleccionLayout.setHorizontalGroup(
            panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelTecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelPiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelSeleccionLayout.createSequentialGroup()
                            .addComponent(panelSistemaIluminación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(panelEnsuciamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(panelLuminaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEspacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPared, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelLuminaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEspacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelTecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
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
                    .addComponent(panelSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnCalcular)))
                .addContainerGap(92, Short.MAX_VALUE))
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
            
            //Asigna la reflectancia del piso
            ReflecPiso();
            ReflecPiso=ReflecPiso/100;
            info= info+"La Reflectancia del piso es "+ReflecPiso+"\n";
            
            //Asigna la reflectancia de la pared
            ReflecPared();
            ReflecPared=ReflecPared/100;
            info= info+"La Reflectancia de la pared es "+ReflecPared+"\n";
            
             //Asigna la reflectancia del techo
            ReflecTecho();
            ReflecTecho=ReflecTecho/100;
            info= info+"La Reflectancia del techo es "+ReflecTecho+"\n";
            
           JOptionPane.showMessageDialog(null,info);
       }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void optPisoColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optPisoColorActionPerformed
        cboReflecPiso.removeAllItems();
        for(int i=0;i<Color.length;i++){
            cboReflecPiso.addItem(Color[i]);
        }
    }//GEN-LAST:event_optPisoColorActionPerformed

    private void optPisoSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optPisoSuperficieActionPerformed
        cboReflecPiso.removeAllItems();
        for(int i=0;i<Superficie.length;i++){
            cboReflecPiso.addItem(Superficie[i]);
        }
        
    }//GEN-LAST:event_optPisoSuperficieActionPerformed

    private void optPisoAcabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optPisoAcabadoActionPerformed
        cboReflecPiso.removeAllItems();
        for(int i=0;i<Acabado.length;i++){
            cboReflecPiso.addItem(Acabado[i]);
        }
    }//GEN-LAST:event_optPisoAcabadoActionPerformed

    private void optParedColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optParedColorActionPerformed
        cboReflecPared.removeAllItems();
        for(int i=0;i<Color.length;i++){
            cboReflecPared.addItem(Color[i]);
        }
    }//GEN-LAST:event_optParedColorActionPerformed

    private void optParedSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optParedSuperficieActionPerformed
        cboReflecPared.removeAllItems();
        for(int i=0;i<Superficie.length;i++){
            cboReflecPared.addItem(Superficie[i]);
        }
    }//GEN-LAST:event_optParedSuperficieActionPerformed

    private void optParedAcabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optParedAcabadoActionPerformed
        cboReflecPared.removeAllItems();
        for(int i=0;i<Acabado.length;i++){
            cboReflecPared.addItem(Acabado[i]);
        }
    }//GEN-LAST:event_optParedAcabadoActionPerformed

    private void optTechoColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optTechoColorActionPerformed
        cboReflecTecho.removeAllItems();
        for(int i=0;i<Color.length;i++){
            cboReflecTecho.addItem(Color[i]);
        }
    }//GEN-LAST:event_optTechoColorActionPerformed

    private void optTechoSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optTechoSuperficieActionPerformed
        cboReflecTecho.removeAllItems();
        for(int i=0;i<Superficie.length;i++){
            cboReflecTecho.addItem(Superficie[i]);
        }
    }//GEN-LAST:event_optTechoSuperficieActionPerformed

    private void optTechoAcabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optTechoAcabadoActionPerformed
        cboReflecTecho.removeAllItems();
        for(int i=0;i<Acabado.length;i++){
            cboReflecTecho.addItem(Acabado[i]);
        }
    }//GEN-LAST:event_optTechoAcabadoActionPerformed

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
    private javax.swing.JComboBox<String> cboReflecPared;
    private javax.swing.JComboBox<String> cboReflecPiso;
    private javax.swing.JComboBox<String> cboReflecTecho;
    private javax.swing.ButtonGroup grupoEnsuciamiento;
    private javax.swing.ButtonGroup grupoMantenimiento;
    private javax.swing.ButtonGroup grupoPared;
    private javax.swing.ButtonGroup grupoPiso;
    private javax.swing.ButtonGroup grupoSistIlum;
    private javax.swing.ButtonGroup grupoTecho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton optDebil;
    private javax.swing.JRadioButton optDifusa;
    private javax.swing.JRadioButton optDirecta;
    private javax.swing.JRadioButton optFuerte;
    private javax.swing.JRadioButton optIndirecta;
    private javax.swing.JRadioButton optMediano;
    private javax.swing.JRadioButton optOptimo;
    private javax.swing.JRadioButton optParedAcabado;
    private javax.swing.JRadioButton optParedColor;
    private javax.swing.JRadioButton optParedSuperficie;
    private javax.swing.JRadioButton optPisoAcabado;
    private javax.swing.JRadioButton optPisoColor;
    private javax.swing.JRadioButton optPisoSuperficie;
    private javax.swing.JRadioButton optSemidirecta;
    private javax.swing.JRadioButton optSinMantenimiento;
    private javax.swing.JRadioButton optTechoAcabado;
    private javax.swing.JRadioButton optTechoColor;
    private javax.swing.JRadioButton optTechoSuperficie;
    private javax.swing.JPanel panelEnsuciamiento;
    private javax.swing.JPanel panelEspacio;
    private javax.swing.JPanel panelIngresoDatos;
    private javax.swing.JPanel panelLuminaria;
    private javax.swing.JPanel panelMantenimiento;
    private javax.swing.JPanel panelPared;
    private javax.swing.JPanel panelPiso;
    private javax.swing.JPanel panelSeleccion;
    private javax.swing.JPanel panelSistemaIluminación;
    private javax.swing.JPanel panelTecho;
    private javax.swing.JTextField txtAlturaTW;
    private javax.swing.JTextField txtAlturaTot;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtLargo;
    // End of variables declaration//GEN-END:variables
}
