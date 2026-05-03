package tn.esprit.gestionzoo.entities;

public class Dauphin extends Aquatic{
    protected float swimmingSpeed;
    public Dauphin(String family,String name,int age,String habitat,float swimmingSpeed){
        super(family,name,age,true,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
    @Override
    public String toString(){
        return name+" appartient à la famille des "+family+" à "+age+" ans "+" ,is mammal= "+isMammal+" habite "+habitat+" sa vitesse est: "+swimmingSpeed;
    }
    @Override
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
}
