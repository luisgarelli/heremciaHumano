public class defensor extends humano {
    
  public String posicion;
  public int dorsal;
    public void defender (){
        System.out.println("Su tarea es que no lleguen los delanteros contrarios al arco ");
  }  
     public void cabecear(){
         System.out.println("despejando de cabeza todos los balones que lleguen por arriba");
  }  
    
public static void main (String []args){
    defensor jugador2 = new  defensor();
    jugador2.nombre = "Marcos";
    jugador2.club = "Manchester utd.";
    jugador2.posicion = "defensor";
    jugador2.dorsal = 5;

      System.out.println("El nombre del jugador es "+jugador2.nombre);   
      System.out.println("Defiende los colores del "+jugador2.club);
      System.out.println("Se desempeña en la posicion de "+jugador2.posicion);
      System.out.println("La dorsal utilizada es la numero "+jugador2.dorsal);
      jugador2.defender();
      jugador2.cabecear();
      jugador2.jugarEnEquipo();
      System.out.println("para lograrlo deben trabajar como equipo.");
}
}