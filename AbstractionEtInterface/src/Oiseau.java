public class Oiseau extends Animal implements Volant{
    @Override
    public void espece(){
        System.out.println("C'est un animal.");
    }
    public void typeAnimal(){
        System.out.println("c'est un oiseau.");
    }
    @Override
    public void manger(){
        System.out.println("l'oiseau mange des grains");
    }
    public void voler(){
        System.out.println(" L'oiseau vole avec les ailes");
    }
}
