package alrahma1.company;

/**
 * abstract class that we describe the methods in the camps that is extends for camp 'B'
 */
public class Camp_B extends Camp{
    int Numofbed=60;
    int Numofcamps=6;
    /**
     * No argument constructor for camp 'B'
     */
    public Camp_B(){}
    /**
     * Display the list of services in the camp 'B'
     */
    @Override
    public void servicesOfCamp(){
        System.out.println("");
        System.out.println("1-We offer free transportation to the Holy Mosque and the holy sites around the clock");
        System.out.println("2-Providing a religious guide for help and guidance" );
        System.out.println("4-we provide protection and safety for any issues " );
        System.out.println("5-First aid and paramedic services around the clock are provided Providing masks and sterilizers to prevent viruses" );
        System.out.println("6-we provide a safekeeping service" );
        System.out.println("7-We provide nutritional programs");
        System.out.println("8-Provide an limited WIFI ");
    }
    /**
     * Gives a brief description of the camp 'B' location and how far it is
     */
    @Override
    public void Location(){
        System.out.println("**Camp B is located in the middle of Mina near Jamarat, about 1 km away**");

    }
    /**
     * Gives a description of the camp 'B' and what it's difference from each camp
     */
    @Override
    public  void description(){
        System.out.println("**We have spacious camps with an area of 30 m, and we provide each person with a single bed, a pillow and a blanket\n" +
                "Dedicated toilets for each camp, free food services, as well as TV**");

    }

    @Override
    public String toString() {
        return "Your reservation in camp B in bed: "+Numofbed--;
    }
}
