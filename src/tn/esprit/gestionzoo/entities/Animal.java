//Instruction 19 : Organisation des packages
package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Animal {
    public String family;
    public String name;

    //Instruction 18 : Encapsulation des attributs
    private int age;
    public void setAge(int age){
        if(age<=0){
            System.out.println("L'age ne doit pas etre négatif !! Donner l'age de l'animal :");
        }
        else
            this.age=age;
    }
    public int getAge (){
        return age;
    }

    public boolean isMammal;
    public Animal(){}
    //Instruction 6 : Constructeurs paramétrés
    public Animal(String family,String name,int age,boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }

    //Instruction 9 : La méthode toString()
    @Override
    public String toString(){
        return "le nom de l'animal est: "+name+" est de la famille des "+family+" .il a "+age+" c'est un mamal: "+isMammal;
    }

    // //Instruction 12 : Contraintes de gestion du zoo
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal other = (Animal) obj;
        return age == other.age
                && isMammal == other.isMammal
                && Objects.equals(name, other.name)
                && Objects.equals(family, other.family);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
