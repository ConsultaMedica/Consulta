package HospitalVentana;

import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.FlowLayout;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;










import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

import javax.swing.JTree;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JToolBar;

import java.awt.Panel;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;



import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import java.util.Calendar;

import javax.swing.JSplitPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.MatteBorder;

import java.awt.Color;

import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;


import javax.swing.SwingConstants;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextArea;




//import consultasMedicas.bussinesLogic.domain.facade.ConsultasMedicasFacade;
import HospitalClases.Calendario;
import HospitalClases.Enfermedad;
import HospitalClases.Medicamento;
import HospitalClases.Medico;
import HospitalClases.Paciente;
import HospitalEnumeraciones.Especialidad;
import HospitalEnumeraciones.Sexo;


public class JMainVentana extends JFrame{

	final JTabbedPane tabbedPane;
	final JTextField jtfMedicoNumero;
	final JTextField jtfMedicoNombre;
	final JTextField jtfMedicoApellido1;
	final JTextField jtfMedicoApellido2;
	final JTextField jtfMedicoDni;
	final JSpinner jspMedicoFechaNac;
	final JComboBox<Sexo> jcbMedicoSexo;
	final JComboBox<Especialidad> jcbEspecialidad;
	final JButton btnNuevoMedico;
	final JButton btnAnyadirMedico;
	final JButton btnEliminarMedico;
	final JButton btnModificarMedico;
	final JList<Medico> jlstMedicos;
	
	final JTextField jtfPacienteNumeroSS;
	final JTextField jtfPacienteNombre;
	final JTextField jtfPacienteApellido1;
	final JTextField jtfPacienteApellido2;
	final JTextField jtfPacienteDni;
	final JSpinner jspPacienteFechaNac;
	final JComboBox<Sexo> jcbPacienteSexo;
	final JButton btnNuevoPaciente;
	final JButton btnAnyadirPaciente;
	final JButton btnEliminarPaciente;
	final JButton btnModificarPaciente;
	final JList<Paciente> jlstPacientes;
	
	final JTextField jtfEnfermedadNombre;
	final JCheckBox chckbxContagiosa;
	final JCheckBox chckbxCronica;
	final JCheckBox chckbxHereditaria;
	final JCheckBox chckbxInfecciosa;
	final JCheckBox chckbxDegenerativa;
	final JButton btnNuevaEnfermedad;
	final JButton btnAnyadirEnfermedad;
	final JButton btnEliminarEnfermedad;
	final JButton btnModificarEnfermedad;
	final JList<Enfermedad> jlstEnfermedades;
	
	final JTextField jtfMedicamentoCodigo;
	final JTextField jtfMedicamentoNombre;
	final JCheckBox chckbxGenerico;
	final JTextField jtfLaboratorio;
	final JSpinner jspUnidades;
	final JCheckBox chckbxVentaConReceta;
	final JButton btnNuevoMedicamento;
	final JButton btnAnyadirMedicamento;
	final JButton btnEliminarMedicamento;
	final JButton btnModificarMedicamento;
	final JList<Medicamento> jlstMedicamentos;

	final JSpinner jspdia;
	final JSpinner jspmes;
	final JSpinner jspaño;
	final JTextField jtfNombreMedico;
	final JTextField jtfNombrePaciente;
	final JButton btnNuevaCita;
	final JButton btnAnyadirCita;
	final JButton btnEliminarCita;
	final JButton btnModificarCita;
	final JList<Calendario> jlstCitas;

