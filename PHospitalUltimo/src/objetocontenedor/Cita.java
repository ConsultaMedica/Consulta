package objetocontenedor;

import java.io.Serializable;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import HospitalClases.Medico;
import HospitalClases.Paciente;
import HospitalEnumeraciones.Especialidad;
import HospitalEnumeraciones.Sexo;


/**
 * Clase que representa una cita para una consulta o prueba m�dica.
 * 
 * @author Ainhoa Goirigolzarri
 *
 */
public class Cita implements Cloneable, Serializable {

	/**
	 * ID para la serializaci�n
	 */
	private static final long serialVersionUID = -2352604661284255884L;

	/**
	 * Atributo que almacena la fecha y hora de la cita
	 */
	private Date fecha;
	
	/**
	 * Atributo que almacena un objeto de tipo Medico con el m�dico 
	 */
	private Medico medico;
	
	/**
	 * Atributo que almacena un objeto de tipo Paciente con el paciente 
	 */
	private Paciente paciente;
	
	/**
	 * M�todo que permite obtener la fecha de la cita
	 * @return Date con la fecha de la cita
	 */
	public Date getFecha() {
		return this.fecha;
	}

	/**
	 * M�todo que permite modificar la fecha de la cita
	 * @param fecha Nueva fecha de la cita
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * M�todo que permite obtener el m�dico que atiende la cita
	 * @return Objeto de tipo Medico con el m�dico que atiende la cita
	 */
	public Medico getMedico() {
		return this.medico;
	}

	/**
	 * M�todo que permite modificar el m�dico que atiende la cita
	 * @param medico Objeto de tipo Medico con el nuevo m�dico que atiende la cita
	 */
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	/**
	 * M�todo que permite obtener el paciente que solicita la cita
	 * @return Objeto de tipo Paciente con el paciente que solicita la cita
	 */
	public Paciente getPaciente() {
		return this.paciente;
	}

	/**
	 * Metodo que permite modificar el paciente que solicita la cita
	 * @param paciente Objeto de tipo Paciente con el nuevo paciente que solicita la cita
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	/**
	 * Constructor por defecto de la clase;
	 */
	public Cita() {
		  this.fecha = new Date();
		  this.medico = new Medico();
		  this.paciente = new Paciente();
	}

	/**
	 * Constructor de la clase con par�metros
	 * @param fecha Date con la fecha y hora de la cita
	 * @param medico Objeto de tipo Medico que representa al m�dico que atiende la cita
	 * @param paciente Objeto de tipo Paciente que representa al paciente que solicita la cita
	 */
	public Cita(Date fecha, Medico medico, Paciente paciente){
		this.fecha = fecha;
		this.medico = medico;
		this.paciente = paciente;
	}
		
	/**
	 * M�todo de la interfaz Cloneable que permite realizar el clonado
	 */
	@Override
	public Object clone() {
		try {
			Cita citaClonada = (Cita)super.clone();
			return citaClonada;
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	
	/**
	 * M�todo que obtiene una cadena de texto con los datos de la cita
	 * @return Cadena de texto con los datos de la cita
	 */
	@Override
	public String toString() {
		String str = "";
		str += "--------------------------------------------------------------------------\n";
		str += "Fecha y Hora: " + new SimpleDateFormat("dd-MM-yyyy HH:mm").format(this.fecha) + " \n";
		str += "--------------------------------------------------------------------------\n";
		str += this.medico.getNombreCompleto() + "\n";
		str += "N�mero colegiado: " + this.medico.getcodmedico() + " \n";
		str += "Especialidad: " + this.medico.getEspecialidad() + " \n";
		str += "--------------------------------------------------------------------------\n";
		str += this.paciente.getNombreCompleto() + "\n";
		str += "N�mero Seguridad Social: " + this.paciente.getNumeroSeguridadSocial() + " \n";
		str += "DNI: " + this.paciente.getDni() + " \n";
		str += "Sexo: " + this.paciente.getSexo() + " \n";
		str += "Fecha Nacimiento: " + new SimpleDateFormat("dd-MM-yyyy").format(this.paciente.getFechaNacimiento()) + " \n";
		str += "Edad: " + this.paciente.edad() + " a�os \n";
		str += "--------------------------------------------------------------------------\n";
		return str;
	}
	

	/**
	 * Programa principal para realizar las pruebas de la clase Consulta
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Creamos un objeto de tipo Medico para incluirlo en la Cita
		Medico medicoDePrueba = new Medico();
		// Asignamos los datos a las propiedades del medico
		medicoDePrueba.setCodmedico("11111");
		medicoDePrueba.setEspecialidad(Especialidad.CARDIOLOGIA);
		medicoDePrueba.setDni("22222222Z");
		medicoDePrueba.setApellido1("OLEAGA");
		medicoDePrueba.setApellido2("GOMEZ");
		medicoDePrueba.setNombre("LEIRE");
		medicoDePrueba.setSexo(Sexo.MUJER);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		medicoDePrueba.setFechaNacimiento(sdf.parse("11-08-1990", new ParsePosition(0)));
		
		// Creamos un objeto de tipo Paciente
		Paciente pacienteDePrueba = new Paciente();
		// Asignamos los datos a las propiedades del paciente
		pacienteDePrueba.setNumeroSeguridadSocial("48111111");
		pacienteDePrueba.setDni("44444444Q");
		pacienteDePrueba.setApellido1("ALONSO");
		pacienteDePrueba.setApellido2("GARAY");
		pacienteDePrueba.setNombre("MARTA");
		pacienteDePrueba.setSexo(Sexo.MUJER);
		pacienteDePrueba.setFechaNacimiento(sdf.parse("19-01-1991", new ParsePosition(0)));

		// Creamos un objeto de tipo Cita
		Cita citaDePrueba = new Cita();
		System.out.println("Creamos un objeto de tipo Cita y visualizamos sus propiedades");
		
		citaDePrueba.setFecha(new Date());
		citaDePrueba.setMedico(medicoDePrueba);
		citaDePrueba.setPaciente(pacienteDePrueba);

		System.out.println(citaDePrueba);
		
		
	}

}
