package HospitalClases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


/**
 * Clase que representa a un paciente. Hereda de la clase Persona.
 * 
 */

public class Paciente extends Persona implements Serializable {
	
	/**
	 * ID para la serialización
	 */
	private static final long serialVersionUID = 9166017119919328872L;

	/**
	 * Atributo que almacena el número de Seguridad Social
	 */
	private String numeroSeguridadSocial;
	
	/**
	 * Atributo que almacena la lista de enfermedades del paciente
	 */
	private HashMap<String, Enfermedad> listaEnfermedades;
	

	/**
	 * Override del método abstracto equivalente de la clase padre Persona
	 * Metodo que permite obtener el nombre completo del paciente
	 * @return Cadena de texto que representa el nombre de la persona
	 */
	@Override
	public String getNombreCompleto() {
			return  "Paciente " + super.getNombre() +  " " + super.getApellido1() +  " " + super.getApellido2();
	}
	
	/**
	 * Metodo que permite obtener el número de Seguridad Social del paciente
	 * @return Cadena de texto que representa el número de Seguridad Social del paciente
	 */
	public String getNumeroSeguridadSocial() {
		return this.numeroSeguridadSocial;
	}

	/**
	 * Metodo que permite modificar el número de Seguridad Social del paciente
	 * @param numerosocial Cadena de texto que representa el nuevo número de Seguridad Social del paciente
	 */
	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}
	
	/**
	 * Método que devuelve la lista completa de enfermedades del paciente
	 * @return ArrayList con los medicamentos que el paciente tiene recetados
	 */
	public ArrayList<Enfermedad> getListaEnfermedades() {
		ArrayList<Enfermedad> le = new ArrayList<Enfermedad>();
		for (Enfermedad enfermedad : this.listaEnfermedades.values())
			le.add(enfermedad);
		return le;
	}
	
	/**
	 * Constructor por defecto de la clase;
	 */
	public Paciente() {
		super();
		this.numeroSeguridadSocial = "";
		this.listaEnfermedades = new  HashMap<String, Enfermedad>();
	}
	
	/**
	 * Constructor de la clase con parámetros
	 * @param numerosocial número de Seguridad Social
	 * @param nombre Cadena de texto con el nombre
	 * @param apellido Cadena de texto con el apellido
	 * @param dni Cadena de texto con el dni
	 * @param sexo Elemento de la enumeración de tipo Sexo
	 * @param fechanacimiento Date con la fecha de nacimiento
	 */
	public Paciente(String numeroSeguridadSocial, String nombre, String apellido1, String apellido2, String dni, HospitalEnumeraciones.Sexo sexo, Date fechaNacimiento, HashMap<String, Enfermedad> listaEnfermedades){
		super(nombre, apellido1, apellido2, dni, sexo, fechaNacimiento);
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.listaEnfermedades = listaEnfermedades;

	}

	public Object toUpperCase() {
		// TODO Auto-generated method stub
		return null;
	}

}