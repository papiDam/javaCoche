public class Password{
  private int longitud;
  private String contrasenia;

  public Password(){
    this.longitud = 8;
    this.contrasenia = "ASD123re";
  }
  public Password(int longitud, String contrasenia){
    this.longitud = longitud;
    if (contrasenia.length() == longitud){
      this.contrasenia = contrasenia;
    }
    else if(contrasenia.length() < longitud){
      while (contrasenia.length()< longitud){
        contrasenia += "0";
      }
      this.contrasenia = contrasenia;
    }
    else{
      String passRecortada = "";
      for(int i = 0; i < longitud; i++){
        passRecortada += contrasenia.charAt(i);
      }
      this.contrasenia = passRecortada;
    }
  }
  public String toString(){
    return "el tamaño de la contraseña es " + this.longitud + " y la contraseña es "+ this.contrasenia;
  }
}
