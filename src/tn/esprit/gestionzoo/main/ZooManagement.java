//Instruction 19 : Organisation des packages
package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

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

        //Aquatic balen=new Aquatic("7out","laboon",70,true,"one piece");
        Dauphin d1 = new Dauphin("Delphinidae", "Flipper", 5, "Océan Atlantique", 25.5f);
        Terrestrial temse7 =new Terrestrial("lizards","crocodile",22,false,4);

        /*System.out.println(balen);
        System.out.println(d1);
        System.out.println(betri9);
        System.out.println(temse7);

        balen.swim();
        d1.swim();
        betri9.swim();*/

        /*for(Aquatic aquatic:myZoo1.aquaticAnimals){
            aquatic.swim();
        }*/

        //myZoo1.addAquaticAnimal(balen);
        myZoo1.addAquaticAnimal(d1);
        //myZoo1.addAquaticAnimal(betri9);
        /*int i;
        for(i=0;i< myZoo1.compteurAquatic;i++){
                myZoo1.aquaticAnimals[i].swim();
        }*/
        Pingouin betri91 =new Pingouin("batari9","bomba",3,false,"ocean",15.3f);
        Pingouin betri92 =new Pingouin("batari9","bomba",3,false,"ocean",15.5f);
        Pingouin betri93 =new Pingouin("batari9","hehe",3,false,"ocean",16f);
        myZoo1.addAquaticAnimal(betri91);
        myZoo1.addAquaticAnimal(betri92);
        myZoo1.addAquaticAnimal(betri93);
        System.out.println(myZoo1.maxPenguinSwimmingDepth());
        myZoo1.displayNumberOfAquaticByType();

        System.out.println(betri91.equals(betri92));

        // --- Test Instructions 32, 33, 34 ---
        System.out.println("\n--- Tests d'ajout d'animaux avec Exceptions ---");
        Zoo myZooTest = new Zoo("TestZoo", "TestCity");
        Animal validAnimal1 = new Animal("Felids", "Lion", 5, true);
        Animal invalidAgeAnimal = new Animal("Felids", "Tiger", -2, true);
        Animal validAnimal2 = new Animal("Felids", "Cheetah", 3, true);
        Animal validAnimal3 = new Animal("Felids", "Panther", 4, true);
        Animal validAnimal4 = new Animal("Felids", "Leopard", 2, true);

        Animal[] animalsToTest = {validAnimal1, invalidAgeAnimal, validAnimal2, validAnimal3, validAnimal4};

        for (Animal a : animalsToTest) {
            try {
                System.out.println("\nTentative d'ajout d'un animal...");
                myZooTest.addAnimal(a);
            } catch (InvalidAgeException | ZooFullException e) {
                System.out.println("Erreur: " + e.getMessage());
            }
            System.out.println("Nombre d'animaux présents dans le zoo : " + myZooTest.compteur);
        }
    }
}