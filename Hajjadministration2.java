package alrahma1.company;

import java.util.*;

/**
 * An implement class from the interface class that displays all the hajj information methods.‏
 */
public class Hajjadministration2  implements Hajj_administration{
    

    ArrayList<Health_Information> p = new ArrayList<Health_Information>();

    /**
     * Add user's information to a list such as first name, second name, last name, age, country, id/iqama, phone number.
     * @param P This variable(P)contains the pilgrim's information such as, his name, permit number, if there are diseases, age, country, national identity, mobile number.
     */
    
    @Override
    public void add_hajj(Health_Information P) {
        p.add(P);
    }

    /**
     * display pilgrim's information By searching for the ID number and then printing it's information.
     */
public void display_singleA() {
    
        Camp cA =new Camp_A();
        Buss bA = new Buss();
        Scanner ab=new Scanner (System.in);
      
        System.out.println("Enter the Id: ");
        int number = ab.nextInt();
         System.out.println("***");
        int s = search2(number);
        if (s>=0){
           
             System.out.println(p.get(s));
             System.out.println(cA.toString());
             System.out.println(bA.toString());
         }else{
                System.out.println("There Is No Information !");
        }

}

 /**
     * display pilgrim's information By searching for the ID number and then printing it's information.
     */
public void display_singleB() {
        Camp cb =new Camp_B();
        Buss bB = new Buss();
        Scanner ab=new Scanner (System.in);
      
        System.out.println("Enter the Id: ");
        int number = ab.nextInt();
         System.out.println("***");
        int s = search2(number);
        if (s>=0){
           
             System.out.println(p.get(s));
             System.out.println(cb.toString());
             System.out.println(bB.toString());
         }else{
                 System.out.println("There Is No Information !");
        }

}

 /**
     * display pilgrim's information By searching for the ID number and then printing it's information.
     */
public void display_singleC() {
        Camp cc =new Camp_C();
        Buss bC = new Buss();
        Scanner ab=new Scanner (System.in);
      
        System.out.println("Enter the Id: ");
        int number = ab.nextInt();
         System.out.println("***");
        int s = search2(number);
        if (s>=0){
           
             System.out.println(p.get(s));
             System.out.println(cc.toString());
             System.out.println(bC.toString());
         } else{
            
             System.out.println("There Is No Information !");
        }
}



 
    /**
     * The search method is that when the user enters his ID number, we use this method, for example, to print his information, update his information, or even if he wants to delete it
     * @param Id Holds the Hajj ID number
     * @return return the ID of Hajj that we search it.
     */
    @Override
 public int search2(int Id) {
        int r =0;
        Health_Information h=new Health_Information();
        for (int i = 0; i < p.size(); i++) {
            int q= p.get(i).getId(); // index
            if(Id==q){
                r=i;
            }else      
                r=-1;
        }
        return r;
        
        }

    
    
    
    /**
     * The search method is that when the user enters his ID number, we use this method, for example, to print his information, update his information, or even if he wants to delete it
     * @param Id Holds the Hajj ID number
     * @return return the ID of Hajj that we search it.
     */
    @Override
    public int search(int Id) {
        int i = 0;
        for (; i < p.size(); i++) {
            if (p.get(i).equals(Id)) ;

            break;
        }
        return i;
    }
    
    @Override
//    /**
//     * Method of deletion to remove all the pilgrim's information from the list when he does not want to confirm his reservation
//     * @param P This variable(P)contains the pilgrim's information such as, his name, permit number, if there are diseases, age, country, national identity, mobile number.
//     */
    public void remove_hajj(Health_Information P) {
        p.remove(P);

        System.out.println("Your information has deleted");
    }
    
    
//    /**
//     * To update the information of the pilgrim after completing the process of adding him to the list, this method allows him to update his personal information
//     */
    
    @Override
    public void update_info() {
        Health_Information hel=new Health_Information();
        Scanner ab = new Scanner(System.in);
        Health_Information c = new Health_Information();

        System.out.println("Enter your ID");
        int id = ab.nextInt();
        System.out.println("Enter your first name");
        String name = ab.next();
        System.out.println("Enter your middel name");
        String mid = ab.next();
        System.out.println("Enter your last name");
        String last = ab.next();
        System.out.println("Enter your number phone");
        int num = ab.nextInt();
        String dei = " ";
        if (hel.Health_Qu() == true) {
            System.out.println("Enter your diesase: ");
            dei = ab.next();
            System.out.println("-------------------------------------");
        }else{
            dei= "No diesase.";
        }
        
        System.out.println("Enter your nationality :"); 
        String NA = ab.next();
        System.out.println("Enter your country :");
        String Co = ab.next();
        
        System.out.println("Enter your age");
        int age=ab.nextInt();
        if (hel.Accsept_Age(age) == true) 
        {
         //if lees the 18
         System.out.println("Sorry, you are not accepted because of the requirement of age.");
         System.exit(0);
                   
                }
        
        int index =search(id);
        
        p.set(index, new Health_Information(name , mid, last, age, NA ,Co, id,num,c.getPermitNOhaj(), dei));
        
    }

}