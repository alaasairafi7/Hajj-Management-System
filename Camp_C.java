package ALRAHMA1.company;



public class Camp_C extends Camp{
int Numofbed=90;
int Numofcamps=9;

    public void servicesOfCamp(){ System.out.println("");
        System.out.println("1-We offer free transportation to the Holy Mosque and the holy sites limited times in the day \n" +
                "١- نقدم خدمه النقل الى المسجد الحرام والمشاعر المقدسة لساعات محدودة باليوم ");
        System.out.println("2- Distribution of refrigerators for water bottles" +
                "\n٢ -توزيع البرادات الخاصة بعبوات المياه");
        System.out.println("3- we provide protection and safety for any issues " +
                "\n٣- نحن نقدم الحماية والأمان لأي مشاكل");
        System.out.println("4- First aid and paramedic services around the clock are provided Providing masks and sterilizers to prevent viruses" +
                "\n٤- يتم تقديم خدمات الإسعافات الأولية والمسعفين وتوزيع الأقنعة والمعقمات على مدار الساعة");
        System.out.println("5-We provide nutritional programs\n" +
                 "٥- البرامج الغذائية");
        }

    public void Location(){
        System.out.println("Camp C is located in AL-AZIZIYYAH");
        System.out.println("يقع مخيم C في العزيزية");
    }

    public  void description(){
        System.out.println("We have spacious camps with an area of 25 km, and we provide each person with a single bed, a pillow and a blanket\n" +
                "Dedicated toilets for each camp, free food services, as well as TV, Speakers to alert you when entering the prayer.\n ");
        System.out.println("لدينا مخيمات واسعة بمساحة ٢٥م، ونوفر لكل حاج سرير منفرد ووسادة وبطانية\n" +
                "ودورات مياه مخصصة لكل مخيم، وخدمات طعام مجانية، بالإضافة الى تلفاز\n" +
                "و مكبرات صوت لتنبيهك عند دخول الصلاة\n");
    }

    @Override
    public String toString() {
        return "Your reservation in camp C in bed"+Numofbed--;
    }
}
