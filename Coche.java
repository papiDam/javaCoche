class Coche{
  private Motor motorCoche;
  private Puerta puertaI;
  private Puerta puertaD;


  public Coche(){
    this.motorCoche = new Motor();
    this.puertaD = new Puerta();
    this.puertaI = new Puerta();
    }
    public String toString(){
      return this.motorCoche + "\n" + this.puertaD + "\n" + this.puertaI;
    }
}
