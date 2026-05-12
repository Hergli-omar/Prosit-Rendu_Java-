package tn.esprit.gestionzoo.entities;

public class Pingouin extends Aquatic {
    protected float swimmingDepth;

    public Pingouin() {}

    public Pingouin(AnimalFamily family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This Pingouin is swimming.");
    }

    @Override
    public void makeSound() {
        System.out.println("Pingouin makes a honk sound.");
    }

    @Override
    public String toString() {
        return super.toString() + " peut atteindre une profendeur de " + swimmingDepth;
    }
}
