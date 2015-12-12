package HospitalClases;

import java.io.Serializable;
import java.util.Date;

import HospitalEnumeraciones.Especialidad;
import HospitalEnumeraciones.Sexo;

/**
 * Clase que representa a un m�dico. Hereda de la clase Persona.
 * 
 * @author Ainhoa Goirigolzarri
 *
 */

public class Medico extends Persona implements Cloneable, Serializable {
	
	/**
	 * ID para la serializaci�n
	 */
	private static final long serialVersionUID = 6426724970747922207L;

	/**
	 * Atributo que almacena el n�mero de colegiado del m�dico
	 */
    private String codmedico;
    
	/**
	 * Atributo que almacena la especialidad del m�dico
	 */
	private Especialidad especialidad;


	/**
	 * Override del m�todo abstracto equivalente de la clase padre Persona
	 * Metodo que permite obtener el nombre completo del m�dico con el tratamiento de Doctor por delante
	 * @return Cadena de texto que representa el nombre de la persona
	 */
	@Override
	public String getNombreCompleto() {
		if (super.getSexo() == Sexo.MUJER )
			return  "Doctora " + super.getNombre() +  " " + super.getApellido1() +  " " + super.getApellido2();
		else
			return  "Doctor " + super.getNombre() +  " " + super.getApellido1() +  " " + super.getApellido2();
	}
	
	/**
	 * M�todo que permite obtener el n�mero de colegiado
	 * @return Cadena de texto que representa el n�mero de colegiado
	 */
	public String getcodmedico(){
		return this.codmedico;
	}
	
	/**
	 * M�todo que permite modificar el n�mero de colegiado
	 * @param codmedico Cadena de texto que representa el nuevo n�mero de colegiado
	 */
	public void setCodmedico(String codmedico){
		this.codmedico=codmedico;
	}
	
	/**
	 * M�todo que permite obtener la especialidad 
	 * @return Elemento de enumeraci�n de tipo Especialidad que representa la especialidad
	 */
	public Especialidad getEspecialidad() {
		return this.especialidad;
	}

	/**
	 * M�todo que permite modificar la especialidad 
	 * @param especialidad Elemento de enumeraci�n de tipo Especialidad que representa la nueva especialidad
	 */
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	/**
	 * Constructor por defecto de la clase;
	 */
	public Medico() {
		super();
	    codmedico = "";
		especialidad = null;
	}
	
	/**
	 * Constructor de la clase con par�metros
	 * @param codmedico Cadena de texto con n�mero de colegiado
	 * @param especialidad Elemento de la enumeraci�nde tipo Especialidad
	 * @param nombre Cadena de texto con el nombre
	 * @param apellido Cadena de texto con el apellido
	 * @param dni Cadena de texto con el dni
	 * @param sexo Elemento de la enumeraci�n de tipo Sexo
	 * @param fechanacimiento Date con la fecha de nacimiento
	 */
	public Medico(String codmedico, Especialidad especialidad, String nombre, String apellido1, String apellido2, String dni, Sexo sexo, Date fechaNacimiento){
		super(nombre, apellido1, apellido2, dni, sexo, fechaNacimiento);
		this.codmedico=codmedico;
		this.especialidad=especialidad;
	}
}
		
