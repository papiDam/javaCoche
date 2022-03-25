public class Matriz{
  private int matriz [][];
  private int filas;
  private int columnas;

  public Matriz(){
    this.filas = 8;
    this.columnas = 8;
    this.matriz = new int[filas][columnas];
    rellenarMatrizPalabra(" ");
  }
  public Matriz(int filas, int columnas){
    this.filas = filas;
    this.columnas = columnas;
    this.matriz = new int [filas][columnas];
  }

  public void rellenarMatriz(int numero){
    for(int i=0; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = numero;
      }
    }
  }

  public void rellenarMatrizPalabra(String palabra){
    for(int i=0; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = palabra;
      }
    }
  }

  public void rellenarMatrizFila(){
    for(int i=0; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = i;
      }
    }
  }

  public void rellenarMatrizFilaPorColumna(){
    for(int i=0; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = i*j;
      }
    }
  }

  public void rellenarMatrizFilaMasColumna(){
    for(int i=0; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = i+j;
      }
    }
  }

  public void rellenarMatrizColumna(){
    for(int i=0; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = j;
      }
    }
  }

  public void rellenarMatrizPosicion(){
    int posicion = 0;
    for(int i=0; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = posicion;
        posicion++;
      }
    }
  }

  public void lineaH(){
    for(int i=0; i < this.columnas ; i++){
      System.out.print("--");
    }
    System.out.println("-");
  }

  public void imprimir(){
    lineaH();
    lineaH();
      for(int i=0; i < this.filas ; i++){
        System.out.print("|");
          for (int j = 0; j < this.columnas; j++){
            System.out.print(this.matriz[i][j]);
            System.out.print("|");
      }
      System.out.println();
      lineaH();
      lineaH();
    }
  }
}