	/**
	 * 
	 */
	private static final long serialVersionUID = -7912887854396053953L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMainVentana frame = new JMainVentana();
					frame.setLocationRelativeTo(null);
				    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public JMainVentana() {
		
		
		// definimos el titulo y tamaño de la ventana principal
		setTitle("ConsultasMedicas - Gestión de consultas médicas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 745);
		 
		// creamos el menu vacio
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		// añadimos la opcion Archivo
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		// añadimo la opción salir a la opción archivo
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamamos a las operaciones de cierre de sistema
			//	cerrarVentana();
				// Eliminamos la ventana
				dispose();
				// Cerramos la aplicación marcando que no hay errores.
				System.exit(0);
			}
		});
		mnArchivo.add(mntmSalir);
		JMenu mnGestion = new JMenu("Gestión");
		menuBar.add(mnGestion);
		
		JMenuItem mnMedicos = new JMenuItem("Medicos");
		mnMedicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		mnGestion.add(mnMedicos);
		
		
		JMenuItem mnPacientes = new JMenuItem("Pacientes");
		mnPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		mnGestion.add(mnPacientes);
		
		JMenuItem mnEnfermedades = new JMenuItem("Enfermedades");
		mnEnfermedades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		mnGestion.add(mnEnfermedades);
		
		JMenuItem mnMedicamentos = new JMenuItem("Medicamentos");
		mnMedicamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		mnGestion.add(mnMedicamentos);
		
		
		JMenuItem mnConsultas = new JMenuItem("Consultas");
		mnConsultas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		mnGestion.add(mnConsultas);
		
		
		JMenuItem mnCalendario = new JMenuItem("Calendario de citas");
		mnCalendario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		mnGestion.add(mnCalendario);
		
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		JTree tree = new JTree();
		
		DefaultMutableTreeNode node_0 = new DefaultMutableTreeNode("Consultas M\u00E9dicas");
		DefaultMutableTreeNode node_1 = new DefaultMutableTreeNode("Catalogos");
		node_1.add(new DefaultMutableTreeNode("Medicos"));
		node_1.add(new DefaultMutableTreeNode("Pacientes"));
		node_1.add(new DefaultMutableTreeNode("Enfermedades"));
		node_1.add(new DefaultMutableTreeNode("Medicamentos"));
		node_1.add(new DefaultMutableTreeNode("Calendario de citas"));
		node_0.add(node_1);
		DefaultMutableTreeNode node_2 = new DefaultMutableTreeNode("Gesti\u00F3n");
		node_2.add(new DefaultMutableTreeNode("Citas"));
		node_2.add(new DefaultMutableTreeNode("Consultas"));
		node_0.add(node_2);
		DefaultTreeModel dtmRaiz = new DefaultTreeModel(node_0);
		tree.setModel(dtmRaiz);
		
		getContentPane().add(tree, BorderLayout.WEST);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
	
		JPanel jpMedicos = new JPanel();
		tabbedPane.addTab("M\u00E9dicos", null, jpMedicos, null);
		jpMedicos.setLayout(null);
		
		JLabel lblListaDeMdicos = new JLabel("Lista de m\u00E9dicos");
		lblListaDeMdicos.setBounds(35, 30, 114, 14);
		jpMedicos.add(lblListaDeMdicos);
		
		JScrollPane jspMedicos = new JScrollPane();
		jspMedicos.setBounds(35, 55, 618, 130);
		jpMedicos.add(jspMedicos);
		
		jlstMedicos = new JList<Medico>();
		jlstMedicos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (jlstMedicos.getSelectedIndex() != -1) {
				Medico medico = (Medico) jlstMedicos.getSelectedValue();
				jtfMedicoNumero.setText(medico.getcodmedico());
				jtfMedicoNombre.setText(medico.getNombre());
				jtfMedicoApellido1.setText(medico.getApellido1());
				jtfMedicoApellido2.setText(medico.getApellido2());
				jtfMedicoDni.setText(medico.getDni());
				jspMedicoFechaNac.setValue(medico.getFechaNacimiento());
				jcbMedicoSexo.setSelectedItem(medico.getSexo());
				jcbEspecialidad.setSelectedItem(medico.getEspecialidad());
				}
			}
		});
		jlstMedicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jlstMedicos.setModel(new DefaultListModel<Medico>());
		jspMedicos.setViewportView(jlstMedicos);
		

		JPanel jpnlMedicoDatos = new JPanel();
		jpnlMedicoDatos.setLayout(null);
		jpnlMedicoDatos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		jpnlMedicoDatos.setBounds(35, 211, 617, 111);
		jpMedicos.add(jpnlMedicoDatos);
		
		JLabel lblNmeroColegiado = new JLabel("N\u00FAmero Colegiado:");
		lblNmeroColegiado.setBounds(17, 11, 132, 14);
		jpnlMedicoDatos.add(lblNmeroColegiado);
		
		jtfMedicoNumero = new JTextField();
		jtfMedicoNumero.setColumns(10);
		jtfMedicoNumero.setBounds(17, 25, 132, 20);
		jpnlMedicoDatos.add(jtfMedicoNumero);
		
		JLabel label_12 = new JLabel("Nombre:");
		label_12.setBounds(166, 11, 79, 14);
		jpnlMedicoDatos.add(label_12);
		
		jtfMedicoNombre = new JTextField();
		jtfMedicoNombre.setColumns(10);
		jtfMedicoNombre.setBounds(166, 25, 132, 20);
		jpnlMedicoDatos.add(jtfMedicoNombre);
		
		JLabel label_11 = new JLabel("1\u00BA Apellido:");
		label_11.setBounds(315, 11, 109, 14);
		jpnlMedicoDatos.add(label_11);
		
		jtfMedicoApellido1 = new JTextField();
		jtfMedicoApellido1.setColumns(10);
		jtfMedicoApellido1.setBounds(315, 25, 132, 20);
		jpnlMedicoDatos.add(jtfMedicoApellido1);
		
		JLabel label_10 = new JLabel("2\u00BA Apellido:");
		label_10.setBounds(464, 11, 93, 14);
		jpnlMedicoDatos.add(label_10);
		
		jtfMedicoApellido2 = new JTextField();
		jtfMedicoApellido2.setColumns(10);
		jtfMedicoApellido2.setBounds(464, 25, 132, 20);
		jpnlMedicoDatos.add(jtfMedicoApellido2);
		
		JLabel label_9 = new JLabel("DNI:");
		label_9.setBounds(315, 56, 27, 14);
		jpnlMedicoDatos.add(label_9);
		
		jtfMedicoDni = new JTextField();
		jtfMedicoDni.setColumns(10);
		jtfMedicoDni.setBounds(315, 71, 132, 20);
		jpnlMedicoDatos.add(jtfMedicoDni);
		
		JLabel label_7 = new JLabel("Fecha nacimiento:");
		label_7.setBounds(464, 56, 132, 14);
		jpnlMedicoDatos.add(label_7);
		
		jspMedicoFechaNac = new JSpinner();
		jspMedicoFechaNac.setModel(new SpinnerDateModel(new Date(1399845600000L), null, null, Calendar.DAY_OF_YEAR));
		jspMedicoFechaNac.setBounds(464, 71, 132, 20);
		jpnlMedicoDatos.add(jspMedicoFechaNac);
		
		JLabel label_8 = new JLabel("Sexo:");
		label_8.setBounds(212, 56, 34, 14);
		jpnlMedicoDatos.add(label_8);
		
		jcbMedicoSexo = new JComboBox<Sexo>();
		jcbMedicoSexo.setModel(new DefaultComboBoxModel<Sexo>(Sexo.values()));
		jcbMedicoSexo.setSelectedIndex(-1);
		jcbMedicoSexo.setBounds(212, 71, 86, 20);
		jcbMedicoSexo.setSelectedIndex(-1);
		jpnlMedicoDatos.add(jcbMedicoSexo);


		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setBounds(17, 56, 86, 14);
		jpnlMedicoDatos.add(lblEspecialidad);
		
		jcbEspecialidad = new JComboBox<Especialidad>();
		jcbEspecialidad.setModel(new DefaultComboBoxModel<Especialidad>(Especialidad.values()));
		jcbEspecialidad.setSelectedIndex(-1);
		jcbEspecialidad.setBounds(17, 71, 170, 20);
		jcbEspecialidad.setSelectedIndex(-1);
		jpnlMedicoDatos.add(jcbEspecialidad);
		
		btnNuevoMedico = new JButton("Nuevo");
		//btnNuevoMedico.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent arg0) {
			//	limpiarDatosMedico();
			//}
		//});
		btnNuevoMedico.setBounds(69, 351, 89, 32);
		jpMedicos.add(btnNuevoMedico);
		
		btnAnyadirMedico = new JButton("A\u00F1adir");
		btnAnyadirMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medico medico = new Medico();
				medico.setCodmedico(jtfMedicoNumero.getText());
				medico.setNombre(jtfMedicoNombre.getText());
				medico.setApellido1(jtfMedicoApellido1.getText());
				medico.setApellido2(jtfMedicoApellido2.getText());
				medico.setDni(jtfMedicoDni.getText());
				medico.setFechaNacimiento((Date) jspMedicoFechaNac.getValue());
				medico.setSexo((Sexo) jcbMedicoSexo.getSelectedItem());
				medico.setEspecialidad((Especialidad) jcbEspecialidad.getSelectedItem());
				DefaultListModel<Medico> modelo = (DefaultListModel<Medico>) jlstMedicos.getModel();
				
				boolean duplicado = false; 
				Medico med;
	              for(int i=0;i<modelo.getSize();i++)
	                {
	            	  med = (Medico) modelo.getElementAt(i);
                      if ( med.getcodmedico().equals(medico.getcodmedico()) || med.getDni().equals(medico.getDni()) ){
	                    	duplicado=true;
                      }
	                }
	            
	              if (!duplicado) {
					modelo.addElement(medico);
					jlstMedicos.setSelectedIndex(modelo.getSize()-1);
					btnEliminarMedico.setEnabled(true);
					btnModificarMedico.setEnabled(true);
	              }
	              else
	              {
					JOptionPane.showMessageDialog(new JFrame("Error añadiendo"),
						    "Ya existe un médico con el número " + medico.getcodmedico() +" o el DNI " + medico.getDni(),
						    "ConsultasMedicas - Error",
						    JOptionPane.ERROR_MESSAGE);
	              }
			}
		});
		btnAnyadirMedico.setBounds(227, 351, 89, 32);
		jpMedicos.add(btnAnyadirMedico);
		
		btnModificarMedico = new JButton("Modificar");
		btnModificarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jlstMedicos.getSelectedIndex() != -1) {
					Medico medico = (Medico) jlstMedicos.getSelectedValue();
					medico.setCodmedico(jtfMedicoNumero.getText());
					medico.setNombre(jtfMedicoNombre.getText());
					medico.setApellido1(jtfMedicoApellido1.getText());
					medico.setApellido2(jtfMedicoApellido2.getText());
					medico.setDni(jtfMedicoDni.getText());
					medico.setFechaNacimiento((Date) jspMedicoFechaNac.getValue());
					medico.setSexo((Sexo) jcbMedicoSexo.getSelectedItem());
					medico.setEspecialidad((Especialidad) jcbEspecialidad.getSelectedItem());
					DefaultListModel<Medico> modelo = (DefaultListModel<Medico>) jlstMedicos.getModel();
					int i = jlstMedicos.getSelectedIndex();
					modelo.removeElementAt(i);
					modelo.add(i, medico);
					jlstMedicos.setSelectedIndex(i);
				}
			}
		});
		btnModificarMedico.setBounds(385, 351, 89, 32);
		jpMedicos.add(btnModificarMedico);
		
		btnEliminarMedico = new JButton("Eliminar");
		btnEliminarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jlstMedicos.getSelectedIndex() != -1) {
					DefaultListModel<Medico> modelo = (DefaultListModel<Medico>) jlstMedicos.getModel();
					modelo.remove(jlstMedicos.getSelectedIndex());
					//limpiarDatosMedico();
					// Comprobamos si queda algo en la lista
					if(modelo.getSize() == 0){
						// Como no queda nada en la lista procedemos deshabilitar los botones
						btnEliminarMedico.setEnabled(false);
						btnModificarMedico.setEnabled(false);
					}
				}
					else 
						JOptionPane.showMessageDialog(new JFrame("Error de selección"),
							    "No se ha seleccionado el médico a borrar.",
							    "ConsultasMedicas - Error",
							    JOptionPane.ERROR_MESSAGE);
				}
		});
		btnEliminarMedico.setBounds(543, 351, 89, 32);
		jpMedicos.add(btnEliminarMedico);

		
		JPanel jpPacientes = new JPanel();
		tabbedPane.addTab("Pacientes", null, jpPacientes, null);
		jpPacientes.setLayout(null);
		
		JLabel lblListaDePacientes = new JLabel("Lista de pacientes");
		lblListaDePacientes.setBounds(35, 30, 114, 14);
		jpPacientes.add(lblListaDePacientes);
		
		JScrollPane jspPacientes = new JScrollPane();
		jspPacientes.setBounds(35, 55, 618, 130);
		jpPacientes.add(jspPacientes);
		
		jlstPacientes = new JList<Paciente>();
		jlstPacientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (jlstPacientes.getSelectedIndex() != -1) {
				Paciente paciente = (Paciente) jlstPacientes.getSelectedValue();
				jtfPacienteNumeroSS.setText(paciente.getNumeroSeguridadSocial());
				jtfPacienteNombre.setText(paciente.getNombre());
				jtfPacienteApellido1.setText(paciente.getApellido1());
				jtfPacienteApellido2.setText(paciente.getApellido2());
				jtfPacienteDni.setText(paciente.getDni());
				jspPacienteFechaNac.setValue(paciente.getFechaNacimiento());
				jcbPacienteSexo.setSelectedItem(paciente.getSexo());
				}
			}
		});
		jlstPacientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jlstPacientes.setModel(new DefaultListModel<Paciente>());
		jspPacientes.setViewportView(jlstPacientes);

		JPanel jpnlPacienteDatos = new JPanel();
		jpnlPacienteDatos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		jpnlPacienteDatos.setBounds(35, 211, 617, 111);
		jpPacientes.add(jpnlPacienteDatos);
		jpnlPacienteDatos.setLayout(null);
		
		JLabel lblNmeroSegSocial = new JLabel("N\u00FAmero Seg Social:");
		lblNmeroSegSocial.setBounds(17, 11, 132, 14);
		jpnlPacienteDatos.add(lblNmeroSegSocial);
		
		jtfPacienteNumeroSS = new JTextField();
		jtfPacienteNumeroSS.setBounds(17, 25, 132, 20);
		jpnlPacienteDatos.add(jtfPacienteNumeroSS);
		jtfPacienteNumeroSS.setColumns(10);
		
		JLabel label = new JLabel("Nombre:");
		label.setBounds(166, 11, 79, 14);
		jpnlPacienteDatos.add(label);
		
		jtfPacienteNombre = new JTextField();
		jtfPacienteNombre.setBounds(166, 25, 132, 20);
		jpnlPacienteDatos.add(jtfPacienteNombre);
		jtfPacienteNombre.setColumns(10);
		
		JLabel label_1 = new JLabel("1\u00BA Apellido:");
		label_1.setBounds(315, 11, 109, 14);
		jpnlPacienteDatos.add(label_1);
		
		jtfPacienteApellido1 = new JTextField();
		jtfPacienteApellido1.setBounds(315, 25, 132, 20);
		jpnlPacienteDatos.add(jtfPacienteApellido1);
		jtfPacienteApellido1.setColumns(10);
		
		JLabel label_2 = new JLabel("2\u00BA Apellido:");
		label_2.setBounds(464, 11, 93, 14);
		jpnlPacienteDatos.add(label_2);
		
		jtfPacienteApellido2 = new JTextField();
		jtfPacienteApellido2.setBounds(464, 25, 132, 20);
		jpnlPacienteDatos.add(jtfPacienteApellido2);
		jtfPacienteApellido2.setColumns(10);
		
		JLabel label_3 = new JLabel("DNI:");
		label_3.setBounds(166, 52, 27, 14);
		jpnlPacienteDatos.add(label_3);
		
		jtfPacienteDni = new JTextField();
		jtfPacienteDni.setBounds(166, 67, 132, 20);
		jpnlPacienteDatos.add(jtfPacienteDni);
		jtfPacienteDni.setColumns(10);
		
		JLabel label_5 = new JLabel("Fecha nacimiento:");
		label_5.setBounds(315, 52, 93, 14);
		jpnlPacienteDatos.add(label_5);
		
		jspPacienteFechaNac = new JSpinner();
		jspPacienteFechaNac.setModel(new SpinnerDateModel(new Date(1399845600000L), null, null, Calendar.DAY_OF_YEAR));
		jspPacienteFechaNac.setBounds(315, 67, 107, 20);
		jpnlPacienteDatos.add(jspPacienteFechaNac);
		
		JLabel label_4 = new JLabel("Sexo:");
		label_4.setBounds(464, 52, 34, 14);
		jpnlPacienteDatos.add(label_4);
		
		jcbPacienteSexo = new JComboBox<Sexo>();
		jcbPacienteSexo.setModel(new DefaultComboBoxModel<Sexo>(Sexo.values()));
		jcbPacienteSexo.setSelectedIndex(-1);
		jcbPacienteSexo.setBounds(464, 67, 86, 20);
		jcbPacienteSexo.setSelectedIndex(-1);
		jpnlPacienteDatos.add(jcbPacienteSexo);
		
		btnNuevoPaciente = new JButton("Nuevo");
		btnNuevoPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	limpiarDatosPaciente();
			}
		});
		
		btnNuevoPaciente.setBounds (69, 351, 89, 32);
		jpPacientes.add(btnNuevoPaciente);
		
		btnAnyadirPaciente = new JButton("Añadir");
		btnAnyadirPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Paciente paciente = new Paciente();
				paciente.setNumeroSeguridadSocial(jtfPacienteNumeroSS.getText());
				paciente.setNombre(jtfPacienteNombre.getText());
				paciente.setApellido1(jtfPacienteApellido1.getText());
				paciente.setApellido2(jtfPacienteApellido2.getText());
				paciente.setDni(jtfPacienteDni.getText());
				paciente.setFechaNacimiento((Date) jspPacienteFechaNac.getValue());
				paciente.setSexo((Sexo) jcbPacienteSexo.getSelectedItem());
				
				DefaultListModel<Paciente> modelo = (DefaultListModel<Paciente>) jlstPacientes.getModel();
				
				boolean duplicado = false; 
				Paciente paci;
	              for(int i=0;i<modelo.getSize();i++)
	                {
	            	  paci = (Paciente) modelo.getElementAt(i);
                      if ( paci.getNumeroSeguridadSocial().equals(paciente.getNumeroSeguridadSocial()) || paci.getDni().equals(paciente.getDni()) ){
	                    	duplicado=true;
                      }
	                }
	            
	              if (!duplicado) {
					modelo.addElement(paciente);
					jlstPacientes.setSelectedIndex(modelo.getSize()-1);
					btnEliminarPaciente.setEnabled(true);
					btnModificarPaciente.setEnabled(true);
	              }
	              else
	              {
					JOptionPane.showMessageDialog(new JFrame("Error añadiendo paciente"),
						    "Ya existe un paciente con el número de SS " + paciente.getNumeroSeguridadSocial() +" o el DNI " + paciente.getDni(),
						    "ConsultasMedicas - Error",
						    JOptionPane.ERROR_MESSAGE);
	              }
			}
		});
		btnAnyadirPaciente.setBounds(227, 351, 89, 32);
		jpPacientes.add(btnAnyadirPaciente);

		btnModificarPaciente = new JButton("Modificar");
		btnModificarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jlstPacientes.getSelectedIndex() != -1) {
					Paciente paciente = (Paciente) jlstPacientes.getSelectedValue();
					paciente.setNumeroSeguridadSocial(jtfPacienteNumeroSS.getText());
					paciente.setNombre(jtfPacienteNombre.getText());
					paciente.setApellido1(jtfPacienteApellido1.getText());
					paciente.setApellido2(jtfPacienteApellido2.getText());
					paciente.setDni(jtfPacienteDni.getText());
					paciente.setFechaNacimiento((Date) jspPacienteFechaNac.getValue());
					paciente.setSexo((Sexo) jcbPacienteSexo.getSelectedItem());
					DefaultListModel<Paciente> modelo = (DefaultListModel<Paciente>) jlstPacientes.getModel();
					int i = jlstPacientes.getSelectedIndex();
					modelo.removeElementAt(i);
					modelo.add(i, paciente);
					jlstPacientes.setSelectedIndex(i);
				}
			}
		});
		btnModificarPaciente.setBounds(385, 351, 89, 32);
		jpPacientes.add(btnModificarPaciente);
		
		btnEliminarPaciente = new JButton("Eliminar");
		btnEliminarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jlstPacientes.getSelectedIndex() != -1) {
					DefaultListModel<Paciente> modelo = (DefaultListModel<Paciente>) jlstPacientes.getModel();
					modelo.remove(jlstPacientes.getSelectedIndex());
					//limpiarDatosPaciente();
					// Comprobamos si queda algo en la lista
					if(modelo.getSize() == 0){
						// Como no queda nada en la lista procedemos deshabilitar los botones
						btnEliminarPaciente.setEnabled(false);
						btnModificarPaciente.setEnabled(false);
					}
				}
					else 
						JOptionPane.showMessageDialog(new JFrame("Error de selección"),
							    "No se ha seleccionado el paciente a borrar.",
							    "ConsultasMedicas - Error",
							    JOptionPane.ERROR_MESSAGE);
				}
		});
		btnEliminarPaciente.setBounds(543, 351, 89, 32);
		jpPacientes.add(btnEliminarPaciente);
		
