package tn.esprit.gestionzoo.entities;

public class Dauphin extends Aquatic {
    protected float swimmingSpeed;

    public Dauphin() {}

    public Dauphin(AnimalFamily family, String name, int age, String habitat, float swimmingSpeed) {
        super(family, name, age, true, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dolphin makes a click-click sound.");
    }

    @Override
    public String toString() {
        return super.toString() + " sa vitesse est: " + swimmingSpeed;
    }
}
