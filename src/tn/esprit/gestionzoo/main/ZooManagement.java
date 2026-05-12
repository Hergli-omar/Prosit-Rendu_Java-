package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    ZooManagement(){}

    public static void main(String[] args) {

        Terrestrial lion = new Terrestrial(AnimalFamily.FELIDAE, "Simba", 1, true, 4);
        Terrestrial giraffe = new Terrestrial(AnimalFamily.GIRAFFIDAE, "zohra", 15, true, 4);
        Dauphin orca = new Dauphin(AnimalFamily.DELPHINIDAE, "wiw", 6, "Océan", 35.5f);
        Terrestrial turtle = new Terrestrial(AnimalFamily.TURTLES, "Frank", 120, false, 4);

        Zoo myZoo1 = new Zoo("friguia", "Sousse");
        Zoo myZoo2 = new Zoo("jungle", "Gafsa");
        Zoo myZoo3 = new Zoo("belvidere", "Tunis");

        Dauphin d1 = new Dauphin(AnimalFamily.DELPHINIDAE, "Flipper", 5, "Océan Atlantique", 25.5f);
        Terrestrial temse7 = new Terrestrial(AnimalFamily.LIZARDS, "crocodile", 22, false, 4);

        myZoo1.addAquaticAnimal(d1);

        Pingouin betri91 = new Pingouin(AnimalFamily.BATARI9, "bomba", 3, false, "ocean", 15.3f);
        Pingouin betri92 = new Pingouin(AnimalFamily.BATARI9, "bomba", 3, false, "ocean", 15.5f);
        Pingouin betri93 = new Pingouin(AnimalFamily.BATARI9, "hehe", 3, false, "ocean", 16f);
        myZoo1.addAquaticAnimal(betri91);
        myZoo1.addAquaticAnimal(betri92);
        myZoo1.addAquaticAnimal(betri93);
        
        System.out.println(myZoo1.maxPenguinSwimmingDepth());
        myZoo1.displayNumberOfAquaticByType();

        System.out.println(betri91.equals(betri92));

        // --- Test Instructions 32, 33, 34 ---
        System.out.println("\n--- Tests d'ajout d'animaux avec Exceptions ---");
        Zoo myZooTest = new Zoo("TestZoo", "TestCity");
        Terrestrial validAnimal1 = new Terrestrial(AnimalFamily.FELIDAE, "Lion", 5, true, 4);
        Terrestrial invalidAgeAnimal = new Terrestrial(AnimalFamily.FELIDAE, "Tiger", -2, true, 4);
        Terrestrial validAnimal2 = new Terrestrial(AnimalFamily.FELIDAE, "Cheetah", 3, true, 4);
        Terrestrial validAnimal3 = new Terrestrial(AnimalFamily.FELIDAE, "Panther", 4, true, 4);
        Terrestrial validAnimal4 = new Terrestrial(AnimalFamily.FELIDAE, "Leopard", 2, true, 4);

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

        // --- Polymorphisme et tests ---
        System.out.println("\n--- Tests de Polymorphisme et interfaces ---");
        Animal a = new Dauphin(AnimalFamily.DELPHINIDAE, "PolymorphDolphin", 4, "Ocean", 30.0f);
        
        // Appel méthode polymorphique abstraite
        a.makeSound();

        // Downcasting pour appeler la méthode spécifique swim()
        if (a instanceof Aquatic) {
            ((Aquatic) a).swim();
        }

        // Utilisation des interfaces alimentaires
        if (a instanceof Carnivore) {
            ((Carnivore) a).eatMeat();
        }

        System.out.println("--- Test Terrestrial ---");
        lion.makeSound();
        lion.walk();
        lion.eatMeat();
        lion.eatPlant();
    }
}