package alrahma1.company;
/**
 * this class extend the abstract Menu class, Describe what is in the menu(C) that has less other advantages.
 */
public class Menu_C extends Menu {

    /**
     * in this method display all breakfast contents of the menu.
     */
    @Override
    public void BreakFast(){
        System.out.println(
                " Breakfasts:\n" +
                "Sandwiches: Liver, Shakshouka, Cheese\n" +
                "Dishes: Liver, Shakshouka, Foul");
    }

    /**
     * in this method display all lunch contents of the menu.
     */
    @Override
    public void lunch(){
        System.out.println(

                " Lunches:\n" +
                "Sandwiches: chicken, tuna\n" +
                "Dishes: chicken, tuna");
    }

    /**
     * in this method display all dinner contents of the menu.
     */
    @Override
    public void Dinner(){
        System.out.println(
                "Dinners:\n" +
                "Sandwiches: tuna, shakshouka, boiled eggs\n" +
                "Dishes: peas, shakshouka, foul");
    }
    /**
     * In this method displays the list that contains the additions to each menu
     */

    @Override
    public void other(){
        System.out.println(
                         "Sweets:\n" +
                        "A plate of sliced seasonal fruits"+
                        "hot drinks:\n" +
                        "Freshly brewed regular decaffeinated coffee\n" +
                        "A variety of herbal tea\n" +
                        "cold drinks:\n" +
                        "Pepsi, Coca-Cola, 7up, small water, large water\n" +
                        "Apple juice, strawberry juice, mango juice");
    }
}

