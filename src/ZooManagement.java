import java.util.Scanner;
public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    ZooManagement(){}

    public static void main(String[] args) {
        //Prosit 1:Instruction1: Q3
        ZooManagement zoo=new ZooManagement();
        System.out.println("Nom:"+zoo.zooName+"NbrCages:"+zoo.nbrCages);
        //Prosit 1:Instruction2
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Donner le nom du zoo :");
            zoo.zooName=sc.nextLine().trim();
        }while(zoo.zooName.isEmpty());
        do{
            System.out.println("Donner le nombre des cages du zoo :");
            zoo.nbrCages=sc.nextInt();
        }while(zoo.nbrCages<=0);
        //prosit 1:Instruction3
        System.out.println(zoo.zooName+" comporte "+zoo.nbrCages+" cages.");

    }
}