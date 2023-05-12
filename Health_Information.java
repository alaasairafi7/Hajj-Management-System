package ALRAHMA1.company;

import java.util.*;
public class Health_Information extends Hajj_Information {
   /* private boolean Pressure_disease;
    private boolean Heart_disease;
    private boolean Diabetes;
    private boolean Asthma;
    private boolean Epilepitc_fit;
    private boolean other_disease;*/
    private String disease;

    public Health_Information(String name, String mid, String last, int age, String nat, String con, int id, int num) {
        super(name,mid,last,age,nat,con,id,num);
    }

    public Health_Information(String firstName, String lastName, int Age, String Nationality, String country, int id, int phone_Number, String permitNOhaj) {
        super(firstName, lastName, Age, Nationality, country, id, phone_Number, permitNOhaj);
    }

    public Health_Information(String firstName, String middleName, String lastName, int Age, String Nationality, String country, int id, int phone_Number, String permitNOhaj,String disease) {
        super(firstName, middleName, lastName, Age, Nationality, country, id, phone_Number, permitNOhaj);
        this.disease=disease;
    }
    public Health_Information(String firstName, String middleName, String lastName, int id, int phone_Number, String disease) {
        super(firstName, middleName, lastName, id, phone_Number);
        this.disease=disease;}

    public Health_Information(String firstName, String middleName, String lastName, int id, int phone_Number) {
        super(firstName, middleName, lastName, id,phone_Number);

    }

    public Health_Information() {

    }

// seter and geter


    public boolean Health_Qu( ) {
        Scanner ab =new Scanner(System.in);
        System.out.println("Do you have any disease");
        System.out.println("هل لديك اي مرض ؟");
        String ans=ab.next();
        if (ans.equalsIgnoreCase("yes"))
       return true;
       else
           return false;
    } // اسال الحاج اذا عنده امراض

    public String toString( ) {
        return getFirstName()+" "+getMiddleName()+" "+getLastName()+" "+getPhone_Number()+" "+getId()+" ";
    }







}
