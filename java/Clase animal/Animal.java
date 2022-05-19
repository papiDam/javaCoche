public class Animal{
  protected String especie;
  protected int numAnimales;
  protected String comidaFav;
  protected int numPatas;

  public Animal(){
    this.especie = "dementor";
    this.numAnimales = 300;
    this.comidaFav = "recuerdos felices";
    this.numPatas = 0;
  }
    public Animal(String especie,int numAnimales,String comidaFav,int numPatas){
      this.especie = especie;
      this.numAnimales = numAnimales;
      this.comidaFav = comidaFav;
      this.numPatas = numPatas;
    }
    public String getEspecie(){
      return this.especie;
    }
    public int getNumAnimales(){
      return this.numAnimales;
    }
    public String getComidaFav(){
      return this.comidaFav;
    }
    public int getNumPatas(){
      return this.numPatas;
    }
    public void setEspecie(String especie){
      this.especie = especie;
    }
    public void setNumAnimales(int numAnimales){
      this.numAnimales = numAnimales;
    }
    public void setComidaFav(String comidaFav){
      this.comidaFav = comidaFav;
    }
    public void setNumPatas(int numPatas){
      this.numPatas = numPatas;
    }
    public String toString(){
      return "-----Nombre especie-----\n"+this.especie+"\n-----Numero de animales-----\n"+this.numAnimales+"\n-----Comida Favorita-----\n"+this.comidaFav+"\n-----Numero de patas-----\n"+this.numPatas;
    }
    public String comidaFav(){
      return this.comidaFav;
    }
    public String chiste(){
      return "Por que cruzo el " + this.especie + " la carretera? Para llegar al otro lado";
    }
}
