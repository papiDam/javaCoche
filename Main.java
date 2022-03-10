class Main{
    public static void main(String[] args){ 
      
      Motor miMotor = new Motor();
      Ventana miVentana = new Ventana();
      Puerta miPuerta = new Puerta();

      miMotor.encender();
      miVentana.abrir();
      miPuerta.getVentanaPuerta().abrir();


      System.out.println(miMotor.getEncendido());
      System.out.println(miVentana.getEstado());
      System.out.println(miPuerta.getVentanaPuerta().getEstado());
      
      
    }
  }