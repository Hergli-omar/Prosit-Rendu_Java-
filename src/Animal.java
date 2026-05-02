public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    Animal(){}
    //Instruction 6 : Constructeurs paramétrés
    Animal(String family,String name,int age,boolean isMammal){
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

}
