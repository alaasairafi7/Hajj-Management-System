package alrahma1.company;
/**
 * this class extend the abstract Menu class, Describe what is in the moderate menu(B)  in terms of advantages.

 */
public class Menu_B extends Menu {
        /**
         * in this method display all breakfast contents of the menu.
         */
        @Override
        public void BreakFast(){
                System.out.println(
                        "Breakfasts:\n" +
                        "1.green salad ,A set of stuffed eggplant, cream caramel plate\n" +
                        "2.fattoush salad, slices of halloumi cheese, plate of sliced seasonal fruits ");
        }
        /**
         * in this method display all lunch contents of the menu.
         */
        @Override
        public void lunch(){
                System.out.println(
                        "Lunches:\n" +
                        "1.preheated chicken, vegetables with chicken or vegetables with meat, plate of sliced seasonal fruits\n" +
                        "2.chicken caesar salad, chicken tagine meat tagine, Chocolate brownie");
        }
        /**
         * in this method display all dinner contents of the menu.
         */
        @Override
        public void Dinner(){
                System.out.println(
                        "Dinners:\n" +
                        "1.fried kibbeh, Spinach pie or cheese pie, plate of sliced seasonal fruits \n" +
                        "2.Hummus, falafl, pudding");
        }
        /**
         *  In this method displays the list that contains the additions to each menu
         */
        @Override
        public void other(){
                System.out.println(
                        "hot drinks:\n" +
                        "Freshly brewed regular decaffeinated coffee\n" +
                        "A variety of tea and herbal drinks\n" +
                        "cold drinks:\n" +
                        "Pepsi, Coca-Cola, 7up, small water, large water\n" +
                        "Mojito in three flavors: blueberry, strawberry, red berry");
        }

}
