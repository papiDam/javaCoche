import java.util.Scanner;

class Main {
  public static void solucionAlternativa(int clientes){
    Albergue arrAlbergue[] = Albergue.values();
    double descuento = 0.85; //dscuento de 15% es *0.85
    double precio;

    double habitacionesNec;
    for (Albergue h : arrAlbergue){
      habitacionesNec = Math.ceil((double)clientes/(double)h.getPersonas());
      if (habitacionesNec <= h.getHabitaciones()){
      precio = habitacionesNec*h.getPrecio()*descuento;
      System.out.println("Con habitaciones de tipo "+h+" vas a necesitar "+ habitacionesNec + "habitaciones y el precio por dia con descuento " +precio+ " euros");
      }
    }
  }
  public static void main(String[] args){
    System.out.println("Alberto Sanjuan Perez");
    Scanner sc = new Scanner(System.in);
    Albergue arrAlbergue[] = Albergue.values();
    for (Albergue h : arrAlbergue)
    System.out.println(h);
    Albergue habitacion = Albergue.SIMPLE;
    String tipo;
    int clientes = 0;
    int noches = 0;
    boolean valido = true;
    double total = 0;

    //NOI SE COMO HACERLO PARA SALIR DEL BUCLE CUANDO LLEGA A 0 TODAS LAS HABITACIONES
    while(valido){
    System.out.println();
    System.out.println("Elije una de nuestra habitaciones: SIMPLE, DOBLE, TRIPLE, MULTIPLE");
    tipo = sc.nextLine();
    habitacion = Albergue.valueOf(tipo);
    System.out.println("Cuantas personas sois en total: ");
    clientes = Integer.parseInt(sc.nextLine());
    valido = habitacion.numPersValido(clientes);
    System.out.println("Cuantas noches se va a quedar? ");
    noches = Integer.parseInt(sc.nextLine());
  
    System.out.println("La habitacion vale en total: ");
    System.out.println(habitacion.precioTotal(noches));
    System.out.println("Cada persona tiene que pagar: ");
    System.out.println(habitacion.precioPersona(clientes,noches));
    //RESTO 1 HABITACION
    habitacion.setHabitaciones();
    //IMPRIMO LAS HABITACIONES QUE QUEDAN LIBRES DEL TIPO SELECCIONADO
    System.out.println("Habitaciones del tipo seleccionado libres");
    System.out.println(habitacion.getHabitaciones());
    //IMPRIMO TOTAL
    System.out.println("Total de ventas de reservas");
    total =  total += habitacion.precioTotal(noches);
    System.out.println(total);

    }

    /*if(habitacion.getHabitaciones()==0){
    System.out.println("Hemos cometido un error y no quedan habitaciones libre como la reservada");
    solucionAlternativa(clientes);
  }*/
  }
}
