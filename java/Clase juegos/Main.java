//Alberto Sanjuan Perez
class Main{
    public static void main(String[] args){
      System.out.println("Alberto Sanjuan Perez");
      Juego juegoDefecto = new Juego();
      Juego juegoParametros = new Juego("The witcher", 35);

      Videojuego videojuegoDe = new Videojuego();
      Videojuego videojuegoPa = new Videojuego("Call of duty", 75,"PlayStation");

      System.out.println("Impresion de juego por defecto");
      System.out.println(juegoDefecto);

      System.out.println("\n");

      System.out.println("Impresion de juego con parametros");
      System.out.println(juegoParametros);

      System.out.println("\n");

      System.out.println("Cambio valores juegoDefecto con los sets");
      juegoDefecto.setNombre("Skyrim");
      juegoDefecto.setPrecio(15);

      System.out.println("\n");

      System.out.println("Impresion de juegoDefecto con valores cambiados");
      System.out.println(juegoDefecto);

      System.out.println("\n");

      System.out.println("Impresion de los valores de juego con los gets");
      System.out.println(juegoParametros.getNombre());
      System.out.println(juegoParametros.getPrecio());

      System.out.println("\n");


      System.out.println("Impresion de videojuego por defecto");
      System.out.println(videojuegoDe);

      System.out.println("\n");


      System.out.println("Impresion de videojuego con parametros");
      System.out.println(videojuegoPa);

      System.out.println("\n");

      System.out.println("Cambio valores juegoDefecto con los sets");
      videojuegoDe.setNombre("Skyrim");
      videojuegoDe.setPrecio(15);
      videojuegoDe.setPlataforma("Xbox");

      System.out.println("\n");

      System.out.println("Impresion de videojuegoDe con valores cambiados");
      System.out.println(juegoDefecto);

      System.out.println("\n");

      System.out.println("Impresion de los valores de videojuegoPa con los gets");
      System.out.println(videojuegoPa.getNombre());
      System.out.println(videojuegoPa.getPrecio());
      System.out.println(videojuegoPa.getPlataforma());


    }
  }
