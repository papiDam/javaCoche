//Creacion de clase tablero con sus atributos
public class Tablero{
  private String tablero [][];
  private int filas;
  private int columnas;
  private Ficha matriz;

//Creacion de los constructores
  public Tablero(){
    this.filas = 3;
    this.columnas = 3;
    this.tablero = new String[filas][columnas];
    }

  public Tablero(int filas, int columnas){
    this.filas = filas;
    this.columnas = columnas;
    this.tablero = new String [filas][columnas];
    }

// Metodo para rellenar el tablero con X
  public void rellenarTablero(){
    for(int i=0; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j++){
        this.tablero[i][j] = "X";
      }
    }
  }

// Metodo para rellenar el tablero con X y O como pide el ejercicio, se que asi no es pero me imprime lo que pides
  public void rellenarTablero2(){
    int posicion = 0;
    for(int i=0; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j++){
        if(posicion % 2 == 0 ){
          this.tablero[i][j] = "X";
        }else if(posicion % 2 == 1){
          this.tablero[i][j] = "O";
        }
        posicion++;
      }
    }
  }
/* No se como rellenarlo con numeros cuando la matriz es de tipo string

  public void rellenarTableroPosicion(){
    int posicion = 0;
    for(int i=0; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j++){
        this.tablero[i][j] = posicion;
        posicion++;
      }
    }
  }
*/

//Metodos para imprimir el tablero
  public void imprimir(){
    lineaH();
    lineaH();
      for(int i=0; i < this.filas ; i++){
        System.out.print("|");
          for (int j = 0; j < this.columnas; j++){
            System.out.print(this.tablero[i][j]);
            System.out.print("|");
      }
      System.out.println();
      lineaH();
      lineaH();
    }
  }

  public void lineaH(){
    for(int i=0; i < this.columnas ; i++){
      System.out.print("--");
    }
    System.out.println("-");
  }


}
