package alrahma1.company;

import java.util.*;

/**
 * An implemented class from class Hajj administration that has all methods for a bonus trip
 */
public class Tourist_trips extends Health_Information implements Hajj_administration  {
    
    private static final int Extra_buss = 3;
    private static final int capsity = 144;
    public static final int sets = 48;
    private int NoHT;
    
    ArrayList<Health_Information> p = new ArrayList<Health_Information>();
    int add = 0; // obj

    /**
     * no-argument Constructor
     */

    public Tourist_trips() {

    }

    /**
     * View to the pilgrim's our available trips
     */

    public void our_trips() {
        System.out.println("** We have trips around Makkah: **\n1- Makkah Tower Museum 2- Museum of the Two Holy Mosques 3- Mount Arafat\n" +
                "** We conclude with a trip to Medina ** the city of the Prophet, may God bless him and grant him peace:\n1- Al-Masjid Al-Nabawi 2- Quba Mosque 3- Al-Baqi Cemetery 4- Al-Hijaz Station,and a quick tour of Medina."
                        +"\n** And also trips to the Jeddah region ** to see the tallest fountain in the world, \nthe beauty of the Red Sea, a trip to Fakih Aquarium, and there are also several museums,\nand a visit to the old city of Jeddah." );
                       
    }


    /**
     * Add user's information to a list such as first name, second name, last name, age, country, id/Eqama, phone number.
     * @param P This variable(P)contains the pilgrim's information such as, his name, permit number, if there are diseases, age, country, national identity, mobile number.
     */

    @Override
    public void add_hajj(Health_Information P) {
        p.add(P);
    }

    /**
     * display pilgrim's information By searching for the ID number and then printing it's information.
     */


    public void display_infoTrips() {
        
        Scanner ab=new Scanner (System.in);
        System.out.println("Enter the Id: ");
        try{
        int number = ab.nextInt();
         System.out.println("***");
        int s = search2(number); // number of index
        if (s>=0){
           System.out.println(p.get(s));
         
         } 
        }catch(IndexOutOfBoundsException‏ e){
            System.err.println("There Is No Information !");
        }
        

    }



    /**
     * Method of deletion to remove all the pilgrim's information from the list when he does not want to confirm his reservation
     * @param P This variable(P)contains the pilgrim's information such as, his name, permit number, if there are diseases, age, country, national identity, mobile number.
     */
    @Override
    public void remove_hajj(Health_Information P) {
        p.remove(P);
        System.out.println("Your information has deleted ");
    }


    /**
     * To update the information of the pilgrim after completing the process of adding him to the list, this method allows him to update his personal information

     */

    @Override
    public void update_info() {
        try{
            
        
        Scanner ab = new Scanner(System.in);
        String disease=" ";
        Health_Information c = new Health_Information();
        System.out.println("Enter your ID");
        int id = ab.nextInt();

        System.out.println("Enter your first name: ");
        String name = ab.next();
        System.out.println("Enter your middel name: ");
        String mid = ab.next();
        System.out.println("Enter your last name: ");
        String last = ab.next();
        System.out.println("Enter your number phone: ");
        int num = ab.nextInt();
        if (c.Health_Qu() == true) {
            System.out.println("Enter your diesase: ");
           disease = ab.next();
        
        }else{
            disease= "No diesase.";
        }
        
        System.out.println("Enter your age: ");
        int age=ab.nextInt();
        System.out.println("Enter your nationality:"); 
        String NA = ab.next();
        System.out.println("Enter your country:");
        String Co = ab.next();
        
        int index =search(id);
        
        p.set(index, new Health_Information(name, mid, last, age, NA, Co , id,num, c.getPermitNOhaj(),disease ));
        
        
        } catch(InputMismatchException e){
            System.err.println("Enter only numbers! ");
        }
    }

   /**
    * Comparing the entered ID number with the previously registered ID number
    * @param h This variable(P)contains the pilgrim's information such as, his name, permit number, if there are diseases, age, country, national identity, mobile number.
    * @return true/false
    */
    
    public boolean equals( Health_Information h ) {

        if(this.getId()!=h.getId())
            return true;
        else
            return false;

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
            int q= p.get(i).getId();
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

}