////////////////////////////////////////////////////////Tab de Enfermedades 
        JPanel jpEnfermedades = new JPanel();
        tabbedPane.addTab("Enfermedades", null, jpEnfermedades, null);
        jpEnfermedades.setLayout(null);

        JLabel lblListaEnfermedades = new JLabel("Lista de enfermedades");
        lblListaEnfermedades.setBounds(35, 30, 162, 14);
        jpEnfermedades.add(lblListaEnfermedades);

        JScrollPane jspEnfermedades = new JScrollPane();
        jspEnfermedades.setBounds(35, 55, 618, 130);
        jpEnfermedades.add(jspEnfermedades);

        jlstEnfermedades = new JList<Enfermedad>();
        jlstEnfermedades.addMouseListener(new MouseAdapter() {
     @Override
        public void mouseClicked(MouseEvent arg0) {
        if (jlstEnfermedades.getSelectedIndex() != -1) {
          Enfermedad enfermedad = (Enfermedad) jlstEnfermedades.getSelectedValue();
          jtfEnfermedadNombre.setText(enfermedad.getNombre());
          chckbxContagiosa.setSelected(enfermedad.isContagiosa());
          chckbxCronica.setSelected(enfermedad.isCronica());
          chckbxHereditaria.setSelected(enfermedad.isHereditaria());
          chckbxInfecciosa.setSelected(enfermedad.isInfecciosa());
          chckbxDegenerativa.setSelected(enfermedad.isDegenerativa());
             }
       }
    });
        jlstEnfermedades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jlstEnfermedades.setModel(new DefaultListModel<Enfermedad>());
        jspEnfermedades.setViewportView(jlstEnfermedades);
 
        JPanel jpnlEnfermedadDatos = new JPanel();
        jpnlEnfermedadDatos.setLayout(null);
        jpnlEnfermedadDatos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        jpnlEnfermedadDatos.setBounds(35, 211, 617, 111);
        jpEnfermedades.add(jpnlEnfermedadDatos);

        JLabel lblEnfermedadNombre = new JLabel("Nombre enfermedad:");
        lblEnfermedadNombre.setBounds(162, 11, 132, 14);
        jpnlEnfermedadDatos.add(lblEnfermedadNombre);

        jtfEnfermedadNombre = new JTextField();
        jtfEnfermedadNombre.setColumns(10);
        jtfEnfermedadNombre.setBounds(162, 25, 294, 20);;
        jpnlEnfermedadDatos.add(jtfEnfermedadNombre);

        chckbxContagiosa = new JCheckBox("Contagiosa");
        chckbxContagiosa.setBounds(22, 70, 97, 23);
        jpnlEnfermedadDatos.add(chckbxContagiosa);

        chckbxCronica = new JCheckBox("Cr\u00F3nica");
        chckbxCronica.setBounds(141, 70, 97, 23);
        jpnlEnfermedadDatos.add(chckbxCronica);

        chckbxHereditaria = new JCheckBox("Hereditaria");
        chckbxHereditaria.setBounds(498, 70, 97, 23);
        jpnlEnfermedadDatos.add(chckbxHereditaria);

        chckbxInfecciosa = new JCheckBox("Infecciosa");
        chckbxInfecciosa.setBounds(260, 70, 97, 23);
        jpnlEnfermedadDatos.add(chckbxInfecciosa);

        chckbxDegenerativa = new JCheckBox("Degenerativa");
        chckbxDegenerativa.setBounds(379, 70, 117, 23);
        jpnlEnfermedadDatos.add(chckbxDegenerativa);

        btnNuevaEnfermedad = new JButton("Nueva");
        btnNuevaEnfermedad.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
       // limpiarDatosEnfermedad();
         }
    });
        btnNuevaEnfermedad.setBounds(69, 351, 89, 32);
        jpEnfermedades.add(btnNuevaEnfermedad);

        btnAnyadirEnfermedad = new JButton("A\u00F1adir");
        btnAnyadirEnfermedad.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
          Enfermedad enfermedad = new Enfermedad();
          enfermedad.setNombre(jtfEnfermedadNombre.getText());
          enfermedad.setContagiosa(chckbxContagiosa.isSelected());
          enfermedad.setCronica(chckbxCronica.isSelected());
          enfermedad.setHereditaria(chckbxHereditaria.isSelected());
          enfermedad.setInfecciosa(chckbxInfecciosa.isSelected());
          enfermedad.setDegenerativa(chckbxDegenerativa.isSelected());

        DefaultListModel<Enfermedad> modelo = (DefaultListModel<Enfermedad>) jlstEnfermedades.getModel();

        boolean duplicado = false; 
        Enfermedad enfer;
       for(int i=0;i<modelo.getSize();i++)
       {
       enfer = (Enfermedad) modelo.getElementAt(i);
       if ( enfer.getNombre().toUpperCase().equals(enfermedad.getNombre().toUpperCase()) ){
         duplicado=true;
        }
       }

       if (!duplicado) {
       modelo.addElement(enfermedad);
       jlstEnfermedades.setSelectedIndex(modelo.getSize()-1);
       btnEliminarEnfermedad.setEnabled(true);
       btnModificarEnfermedad.setEnabled(true);
         }
       else
       {
       JOptionPane.showMessageDialog(new JFrame("Error añadiendo enfermedad"),
       "Ya existe una enfermedad con el nombre " + enfermedad.getNombre(),
       "ConsultasMedicas - Error",
       JOptionPane.ERROR_MESSAGE);
         }
       }
    });
       btnAnyadirEnfermedad.setBounds(227, 351, 89, 32);
       jpEnfermedades.add(btnAnyadirEnfermedad);

       btnModificarEnfermedad = new JButton("Modificar");
       btnModificarEnfermedad.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
         if (jlstEnfermedades.getSelectedIndex() != -1) {
         Enfermedad enfermedad = (Enfermedad) jlstEnfermedades.getSelectedValue();
         enfermedad.setNombre(jtfEnfermedadNombre.getText());
         enfermedad.setContagiosa(chckbxContagiosa.isSelected());
         enfermedad.setCronica(chckbxCronica.isSelected());
         enfermedad.setHereditaria(chckbxHereditaria.isSelected());
         enfermedad.setInfecciosa(chckbxInfecciosa.isSelected());
         enfermedad.setDegenerativa(chckbxDegenerativa.isSelected());

       DefaultListModel<Enfermedad> modelo = (DefaultListModel<Enfermedad>) jlstEnfermedades.getModel();
       int i = jlstEnfermedades.getSelectedIndex();
       modelo.removeElementAt(i);
       modelo.add(i, enfermedad);
       jlstEnfermedades.setSelectedIndex(i);
        }
       }
     });
       btnModificarEnfermedad.setBounds(385, 351, 89, 32);
       jpEnfermedades.add(btnModificarEnfermedad);

       btnEliminarEnfermedad = new JButton("Eliminar");
       btnEliminarEnfermedad.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
         if (jlstEnfermedades.getSelectedIndex() != -1) {
         DefaultListModel<Enfermedad> modelo = (DefaultListModel<Enfermedad>) jlstEnfermedades.getModel();
         modelo.remove(jlstEnfermedades.getSelectedIndex());
         //limpiarDatosEnfermedad();
        
         // Comprobamos si queda algo en la lista
      if(modelo.getSize() == 0){
      // Como no queda nada en la lista procedemos deshabilitar los botones
      btnEliminarEnfermedad.setEnabled(false);
      btnModificarEnfermedad.setEnabled(false);
        }
     }
      else 
      JOptionPane.showMessageDialog(new JFrame("Error de selección"),
      "No se ha seleccionado la enfermedad a borrar.",
      "ConsultasMedicas - Error",
      JOptionPane.ERROR_MESSAGE);
     }
   });
     btnEliminarEnfermedad.setBounds(543, 351, 89, 32);
     jpEnfermedades.add(btnEliminarEnfermedad);
	
