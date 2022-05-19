enum Transporte{
  AVION(900,10),
  TREN(200,14),
  COCHE(120,12),
  BICICLETA(20,0);

  private double velocidad;
  private double precio;

  Transporte(double velocidad,double precio){
    this.velocidad = velocidad;
    this.precio = precio;
  }

  public double getVelocidad(){
    return this.velocidad;
  }
  public double getPrecio(){
    return this.precio;
  }

  public double tiempo(double distancia){
    double tiempoTotal = distancia/this.velocidad;
    double tiempoEspera = 1;
    if(this == AVION) tiempoTotal += tiempoEspera;
    return tiempoTotal;
  }

  public  double coste(double distancia){
    return (this.precio * distancia)/100;
  }
}
