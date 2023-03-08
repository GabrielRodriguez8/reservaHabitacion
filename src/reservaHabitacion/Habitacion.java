package reservaHabitacion;
    /**

    Clase que representa una habitación de un hotel.
    */
    public class Habitacion {
	


	private int numero;
	private String estado;
	private int numCamas;

	/**

	Constructor de la clase Habitacion.
	@param numero número de la habitación.
	@param estado estado de la habitación.
	@param numCamas número de camas de la habitación.
	*/
	public Habitacion(int numero, String estado, int numCamas) {
	this.numero = numero;
	this.estado = estado;
	this.numCamas = numCamas;
	}
	/**

	Método que devuelve el número de la habitación.
	@return número de la habitación.
	*/
	public int getNumero() {
	return numero;
	}
	/**

	Método que devuelve el estado de la habitación.
	@return estado de la habitación.
	*/
	public String getEstado() {
	return estado;
	}
	/**

	Método que establece el estado de la habitación.
	@param estado nuevo estado de la habitación.
	*/
	public void setEstado(String estado) {
	this.estado = estado;
	}
	/**

	Método que devuelve el número de camas de la habitación.
	@return número de camas de la habitación.
	*/
	public int getNumCamas() {
	return numCamas;
	}
	/**

	Método que establece el número de camas de la habitación.
	@param numCamas nuevo número de camas de la habitación.
	*/
	public void setNumCamas(int numCamas) {
	this.numCamas = numCamas;
	}
	}

