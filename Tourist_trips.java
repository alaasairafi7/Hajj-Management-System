package ALRAHMA1.company;

import java.util.*;

public class Tourist_trips implements Hajj_administration {
    //int Datasimcard;
private static final int Extra_buss = 3;
    private static final int capsity = 144;
    public static final int sets = 48;
    private int NoHT;
    ArrayList<Hajj_Information> p = new ArrayList<Hajj_Information>();
    int add = 0;// obj

    public Tourist_trips(int NoHT) {
        this.NoHT = NoHT;
    }

    public void our_trips() {
        System.out.println(
                "وايضا رحلات الى منطقة جدة لرؤية اطول نافورة بالعالم، وجمال البحر الاحمر، ورحلة الى فقيه اكواريم وهناك أيضا عدة متاحف، وزيارة المدينة القديمة بجدة \n" +
                "ونختتم برحلة الى المدينة المنورة، مدينة الرسول صلى الله عليه وسلم  ١- المسجد النبوي ٢- مسجد قباء  ٣- مقبرة البقيع ٤- محطة الحجاز، وجولة سريعة في المدينة المنورة  \n" +
                "We have trips around Mecca 1- Makkah Tower Museum 2- Museum of the Two Holy Mosques 3- Mount Arafat\n" +
                "And also trips to the Jeddah region to see the tallest fountain in the world, the beauty of the Red Sea, a trip to Fakih Aquarium, and there are also several museums, and a visit to the old city of Jeddah\n" +
                "We conclude with a trip to Medina, the city of the Prophet, may God bless him and grant him peace 1- Al-Masjid Al-Nabawi 2- Quba Mosque 3- Al-Baqi’ Cemetery 4- Al-Hijaz Station, and a quick tour of Medina ");
    }


    public void add_hajj(Health_Information P) {
       p.add(P);
 }

    @Override
    public void display_single(Health_Information p) {
        System.out.println(p.toString());

        Health_Information a = new Health_Information();
        Scanner ab = new Scanner(System.in);
   }
    @Override
    public int search(int Id) {
        int i = 0;
        for (; i < p.size(); i++) {
            if (p.indexOf(i)==Id) ;

            break;
        }
        return i;
    }

    @Override
    public void remove_hajj(Hajj_Information P) {
        p.remove(P);
        System.out.println("Your information has deleted");
    }

    @Override
    public void update_info() {
        Scanner ab = new Scanner(System.in);
        Health_Information c = new Health_Information();
        System.out.println("Enter your ID");
        int id = ab.nextInt();

        System.out.println("Enter your first name");
        String name = ab.next();
        System.out.println("Enter your middel name");
        String mid = ab.next();
        System.out.println("Enter your last name");
        String last = ab.next();
        System.out.println("Enter your number phone");
        int num = ab.nextInt();
        System.out.println("Enter your disease");
        String di = ab.next();
        System.out.println("Enter your age");
        int age=ab.nextInt();
      int index =search(id);
        p.set(index, new Health_Information(name, mid, last, id, num, di ));
    }

    @Override
    public boolean equals(Object o) {
        Hajj_Information h=(Hajj_Information)o;
      if(p.indexOf(o)!=h.getId())
            return true;
         else
            return false;

}
}