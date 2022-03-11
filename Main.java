class Main{
    public static void main(String[] args){
      //Creacion de objetos
      Motor miMotor = new Motor();
      Puerta miPuerta = new Puerta();
      Puerta miPuerta2 = new Puerta();
      Coche miCoche = new Coche();
      Ventana ventanaDerCoche = new Ventana();
/*
      miMotor.encender();
      miPuerta.getVentanaPuerta().abrir();
      miPuerta2.abrir();



      System.out.println(miPuerta);
      miPuerta.abrir();
      System.out.println(miPuerta);
      miPuerta.getVentanaPuerta().abrir();
      System.out.println(miPuerta);
      miPuerta.cerrar();
      System.out.println(miPuerta);

      System.out.println(miMotor);
      System.out.println(miPuerta);
      System.out.println(miPuerta2);
*/

      System.out.println(miCoche.getMotor());
      System.out.println(miCoche.getPuertaD());
      miCoche.getPuertaD().abrir();
      System.out.println(miCoche.getPuertaD());
      System.out.println(miCoche.getPuertaD().getVentanaPuerta());
      miCoche.getPuertaD().getVentanaPuerta().abrir();
      System.out.println(miCoche.getPuertaD().getVentanaPuerta());

      ventanaDerCoche = miCoche.getPuertaD().getVentanaPuerta();
      ventanaDerCoche.abrir();
      System.out.println(ventanaDerCoche);
      ventanaDerCoche.cerrar();
      System.out.println(ventanaDerCoche);


      miCoche.abrirVentanaDer();
      System.out.println(miCoche);

    }
  }
