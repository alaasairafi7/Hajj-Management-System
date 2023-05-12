package alrahma1.company;

/**
 * A class that has all health information and extend from hajj information
 */

import java.util.*;

/**
 * A class that has all health information and extend from hajj information
 */

public class Health_Information extends Hajj_Information {

    private String disease;

    /**
     *
     * @param firstName To enter an initial value
     * @param middleName To enter an initial value
     * @param lastName To enter an initial value
     * @param id To enter an initial value
     * @param phone_Number To enter an initial value
     * @param Age To enter an initial value
     * @param disease To enter an initial value
     */
    public Health_Information(String firstName, String middleName, String lastName, int id, int phone_Number, int Age, String disease) {
        super(firstName, middleName, lastName, id, phone_Number, Age);
        this.disease = disease;
    }

    /**
     *
     * @param firstName To enter an initial value 
     * @param middleName To enter an initial value 
     * @param lastName To enter an initial value 
     * @param id To enter an initial value 
     * @param phone_Number To enter an initial value 
     * @param Age To enter an initial value 
     * @param PermitNOhaj To enter an initial value 
     * @param disease To enter an initial value 
     */
    public Health_Information(String firstName, String middleName, String lastName, int id, int phone_Number, int Age, String PermitNOhaj, String disease) {
        super(firstName, middleName, lastName, id, phone_Number, Age, PermitNOhaj);
        this.disease = disease;
    }

    /**
     * constructor
     *
     * @param name To enter an initial value
     * @param mid To enter an initial value
     * @param last To enter an initial value
     * @param age To enter an initial value
     * @param nat To enter an initial value
     * @param con To enter an initial value
     * @param id To enter an initial value
     * @param num To enter an initial value
     */
    public Health_Information(String name, String mid, String last, int age, String nat, String con, int id, int num) {
        super(name, mid, last, age, nat, con, id, num);
    }

    /**
     * constructor
     *
     * @param firstName To enter an initial value
     * @param lastName To enter an initial value
     * @param Age To enter an initial value
     * @param Nationality To enter an initial value
     * @param country To enter an initial value
     * @param id To enter an initial value
     * @param phone_Number To enter an initial value
     * @param permitNOhaj To enter an initial value
     */
    public Health_Information(String firstName, String lastName, int Age, String Nationality, String country, int id, int phone_Number, String permitNOhaj) {
        super(firstName, lastName, Age, Nationality, country, id, phone_Number, permitNOhaj);
    }

    /**
     * constructor
     *
     * @param firstName To enter an initial value
     * @param middleName To enter an initial value
     * @param lastName To enter an initial value
     * @param Age To enter an initial value
     * @param Nationality To enter an initial value
     * @param country To enter an initial value
     * @param id To enter an initial value
     * @param phone_Number To enter an initial value
     * @param permitNOhaj To enter an initial value
     * @param disease To enter an initial value
     */
    public Health_Information(String firstName, String middleName, String lastName, int Age, String Nationality, String country, int id, int phone_Number, String permitNOhaj, String disease) {
        super(firstName, middleName, lastName, Age, Nationality, country, id, phone_Number, permitNOhaj);
        this.disease = disease;
    }

    /**
     * constructor
     *
     * @param firstName To enter an initial value
     * @param middleName To enter an initial value
     * @param lastName To enter an initial value
     * @param id To enter an initial value
     * @param phone_Number To enter an initial value
     * @param disease To enter an initial value
     * @param permitNOhaj To enter an initial value
     */
    public Health_Information(String firstName, String middleName, String lastName, int id, int phone_Number, String disease, String permitNOhaj) {
        super(firstName, middleName, lastName, id, phone_Number, permitNOhaj);
        this.disease = disease;
    }

    /**
     * constructor
     *
     * @param firstName To enter an initial value
     * @param middleName To enter an initial value
     * @param lastName To enter an initial value
     * @param disease To enter an initial value
     * @param Nationality To enter an initial value
     * @param Age To enter an initial value
     * @param id To enter an initial value
     * @param phone_Number To enter an initial value
     */
    public Health_Information(String firstName, String middleName, String lastName, String disease, String Nationality, int Age, int id, int phone_Number) {
        super(firstName, middleName, lastName, Age, id, phone_Number, Nationality);
        this.disease = disease;
    }

    /**
     * constructor
     *
     * @param firstName To enter an initial value
     * @param middleName To enter an initial value
     * @param lastName To enter an initial value
     * @param country To enter an initial value
     * @param nationality To enter an initial value
     * @param id To enter an initial value
     * @param Age To enter an initial value
     * @param phone_Number To enter an initial value
     * @param disease To enter an initial value
     */
    public Health_Information(String firstName, String middleName, String lastName, String country, String nationality, int id, int Age, int phone_Number, String disease) {
        super(firstName, middleName, lastName, country, nationality, id, Age, phone_Number);
        this.disease = disease;
    }

    /**
     * no argument constructor
     */
    public Health_Information() {

    }

    /**
     * To get Disease of user's
     *
     * @return String disease
     */
    public String getDisease() {
        return disease;
    }

    /**
     * To set user's Disease
     *
     * @param disease
     */
    public void setDisease(String disease) {
        this.disease = disease;
    }

    /**
     * to ask user about her/his health condition
     *
     * @return true or false
     */
    public boolean Health_Qu() {
        Scanner ab = new Scanner(System.in);
        System.out.println("Do you have any disease (Yes/No): ");
        String ans = ab.next();
        if (ans.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Comparing the entered ID number with the previously registered ID number
     *
     * @param h This variable(P)contains the pilgrim's information such as, his
     * name, permit number, if there are diseases, age, country, national
     * identity, mobile number.
     * @return true/false
     */
    public boolean equals(Health_Information h) {

        if (this.getId() != h.getId()) {
            return true;
        } else {
            return false;
        }

    }
    

    public String toString() {
        return "First name:" + getFirstName() + "\nMiddle name:" + getMiddleName()
                + "\nLast name: " + getLastName() + "\nAge :" + getAge()
                + "\nNationality: " + getNationality() + "\nCountry: " + getCountry()
                + "\nphone number: " + "0" + getPhone_Number() + "\nID: " + getId()
                + "\ndisease: " + disease + "\nPrimet Number: " + getPermitNOhaj();
    }

}
