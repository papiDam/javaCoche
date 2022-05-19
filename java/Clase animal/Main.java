class Main{
    public static void main(String[] args){

        Animal miAnimal = new Animal();
        Animal tuAnimal = new Animal("Gato",7,"Tartaleta",4);

        Zorro miZorro = new Zorro();
        Zorro tuZorro = new Zorro("Zorro Iberico",15,"gallinas",4,3);

        Gallina miGallina = new Gallina();
        Gallina tuGallina = new Gallina("Gallina tricolor",25,"gusanitos",2,5,25);

        System.out.println("Impresion del constructor por defecto de animal");
        System.out.println(miAnimal);
        System.out.println(miAnimal.chiste());

        System.out.println("\n");

        System.out.println("Impresion del constructor con parametros de animal");
        System.out.println(tuAnimal);
        System.out.println(tuAnimal.chiste());

        System.out.println("\n");

        System.out.println("Cambio valores Animal con los sets");
        miAnimal.setEspecie("Centauro");
        miAnimal.setNumAnimales(200);
        miAnimal.setComidaFav("Hurones");
        miAnimal.setNumPatas(4);


        System.out.println("\n");

        System.out.println("Impresion de animal con valores cambiados");
        System.out.println(miAnimal);

        System.out.println("\n");

        System.out.println("Impresion de los valores de animal con los gets");
        System.out.println(tuAnimal.getEspecie());
        System.out.println(tuAnimal.getNumAnimales());
        System.out.println(tuAnimal.getComidaFav());
        System.out.println(tuAnimal.getNumPatas());

        System.out.println("\n");

        System.out.println("Impresion del constructor por defecto de zorro");
        System.out.println(miZorro);
        System.out.println(miZorro.chiste());

        System.out.println("\n");

        System.out.println("Impresion del constructor con parametros de zorro");
        System.out.println(tuZorro);
        System.out.println(tuZorro.chiste());

        System.out.println("\n");

        System.out.println("Cambio valores zorro con los sets");
        miZorro.setEspecie("Zorro Tibetano");
        miZorro.setNumAnimales(25);
        miZorro.setComidaFav("Gallinas de granja");
        miZorro.setNumPatas(4);
        miZorro.setDiasGranja(15);

        System.out.println("\n");

        System.out.println("Impresion de zorro con valores cambiados");
        System.out.println(miZorro);

        System.out.println("\n");

        System.out.println("Impresion de los valores de zorro con los gets");
        System.out.println(tuZorro.getEspecie());
        System.out.println(tuZorro.getNumAnimales());
        System.out.println(tuZorro.getComidaFav());
        System.out.println(tuZorro.getNumPatas());
        System.out.println(tuZorro.getDiasGranja());

        System.out.println("\n");

        System.out.println("Impresion del constructor por defecto de gallina");
        System.out.println(miGallina);
        System.out.println(miGallina.chiste());

        System.out.println("\n");

        System.out.println("Impresion del constructor con parametros de gallina");
        System.out.println(tuGallina);
        System.out.println(tuGallina.chiste());

        System.out.println("\n");

        System.out.println("Cambio valores gallina con los sets");
        miGallina.setEspecie("Gallina de pelea");
        miGallina.setNumAnimales(12);
        miGallina.setComidaFav("maiz");
        miGallina.setNumPatas(2);
        miGallina.setHuevosDia(8);
        miGallina.setNumDiaHuevos(10);

        System.out.println("\n");

        System.out.println("Impresion de gallina con valores cambiados");
        System.out.println(miGallina);

        System.out.println("\n");

        System.out.println("Impresion de los valores de zorro con los gets");
        System.out.println(tuGallina.getEspecie());
        System.out.println(tuGallina.getNumAnimales());
        System.out.println(tuGallina.getComidaFav());
        System.out.println(tuGallina.getNumPatas());
        System.out.println(tuGallina.getHuevosDias());
        System.out.println(tuGallina.getNumDiasHuevos());
        System.out.println(tuGallina.getHuevosTotales());


    }
}
