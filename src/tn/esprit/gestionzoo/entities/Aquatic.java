package tn.esprit.gestionzoo.entities;
import java.util.Objects;
public abstract class Aquatic extends Animal{
    protected String habitat;
    public Aquatic(String family,String name,int age,boolean isMammal,String habitat){
         super(family,name,age,isMammal);
         this.habitat=habitat;
    }
    @Override
    public String toString(){
        return name+" appartient à la famille des "+family+" à "+age+" ans "+" ,is mammal= "+isMammal+" habite "+habitat;
    }
    public abstract void swim();

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(null==obj || getClass()!=obj.getClass()) return false;
        Aquatic aquatic=(Aquatic) obj;
        return this.age==aquatic.age
                && this.name.equals(aquatic.name)
                && this.habitat.equals(aquatic.habitat);

    }
}
