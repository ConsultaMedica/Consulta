package HospitalClases;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que representa una cita para una consulta o prueba m�dica.
 *
 */
public class Calendario implements Cloneable, Serializable {

	/**
	 * ID para la serializaci�n
	 */
	private static final long serialVersionUID = -2352604661284255884L;

	/**
	 * Atributo que almacena el dia de la siguiente cita
	 */
	private Date dia;
	
	/**
	 * Atributo que almacena del mes de la siguiente cita
	 */
	private Date mes;
	
	/**
	 * Atributo que almacena el a�o de la siguiente cita
	 */
	private Date a�o;
	
	/**
	 * Atributo que almacena un objeto de tipo Medico con el m�dico 
	 */
	private Medico medico;
	
	/**
	 * Atributo que almacena un objeto de tipo Paciente con el paciente 
	 */
	private Paciente paciente;
	
	/**
	 * M�todo que permite obtener el dia de la cita
	 * @return Date con el dia de la cita
	 */
	public Date getdia() {
		return this.dia;
	}

	/**
	 * M�todo que permite modificar el dia de la cita
	 * @param fecha Nuevo dia de la cita
	 */
	public void setdia(Date dia) {
		this.dia = dia;
	}
	
	/**
	 * M�todo que permite obtener el mes de la cita
	 * @return Date con el mes de la cita
	 */
	public Date getmes() {
		return this.mes;
	}

	/**
	 * M�todo que permite modificar el mes de la cita
	 * @param fecha Nuevo mes de la cita
	 */
	public void setmes(Date mes) {
		this.mes = mes;
	}
	
	/**
	 * M�todo que permite obtener el a�o de la cita
	 * @return Date con el a�o de la cita
	 */
	public Date geta�o() {
		return this.a�o;
	}

	/**
	 * M�todo que permite modificar el a�o de la cita
	 * @param fecha Nuevo a�o de la cita
	 */
	public void seta�o(Date a�o) {
		this.a�o = a�o;
	}

	/**
	 * M�todo que permite obtener el m�dico que atiende la cita
	 * @return Objeto de tipo Medico con el m�dico que atiende la cita
	 */
	public Medico getmedico() {
		return this.medico;
	}

	/**
	 * M�todo que permite modificar el m�dico que atiende la cita
	 * @param medico Objeto de tipo Medico con el nuevo m�dico que atiende la cita
	 */
	public void setmedico(Medico medico) {
		this.medico = medico;
	}

	/**
	 * M�todo que permite obtener el paciente que solicita la cita
	 * @return Objeto de tipo Paciente con el paciente que solicita la cita
	 */
	public Paciente getpaciente() {
		return this.paciente;
	}

	/**
	 * Metodo que permite modificar el paciente que solicita la cita
	 * @param paciente Objeto de tipo Paciente con el nuevo paciente que solicita la cita
	 */
	public void setpaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	/**
	 * Constructor por defecto de la clase;
	 */
	public Calendario() {
		  this.dia = new Date();
		  this.mes = new Date();
		  this.a�o = new Date();
		  this.medico = new Medico();
		  this.paciente = new Paciente();
	}

	/**
	 * Constructor de la clase con par�metros
	 * @param fecha Date con la fecha y hora de la cita
	 * @param medico Objeto de tipo Medico que representa al m�dico que atiende la cita
	 * @param paciente Objeto de tipo Paciente que representa al paciente que solicita la cita
	 */
	public Calendario(Date dia, Date mes, Date a�o, Medico medico, Paciente paciente){
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
		this.medico = medico;
		this.paciente = paciente;
	}

	
	
}
		
