package HospitalClases;
import java.io.Serializable;

/**
 * Clase que representa a un medicamento.
 * 
 */

public class Medicamento implements Cloneable, Serializable {
	
	/**
	 * ID para la serialización
	 */
	private static final long serialVersionUID = -4526187736257092754L;

	/**
	 * Atributo que almacena el código único del medicamento
	 */
	private String codigo;
		
	/**
	 * Atributo que almacena el nombre del medicamento
	 */
	private String nombre;
	
	/**
	 * Atributo que almacena el nombre del laboratorio que lo fabrica
	 */
	private String laboratorio;
		
	/**
	 * Atributo que almacena si el medicamento es un genérico o no
	 */
	private boolean generico;
	
	/**
	 * Atributo que almacena si el medicamento solo se vende con receta médica
	 */
	private boolean ventaConReceta;
	
	/**
	 * Atributo que almacena el número de unidades que trae el medicamento 
	 */
	private int unidades;

	/**
	 * Metodo que permite obtener el código del medicamento 
	 * @return Cadena de texto que representa el código del medicamento 
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Metodo que permite modificar el código del medicamento 
	 * @param codigo Cadena de texto que representa el nuevo código del medicamento 
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Metodo que permite obtener el nombre del medicamento 
	 * @return Cadena de texto que representa el nombre del medicamento 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Metodo que permite modificar el nombre del medicamento 
	 * @param nombre Cadena de texto que representa el nuevo nombre del medicamento 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo que permite obtener el nombre del laboratorio que lo fabrica
	 * @return Cadena de texto que representa el nombre del laboratorio que lo fabrica
	 */
	public String getLaboratorio() {
		return laboratorio;
	}

	/**
	 * Metodo que permite modificar el nombre del laboratorio que lo fabrica
	 * @param laboratorio Cadena de texto que representa el nuevo nombre del laboratorio que lo fabrica
	 */
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	/**
	 * Metodo que permite obtener si el medicamento es un genérico o no
	 * @return Boolean que indica si el medicamento es un genérico o no
	 */
	public boolean isGenerico() {
		return this.generico;
	}

	/**
	 * Metodo que permite modificar si el medicamento es genérico o no
	 * @param generico Boolean que indica si el medicamento es un genérico o no
	 */	
	public void setGenerico(boolean generico) {
		this.generico = generico;
	}

	/**
	 * Metodo que permite obtener si el medicamento se vende con receta médica
	 * @return Boolean que indica si el medicamento se vende con receta médica
	 */
	public boolean isVentaConReceta() {
		return ventaConReceta;
	}

	/**
	 * Metodo que permite modificar si el medicamento se vende con receta médica
	 * @param ventaConReceta Boolean que indica si el medicamento se vende con receta médica
	 */	
	public void setVentaConReceta(boolean ventaConReceta) {
		this.ventaConReceta = ventaConReceta;
	}
	
	/**
	 * Metodo que permite obtener el número de unidades que trae el medicamento 
	 * @return Integer que representa el número de unidades que trae el medicamento 
	 */
	public int getUnidades() {
		return unidades;
	}

	/**
	 * Metodo que permite modificar el número de unidades que trae el medicamento 
	 * @param presentacion Integer que representa el número de unidades que trae el medicamento 
	 */	
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	/**
	 * Constructor por defecto de la clase;
	 */
	public Medicamento() {
		this.codigo = "";
		this.nombre = "";
		this.laboratorio = "";
		this.generico = true;
		this.ventaConReceta = true;
		this.unidades = 0;
	}
	
	/**
	 * Constructor de la clase con parámetros
	 * @param nombre Cadena de texto con el nombre del medicamento 
	 * @param generico Boolean que indica si el medicamento es un genérico o no
	 * @param presentacion Elemento de la enumeración de tipo Preparacion
	 */
	public Medicamento(String codigo, String nombre, String laboratorio, boolean generico, boolean ventaConReceta, int unidades){
		this.codigo = codigo;
		this.nombre = nombre;
		this.laboratorio = laboratorio;
		this.generico = generico;
		this.ventaConReceta = ventaConReceta;
		this.unidades = unidades;
	}
}
