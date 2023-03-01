
//Ajustes del boton
//-Podemos manipular la letra del boton(color tamaño estilo)

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame {
  // atributo
  public JPanel panel;

  // constructor
  public Ventana() {
    this.setSize(600, 600);
    this.setTitle("Capitulos del  183 al 194 ");
    this.setLocationRelativeTo(null);
    this.setMinimumSize(new Dimension(300, 300));

    iniciarComponentes();

    setDefaultCloseOperation(EXIT_ON_CLOSE);

  }

  private void iniciarComponentes() {
    colocarPaneles();
    colocarSeparador();
    // colocarEtiquetas();
    // colocarBotones();
    // colocarRadioBotones();
    // colocarBotonesDeActivacion();
    // colocarCajasDeTexto();
    // colocarAreasDeTexto();
    // colocarScroll();
    // colocarCasillasDeVerificacion();
    // colocarListasDesplegables();
    // colocarCampoDeContraseña();
    // colocarTablas();
    // colocarListas();

  }

  private void colocarPaneles() {
    panel = new JPanel();
    panel.setLayout(null);
    this.getContentPane().add(panel);// agregamos el panel a la ventana
  }

  private void colocarSeparador() {
    JSeparator separador = new JSeparator(SwingConstants.VERTICAL);
    separador.setBounds(130, 10, 50, 500);
    panel.add(separador);

    JSeparator separador2 = new JSeparator(SwingConstants.HORIZONTAL);
    separador2.setBounds(1, 1, 570, 50);
    panel.add(separador2);

    JButton boton1 = new JButton("Boton 1");
    boton1.setBounds(10, 20, 100, 30);
    panel.add(boton1);

    JButton boton2 = new JButton("Boton 2");
    boton2.setBounds(10, 120, 100, 30);
    panel.add(boton2);

    JButton boton3 = new JButton("Boton 3");
    boton3.setBounds(10, 220, 100, 30);
    panel.add(boton3);
  }

  private void colocarEtiquetas() {
    // etiqueta 1
    JLabel label = new JLabel("Mundial 2022", SwingConstants.CENTER);
    // label.setText("Mundial 2022");
    label.setBounds(20, 20, 400, 30);
    // label.setHorizontalAligment(SwingConstants.CENTER);
    label.setForeground(Color.BLACK); // establecemos el color de la letra
    label.setFont(new Font("cooper black", 0, 40)); // establecemos el tipo de la fuente
    panel.add(label);

    // etiqueta 2 tipo imagen
    ImageIcon balon = new ImageIcon("balon.jpg");
    JLabel label2 = new JLabel();
    label2.setBounds(10, 80, 500, 500);

    label2.setIcon(
        new ImageIcon(balon.getImage().getScaledInstance(label2.getWidth(), label2.getHeight(), Image.SCALE_SMOOTH)));
    panel.add(label2);
  }

  private void colocarBotones() {
    JButton boton1 = new JButton();
    boton1.setText("Boton 1");
    boton1.setBounds(100, 100, 100, 40);
    boton1.setBackground(Color.gray);// Establecemos un color de fondo en el boton
    boton1.setBorder(BorderFactory.createLineBorder(Color.red, 10, true));
    panel.add(boton1);

    JButton boton2 = new JButton("Enviar");
    boton2.setBounds(100, 200, 100, 40);
    boton2.setForeground(Color.blue); // establecemos el color de la letra
    boton2.setFont(new Font("arial", 3, 18)); // Establecemos la letra,fuente y tamaño
    boton2.setBorder(BorderFactory.createLineBorder(Color.red, 5, true));
    panel.add(boton2);

    JButton boton3 = new JButton(" ");
    boton3.setBounds(250, 100, 150, 40);
    ImageIcon imagen = new ImageIcon("btn.png");
    boton3.setIcon(
        new ImageIcon(imagen.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_SMOOTH)));
    panel.add(boton3);

    JButton boton4 = new JButton("Alt + a");
    boton4.setBounds(250, 20, 150, 40);
    boton4.setEnabled(true);
    boton4.setMnemonic('a'); // cuando presionams alt + a se va a activar
    boton4.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    panel.add(boton4);

    JButton boton5 = new JButton("Boton 5");
    boton5.setBounds(250, 200, 150, 40);
    boton5.setEnabled(false);
    boton5.setBorder(BorderFactory.createLineBorder(Color.red));
    panel.add(boton5);

  }

  private void colocarRadioBotones() {
    // solo podemos escoger uno
    JRadioButton radioboton1 = new JRadioButton("Opcion 1", true);
    radioboton1.setBounds(50, 100, 300, 50);
    radioboton1.setFont(new Font("arial", 3, 20));
    panel.add(radioboton1);

    JRadioButton radioboton2 = new JRadioButton("Opcion 2", false);
    radioboton2.setBounds(50, 150, 100, 50);
    panel.add(radioboton2);

    JRadioButton radioboton3 = new JRadioButton("Opcion 3", false);
    radioboton3.setBounds(50, 200, 100, 50);
    // desactiva el radioboton
    radioboton3.setEnabled(false);
    panel.add(radioboton3);

    ButtonGroup grupoRadiobotones = new ButtonGroup();
    grupoRadiobotones.add(radioboton1);
    grupoRadiobotones.add(radioboton2);
    grupoRadiobotones.add(radioboton3);

  }

  private void colocarBotonesDeActivacion() {
    // nos aparece un boton que esta sumido (activado) si lo presionamos se
    // desactiva
    JToggleButton botonActivacion1 = new JToggleButton("Opcion 1", true);
    botonActivacion1.setBounds(50, 100, 100, 50);
    panel.add(botonActivacion1);

    JToggleButton botonActivacion2 = new JToggleButton("Opcion 2", false);
    botonActivacion2.setBounds(50, 200, 100, 50);
    panel.add(botonActivacion2);

    JToggleButton botonActivacion3 = new JToggleButton("Opcion 3", false);
    botonActivacion3.setBounds(50, 300, 100, 50);
    panel.add(botonActivacion3);

    // creamos un grupo para que solo se pueda activar uno
    ButtonGroup grupoBotonesActivados = new ButtonGroup();
    grupoBotonesActivados.add(botonActivacion1);
    grupoBotonesActivados.add(botonActivacion2);
    grupoBotonesActivados.add(botonActivacion3);

  }

  private void colocarCajasDeTexto() {

    JTextField cajaTexto = new JTextField();
    cajaTexto.setBounds(30, 30, 100, 30);
    cajaTexto.setText("Nombre...");
    // String palabra = cajaTexto.getText();
    // System.out.println(palabra);
    panel.add(cajaTexto);
  }

  private void colocarAreasDeTexto() {
    JTextArea cuadro = new JTextArea();
    cuadro.setBounds(50, 50, 500, 500);
    cuadro.setText("Ingrese sus Datos");
    cuadro.append("\nAñade mas texto aqui");
    cuadro.setEditable(true); // podemos borrar el texto
    System.out.println(cuadro.getText());
    panel.add(cuadro);

  }

  private void colocarScroll() {
    JTextArea cuadro = new JTextArea();
    cuadro.setBounds(50, 50, 500, 500);
    cuadro.setText("Ingrese sus Datos");
    cuadro.append("\nAñade mas texto aqui");
    panel.add(cuadro);

    JScrollPane scroll = new JScrollPane(cuadro);
    scroll.setBounds(50, 50, 500, 500);
    // podemos agregar una barra de desplazamiento Horizontal
    // scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
    // podemos agregar una barra de desplazamiento Vertical
    // sc
    // roll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    panel.add(scroll);

  }

  private void colocarCasillasDeVerificacion() {
    JCheckBox check1 = new JCheckBox("Check 1");
    check1.setBounds(20, 20, 100, 30);
    panel.add(check1);

    JCheckBox check2 = new JCheckBox("Check 2", true);
    check2.setBounds(140, 20, 100, 30);
    panel.add(check2);

    JCheckBox check3 = new JCheckBox("Check 3");
    check3.setBounds(260, 20, 100, 30);
    panel.add(check3);

    JCheckBox check4 = new JCheckBox("Check 4");
    check4.setBounds(20, 80, 100, 30);
    check4.setEnabled(false);
    panel.add(check4);

  }

  private void colocarListasDesplegables() {
    /*
     * String [] paises = {"Mexico","USA","Canada","Cuba","Guatemala"};
     * JComboBox listaDesplegable1 = new JComboBox(paises);
     * listaDesplegable1.setBounds(20,20,150,30);
     * listaDesplegable1.addItem("Colombia");//añadir objetos a nuestra lista
     * desplegable
     * listaDesplegable1.setSelectedItem("USA");//LE DECIMOS CUAL QUEREMOS QUE SEA
     * EL QUE NOS SALGA CUANDO APAREZCA NUESTRA LISTA DESPLEGABLE
     * panel.add(listaDesplegable1);
     */
    Persona p1 = new Persona("Luisito Rojas", 44, "Japones");
    Persona p2 = new Persona("Mariana Garcia", 31, "Mexicana");
    Persona p3 = new Persona("Martha Mariana", 8, "Francesa");
    Persona p4 = new Persona("Chalino Valentino", 1, "Estadounidense");
    Persona p5 = new Persona("Pollo Rojas", 38, "Camerunes");
    DefaultComboBoxModel modelo = new DefaultComboBoxModel();
    JComboBox listaDesplegable1 = new JComboBox(modelo);
    modelo.addElement(p1);
    modelo.addElement(p2);
    modelo.addElement(p3);
    modelo.addElement(p4);
    modelo.addElement(p5);

    listaDesplegable1.setBounds(20, 20, 250, 30);
    panel.add(listaDesplegable1);

  }

  private void colocarCampoDeContraseña() {
    JPasswordField contraseña = new JPasswordField();
    contraseña.setBounds(50, 50, 150, 30);
    contraseña.setText("Chalis");
    panel.add(contraseña);

    String oculto = "";

    for (int i = 0; i < contraseña.getPassword().length; i++) {
      oculto += contraseña.getPassword()[i];
    }

    System.out.println("La contraseña es: " + oculto);

  }

  private void colocarTablas() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellidos");
    modelo.addColumn("Edad");
    modelo.addColumn("Domicilio");

    String persona1[] = { "Chalis", "Rojas", "1", "pirules # 20" };
    String persona2[] = { "Martitha", "Rojas", "8", "pirules # 20" };
    String persona3[] = { "Luisito", "Rojas", "44", "pirules # 20" };
    String persona4[] = { "Mariana", "Garcia", "31", "Cuauhtemoc # 6" };
    String persona5[] = { "Marha Celia", "Rojas", "42", "Murcia # 3478" };

    modelo.addRow(persona1);
    modelo.addRow(persona2);
    modelo.addRow(persona3);
    modelo.addRow(persona4);
    modelo.addRow(persona5);
    modelo.addRow(persona1);
    modelo.addRow(persona2);
    modelo.addRow(persona3);
    modelo.addRow(persona4);
    modelo.addRow(persona5);
    modelo.addRow(persona1);
    modelo.addRow(persona2);
    modelo.addRow(persona3);
    modelo.addRow(persona4);
    modelo.addRow(persona5);
    modelo.addRow(persona1);
    modelo.addRow(persona2);
    modelo.addRow(persona3);
    modelo.addRow(persona4);
    modelo.addRow(persona5);
    modelo.addRow(persona1);
    modelo.addRow(persona2);
    modelo.addRow(persona3);
    modelo.addRow(persona4);
    modelo.addRow(persona5);
    modelo.addRow(persona1);
    modelo.addRow(persona2);
    modelo.addRow(persona3);
    modelo.addRow(persona4);
    modelo.addRow(persona5);

    JTable tabla = new JTable(modelo);
    // tabla.setBounds(50,50,400,400);
    // panel.add(tabla);

    JScrollPane scroll = new JScrollPane(tabla);
    scroll.setBounds(50, 50, 400, 400);
    panel.add(scroll);

  }

  private void colocarListas() {
    DefaultListModel modelo = new DefaultListModel();

    modelo.addElement(new Persona("Luisito", 44, "Mexicano"));
    modelo.addElement(new Persona("Mariana", 31, "Canadiense"));
    modelo.addElement(new Persona("Joseph", 14, "Holandes"));
    modelo.addElement(new Persona("Ricardo", 17, "Cubano"));
    modelo.addElement(new Persona("Rogelio", 74, "Brasileño"));
    modelo.addElement(new Persona("Salvador", 35, "Chileno"));
    modelo.addElement(new Persona("Luisito", 44, "Mexicano"));
    modelo.addElement(new Persona("Mariana", 31, "Canadiense"));
    modelo.addElement(new Persona("Joseph", 14, "Holandes"));
    modelo.addElement(new Persona("Ricardo", 17, "Cubano"));
    modelo.addElement(new Persona("Rogelio", 74, "Brasileño"));
    modelo.addElement(new Persona("Salvador Adrian", 35, "Chileno"));
    modelo.addElement(new Persona("Luisito", 44, "Mexicano"));
    modelo.addElement(new Persona("Mariana", 31, "Canadiense"));
    modelo.addElement(new Persona("Joseph", 14, "Holandes"));
    modelo.addElement(new Persona("Jose Ricardo", 17, "Cubano"));
    modelo.addElement(new Persona("Rogelio", 74, "Brasileño"));
    modelo.addElement(new Persona("Salvador", 35, "Chileno"));
    modelo.addElement(new Persona("Luis Armando ", 44, "Mexicano"));
    modelo.addElement(new Persona("Mariana", 31, "Canadiense"));
    modelo.addElement(new Persona("Joseph", 14, "Holandes"));
    modelo.addElement(new Persona("Ricardo", 17, "Cubano"));
    modelo.addElement(new Persona("Rogelio", 74, "Brasileño"));
    modelo.addElement(new Persona("Salvador", 35, "Chileno"));

    JList lista = new JList(modelo);

    JScrollPane scroll = new JScrollPane(lista);
    scroll.setBounds(20, 20, 150, 300);
    panel.add(scroll);

  }

}
