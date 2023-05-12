package ALRAHMA1.company;

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
    Camp camp;
    Menu menu;
    Tourist_trips service;

    public Hajj_Information() {
    }

    public Hajj_Information(String firstName, String middleName, String lastName, int id, int phone_Number) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.id = id;
        this.phone_Number = phone_Number;
        this.Age=Age;
    }

    public Hajj_Information(String firstName, String middleName, String lastName, int id) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.id=id;
    }

    public Hajj_Information(String firstName, String middleName, String lastName, int age,String Nationality,String country,int id,int phone_Number ) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.Age=age;
        this.Nationality=Nationality;
        this.country=country;
        this.id=id;
    }
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

    public Hajj_Information(String permitNOhaj) {
        this.permitNOhaj = permitNOhaj;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(int phone_Number) {
        this.phone_Number = phone_Number;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPermitNOhaj() {
        return permitNOhaj;
    }

    public void setPermitNOhaj(String permitNOhaj) {
        this.permitNOhaj = permitNOhaj;
    }

    public boolean Last_hajj(int year) {
        if (year == 2017 |year == 2018 |year == 2019 | year ==2020 |year ==2021)
            return false ;
       else
            return true;

    }

    public boolean Accsept_Age(int age) {
        if (age<18)
            return true;
            //System.out.println("Sorry, your age is less then required ");
        else
        return false;  //  System.out.println("Countinue");
// هنا العمر اذا العمر اكثر ١٨ ينقبل
        // اقل من ١٨ ماينقبل
    }




    }



