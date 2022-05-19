enum Albergue{
  SIMPLE(1,50,4 ),
  DOBLE(2,80,4),
  TRIPLE(3,100,4),
  MULTIPLE(6,150,4);

  private int personas;
  private double precio;
  private int habitaciones;

  Albergue(int personas, double precio,int habitaciones){
    this.personas = personas;
    this.precio = precio;
    this.habitaciones = habitaciones;
  }
  public int getPersonas(){
    return this.personas;
  }
  public double getPrecio(){
    return this.precio;
  }
  public int getHabitaciones(){
    return this.habitaciones;
  }
  public void setHabitaciones(){
    if (this.habitaciones > 0){
      this.habitaciones -= 1;
    }
  }
  public double precioPersona(int persona,int noches){
    return (noches * this.precio)/persona;
  }
  public double precioTotal(int noches){
    return this.precio * noches;
  }
  public boolean numPersValido(int clientes){
    return this.personas >= clientes;
  }
}
