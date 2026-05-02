import java.util.Scanner;
public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    ZooManagement(){}

    public static void main(String[] args) {


        Animal lion=new Animal("Felids","Simba",1,true);
        Animal Giraffe=new Animal("Giraffidae","zohra",15,true);
        Animal Orca=new Animal("Delphinidés","wiw",6,true);
        Animal turtle=new Animal("turtles","Frank",120,false);

        Zoo myZoo1=new Zoo("friguia","Sousse");
        Zoo myZoo2=new Zoo("jungle","Gafsa");
        Zoo myZoo3=new Zoo("belvidere","Tunis");


       myZoo1.addAnimal(lion);
       myZoo2.addAnimal(lion);
       myZoo3.addAnimal(lion);
       myZoo3.addAnimal(Giraffe);

        Zoo gagnant = myZoo3.compareZoo(myZoo1, myZoo3);

        if (gagnant != null) {
            gagnant.displayZoo();
            gagnant.displayZooAnimals();
        } else {
            System.out.println("Égalité !");
        }

    }
}