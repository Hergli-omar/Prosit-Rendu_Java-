import java.util.Objects;
public class Zoo {
    Animal[] animals=new Animal[3];
    String name ;
    String city ;
    /*Instruction 14 : Constante pour le nombre de cages*/final int nbrCages=25;
    int compteur=0;
    int i;
    Zoo(){}
    // Instruction 6 : Constructeurs paramétrés
    Zoo( String name,String city){
        this.name=name;
        this.city=city;
    }
    //Instruction 8 : Méthode displayZoo():Q1
    void displayZoo(){
        System.out.println("le nom du zoo est: "+name+" située à "+city+" comporte "+nbrCages+" cages.");
    }

    //Instruction 9 : La méthode toString()
    @Override
    public String toString(){
        return "le nom du zoo est: "+name+" située à "+city+" comporte "+nbrCages+" cages.";
    }

    //Instruction 10 : Ajouter des animaux dans le Zoo
    /*boolean addAnimal(Animal animal){
        if (compteur<animals.length){
            animals[compteur]=animal;
            compteur ++;
            System.out.println("L'animal est bien ajoutée.");
            return true;
        }
        else{
            System.out.println("Zoo plein!! Pas possible d'ajouter des animeaux.");
            return false;
        }
    }*/

    //Instruction 11 : Affichage et recherche des animaux
    //1. Affichage des animaux :
    void displayZooAnimals(){
        for(i=0;i< compteur;i++)
        {
            System.out.println(animals[i]);
        }
    }
    //2. Recherche d’un animal :
    /*int searchAnimal(Animal animal){
        for(i=0;i<animals.length;i++){
            if(animal.name==animals[i].name){
                System.out.println("L'aniaml se trouve a lindice : "+i);
                return i;
            }
        }
        System.out.println("L'aniaml n'est pas dans le tableau .");
        return -1;
    }*/

    //Instruction 12 : Contraintes de gestion du zoo
    //1
    boolean addAnimal(Animal animal) {
        // Vérifier si l'animal existe déjà
        for (int i = 0; i < compteur; i++) {
            if (animal.equals(animals[i])) {
                System.out.println("L'animal existe déjà dans le zoo.");
                return false;
            }
        }
        // Ajouter si espace disponible
        if (compteur < animals.length) {
            animals[compteur] = animal;
            compteur++;
            System.out.println("L'animal est bien ajouté.");
            return true;
        } else {
            System.out.println("Zoo plein !! Pas possible d'ajouter des animaux.");
            return false;
        }
    }
    //2
    int searchAnimal(Animal animal) {
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
    boolean removeAnimal(Animal animal) {
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
    boolean isZooFull() {
        if (compteur >= nbrCages) {
            System.out.println("Le zoo est plein.");
            return true;
        } else {
            System.out.println("Le zoo n'est pas plein. Places disponibles : " + (nbrCages - compteur));
            return false;
        }
    }

    Zoo compareZoo(Zoo zoo1 ,Zoo zoo2){
        if (zoo1.compteur>zoo2.compteur){
            System.out.println("Le zoo le plus peuplé est : " + zoo1.name);
            return zoo1;
        }
        else if(zoo1.compteur<zoo2.compteur) {
            System.out.println("Le zoo le plus peuplé est : " + zoo2.name);
            return zoo2;
        }
        else
            return null;
    }




}
