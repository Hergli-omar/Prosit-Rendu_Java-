package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    protected int nbrLegs;
    public Terrestrial(String family,String name,int age,boolean isMammal,int nbrLegs){
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;
    }
    @Override
    public String toString(){
        return name+" appartient à la famille des "+family+" à "+age+" ans "+" ,is mammal= "+isMammal+" et à "+nbrLegs+" legs.";
    }
}
