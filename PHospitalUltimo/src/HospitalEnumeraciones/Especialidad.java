package HospitalEnumeraciones;

/**
 * Clase que representa a las especialidades m�dicas existentes y su representaci�n en texto.
 * 
 */

public enum Especialidad {
	
	ALERGOLOGIA,
	ANATOMIA_PATOLOGICA,
	ANESTESIOLOGIA,
	APARATO_DIGESTIVO,
	CARDIOLOGIA,
	CIRUGIA_GENERAL,
	CIRUGIA_MAXILOFACIAL,
	CIRUGIA_PLASTICA,
	DERMATOLOGIA,
	ENDOCRINOLOGIA,
	ESTOMATOLOGIA,
	GERIATRIA,
	GINECOLOGIA,
	HEMATOLOGIA,
	INMUNOLOGIA,
	MEDICINA_FAMILIAR,
	MEDICINA_INTERNA,
	NEFROLOGIA,
	NEUMOLOGIA,
	NEUROLOGIA,
	OFTALMOLOGIA,
	OTORRINOLARINGOLOGIA,
	PEDIATRIA,
	PSIQUIATRIA,
	RADIODIAGNOSTICO,
	REHABILITACION,
	REUMATOLOGIA,
	TRAUMATOLOGIA,
	UROLOGIA;


	/**
	 * M�todo que muestra la cadena de texto asociada a cada elemento de la enumerac�n de especialidades m�dicas
	 * @return Cadena de texto con la cadena de texto asociada a cada especialidad m�dica
	 */
	@Override
	public String toString() {
		switch(this) {
			case ANATOMIA_PATOLOGICA:
				return "Anatom�a patol�gica";
			case ANESTESIOLOGIA:
				return "Anestesiolog�a";
			case MEDICINA_FAMILIAR:
				return "Medicina familiar";
			case MEDICINA_INTERNA:
				return "Medicina interna";
			case NEUMOLOGIA:
				return "Neumolog�a";
			case NEUROLOGIA:
				return "Neurolog�a";
			case GINECOLOGIA:
				return "Ginecolog�a";
			case OFTALMOLOGIA:
				return "Oftalmolog�a";
			case OTORRINOLARINGOLOGIA:
				return "Otorrinolaringolog�a";
			case PEDIATRIA:
				return "Pediatr�a";
			case PSIQUIATRIA:
				return "Psiquiatr�a";
			case TRAUMATOLOGIA:
				return "Traumatolog�a";
			case UROLOGIA:
				return "Urolog�a";
			case ALERGOLOGIA:
				return "Alergolog�a";
			case APARATO_DIGESTIVO:
				return "Aparato digestivo";
			case CARDIOLOGIA:
				return "Cardiolog�a";
			case CIRUGIA_GENERAL:
				return "Cirug�a general";
			case CIRUGIA_MAXILOFACIAL:
				return "Cirug�a maxilofacial";
			case CIRUGIA_PLASTICA:
				return "Cirug�a pl�stica";
			case DERMATOLOGIA:
				return "Dermatolog�a";
			case ENDOCRINOLOGIA:
				return "Endocrinolog�a";
			case ESTOMATOLOGIA:
				return "Estomatolog�a";
			case GERIATRIA:
				return "Geriatr�a";
			case HEMATOLOGIA:
				return "Hematolog�a";
			case INMUNOLOGIA:
				return "Inmunolog�a";
			case NEFROLOGIA:
				return "Nefrolog�a";
			case RADIODIAGNOSTICO:
				return "Radiodiagn�stico";
			case REHABILITACION:
				return "Rehabilitaci�n";
			case REUMATOLOGIA:
				return "Reumatolog�a";
			default:
				return "";
		}
	}
}