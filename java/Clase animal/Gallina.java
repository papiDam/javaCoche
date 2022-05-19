public class Gallina extends Animal{
  private int huevosDia;
  private int numDiasHuevos;
  private int huevosTotales;

  public Gallina(){
    super();
    this.huevosDia = 3;
    this.numDiasHuevos = 15;
    this.huevosTotales = this.totalHuevos();
    }
    public Gallina(String especie,int numAnimales,String comidaFav,int numPatas,int huevosDia,int numDiasHuevos){
      super(especie,numAnimales,comidaFav,numPatas);
      this.huevosDia = huevosDia;
      this.numDiasHuevos = numDiasHuevos;
      this.huevosTotales = this.totalHuevos();
    }
    public int getHuevosDias(){
      return this.huevosDia;
    }
    public int getNumDiasHuevos(){
      return this.numDiasHuevos;
    }
    public int getHuevosTotales(){
      return this.huevosTotales;
    }
    public void setHuevosDia(int huevosDia){
      this.huevosDia = huevosDia;
    }
    public void setNumDiaHuevos(int numDiasHuevos){
      this.numDiasHuevos = numDiasHuevos;
    }
    public String toString(){
      return super.toString()+"\n-----Huevos por dia-----\n"+this.huevosDia+"\n-----Numero de dias que pone huevos-----\n"+this.numDiasHuevos+"\n-----Huevos totales-----\n"+this.huevosTotales;
    }
    public int totalHuevos(){
      return this.huevosDia * numDiasHuevos;
    }
    public String chiste(){
      return "¿Para qué cruzó la gallina la carretera? Para llegar al otro lado.";
    }
}
