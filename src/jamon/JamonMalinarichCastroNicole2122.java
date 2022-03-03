
package jamon;

/**
 *Clase que reprenta a un <strong>jamón</strong>.
 * 
 * <p>Los objetos de esta clase permiten almacenar y gestionar la información sobre 
 * la categoria a la que pertenece el jamón, el precio, el stock asi como 
 * la compra venta de los jamones.</p> 
 * 
 * @author Nicole Malinarich
 * @version 1.0
 * @since 03/03/2022
 */
public class JamonMalinarichCastroNicole2122 {
    
    private String categoria;
    private double precio;
    private int mesesCuracion;
    private int stock;

    /**
     * Constructor sin argumentos
     */
    
    public JamonMalinarichCastroNicole2122 ()
    {
    }
    
    /**
     * Constructor con tres parámetros
     * @param cat categoria del jamón
     * @param precio precio del jamón
     * @param stock cantidad de stock
     */
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    // jamon
    
    public JamonMalinarichCastroNicole2122 (String cat, double precio, int stock)
    {
        this.categoria =cat;
        this.precio=precio;
        this.stock=stock;
    }
    /**
     * Asigna una categoria al jamón
     * @param cat categoria 
     */
   // Método para asignar la categoría del jamón
    public void asignarCategoria(String cat)
    {
        setCategoria(cat);
    }
    
    /**
     * Muestra la categoria a la que pertenece el jamón
     * @return devuelve la categoria
     */
    // Método que me devuelve la categoría del jamón
    public String obtenerCategoria()
    {
        return getCategoria();
    }
    /**
     * Muestra el stock de jamones disponibles en cada momento
     * @return devuelve el stock del jamones disponibles.
     */

    // Método que me devuelve el stock de jamones disponible en cada momento
     public int obtenerStock ()
    {
        return getStock();
    }
     
     /**
      * Comprar jamones 
      * @param cantidad cantidad de jamones que se van a comprar
      * @throws Exception el número de jamones es negativo
      */

    /* Método para comprar jamones Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de jamones");
        setStock(getStock() + cantidad);
    }
    /**
     * Vender jamones 
     * @param cantidad cantidad de jamones para vender
     * @param paisMalinarichCastroNicole2122 pais de origen
     * @throws Exception cantidad de jamones es negativo, no hay suficientes jamones para vender.
     */

    public void vender (int cantidad, String paisMalinarichCastroNicole2122) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de jamones");
        if (obtenerStock()< cantidad)
            throw new Exception ("No  hay suficientes jamones para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * Muestra la categoria a la que pertenece el jamón
     * @return devuelve la categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Cambia la categoria a la que pertenece el jamón
     * @param categoria nueva categoria 
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Muestra el precio del jamón
     * @return devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Cambia el precio
     * @param precio nuevo precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Muestra los meses de curación 
     * @return devuelve número de meses
     */
    public int getMesesCuracion() {
        return mesesCuracion;
    }

    /**
     * Cambia el número de meses de curación
     * @param mesesCuracion meses de curación 
     */
    public void setMesesCuracion(int mesesCuracion) {
        this.mesesCuracion = mesesCuracion;
    }

    /**
     * Muestra el stock de jamones disponibles
     * @return devuelve el stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Cambia el número de stock de jamones
     * @param stock número de jamones
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
