public class Zorro extends Animal{
  private int diasGranja;

  public Zorro(){
    super();
    this.diasGranja = 25;
  }
    public Zorro(String especie,int numAnimales,String comidaFav,int numPatas,int diasGranja){
      super(especie,numAnimales,comidaFav,numPatas);
      this.diasGranja = diasGranja;
    }
    public int getDiasGranja(){
      return this.diasGranja;
    }
    public void setDiasGranja(int diasGranja){
      this.diasGranja = diasGranja;
    }
    public String toString(){
      return super.toString()+"\n-----Numero de dias que viaja a la granaja-----\n"+this.diasGranja;
    }
    public int diasViaje(){
      return this.diasGranja + 1;
    }
    public String chiste(){
      return "¿Para qué cruzó el zorro la carretera? Para comerse a las gallinas.";
    }
}
