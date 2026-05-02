public class Zoo {
    Animal[] animals=new Animal[25];
    String name ;
    String city ;
    int nbrCages;
    Zoo(){}
    // Instruction 6 : Constructeurs paramétrés
    Zoo( String name,String city,int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
    }
    //Instruction 8 : Méthode displayZoo():Q1
    void displayZoo(){
        System.out.println("le nom du zoo est: "+name+" située à "+city+" comporte "+nbrCages+" cages.");
    }

    //Instruction 9 : La méthode toString()
    @Override
    public String toString(){
        return "le nom du zoo est: "+name+" située à "+city+" comporte "+nbrCages+" cages.";
    }
}
