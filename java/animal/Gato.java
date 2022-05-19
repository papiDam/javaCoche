//clase gato implementa la interfaz animal_interfaz
class Gato extends Mascota implements Animal_interfaz{
  int banio = 0;
  int pipi = 0;
  int caca = 0;

  // he creado unos get para que se compruebe 
  // la veces que va al baño y lo que hace cada vez
  public int getBanio(){
    return this.banio;
  }
  public int getPipi(){
    return this.pipi;
  }
  public int getCaca(){
    return this.caca;
  }
  //metodos
  public String onomatopeya(){
    return "Miau";
  }
  public String durmiendo(){
    return "ZZzzzZZZ -> RRRRRRRRRRRRRRRRR";
  }
  public String comiendo(){
    String alimentacion = "Peces";
    return "Yo como "+ alimentacion;
  }
  public String excretando(){
    banio = banio += 1;
    if(banio%3 != 0){
      pipi +=1;
      return "pipi";
    }
    else{
      caca += 1;
      return "caca";
    }
  }
  public String follando(){
    int polvazo = (int)(Math.random()*10+1);
    if(polvazo <= 9){
      return "Le hicieron una barriguita amiga";
    }
    else{
      return "Siga prbando, no habido suerte";
    }

  }
}
