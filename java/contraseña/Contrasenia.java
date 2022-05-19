abstract class Contrasenia{
  protected String pass;


  abstract boolean tamanioValido();
  abstract boolean caracterValido();

  public Contrasenia(String pass){
    this.pass = pass;
  }

  public String getPass(){
    return this.pass;
  }
  public void setPass(String pass){
    this.pass = pass;
  }
  abstract boolean noCaracterRep();
}
