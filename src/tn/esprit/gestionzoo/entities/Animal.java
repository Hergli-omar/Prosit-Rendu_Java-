package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Animal {
    protected AnimalFamily family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal() {}

    public Animal(AnimalFamily family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    protected void setAge(int age) {
        if(age <= 0) {
            System.out.println("L'age ne doit pas etre négatif !!");
        } else {
            this.age = age;
        }
    }

    protected int getAge() {
        return age;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "le nom de l'animal est: " + name + " est de la famille des " + family + " .il a " + age + " c'est un mamal: " + isMammal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal other = (Animal) obj;
        return age == other.age
                && isMammal == other.isMammal
                && Objects.equals(name, other.name)
                && family == other.family;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
