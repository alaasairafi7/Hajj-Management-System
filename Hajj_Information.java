package alrahma1.company;

/**
 * A class that has all personal information
 */
public class Hajj_Information {
    private String firstName;
    private String middleName;
    private String lastName;
    private int id;
    private int phone_Number;
    private int Age;
    private String Nationality;
    private String country;
    private String permitNOhaj;

    /**
     * no argument constructor
     */
    public Hajj_Information() {
    }
    

    /**
     * 
     * @param firstName To enter an initial value 
     * @param middleName To enter an initial value 
     * @param lastName To enter an initial value 
     * @param id To enter an initial value 
     * @param phone_Number phone_Number To enter an initial value  
     * @param Age phone_Number To enter an initial value  
     */
    
    public Hajj_Information(String firstName, String middleName, String lastName, int id, int phone_Number, int Age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.id = id;
        this.phone_Number = phone_Number;
        this.Age = Age;
    }
    
    /**
     * constructor
     * @param firstName To enter an initial value 
     * @param middleName To enter an initial value 
     * @param lastName To enter an initial value 
     * @param id To enter an initial value 
     * @param phone_Number To enter an initial value  
     * @param  permitNOhaj To enter an initial value  
     */
    public Hajj_Information(String firstName, String middleName, String lastName, int id, int phone_Number,String permitNOhaj) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.id = id;
        this.phone_Number = phone_Number;
        this. permitNOhaj= permitNOhaj;

    }

    /**
     * Constructor
     * @param firstName To enter an initial value 
     * @param middleName To enter an initial value 
     * @param lastName To enter an initial value 
     * @param id To enter an initial value 
     */
    public Hajj_Information(String firstName, String middleName, String lastName, int id) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.id=id;
    }

    /**
     * Constructor
     * @param firstName To enter an initial value 
     * @param middleName To enter an initial value 
     * @param lastName To enter an initial value 
     * @param age To enter an initial value 
     * @param Nationality To enter an initial value 
     * @param country To enter an initial value 
     * @param id To enter an initial value  
     * @param phone_Number To enter an initial value 
     */
    public Hajj_Information(String firstName, String middleName, String lastName, int age,String Nationality,String country,int id,int phone_Number ) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.Age=age;
        this.Nationality=Nationality;
        this.country=country;
        this.id=id;
        this.phone_Number=phone_Number;
        
    }

    /**
     * Constructor
     * @param firstName To enter an initial value 
     * @param middleName To enter an initial value 
     * @param lastName To enter an initial value 
     * @param Age To enter an initial value 
     * @param Nationality To enter an initial value 
     * @param country To enter an initial value 
     * @param id To enter an initial value 
     * @param phone_Number To enter an initial value 
     * @param permitNOhaj To enter an initial value 
     */
    public Hajj_Information(String firstName, String middleName, String lastName, int Age, String Nationality, String country, int id, int phone_Number, String permitNOhaj) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.id = id;
        this.phone_Number = phone_Number;
        this.Age = Age;
        this.Nationality = Nationality;
        this.country = country;
        this.permitNOhaj = permitNOhaj;
    }

    /**
     * Constructor
     * @param firstName To enter an initial value 
     * @param lastName To enter an initial value 
     * @param Age To enter an initial value 
     * @param Nationality To enter an initial value 
     * @param country To enter an initial value 
     * @param id To enter an initial value 
     * @param phone_Number To enter an initial value 
     * @param permitNOhaj To enter an initial value 
     */
    public Hajj_Information(String firstName, String lastName, int Age, String Nationality, String country, int id, int phone_Number, String permitNOhaj) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.phone_Number = phone_Number;
        this.Age = Age;
        this.Nationality = Nationality;
        this.country = country;
        this.permitNOhaj = permitNOhaj;
    }

    /**
     * Constructor
     * @param firstName To enter an initial value 
     * @param middleName To enter an initial value 
     * @param lastName To enter an initial value 
     * @param nationality To enter an initial value  
     * @param country To enter an initial value 
     * @param id To enter an initial value 
     * @param phone_Number To enter an initial value 
     */
    public Hajj_Information(String firstName, String middleName, String lastName,String nationality,String country, int id,int phone_Number){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.Nationality=nationality;
        this.country=country;
        this.id=id;
        this.phone_Number=phone_Number;

    }
    /**
     * Constructor
     * @param firstName To enter an initial value 
     * @param middleName To enter an initial value 
     * @param lastName To enter an initial value 
     * @param Age To enter an initial value 
     * @param id To enter an initial value 
     * @param phone_Number To enter an initial value 
     * @param Nationality To enter an initial value 
     */
    public Hajj_Information(String firstName, String middleName, String lastName, int Age ,int id, int phone_Number,  String Nationality) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.id = id;
        this.phone_Number = phone_Number;
        this.Age=Age;
        this.Nationality = Nationality;

    }/**
     * Constructor
     * @param firstName To enter an initial value 
     * @param middleName To enter an initial value 
     * @param lastName To enter an initial value 
     * @param country To enter an initial value 
     * @param nationality To enter an initial value 
     * @param id To enter an initial value 
     * @param Age To enter an initial value 
     * @param phone_Number To enter an initial value 
     */
    public Hajj_Information(String firstName, String middleName, String lastName ,String country,String nationality,int id,int Age, int phone_Number) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.id = id;
        this.phone_Number = phone_Number;
        this.Age=Age;
        this.Nationality = nationality;
        this.country = country;

    }
    

    
    /**
     * To set user's middle name
     * @param  firstName to be entered
     * 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * To get user's first name
     * @return  first Name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * To get user's middle name
     * @return  middle Name
     */
    public String getMiddleName() {
        return middleName;
    }
    /**
     * To set user's middle name
     * @param middleName to be entered
     * 
     */

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    /**
     * To get user's last name
     * @return  last Name
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * To set user's first name
     * @param lastName to be entered
     * 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * To get user's Id
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * To set user's id
     * @param id to be entered
     * 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * To get user's phone number
     * @return phone number
     */
    public int getPhone_Number() {
        return phone_Number;
    }
    /**
     * To set user's phone number
     * @param phone_Number to be entered
     * 
     */
    public void setPhone_Number(int phone_Number) {
        this.phone_Number = phone_Number;
    }
    /**
     * To get user's Age
     * @return Age
     */
    public int getAge() {
        return Age;
    }
    /**
     * To set user's Age
     * @param Age to be entered
     */
    public void setAge(int Age) {
        this.Age = Age;
    }
    /**
     * To get user's Nationality
     * @return Nationality
     */
    public String getNationality() {
        return Nationality;
    }
    /**
     * To set user's Nationality
     * @param  Nationality to be entered
     * 
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }
    /**
     * To  get user's country
     * @return country
     */
    public String getCountry() {
        return country;
    }
    /**
     * To set user's country
     * @param  country to be entered
     * 
     */
    public void setCountry(String country) {
        this.country = country;
    }
    /**
     * to get permit number hajj
     * @return permit number hajj 
     */
    public String getPermitNOhaj() {
     
         int primetnum1 = (int) (Math.random() * 200);// random numbers for haj number
         int primetnum2 = (int) (Math.random() * 200);
         String permitNOhaj = "22" + primetnum1 +primetnum2 ;//hajjnum
        
        return permitNOhaj;
    }
    /**
     * to set the permit number hajj
     * @param permitNOhaj to be entered
     */
    public void setPermitNOhaj(String permitNOhaj) {
        this.permitNOhaj = permitNOhaj;
    }
    /**
     * To ask user about last hajj
     * @param year to be entered
     * @return true or false
     */
    public boolean Last_hajj(int year) {
        if (year == 2017 | year == 2018 |year == 2019 | year ==2020 |year ==2021)
            return false ;
       else
            return true;

    }

    /**
     * to compare age and make sure the age is over 18
     * @param age to be entered
     * @return true or false
     */
    public boolean Accsept_Age(int age) {
        if(age<18)
            return true;

        else
        return false;

    }

    @Override
    public String toString() {
        return "Hajj_Information{" +
                "firstName :" + firstName + "\n" +
                " middleName :" + middleName + "\n" +
                " lastName :" + lastName + "\n" +
                " id " + id +"\n"+
                " phone_Number :" + phone_Number +"\n"+
                " Age :" + Age +"\n"+
                " Nationality :" + Nationality + "\n" +
                " country :" + country ;
    }

}