package alrahma1.company;

/**
 * abstract class that we describe the methods in the camps that is extends for camp 'A'
 */
public class Camp_A extends Camp {
  
    
   public static int NumofCamps=5;
   public static int NumofBed=50;
   
    /**
     * No argument constructor for camp 'A'
     */
    public Camp_A(){}
    /**
     * Display the list of services in the camp 'A'
     */
    public void servicesOfCamp() {

        System.out.println("1-We offer free transportation to the Holy Mosque and the holy sites around the clock");
        System.out.println("2-Providing a religious guide for help and guidance ");
        System.out.println("3-Distribution of refrigerators for water bottles ");
        System.out.println("4-we provide protection and safety for any issues ");
        System.out.println("5-First aid and paramedic services around the clock are provided Providing masks and sterilizers to prevent viruses" );
        System.out.println("6-we provide a safekeeping service ");
        System.out.println("7-We provide nutritional programs ");
        System.out.println("8-Provide an unlimited WIFI ");


    }
    /**
     * Gives a brief description of the camp 'A' location and how far it is
     */
    public void Location() {
        System.out.println("**Camp A is located in the middle of Mina near Jamarat, about 500 m away** ");


    }
    /**
     * Gives a description of the camp 'A' and what it's difference from each camp
     */
    public void description() {
        System.out.println("**We have spacious camps with an area of 45 m, and we provide each person with a single bed, a pillow and a blanket\n" +
                "Dedicated toilets for each camp, free food services, as well as TV ,Speakers to alert you when entering the prayer**");

    }


    @Override
    public String toString() {
        return "Your reservation in camp A in Bed: "+NumofBed-- ;
    }
}
