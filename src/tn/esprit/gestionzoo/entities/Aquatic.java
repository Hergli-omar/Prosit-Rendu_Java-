package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal implements Carnivore {
    protected String habitat;

    public Aquatic() {}

    public Aquatic(AnimalFamily family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public void eatMeat() {
        System.out.println("This aquatic animal eats meat.");
    }

    @Override
    public String toString() {
        return name + " appartient à la famille des " + family + " à " + age + " ans ,is mammal= " + isMammal + " habite " + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic aquatic = (Aquatic) obj;
        return this.age == aquatic.age
                && Objects.equals(this.name, aquatic.name)
                && Objects.equals(this.habitat, aquatic.habitat);
    }
}
