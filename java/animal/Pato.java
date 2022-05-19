//clase pato implementa la interfaz animal_interfaz
class Pato extends Mascota implements Animal_interfaz{
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
      return "Quack quack";
    }
    public String durmiendo(){
      return "ZZzzzZZZ";
    }
    public String comiendo(){
      String alimentacion = "lombrices";
      return "Yo como "+ alimentacion;
    }
    public String excretando(){
      banio = banio += 1;
      pipi = pipi += 1;
      caca = caca += 1;
      return "pipi y caca";
      }
    public String follando(){
      int polvazo = (int)(Math.random()*10+1);
      if(polvazo <= 6){
        return "Le hicieron una barriguita amiga pata";
      }
      else{
        return "Siga probando, no habido suerte";
      }
  
    }
  }