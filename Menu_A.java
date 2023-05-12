package alrahma1.company;

/**
 * this class extend the abstract Menu class, Describe what is in the VIP menu(A) with more advantages
 */
public class Menu_A extends Menu {

    /**
     * in this method display all breakfast contents of the menu.
     */
    @Override
    public void BreakFast(){
        System.out.println(
                "Breakfasts:\n" +
                "1.green salad ,A set of stuffed eggplant, cream caramel plate\n" +
                "2.fattoush salad, slices of halloumi cheese, plate of sliced seasonal fruits \n" +
                "3.types of mortadella, jam, honey, vermicelli, Chocolate brownie");}
    /**
     * in this method display all lunch contents of the menu.
     */
    @Override
    public void lunch(){
        System.out.println(
                "Lunches:\n" +
                "1.french fries , Chicken shawerma or Beef shawerma, cream caramel plate\n" +
                "2.preheated chicken, vegetables with chicken or vegetables with meat, plate of sliced seasonal fruits\n" +
                "3.chicken caesar salad, chicken tagine meat tagine, Chocolate brownie");
    }
    /**
     * in this method display all dinner contents of the menu.
     */
    @Override
    public void Dinner(){
        System.out.println(
                "Dinners:\n" +
                "1.french fries, chicken burgers or meat burgersm, pieces of cake \n" +
                "2.fried kibbeh, Spinach pie or cheese pie, plate of sliced seasonal fruits \n" +
                "3.Hummus, falafl, pudding");
    }
    /**
     * In this method displays the list that contains the additions to each menu
     */
    @Override
    public void other(){
        System.out.println(
                "hot drinks:\n" +
                "Freshly brewed regular decaffeinated coffee\n" +
                "A variety of tea and herbal drinks\n" +
                "cold drinks:\n" +
                "Pepsi, Coca-Cola, 7up, small water, large water\n" +
                "Mojito in three flavors: blueberry, strawberry, red berry\n" +
                "Ice cream section:\n" +
                "Variety of ice creams\n" +
                "Served with a set of toppings, macaroons and waffles.");
    }

}








