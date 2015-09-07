
/**
 * Descripcion: Obtener el area de un cuadrado
 * author     : Jhonatan Rodriguez
 * Fecha      : 2015-09-06
 */
public class Cuadrado {   
   // Atributos
   private double ancho;
   private String color;

   // Constructor
   public Cuadrado() {                   // 1st Constructor
      ancho = 2;
      color = "blue";
   }
   public Cuadrado(double r) {           // 2nd Constructor
      ancho = r;
      color = "blue";
   }
   public Cuadrado(double r, String c) { // 3rd Constructor
      ancho = r;
      color = c;
   }

   // Metodos
   public double obtenerAncho() {
      return ancho;
   }
   public String obtenerColor() {
      return color;
   }
   public double obtenerArea() {
      return ancho * ancho ;
   }
}