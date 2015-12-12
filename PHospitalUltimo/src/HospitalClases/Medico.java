package HospitalClases;

import java.io.Serializable;
import java.util.Date;

import HospitalEnumeraciones.Especialidad;
import HospitalEnumeraciones.Sexo;

/**
 * Clase que representa a un médico. Hereda de la clase Persona.
 * 
 * @author Ainhoa Goirigolzarri
 *
 */

public class Medico extends Persona implements Cloneable, Serializable {
	
	/**
	 * ID para la serialización
	 */
	private static final long serialVersionUID = 6426724970747922207L;

	/**
	 * Atributo que almacena el número de colegiado del médico
	 */
    private String codmedico;
    
	/**
	 * Atributo que almacena la especialidad del médico
	 */
	private Especialidad especialidad;


	/**
	 * Override del método abstracto equivalente de la clase padre Persona
	 * Metodo que permite obtener el nombre completo del médico con el tratamiento de Doctor por delante
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
	 * Método que permite obtener el número de colegiado
	 * @return Cadena de texto que representa el número de colegiado
	 */
	public String getcodmedico(){
		return this.codmedico;
	}
	
	/**
	 * Método que permite modificar el número de colegiado
	 * @param codmedico Cadena de texto que representa el nuevo número de colegiado
	 */
	public void setCodmedico(String codmedico){
		this.codmedico=codmedico;
	}
	
	/**
	 * Método que permite obtener la especialidad 
	 * @return Elemento de enumeración de tipo Especialidad que representa la especialidad
	 */
	public Especialidad getEspecialidad() {
		return this.especialidad;
	}

	/**
	 * Método que permite modificar la especialidad 
	 * @param especialidad Elemento de enumeración de tipo Especialidad que representa la nueva especialidad
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
	 * Constructor de la clase con parámetros
	 * @param codmedico Cadena de texto con número de colegiado
	 * @param especialidad Elemento de la enumeraciónde tipo Especialidad
	 * @param nombre Cadena de texto con el nombre
	 * @param apellido Cadena de texto con el apellido
	 * @param dni Cadena de texto con el dni
	 * @param sexo Elemento de la enumeración de tipo Sexo
	 * @param fechanacimiento Date con la fecha de nacimiento
	 */
	public Medico(String codmedico, Especialidad especialidad, String nombre, String apellido1, String apellido2, String dni, Sexo sexo, Date fechaNacimiento){
		super(nombre, apellido1, apellido2, dni, sexo, fechaNacimiento);
		this.codmedico=codmedico;
		this.especialidad=especialidad;
	}
}
		
