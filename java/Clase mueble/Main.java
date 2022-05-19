import java.util.ArrayList;
import java.util.Arrays;

class Main{
    public static void main(String[] args){

        Mueble escritorioDefecto = new Mueble();
        Mueble escritorioParam = new Mueble("Aluminio",150,100,50);
        ArrayList<Integer>dimensionesNuevas = new ArrayList<Integer>(Arrays.asList(30,30,30));

        Mesa mesaDefecto = new Mesa();
        Mesa mesaParam = new Mesa("Hierro",50,50,50,3);
        ArrayList<Integer>dimensionesNuevas1 = new ArrayList<Integer>(Arrays.asList(40,40,40));

        Armario armarioDefecto = new Armario();
        Armario armarioParam= new Armario("Carton",300,100,250,"Corredera",5);
        ArrayList<Integer>dimensionesNuevas2 = new ArrayList<Integer>(Arrays.asList(60,60,60));

        System.out.println("Impresion del constructor por defecto de mueble");
        System.out.println(escritorioDefecto);

        System.out.println("\n");

        System.out.println("Impresion del constructor con parametros de mueble");
        System.out.println(escritorioParam);

        System.out.println("\n");

        System.out.println("Cambio valores Mueble con los sets");
        escritorioDefecto.setMaterial("Metal");
        escritorioDefecto.setDimensiones(dimensionesNuevas);

        System.out.println("\n");

        System.out.println("Impresion de escritorio con valores cambiados");
        System.out.println(escritorioDefecto);

        System.out.println("\n");

        System.out.println("Impresion de los valores de mueble con los gets");
        System.out.println(escritorioParam.getMaterial());
        System.out.println(escritorioParam.getDimensiones());

        System.out.println("\n");

        System.out.println("Impresion del constructor por defecto de mesa");
        System.out.println(mesaDefecto);

        System.out.println("\n");

        System.out.println("Impresion del constructor con parametros de mesa");
        System.out.println(mesaParam);

        System.out.println("\n");

        System.out.println("Cambio valores de mesa con los sets");
        mesaDefecto.setMaterial("Canhamo");
        mesaDefecto.setDimensiones(dimensionesNuevas1);
        mesaDefecto.setMesa(8);

        System.out.println("\n");

        System.out.println("Impresion de mesa con valores cambiados");
        System.out.println(mesaDefecto);

        System.out.println("\n");

        System.out.println("Impresion de los valores de mesa con los gets");
        System.out.println(mesaParam.getMaterial());
        System.out.println(mesaParam.getDimensiones());
        System.out.println(mesaParam.getMesa());

        System.out.println("\n");

        System.out.println("Impresion del constructor por defecto de armario");
        System.out.println(armarioDefecto);

        System.out.println("\n");

        System.out.println("Impresion del constructor con parametros de armario");
        System.out.println(armarioParam);

        System.out.println("\n");

        System.out.println("Cambio valores de armario con los sets");
        armarioDefecto.setMaterial("Platino");
        armarioDefecto.setDimensiones(dimensionesNuevas2);
        armarioDefecto.setTipoPuerta("Tijera");
        armarioDefecto.setNumBaldas(2);

        System.out.println("\n");

        System.out.println("Impresion de armario con valores cambiados");
        System.out.println(armarioDefecto);

        System.out.println("\n");

        System.out.println("Impresion de los valores de armario con los gets");
        System.out.println(armarioParam.getMaterial());
        System.out.println(armarioParam.getDimensiones());
        System.out.println(armarioParam.getTipoPuerta());
        System.out.println(armarioParam.getNumBaldas());


    }
}
