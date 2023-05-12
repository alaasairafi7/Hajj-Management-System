package alrahma1.company;

/**
 * abstract class that we describe the methods in the camps
 */
public abstract class Camp {


    /**
     * No argument constructor for the camps
     */
    public Camp(){}
    /**
     * Display the list of services in the camps
     */
    public abstract void servicesOfCamp();
    /**
     * Gives a brief description of the camps location and how far they are
     */
    public abstract void Location();
    /**
     * Gives a description of the camps and their differences
     */
    public abstract void description();

    public abstract String toString();

}
