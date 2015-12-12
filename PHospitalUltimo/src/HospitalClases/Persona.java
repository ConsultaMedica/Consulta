package HospitalClases;

import java.util.Date;

import HospitalEnumeraciones.Sexo;

/**
 * Clase abstracta que representa a una persona.
 * 
 */

 abstract public class Persona {

	/**
	 * Atributo que almacena el nombre 
	 */
	private String nombre;

	/**
	 * Atributo que almacena el apellido1 
	 */
	private String apellido1;
	
	/**
	 * Atributo que almacena el apellido2 
	 */
	private String apellido2;
	
	/**
	 * Atributo que almacena el dni 
	 */
	private String dni;

	/**
	 * Atributo que almacena el sexo 
	 */
	private Sexo sexo;

	/**
	 * Atributo que almacena la fecha de nacimiento
	 */
	private Date fechaNacimiento;
		
	/**
	 * Constructor por defecto de la clase;
	 */
	public Persona() {
		nombre = "";
		apellido1 = "";
		apellido2 = "";
		dni = "";
		sexo = null;
		fechaNacimiento = null;
	}
	
	/**
	 * Constructor de la clase con par�metros
	 * @param nombre Cadena de texto con el nombre
	 * @param apellido1 Cadena de texto con el 1� apellido
	 * @param apellido1 Cadena de texto con el 2� apellido
	 * @param dni Cadena de texto con el dni
	 * @param sexo Elemento de la enumeraci�n de tipo Sexo
	 * @param fechanacimiento Date con la fecha de nacimiento
	 */
	public Persona(String nombre, String apellido1, String apellido2, String dni, Sexo sexo, Date fechaNacimiento){
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Metodo que permite obtener el nombre de la persona
	 * @return Cadena de texto que representa el nombre de la persona
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Metodo que permite modificar el nombre de la persona
	 * @param nombre Cadena de texto que representa el nuevo nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que permite obtener el 1� apellido de la persona
	 * @return Cadena de texto que representa el 1� apellido de la persona
	 */
	public String getApellido1() {
		return this.apellido1;
	}

	/**
	 * Metodo que permite modificar el 1� apellido de la persona
	 * @param apellido Cadena de texto que representa el nuevo 1� apellido de la persona
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * Metodo que permite obtener el 2� apellido de la persona
	 * @return Cadena de texto que representa el 2� apellido de la persona
	 */
	public String getApellido2() {
		return this.apellido2;
	}

	/**
	 * Metodo que permite modificar el 2� apellido de la persona
	 * @param apellido Cadena de texto que representa el nuevo 2� apellido de la persona
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	/**
	 * Metodo que permite obtener el nombre completo. En cada subclase se la a�adir� un prefijo.
	 * @return Cadena de texto que representa el nombre completo
	 */
	abstract public String getNombreCompleto() ;
	
	/**
	 * Metodo que permite obtener el dni de la persona
	 * @return Cadena de texto que representa el dni de la persona
	 */
	public String getDni() {
		return this.dni;
	}

	/**
	 * Metodo que permite modificar el dni de la persona
	 * @param dni Cadena de texto que representa el nuevo dni de la persona
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Metodo que permite obtener el sexo de la persona
	 * @return Elemento de enumeraci�n de tipo Sexo que representa el sexo de la persona
	 */
	public Sexo getSexo() {
		return this.sexo;
	}

	/**
	 * Metodo que permite modificar el sexo de la persona
	 * @param dni Elemento de enumeraci�n de tipo Sexo que representa el nuevo sexo de la persona
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	/**
	 * Metodo que permite obtener la fecha de nacimiento de la persona
	 * @return Date que representa la fecha de nacimiento de la persona
	 */
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	/**
	 * Metodo que permite modificar la fecha de nacimiento de la persona
	 * @param Date que representa la nueva fecha de nacimiento de la persona
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		}
	/**
	 * Metodo que permite obtener la edad de la persona
	 * @return int que representa la edad de la persona
	 */
	public int edad() {
		
		long fechaNacimientoMs = this.fechaNacimiento.getTime();
		long hoyMs = new Date().getTime();
		long diferencia = hoyMs - fechaNacimientoMs;
		double anyos = Math.floor((diferencia / (1000 * 60 * 60 * 24) / 365));
		return (int) anyos;
	}
 }
		