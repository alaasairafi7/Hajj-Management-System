package alrahma1.company;

/**
 * in this abstract class there are 3 concrete class menus (A,B,C), Describe what is in the menu‏
 */
    public abstract class Menu {
        /**
         * In this method we are shown a short description of the meal menu
         */
        public void description(){
            System.out.println("***We offer breakfast" +
                    ", lunch and dinner meals that meet all the needs of pilgrims and are characterized by quality and cleanliness***");}

        /**
         * In this method it shows us meal times
         */
        public void Timing(){
            System.out.println(
                    "Breakfast: From 6:30 am to 11 am\n" +"Lunch: from 12 pm to 4 pm\n" +
                    "Dinner: From 7:30 pm to 11 pm");
        }
        /**
         * In this method displays the list that contains the additions to each menu
         */
        public abstract void other();
        /**
         * in this method display all breakfast contents for each category of the menu.
         */
        public abstract void BreakFast();
        /**
         * in this method display all lunch contents for each category of the menu.
         */
        public abstract void lunch();
        /**
         * in this method display all contents of dinner,   for each category of the menu.
         */
        public abstract void Dinner();

    }


