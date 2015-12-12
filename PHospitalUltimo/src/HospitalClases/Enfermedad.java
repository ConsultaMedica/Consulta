package HospitalClases;

import java.io.Serializable;




/**
 * Clase que representa a una enfermedad
 * 
 */
public class Enfermedad implements Cloneable, Serializable {

	/**
	 * ID para la serialización
	 */
	private static final long serialVersionUID = -7580660896729633016L;

	/**
	 * Atributo que almacena el nombre de la enfermedad
	 */
	private String nombre;
	
	/**
	 * Atributo que almacena si la enfermedad es crónica o no
	 */
	private boolean cronica;
	
	/**
	 * Atributo que almacena si la enfermedad es contagiosa o no
	 */
	private boolean contagiosa;
	
	/**
	 * Atributo que almacena si la enfermedad es hereditaria o no
	 */
	private boolean hereditaria;
	
	/**
	 * Atributo que almacena si la enfermedad es infecciosa o no
	 */
	private boolean infecciosa;
	
	/**
	 * Atributo que almacena si la enfermedad es degenerativa o no
	 */
	private boolean degenerativa;
	
	/**
	 * Metodo que permite obtener el nombre de la enfermedad 
	 * @return Cadena de texto que representa el nombre de la enfermedad 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que permite modificar el nombre de la enfermedad 
	 * @param nombre Cadena de texto que representa el nuevo nombre de la enfermedad 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que permite obtener si la enfermedad es crónica o no
	 * @return Boolean que indica si la enfermedad es crónica o no
	 */
	public boolean isCronica() {
		return cronica;
	}

	/**
	 * Metodo que permite modificar si la enfermedad es crónica o no
	 * @param cronica Boolean que indica si la enfermedad es crónica o no
	 */	
	public void setCronica(boolean cronica) {
		this.cronica = cronica;
	}

	/**
	 * Metodo que permite obtener si la enfermedad es contagiosa o no
	 * @return Boolean que indica si la enfermedad es contagiosa o no
	 */
	public boolean isContagiosa() {
		return contagiosa;
	}

	/**
	 * Metodo que permite modificar si la enfermedad es contagiosa o no
	 * @param contagiosa Boolean que indica si la enfermedad es contagiosa o no
	 */	
	public void setContagiosa(boolean contagiosa) {
		this.contagiosa = contagiosa;
	}

	/**
	 * Metodo que permite obtener si la enfermedad es hereditaria o no
	 * @return Boolean que indica si la enfermedad es hereditaria o no
	 */
	public boolean isHereditaria() {
		return hereditaria;
	}

	/**
	 * Metodo que permite modificar si la enfermedad es hereditaria o no
	 * @param hereditaria Boolean que indica si la enfermedad es hereditaria o no
	 */	
	public void setHereditaria(boolean hereditaria) {
		this.hereditaria = hereditaria;
	}

	/**
	 * Metodo que permite obtener si la enfermedad es infecciosa o no
	 * @return Boolean que indica si la enfermedad es infecciosa o no
	 */
	public boolean isInfecciosa() {
		return infecciosa;
	}

	/**
	 * Metodo que permite modificar si la enfermedad es infecciosa o no
	 * @param infecciosa Boolean que indica si la enfermedad es infecciosa o no
	 */	
	public void setInfecciosa(boolean infecciosa) {
		this.infecciosa = infecciosa;
	}

	/**
	 * Metodo que permite obtener si la enfermedad es degenerativa o no
	 * @return Boolean que indica si la enfermedad es degenerativa o no
	 */
	public boolean isDegenerativa() {
		return degenerativa;
	}

	/**
	 * Metodo que permite modificar si la enfermedad es degenerativa o no
	 * @param degenerativa Boolean que indica si la enfermedad es degenerativa o no
	 */	
	public void setDegenerativa(boolean degenerativa) {
		this.degenerativa = degenerativa;
	}

	/**
	 * Constructor por defecto de la clase;
	 */
	public Enfermedad() {
		this.nombre = "";
		this.cronica = false;
		this.contagiosa = false;
		this.hereditaria = false;
		this.infecciosa = false;
		this.degenerativa = false;
		
	}
	
	/**
	 * Constructor de la clase con parámetros
	 * @param nombre Cadena de texto con el nombre del medicamento 
	 * @param cronica Boolean que indica si la enfermedad es crónica o no
	 * @param contagiosa Boolean que indica si la enfermedad es contagiosa o no
	 * @param hereditaria Boolean que indica si la enfermedad es hereditaria o no
	 * @param infecciosa Boolean que indica si la enfermedad es infecciosa o no
	 * @param degenerativa Boolean que indica si la enfermedad es degenerativa o no
	 */
	public Enfermedad(String nombre, boolean cronica, boolean contagiosa, boolean hereditaria, boolean infecciosa, boolean degenerativa){
		this.nombre = nombre;
		this.cronica = cronica;
		this.contagiosa = contagiosa;
		this.hereditaria = hereditaria;
		this.infecciosa = infecciosa;
		this.degenerativa = degenerativa;
	}
	
	/**
	 * Metodo que me permite hacer la comparacion de dos objetos
	 * @return booleano que idica si son iguales o no
	 */
	/**public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Enfermedad param = (Enfermedad) obj;
		
		if (this.nombre == null) {
			if (param.nombre != null)
				return false;
		} else if (!this.nombre.equals(param.nombre))
			return false;
		
		if (this.cronica != param.cronica)
			return false;
					
		if (this.contagiosa != param.contagiosa)
			return false;			
		
		if (this.hereditaria != param.hereditaria)
			return false;			
		
		if (this.infecciosa != param.infecciosa)
			return false;			
		
		if (this.degenerativa != param.degenerativa)
			return false;			
		
		return true;
	}**/
}
