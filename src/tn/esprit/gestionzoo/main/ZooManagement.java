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

        Aquatic balen=new Aquatic("7out","laboon",70,true,"one piece");
        Dauphin d1 = new Dauphin("Delphinidae", "Flipper", 5, "Océan Atlantique", 25.5f);
        Pingouin betri9 =new Pingouin("batari9","bomba",3,false,"ocean",15.3f);
        Terrestrial temse7 =new Terrestrial("lizards","crocodile",22,false,4);

        System.out.println(balen);
        System.out.println(d1);
        System.out.println(betri9);
        System.out.println(temse7);

        balen.swim();
        d1.swim();
        betri9.swim();




    }
}