////////////////////////////////////////////////////////Tab de Medicamentos
     JPanel jpMedicamentos = new JPanel();
     tabbedPane.addTab("Medicamentos", null, jpMedicamentos, null);
     jpMedicamentos.setLayout(null);

     JLabel lblListaMedicamentos = new JLabel("Lista de medicamentos");
     lblListaMedicamentos.setBounds(35, 30, 162, 14);
     jpMedicamentos.add(lblListaMedicamentos);

     JScrollPane jspMedicamentos = new JScrollPane();
     jspMedicamentos.setBounds(35, 55, 618, 130);
     jpMedicamentos.add(jspMedicamentos);

     jlstMedicamentos = new JList<Medicamento>();
     jlstMedicamentos.addMouseListener(new MouseAdapter() {
    @Override
 
     public void mouseClicked(MouseEvent arg0) {
       if (jlstMedicamentos.getSelectedIndex() != -1) {
        Medicamento medicamento = (Medicamento) jlstMedicamentos.getSelectedValue();
         jtfMedicamentoCodigo.setText(medicamento.getCodigo());
         jtfMedicamentoNombre.setText(medicamento.getNombre());
         chckbxGenerico.setSelected(medicamento.isGenerico());
         jtfLaboratorio.setText(medicamento.getLaboratorio());
         //jcbPresentacion.setSelectedItem(medicamento.getPresentacion());
         jspUnidades.setValue(new Double(medicamento.getUnidades()));
         chckbxVentaConReceta.setSelected(medicamento.isVentaConReceta());
         }
       }
     });
         
         jlstMedicamentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         jlstMedicamentos.setModel(new DefaultListModel<Medicamento>());
         jspMedicamentos.setViewportView(jlstMedicamentos);

         JPanel jpnlMedicamentoDatos = new JPanel();
         jpnlMedicamentoDatos.setLayout(null);
         jpnlMedicamentoDatos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
         jpnlMedicamentoDatos.setBounds(35, 211, 617, 111);
         jpMedicamentos.add(jpnlMedicamentoDatos);

         JLabel lblMedicamentoCodigo = new JLabel("C\u00F3digo:");
         lblMedicamentoCodigo.setBounds(24, 11, 132, 14);
         jpnlMedicamentoDatos.add(lblMedicamentoCodigo);

         jtfMedicamentoCodigo = new JTextField();
         jtfMedicamentoCodigo.setColumns(10);
         jtfMedicamentoCodigo.setBounds(24, 25, 109, 20);
         jpnlMedicamentoDatos.add(jtfMedicamentoCodigo);

         JLabel lblMedicamentoNombre = new JLabel("Nombre:");
         lblMedicamentoNombre.setBounds(159, 11, 79, 14);
         jpnlMedicamentoDatos.add(lblMedicamentoNombre);

         jtfMedicamentoNombre = new JTextField();
         jtfMedicamentoNombre.setColumns(10);
         jtfMedicamentoNombre.setBounds(157, 25, 235, 20);
         jpnlMedicamentoDatos.add(jtfMedicamentoNombre);

         JLabel lblLaboratorio = new JLabel("Laboratorio:");
         lblLaboratorio.setBounds(421, 11, 109, 14);
         jpnlMedicamentoDatos.add(lblLaboratorio);

         jtfLaboratorio = new JTextField();
         jtfLaboratorio.setColumns(10);
         jtfLaboratorio.setBounds(416, 25, 175, 20);
         jpnlMedicamentoDatos.add(jtfLaboratorio);

        // JLabel lblPresentacion = new JLabel("Presentacion");
        // lblPresentacion.setBounds(157, 56, 86, 14);
        // jpnlMedicamentoDatos.add(lblPresentacion);
        
         
         JLabel lblUnidades = new JLabel("Unidades:");
         lblUnidades.setBounds(24, 56, 72, 14);
         jpnlMedicamentoDatos.add(lblUnidades);

         jspUnidades = new JSpinner();
         jspUnidades.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
         jspUnidades.setBounds(24, 71, 109, 20);
         jpnlMedicamentoDatos.add(jspUnidades);

         chckbxVentaConReceta = new JCheckBox("Con receta");
         chckbxVentaConReceta.setBounds(508, 70, 103, 23);
         jpnlMedicamentoDatos.add(chckbxVentaConReceta);

         chckbxGenerico = new JCheckBox("Gen\u00E9rico");
         chckbxGenerico.setBounds(418, 70, 97, 23);
         jpnlMedicamentoDatos.add(chckbxGenerico);


         btnNuevoMedicamento = new JButton("Nuevo");
         btnNuevoMedicamento.addActionListener(new ActionListener() {
         
         public void actionPerformed(ActionEvent arg0) {
       // limpiarDatosMedicamento();
         }
       });
         btnNuevoMedicamento.setBounds(69, 351, 89, 32);
         jpMedicamentos.add(btnNuevoMedicamento);

         btnAnyadirMedicamento = new JButton("Añadir");
         btnAnyadirMedicamento.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
          Medicamento	medicamento = new Medicamento();
           medicamento.setCodigo(jtfMedicamentoCodigo.getText());
           medicamento.setNombre(jtfMedicamentoNombre.getText());
           medicamento.setGenerico(chckbxGenerico.isSelected());
           medicamento.setLaboratorio(jtfLaboratorio.getText());
           medicamento.setUnidades((int) jspUnidades.getValue());
           medicamento.setVentaConReceta(chckbxVentaConReceta.isSelected());

        DefaultListModel<Medicamento> modelo = (DefaultListModel<Medicamento>) jlstMedicamentos.getModel();

        boolean duplicado = false; 
        Medicamento medica;
        for(int i=0;i<modelo.getSize();i++)
         {
        medica = (Medicamento) modelo.getElementAt(i);
        if ( medica.getCodigo().equals(medicamento.getCodigo()) || medica.getNombre().toUpperCase().equals(medicamento.getNombre().toUpperCase()) ){
        duplicado=true;
        }
      }

        if (!duplicado) {
        modelo.addElement(medicamento);
        jlstMedicamentos.setSelectedIndex(modelo.getSize()-1);
        btnEliminarMedicamento.setEnabled(true);
        btnModificarMedicamento.setEnabled(true);
        }
        else
        {
     JOptionPane.showMessageDialog(new JFrame("Error añadiendo medicamento"),
     "Ya existe un medicamento con el código " + medicamento.getCodigo() +" o el nombre " + medicamento.getNombre(),
      "ConsultasMedicas - Error",
      JOptionPane.ERROR_MESSAGE);
       }
      }
   });
     btnAnyadirMedicamento.setBounds(227, 351, 89, 32);
     jpMedicamentos.add(btnAnyadirMedicamento);

     btnModificarMedicamento = new JButton("Modificar");
     btnModificarMedicamento.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
       if (jlstMedicamentos.getSelectedIndex() != -1) {
      Medicamento medicamento = (Medicamento) jlstMedicamentos.getSelectedValue();
      medicamento.setCodigo(jtfMedicamentoCodigo.getText());
      medicamento.setNombre(jtfMedicamentoNombre.getText());
      medicamento.setGenerico(chckbxGenerico.isSelected());
      medicamento.setLaboratorio(jtfLaboratorio.getText());
      medicamento.setUnidades((int) jspUnidades.getValue());
      medicamento.setVentaConReceta(chckbxVentaConReceta.isSelected());

      DefaultListModel<Medicamento> modelo = (DefaultListModel<Medicamento>) jlstMedicamentos.getModel();
      int i = jlstMedicamentos.getSelectedIndex();
      modelo.removeElementAt(i);
      modelo.add(i, medicamento);
      jlstMedicamentos.setSelectedIndex(i);
       }
      }
     });
     btnModificarMedicamento.setBounds(385, 351, 89, 32);
     jpMedicamentos.add(btnModificarMedicamento);

     btnEliminarMedicamento = new JButton("Eliminar");
     btnEliminarMedicamento.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      if (jlstMedicamentos.getSelectedIndex() != -1) {
      DefaultListModel<Medicamento> modelo = (DefaultListModel<Medicamento>) jlstMedicamentos.getModel();
      modelo.remove(jlstMedicamentos.getSelectedIndex());
      //limpiarDatosMedicamento();
      
      // Comprobamos si queda algo en la lista
      if(modelo.getSize() == 0){
      // Como no queda nada en la lista procedemos deshabilitar los botones
      btnEliminarMedicamento.setEnabled(false);
      btnEliminarMedicamento.setEnabled(false);
         }
        }
      else 
     JOptionPane.showMessageDialog(new JFrame("Error de selección"),
     "No se ha seleccionado el paciente a borrar.",
     "ConsultasMedicas - Error",
     JOptionPane.ERROR_MESSAGE);
     }
    });
     btnEliminarMedicamento.setBounds(543, 351, 89, 32);
     jpMedicamentos.add(btnEliminarMedicamento);
	 
     
