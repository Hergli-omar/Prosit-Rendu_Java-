//Instruction 19 : Organisation des packages
package tn.esprit.gestionzoo.entities;

public class Zoo {
    public Animal[] animals=new Animal[3];

    public Aquatic[] aquaticAnimals=new Aquatic [10];

    //Instruction 18 : Encapsulation des attributs
    private String name ;
    public void setName(String name){
        if(name.trim().isEmpty())
            System.out.println("Le nom du zoo ne doit pas etre vide!!");
        else
            this.name=name;
    }
    public String getName(){
        return name;
    }

    public String city ;
    /*Instruction 14 : Constante pour le nombre de cages*/final int nbrCages;
    public int compteur=0;
    public int compteurAquatic=0;

    public int i;
    public Zoo(){
        this.nbrCages = 3;
    }
    // Instruction 6 : Constructeurs paramétrés
    public Zoo( String name,String city){
        this.name=name;
        this.city=city;
        this.nbrCages = 3;
    }
    //Instruction 8 : Méthode displayZoo():Q1
    public void displayZoo(){
        System.out.println("le nom du zoo est: "+name+" située à "+city+" comporte "+nbrCages+" cages.");
    }

    //Instruction 9 : La méthode toString()
    @Override
    public String toString(){
        return "le nom du zoo est: "+name+" située à "+city+" comporte "+nbrCages+" cages.";
    }

    //Instruction 11 : Affichage et recherche des animaux
    //1. Affichage des animaux :
    public void displayZooAnimals(){
        for(i=0;i< compteur;i++)
        {
            System.out.println(animals[i]);
        }
    }
    //Instruction 17 :
    //1
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Âge d’animal invalide : l’âge ne peut pas être négatif.");
        }
        if (compteur >= nbrCages) {
            throw new ZooFullException("Le zoo est plein, impossible d’ajouter un nouvel animal.");
        }
        for (int i = 0; i < compteur; i++) {
            if (animal.equals(animals[i])) {
                System.out.println("L'animal existe déjà dans le zoo.");
                return;
            }
        }
        animals[compteur] = animal;
        compteur++;
        System.out.println("L'animal est bien ajouté.");
    }
    //2
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < compteur; i++) {
            if (animal.equals(animals[i])) {
                System.out.println("L'animal se trouve à l'indice : " + i);
                return i;
            }
        }
        System.out.println("L'animal n'est pas dans le tableau.");
        return -1;
    }

    // Instruction 13 : Suppression d’un animal
    public boolean removeAnimal(Animal animal) {
        int j = searchAnimal(animal);
        if (j == -1) return false;

        // Décaler les éléments vers la gauche
        for (int i = j; i < compteur - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[compteur - 1] = null;
        compteur--;
        System.out.println("L'animal est supprimé.");
        return true;
    }

    //Instruction 15 :
    public boolean isZooFull() {
        if (compteur >= nbrCages) {
            System.out.println("Le zoo est plein.");
            return true;
        } else {
            System.out.println("Le zoo n'est pas plein. Places disponibles : " + (nbrCages - compteur));
            return false;
        }
    }

    public static Zoo comparerZoo(Zoo zoo1 ,Zoo zoo2){
        if (zoo1.compteur>zoo2.compteur){
            System.out.println("Le zoo le plus peuplé est : " + zoo1.getName());
            return zoo1;
        }
        else if(zoo1.compteur<zoo2.compteur) {
            System.out.println("Le zoo le plus peuplé est : " + zoo2.getName());
            return zoo2;
        }
        else
            return null;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        if(compteurAquatic<=9){
            aquaticAnimals[compteurAquatic] = aquatic;
            compteurAquatic++;
            System.out.println("L'animal Aquatic est bien ajouté.");
        }
        else System.out.println("Pas possible d'ajouter !! Les place Aquatic sont plein.");
    }

    public float maxPenguinSwimmingDepth(){
        float max=0f;
        for(i=0;i<compteurAquatic;i++){
            if(aquaticAnimals[i].getClass()== Pingouin.class){
                Pingouin P = (Pingouin) aquaticAnimals[i];
                if(P.swimmingDepth>max)
                    max=P.swimmingDepth;
            }
        }
        return max;
    }

    public void displayNumberOfAquaticByType(){
        int nbrDauphin=0;
        int nbrPinguin=0;
        for(i=0;i<compteurAquatic;i++){
            if(aquaticAnimals[i].getClass()== Pingouin.class)
                nbrPinguin++;
            if(aquaticAnimals[i].getClass()== Dauphin.class)
                nbrDauphin++;
        }
        System.out.println("Le nombre des Dauphin est = "+nbrDauphin);
        System.out.println("Le nombre des Pinguin est = "+nbrPinguin);
    }




}
