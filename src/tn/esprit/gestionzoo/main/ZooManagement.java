//Instruction 19 : Organisation des packages
package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Animal;

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
       myZoo1.addAnimal(lion);
       myZoo1.addAnimal(lion);
       myZoo1.addAnimal(Giraffe);

        /*tn.esprit.gestionzoo.entities.Zoo gagnant = myZoo3.compareZoo(myZoo1, myZoo3);

        if (gagnant != null) {
            gagnant.displayZoo();
            gagnant.displayZooAnimals();
        } else {
            System.out.println("Égalité !");
        }*/

    }
}