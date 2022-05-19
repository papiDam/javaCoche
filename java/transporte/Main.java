class Main {
  public static void main(String[] args){
Transporte miTransporte, miTransporte2;
Transporte arrTransp[] = Transporte.values();
  for(Transporte t : arrTransp)
    System.out.println(t);

  System.out.println("Asignando vehiculo");
  miTransporte = Transporte.AVION;
  miTransporte2 = Transporte.COCHE;
  System.out.println(miTransporte);
  System.out.println(miTransporte2);
  System.out.println("Tiempo que tarda el avion en hacer el recorrido");
  System.out.println(Transporte.AVION.tiempo(2500));
  System.out.println("precio del viaje del avion");
  System.out.println(Transporte.AVION.coste(2500));
  System.out.println("Tiempo que tarda el COCHE en hacer el recorrido");
  System.out.println(Transporte.COCHE.tiempo(2500));
  System.out.println("precio del viaje del coche");
  System.out.println(Transporte.COCHE.coste(2500));
  }
}
