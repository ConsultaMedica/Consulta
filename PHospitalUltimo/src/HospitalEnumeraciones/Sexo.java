package HospitalEnumeraciones;


/**
 * Clase que representa a los sexos existentes y su representaci�n en texto.
 * 
 */

public enum Sexo {
	
	MUJER,
	HOMBRE;
	
	
	/**
	 * M�todo que muestra la cadena de texto asociada a cada elemento de la enumerac�n de tipo Sexo
	 * @return Cadena de texto con la cadena de texto asociada a cada elemento de la enumerac�n de tipo Sexo
	 */
	@Override
	public String toString() {
		switch(this) {
		case MUJER:
			return "Mujer";
		case HOMBRE:
			return "Hombre";
		default:
			return "";
		}
	}
	
	/**
	 * Programa main para realizar las pruebas de la clase Sexo
	 * @param args
	 */
	public static void main(String[] args) {
		// Mostramos los Sexos
		System.out.println("Sexos almacenados:");
		System.out.println("------------------");
		for(Sexo sexo : Sexo.values()){
			System.out.println(sexo.toString());
		}		
		

	}
	

	
}
