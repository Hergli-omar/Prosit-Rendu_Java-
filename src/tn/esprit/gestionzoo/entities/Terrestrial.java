package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore {
    protected int nbrLegs;

    public Terrestrial() {}

    public Terrestrial(AnimalFamily family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public void walk() {
        System.out.println("This terrestrial animal is walking.");
    }

    @Override
    public void makeSound() {
        System.out.println("This terrestrial animal is making a sound.");
    }

    @Override
    public void eatMeat() {
        System.out.println("This terrestrial animal eats meat.");
    }

    @Override
    public void eatPlant() {
        System.out.println("This terrestrial animal eats plants.");
    }

    @Override
    public String toString() {
        return name + " appartient à la famille des " + family + " à " + age + " ans ,is mammal= " + isMammal + " et à " + nbrLegs + " legs.";
    }
}
