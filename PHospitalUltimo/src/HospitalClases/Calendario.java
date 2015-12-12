package HospitalClases;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que representa una cita para una consulta o prueba médica.
 *
 */
public class Calendario implements Cloneable, Serializable {

	/**
	 * ID para la serialización
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
	 * Atributo que almacena el año de la siguiente cita
	 */
	private Date año;
	
	/**
	 * Atributo que almacena un objeto de tipo Medico con el médico 
	 */
	private Medico medico;
	
	/**
	 * Atributo que almacena un objeto de tipo Paciente con el paciente 
	 */
	private Paciente paciente;
	
	/**
	 * Método que permite obtener el dia de la cita
	 * @return Date con el dia de la cita
	 */
	public Date getdia() {
		return this.dia;
	}

	/**
	 * Método que permite modificar el dia de la cita
	 * @param fecha Nuevo dia de la cita
	 */
	public void setdia(Date dia) {
		this.dia = dia;
	}
	
	/**
	 * Método que permite obtener el mes de la cita
	 * @return Date con el mes de la cita
	 */
	public Date getmes() {
		return this.mes;
	}

	/**
	 * Método que permite modificar el mes de la cita
	 * @param fecha Nuevo mes de la cita
	 */
	public void setmes(Date mes) {
		this.mes = mes;
	}
	
	/**
	 * Método que permite obtener el año de la cita
	 * @return Date con el año de la cita
	 */
	public Date getaño() {
		return this.año;
	}

	/**
	 * Método que permite modificar el año de la cita
	 * @param fecha Nuevo año de la cita
	 */
	public void setaño(Date año) {
		this.año = año;
	}

	/**
	 * Método que permite obtener el médico que atiende la cita
	 * @return Objeto de tipo Medico con el médico que atiende la cita
	 */
	public Medico getmedico() {
		return this.medico;
	}

	/**
	 * Método que permite modificar el médico que atiende la cita
	 * @param medico Objeto de tipo Medico con el nuevo médico que atiende la cita
	 */
	public void setmedico(Medico medico) {
		this.medico = medico;
	}

	/**
	 * Método que permite obtener el paciente que solicita la cita
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
		  this.año = new Date();
		  this.medico = new Medico();
		  this.paciente = new Paciente();
	}

	/**
	 * Constructor de la clase con parámetros
	 * @param fecha Date con la fecha y hora de la cita
	 * @param medico Objeto de tipo Medico que representa al médico que atiende la cita
	 * @param paciente Objeto de tipo Paciente que representa al paciente que solicita la cita
	 */
	public Calendario(Date dia, Date mes, Date año, Medico medico, Paciente paciente){
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.medico = medico;
		this.paciente = paciente;
	}

	
	
}
		
