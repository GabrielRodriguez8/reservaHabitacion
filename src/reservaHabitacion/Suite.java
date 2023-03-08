package reservaHabitacion;

/**

Clase que representa una habitación suite en el hotel.

Hereda los atributos de la clase Habitacion.
*/
public class Suite extends Habitacion {
private int metros;
private String servicios;

/**

Constructor de la clase Suite.
@param numero El número de la habitación.
@param estado El estado de la habitación.
@param numCamas El número de camas en la habitación.
@param metros Los metros cuadrados de la habitación.
@param servicios Los servicios adicionales de la habitación.
*/
public Suite(int numero, String estado, int numCamas, int metros, String servicios) {
super(numero, estado, numCamas);
this.metros = metros;
this.servicios = servicios;
}
/**

Obtiene los metros cuadrados de la habitación.
@return Los metros cuadrados de la habitación.
*/
public int getMetros() {
return metros;
}
/**

Establece los metros cuadrados de la habitación.
@param metros Los metros cuadrados de la habitación.
*/
public void setMetros(int metros) {
this.metros = metros;
}
/**

Obtiene los servicios adicionales de la habitación.
@return Los servicios adicionales de la habitación.
*/
public String getServicios() {
return servicios;
}
/**

Establece los servicios adicionales de la habitación.
@param servicios Los servicios adicionales de la habitación.
*/
public void setServicios(String servicios) {
this.servicios = servicios;
}
}