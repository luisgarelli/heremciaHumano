public class arquero extends humano {
  public String posicion;
  public int dorsal;
  
 public void atajar(){
     System.out.println("Su funcion preincipal es atajar los balones que vallan al arco");
 }    
 public void despejar(){
     System.out.println("por lo que debe despejar todos los tiro scon direccion al arco");
 }
 public static void main (String []args){ 
    arquero jugador1 = new arquero();
     jugador1.nombre = "Sergio";
    jugador1.club = "Manchester utd.";
    jugador1.posicion = "arquero";
    jugador1.dorsal = 1;
    
    System.out.println("El nombre del jugador es "+jugador1.nombre);
    System.out.println("Su equipo actual es "+jugador1.club);
    System.out.println("Su posicion es "+jugador1.posicion);
    System.out.println("La dorsal utilizada es la nro "+jugador1.dorsal);
    jugador1.atajar();
    jugador1.despejar();
    jugador1.jugarEnEquipo();
    System.out.println("jugando en equipo es mucho mas simple lograrlo");
}
}