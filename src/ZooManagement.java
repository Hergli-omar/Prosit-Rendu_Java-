import java.util.Scanner;
public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    ZooManagement(){}

    public static void main(String[] args) {
        /*Prosit 1:Instruction1: Q3
        ZooManagement zoo=new ZooManagement();
        System.out.println("Nom:"+zoo.zooName+"NbrCages:"+zoo.nbrCages);*/
        /*Prosit 1:Instruction2
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Donner le nom du zoo :");
            zoo.zooName=sc.nextLine().trim();
        }while(zoo.zooName.isEmpty());
        do{
            System.out.println("Donner le nombre des cages du zoo :");
            zoo.nbrCages=sc.nextInt();
        }while(zoo.nbrCages<=0);*/

        /*prosit 1:Instruction3
        System.out.println(zoo.zooName+" comporte "+zoo.nbrCages+" cages.");*/

        /*Prosit2:Instruction 5: Q3
        Animal lion=new Animal();
        lion.family="félidés";
        lion.name="Simba";
        lion.age=1;
        lion.isMammal=true;

        Zoo myZoo=new Zoo();
        myZoo.animals[0]=lion;
        myZoo.name="friguia";
        myZoo.city="Sousse";
        myZoo.nbrCages=154;*/

        //Prosit2:Instruction6:
        Animal lion=new Animal("Felids","Simba",1,true);
        Zoo myZoo=new Zoo("friguia","Sousse",122);
        //creation plus facile avec les constructeurs

        //Prosit2:Instruction7:
        Animal Giraffe=new Animal("Giraffidae","zohra",15,true);
        Animal Orca=new Animal("Delphinidés","wiw",6,true);
        Animal turtle=new Animal("turtles","Frank",120,false);

        //Instruction 8 : Méthode displayZoo():Q2
        myZoo.displayZoo();

        //Instruction 8 : Méthode displayZoo():Q3
        System.out.println(myZoo);
        System.out.println(myZoo.toString()) ;
        //il affiche un code Instruction 8
        //laffichage est bon Instruction 9
        System.out.println(Giraffe);
        System.out.println(turtle);



    }
}