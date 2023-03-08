package reservaHabitacion;
/**

Clase que representa a un cliente del hotel.
*/
public class Cliente {
	/**

	Número del cliente.
	*/
	private int numero;
	/**

	Nombre del cliente.
	*/
	private String nombre;
	/**

	Teléfono del cliente.
	*/
	private int telefono;
	/**

	Constructor de la clase Cliente.
	@param numero el número del cliente.
	@param nombre el nombre del cliente.
	@param telefono el teléfono del cliente.
	*/
	public Cliente(int numero, String nombre, int telefono) {
	this.numero = numero;
	this.nombre = nombre;
	this.telefono = telefono;
	}
	/**

	Método que devuelve el número del cliente.
	@return el número del cliente.
	*/
	public int getNumero() {
	return numero;
	}
	/**

	Método que devuelve el nombre del cliente.
	@return el nombre del cliente.
	*/
	public String getNombre() {
	return nombre;
	}
	/**

	Método que establece el nombre del cliente.
	@param nombre el nuevo nombre del cliente.
	*/
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	/**

	Método que devuelve el teléfono del cliente.
	@return el teléfono del cliente.
	*/
	public int getTelefono() {
	return telefono;
	}
	/**

	Método que establece el teléfono del cliente.
	@param telefono el nuevo teléfono del cliente.
	*/
	public void setTelefono(int telefono) {
	this.telefono = telefono;
	}
	}

