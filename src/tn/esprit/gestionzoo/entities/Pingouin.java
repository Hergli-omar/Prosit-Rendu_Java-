package tn.esprit.gestionzoo.entities;

public class Pingouin extends Aquatic{
    protected float swimmingDepth;
    public Pingouin(String family,String name,int age,boolean isMammal,String habitat,float swimmingDepth){
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth=swimmingDepth;
    }
    @Override
    public String toString(){
        return name+" appartient à la famille des "+family+" à "+age+" ans "+" ,is mammal= "+isMammal+" habite "+habitat+" peut atteindre une profendeur de "+ swimmingDepth;
    }
}
