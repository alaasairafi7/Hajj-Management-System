package alrahma1.company;

/**
 * abstract class that we describe the methods in the camps that is extends for camp 'C'
 */

public class Camp_C extends Camp{
   public static int Numofbed=90;
   public static int Numofcamps=9;
    /**
     * No argument constructor for camp 'C'
     */
    public Camp_C(){}
    /**
     * Display the list of services in the camp 'C'
     */
   @Override
    public void servicesOfCamp(){ 
        System.out.println("");
        System.out.println("1-We offer free transportation to the Holy Mosque and the holy sites limited times in the day"
                );
        System.out.println("2-Distribution of refrigerators for water bottles"
                );
        System.out.println("3-we provide protection and safety for any issues "
                );
        System.out.println("4-First aid and paramedic services around the clock are provided Providing masks and sterilizers to prevent viruses ");
        System.out.println("5-We provide nutritional programs ");
    }
    /**
     * Gives a brief description of the camp 'C' location and how far it is
     */
   @Override
    public void Location(){
        System.out.println("**Camp C is located in AL-AZIZIYYAH**");

    }
    /**
     * Gives a description of the camp 'C' and what it's difference from each camp
     */
   @Override
    public  void description(){
        System.out.println("**We have spacious camps with an area of 25 km, and we provide each person with a single bed, a pillow and a blanket\n" +
                "Dedicated toilets for each camp, free food services, as well as TV, Speakers to alert you when entering the prayer** ");

    }

    @Override
    public String toString() {
        return "Your reservation in camp C in bed: "+Numofbed--;
    }
}