////////////////////////////////////////////////////////Tab de Consultas
      JPanel jpConsultas = new JPanel();
      tabbedPane.addTab("Consultas médicas", null, jpConsultas, null);
      jpConsultas.setLayout(null);

   /*   JLabel lblMdico = new JLabel("M\u00E9dico:");
      lblMdico.setBounds(30, 10, 110, 14);
      jpConsultas.add(lblMdico);

      JComboBox jcbMedicos = new JComboBox();
      //jcbMedicos.setModel(new DefaultComboBoxModel<Medico>(ConsultasMedicasFacade.getListaMedicos()));
      jcbMedicos.setBounds(30, 27, 419, 20);
      jpConsultas.add(jcbMedicos);

      JLabel lblPaciente = new JLabel("Paciente:");
      lblPaciente.setBounds(30, 57, 110, 14);
      jpConsultas.add(lblPaciente);

      JComboBox jcbPaciente = new JComboBox();
      jcbPaciente.setBounds(30, 73, 419, 20);
      jpConsultas.add(jcbPaciente);

      JLabel lblFecha = new JLabel("Fecha:");
      lblFecha.setBounds(513, 11, 132, 14);
      jpConsultas.add(lblFecha);

      JSpinner jspFecha = new JSpinner();
      jspFecha.setModel(new SpinnerDateModel(new Date(1399845600000L), null, null, Calendar.DAY_OF_YEAR));
      jspFecha.setBounds(513, 26, 132, 20);
      jpConsultas.add(jspFecha);

      JLabel lblSintomas = new JLabel("S\u00EDntomas:");
      lblSintomas.setBounds(30, 111, 124, 14);
      jpConsultas.add(lblSintomas);

      JScrollPane jspSintomas = new JScrollPane();
      jspSintomas.setBounds(30, 129, 632, 74);
      jpConsultas.add(jspSintomas);

      JTextArea jtxtSintomas = new JTextArea();
      jspSintomas.setViewportView(jtxtSintomas);

      JLabel lblDiagnostico = new JLabel("Diagn\u00F3stico:");
      lblDiagnostico.setBounds(30, 215, 110, 14);
      jpConsultas.add(lblDiagnostico);

      JScrollPane jspDiagnostico = new JScrollPane();
      jspDiagnostico.setBounds(30, 234, 632, 74);
      jpConsultas.add(jspDiagnostico);

      JTextArea jtxtDiagnostico = new JTextArea();
      jspDiagnostico.setViewportView(jtxtDiagnostico);

      JTabbedPane jtabConsulta = new JTabbedPane(JTabbedPane.TOP);
      jtabConsulta.setBounds(30, 352, 632, 265);
      jpConsultas.add(jtabConsulta);

}

/**
* MŽtodo que permite actualiazar el contenido de las listas
*/
  /*   private void actualizarListas(){
     DefaultListModel<Medico> medicos = (DefaultListModel<Medico>)jlstMedicos.getModel();
     medicos.clear();
     //for(Medico med : ConsultasMedicasFacade.getListaMedicos())
     //medicos.addElement(med);
     // Comprobamos si hay algun medico
     if(medicos.getSize() == 0){
      btnEliminarMedico.setEnabled(false);
      btnModificarMedico.setEnabled(false);
      }

     DefaultListModel<Paciente> pacientes = (DefaultListModel<Paciente>) jlstPacientes.getModel();
     pacientes.clear();
     //for(Paciente paci : ConsultasMedicasFacade.getListaPacientes())
     //pacientes.addElement(paci);
// Comprobamos si hay algun paciente
     if(pacientes.getSize() == 0){
     btnEliminarPaciente.setEnabled(false);
     btnModificarPaciente.setEnabled(false);
    }

     DefaultListModel<Enfermedad> enfermedades = (DefaultListModel<Enfermedad>) jlstEnfermedades.getModel();
     enfermedades.clear();
    //for(Enfermedad enfer : ConsultasMedicasFacade.getListaEnfermedades())
    //enfermedades.addElement(enfer);
// Comprobamos si hay algun paciente
     if(enfermedades.getSize() == 0){
     btnEliminarEnfermedad.setEnabled(false);
     btnModificarEnfermedad.setEnabled(false);
     }

     DefaultListModel<Medicamento> medicamentos = (DefaultListModel<Medicamento>) jlstMedicamentos.getModel();
     medicamentos.clear();
    //for(Medicamento medicam : ConsultasMedicasFacade.getListaMedicamentos())
    //medicamentos.addElement(medicam);
// Comprobamos si hay algun paciente
     if(medicamentos.getSize() == 0){
       btnEliminarMedicamento.setEnabled(false);
       btnModificarMedicamento.setEnabled(false);
        }

*/

	
////////////////////////////////////////////////////////Tab de Calendario
     JPanel jpCalendario = new JPanel();
     tabbedPane.addTab("Calendario", null, jpCalendario, null);
     jpCalendario.setLayout(null);

     JLabel lblListaCitas = new JLabel("Lista de citas");
     lblListaCitas.setBounds(35, 30, 162, 14);
     jpCalendario.add(lblListaCitas);

     JScrollPane jspCalendario = new JScrollPane();
     jspCalendario.setBounds(35, 55, 618, 130);
     jpCalendario.add(jspCalendario);

     jlstCitas = new JList<Calendario>();
     jlstCitas.addMouseListener(new MouseAdapter() {
     @Override

     public void mouseClicked(MouseEvent arg0) {
      if (jlstCitas.getSelectedIndex() != -1) {
    	Calendario Calendario = (Calendario) jlstCitas.getSelectedValue();
    //    jspdia.setValue(new Date(Calendario.getdia()));
    //    jspmes.setValue(new Date(Calendario.getmes()));
        jspaño.setValue(new Date()); 
    //    jtfNombreMedico.setText(Calendario.getMedico());
   //     jtfNombrePaciente.setText(Calendario.getPaciente());
           }
       }
    });

        jlstCitas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jlstCitas.setModel(new DefaultListModel<Calendario>());
        jspCalendario.setViewportView(jlstCitas);

        JPanel jpnlCalendarioDatos = new JPanel();
        jpnlCalendarioDatos.setLayout(null);
        jpnlCalendarioDatos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        jpnlCalendarioDatos.setBounds(35, 211, 617, 111);
        jpCalendario.add(jpnlCalendarioDatos);
        
      //dia  
        JLabel lbldia = new JLabel("Dia:");
        lbldia.setBounds(24, 11, 132, 14);
        jpnlCalendarioDatos.add(lbldia);

        jspdia = new JSpinner();
        jspdia.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
        jspdia.setBounds(24, 25, 109, 20);
        jpnlCalendarioDatos.add(jspdia);

       //mes
        JLabel lblmes = new JLabel("Mes:");
        lblmes.setBounds(159, 11, 79, 14);
        jpnlCalendarioDatos.add(lblmes);

        jspmes = new JSpinner();
        jspmes.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
        jspmes.setBounds(157, 25, 235, 20);
        jpnlCalendarioDatos.add(jspmes);
        
        //año
        JLabel lblaño = new JLabel("Año:");
        lblaño.setBounds(421, 11, 109, 14);
        jpnlCalendarioDatos.add(lblaño);

        jspaño = new JSpinner();
        jspaño.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
        jspaño.setBounds(416, 25, 175, 20);
        jpnlCalendarioDatos.add(jspmes);
        

       JLabel lblNombreMedico = new JLabel("Nombre del Medico:");
       lblNombreMedico.setBounds(24, 56, 72, 14);
       jpnlCalendarioDatos.add(lblNombreMedico);

       jtfNombreMedico = new JTextField();
       jtfNombreMedico.setColumns(10);
       jtfNombreMedico.setBounds(24, 71, 109, 20);
       jpnlCalendarioDatos.add(jtfNombreMedico);


       JLabel lblNombrePaciente = new JLabel("Nombre del Paciente:");
       lblNombrePaciente.setBounds(508, 70, 103, 23);
       jpnlCalendarioDatos.add(lblNombrePaciente);

       jtfNombrePaciente = new JTextField();
       jtfNombrePaciente.setColumns(10);
       jtfNombrePaciente.setBounds(418, 70, 97, 23);
       jpnlCalendarioDatos.add(jtfNombrePaciente);



       btnNuevaCita = new JButton("Nueva cita");
       btnNuevaCita.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent arg0) {
          // limpiarDatosCita();
            }
        });
       btnNuevaCita.setBounds(69, 351, 89, 32);
       jpCalendario.add(btnNuevaCita);

       btnAnyadirCita = new JButton("Añadir cita");
       btnAnyadirCita.addActionListener(new ActionListener() {
         
    	   public void actionPerformed(ActionEvent arg0) {
           Calendario calendario = new Calendario();
           calendario.setdia((Date) jspdia.getValue());
           calendario.setmes((Date) jspmes.getValue());
           calendario.setaño((Date) jspaño.getValue());
          // calendario.setmedico(jtfNombreMedico.getText());
        //   calendario.setpaciente(jtfNombrePaciente.getText());


       DefaultListModel<Calendario> modelo = (DefaultListModel<Calendario>) jlstCitas.getModel();

      boolean duplicado = false; 
      Calendario cita;
      for(int i=0;i<modelo.getSize();i++)
        {
     cita = (Calendario) modelo.getElementAt(i);
    if ( cita.getdia().equals(calendario.getdia()) || cita.getpaciente().toUpperCase().equals(calendario.getpaciente().toUpperCase()) ){
     duplicado=true;
      }
    }

    if (!duplicado) {
    modelo.addElement(calendario);
    jlstCitas.setSelectedIndex(modelo.getSize()-1);
    btnEliminarCita.setEnabled(true);
    btnModificarCita.setEnabled(true);
    }
    else
    {
    JOptionPane.showMessageDialog(new JFrame("Error añadiendo cita"),
      "Ya existe una cita con ese dia " + calendario.getdia() +" o el nombre del paciente " + calendario.getpaciente(),
      "ConsultasMedicas - Error",
      JOptionPane.ERROR_MESSAGE);
    }
   }
});

       btnAnyadirCita.setBounds(227, 351, 89, 32);
       jpCalendario.add(btnAnyadirCita);

       btnModificarCita = new JButton("Modificar cita");
       btnModificarCita.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        if (jlstCitas.getSelectedIndex() != -1) {
        Calendario calendario = (Calendario) jlstCitas.getSelectedValue();
       // calendario.setmedico(jtfNombreMedico.getText());
      //  calendario.setpaciente(jtfNombrePaciente.getText());
      //  calendario.setdia((int) jspdia.getValue());
    //    calendario.setmes((int) jspmes.getValue());
     //   calendario.setaño((int) jspaño.getValue());


      DefaultListModel<Calendario> modelo = (DefaultListModel<Calendario>) jlstCitas.getModel();
      int i = jlstCitas.getSelectedIndex();
      modelo.removeElementAt(i);
      modelo.add(i, calendario);
      jlstCitas.setSelectedIndex(i);
      }
    }
});
      btnModificarCita.setBounds(385, 351, 89, 32);
      jpCalendario.add(btnModificarCita);

      btnEliminarCita = new JButton("Eliminar");
      btnEliminarCita.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      if (jlstCitas.getSelectedIndex() != -1) {
      DefaultListModel<Calendario> modelo = (DefaultListModel<Calendario>) jlstCitas.getModel();
      modelo.remove(jlstCitas.getSelectedIndex());
      //limpiarDatosCalendario();

      // Comprobamos si queda algo en la lista
      if(modelo.getSize() == 0){
      // Como no queda nada en la lista procedemos deshabilitar los botones
       btnEliminarCita.setEnabled(false);
       btnEliminarCita.setEnabled(false);
      }
     }
     else 
      JOptionPane.showMessageDialog(new JFrame("Error de selección"),
      "No se ha seleccionado la cita a borrar.",
       "ConsultasMedicas - Error",
      JOptionPane.ERROR_MESSAGE);
       }
   });
      btnEliminarCita.setBounds(543, 351, 89, 32);
      jpCalendario.add(btnEliminarCita);
	
	}
	
     }
