package reservaHabitacion;

/**

Clase que representa una habitación doble en un hotel.

Hereda de la clase Habitacion.
*/
public class Doble extends Habitacion {

/** Indica si la habitación tiene minibar o no. */
private boolean minibar;

/**

Constructor de la clase Doble.
@param numero El número de la habitación.
@param estado El estado de la habitación.
@param numCamas El número de camas de la habitación.
@param minibar Indica si la habitación tiene minibar o no.
*/
public Doble(int numero, String estado, int numCamas, boolean minibar) {
super(numero, estado, numCamas);
this.minibar = minibar;
}
/**

Método getter para obtener el valor del atributo minibar.
@return true si la habitación tiene minibar, false en caso contrario.
*/
public boolean isMinibar() {
return minibar;
}
/**

Método setter para modificar el valor del atributo minibar.
@param minibar true si se desea que la habitación tenga minibar, false en caso contrario.
*/
public void setMinibar(boolean minibar) {
this.minibar = minibar;
}
}
