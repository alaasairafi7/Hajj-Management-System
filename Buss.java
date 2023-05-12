package ALRAHMA1.company;

public class Buss extends Hajj_Information {
    public static  int NUMBER_OF_BUSS=5;
    public static  int NUMBER_OF_SEATS=1;
    public static  int CAPACITY_OF_AllBUSS=240;



    public Buss() {
    }
    public Buss(String permitNOhaj ){
        super(permitNOhaj);
    }

    public void First_station() {
        System.out.println("On the 7th of Dhul Hijjah, pilgrims are transferred from Jeddah to Mina at 5 pm.");
        System.out.println("في يوم ثامن ذي الحجة يتم نقل الحجاج من جدة إلى منى في التوقيت الخامسة عصرا.");}

    public void Secound_station() {
        System.out.println("On the morning of 9th Dhul Hijjah, pilgrims are transferred from Mina to Arafa.");
        System.out.println("في صباح يوم التاسع ذي الحجة يتم نقل الحجاج من منى إلى عرفة.");
        System.out.println("On the same morning of 9th Dhul Hijjah, pilgrims are transferred from Arafa to Muzdalifah.");
        System.out.println("في نفس صباح يوم التاسع ذي الحجة يتم نقل الحجاج من عرفة إلى مزدلفة.");}

    public void Third_station() {
        System.out.println("On the morning of 10th Dhul Hijjah, pilgrims are transferred from Muzdalifah to Mina.");
        System.out.println("في صباح العاشر من ذي الحجة يتم نقل الحجاج من مزدلفة إلى منى.");
    }

    public void Fourth_station() {
        System.out.println("On 12th Dhul Hijjah after throwing, pilgrims are transferred from Mina to The holy mosque for farewell Tawaf.");
        System.out.println("في الثاني عشر من ذي الحجة بعد الرمي يتم نقل الحجاج من منى إلى المسجد الحرام لتوديع الطواف.");
    }

    public void Display_sets(){
        String[][] seats = {

            {"A1", "A13 \t", "A25", "A37"},
            {"A2", "A14 \t", "A26", "A38"},
            {"A3", "A15 \t", "A27", "A38"},
            {"A4", "A16 \t", "A28", "A40"},
            {"A5", "A17 \t", "A29", "A41"},
            {"A6", "A18 \t", "A30", "A42"},
            {"A7", "A19 \t", "A31", "A43"},
            {"A8", "A20 \t", "A32", "A44"},
            {"A9", "A21 \t", "A33", "A43"},
            {"A10", "A22 \t", "A34", "A46"},
            {"A11", "A23 \t", "A35", "A47"},
            {"A12", "A24 \t", "A36", "A48"}


    };
        System.out.println();

        for (int row = 0; row < seats.length; row++) {
            System.out.print(seats[row]);
            for (int col = 0; col < seats[row].length; col++) {

                System.out.print("\t" + seats[row][col]);

            }
            System.out.println();

        }}// we will use 2D array to display the sets
 @Override
    public String toString() {
        return  "Your set in :A"+NUMBER_OF_SEATS++;
    }



}
