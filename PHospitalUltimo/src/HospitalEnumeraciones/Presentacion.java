package HospitalEnumeraciones;

/**
 * Enumeración con los tipos de preparación posibles de los medicamentos.
 *
 */
public enum Presentacion {

	SOBRE,
	COMPRIMIDO,
	COMPRIMIDO_EFERVESCENTE,
	INYECCION,
	JARABE,
	POMADA,
	AMPOLLA,
	CAPSULA;
	
	/**
	 * Metodo que permite visualizar el texto asociado a cada tipo de preparación
	 * @return Cadena de texto con el texto asociado a cada tipo de preparación
	 */
	@Override
	public String toString() {
		switch(this) {
		case SOBRE:
			return "Sobre";
		case COMPRIMIDO:
			return "Comprimido";
		case COMPRIMIDO_EFERVESCENTE:
			return "Comprimido efervescente";
		case INYECCION:
			return "Inyección";
		case JARABE:
			return "Jarabe";
		case POMADA:
			return "Pomada";
		case AMPOLLA:
			return "Ampolla";
		case CAPSULA:
			return "Cápsula";
		default:
			return "";
		}
	}
	
	/**
	 * Programa main para realizar las pruebas de la clase Preparacion
	 * @param args
	 */
	public static void main(String[] args) {
		// Mostramos los tipos de preparación posibles de los medicamentos.
		System.out.println("Presentaciones de los medicamentos almacenadas:");
		System.out.println("----------------------------------------------");
		for(Presentacion presentacion : Presentacion.values()){
			System.out.println(presentacion.toString());
		}		
	}
}
