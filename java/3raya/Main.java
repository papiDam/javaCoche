// Creacion del Main
class Main{
  public static void main(String[] args){
    Tablero tablero = new Tablero();

//Imprime el tablero relleno de X
    tablero.rellenarTablero();
    tablero.imprimir();

//Imprime el tablero relleno de X y O
    tablero.rellenarTablero2();
    tablero.imprimir();

/* Esto era para imprimir la posicion pero no me sale y lo dejo comentado
    tablero.rellenarTableroPosicion();
    tablero.imprimir();
*/

  }
}