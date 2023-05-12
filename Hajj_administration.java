package alrahma1.company;

/**
 * An interface class displays all the hajj information methods
 */
public interface Hajj_administration {
    /**
     * Add user's information to a list such as first name, second name, last name, age, country, id/iqama, phone number.
     * @param p This variable(P)contains the pilgrim's information such as, his name, permit number, if there are diseases, age, country, national identity, mobile number.
     */
    public abstract void add_hajj(Health_Information p);
   
   
    /**
     * The search method is that when the user enters his ID number, we use this method, for example, to print his information, update his information, or even if he wants to delete it
     * @param Id Holds the Hajj ID number
     * @return return the ID of Hajj that we search it.
     */
    public abstract int search(int Id);
    
    /**
     * The search method is that when the user enters his ID number, we use this method, for example, to print his information, update his information, or even if he wants to delete it
     * @param Id Holds the Hajj ID number
     * @return return the ID of Hajj that we search it.
     */
    public abstract int search2(int Id);
    /**
     * Method of deletion to remove all the pilgrim's information from the list when he does not want to confirm his reservation
     * @param P This variable(P)contains the pilgrim's information such as, his name, permit number, if there are diseases, age, country, national identity, mobile number.
     */
    public abstract void remove_hajj(Health_Information P);
    
    /**
     * To update the information of the pilgrim after completing the process of adding him to the list, this method allows him to update his personal information

     */

    public abstract void update_info();

}