package reservaHabitacion;

import java.util.Date;

public class Reserva {
	private int numero;
	private Date fechaEntrada;
	private Date fechaSalida;
	private int numPersonas;
	private Habitacion habitacion;
	private Cliente cliente;

	/**
	 * 
	 * Constructor de la clase Reserva.
	 * 
	 * @param numero       El número de la reserva.
	 * @param fechaEntrada La fecha de entrada de la reserva.
	 * @param fechaSalida  La fecha de salida de la reserva.
	 * @param numPersonas  El número de personas que ocuparán la habitación.
	 * @param habitacion   La habitación reservada.
	 * @param cliente      El cliente que ha realizado la reserva.
	 */
	public Reserva(int numero, Date fechaEntrada, Date fechaSalida, int numPersonas, Habitacion habitacion,
			Cliente cliente) {
		this.numero = numero;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.numPersonas = numPersonas;
		this.habitacion = habitacion;
		this.cliente = cliente;
	}

	/**
	 * 
	 * Método para obtener el número de la reserva.
	 * 
	 * @return El número de la reserva.
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * 
	 * Método para obtener la fecha de entrada de la reserva.
	 * 
	 * @return La fecha de entrada de la reserva.
	 */
	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * 
	 * Método para establecer la fecha de entrada de la reserva.
	 * 
	 * @param fechaEntrada La nueva fecha de entrada de la reserva.
	 */
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * 
	 * Método para obtener la fecha de salida de la reserva.
	 * 
	 * @return La fecha de salida de la reserva.
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * 
	 * Método para establecer la fecha de salida de la reserva.
	 * 
	 * @param fechaSalida La nueva fecha de salida de la reserva.
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * 
	 * Método para obtener el número de personas que ocuparán la habitación de la
	 * reserva.
	 * 
	 * @return El número de personas.
	 */
	public int getNumPersonas() {
		return numPersonas;
	}

	/**
	 * 
	 * Método para establecer el número de personas que ocuparán la habitación de la
	 * reserva.
	 * 
	 * @param numPersonas El nuevo número de personas.
	 */
	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	/**
	 * 
	 * Método para obtener el cliente que ha realizado la reserva.
	 * 
	 * @return El cliente de la reserva.
	 */
	public Cliente getCliente() {
		return cliente;
	}
}