package alrahma1.company;
import java.util.*;

/**
 *  A class that has the procedures for hajj
 */
public class Hajj_Status
{
   /**
    * no- argument constructor
    */ 
    Hajj_Status(){
    }

    /**
     * Explain how to prepare for Hajj
     */
    
    public void HajjPerparation(){ // استعدادات الحج
        System.out.println("Labbayk Allaahumma hajj");
        System.out.println("Oh Allah I intended to perform Hajj and made it forbidden to God Almighty, so give good tidings to it");
        System.out.println("Labbek, oh God, you have no partner, you have no partner. Praise be to you, and the king has no partner");
    }

    /**
     * Definition of prohibitions of Ihram so as not to fall into them
     */
    public void ProhibitionsOfIhram(){ //محظورات الاحرام
        System.out.println("Hair removal by shaving or samthing else");
        System.out.println("cutiing nails");
        System.out.println("using perfume on one`s clothes or body after wearing Ihram");
        System.out.println("The contract of marriage engagement intercourse or direct");
        System.out.println("hunting Wild Animals");
        System.out.println("Wear sewn clothes");
        System.out.println("head cover with adhesive");
    }

    /**
     * Formulas to meet the right Hajj
     */
    
    public void FormsForFulfillingHajj(){ //صيغ تلبية انواع النسك
        System.out.println("1-Al-Ifrad:Obligation to perform Hajj, and this is for the one who wants to perform Hajj only,\nand it remains forbidden until the end of Hajj, and he does not have to sacrifice");
        System.out.println("2-Al-Qiran:Obligation to perform Hajj and Umrah for the one who wants to perform Hajj and Umrah together,\nand it remains forbidden until near the end of the Hajj, as it will be explained,\nand a sacrifice (with seven she-camels or seven cows or a sheep)");
        System.out.println("3-Al-Tamatt'u:Labbayk performs Umrah, which is Umrah during the months of Hajj,\nthen performs Hajj in the same year without returning to the homeland faithfully.");

    }

    /**
     * The importance of identifying the pillars of Hajj
     */
    public void PillarsOfHajj(){ //اركان الحج
        System.out.println("Ihram (intention): It is the intention to engage in rituals");
        System.out.println("Standing on Arafat");
        System.out.println("Tawaf Al-Ifadah");
        System.out.println("Sa'i between Safa and Marwa");
    }

    /**
     *  The importance getting to know the duties of Hajj
     */
    public void HajjDuties(){ //واجبات الحج
        System.out.println("Ihram from the Miqat");
        System.out.println("Standing in Arafah until night");
        System.out.println("Overnight in Muzdalifah");
        System.out.println("Overnight in Mina during the days of Tashreeq");
        System.out.println("throwing stones");
        System.out.println("Shaving or shortening the hair");
        System.out.println("farewell circumambulation");
    }

    /**
     * The importance of getting to know the sunnahs of Hajj
     */
    public void SunnahsOfHajj(){ //سنن الحج
        System.out.println(" Washing when Ihram ");
        System.out.println(" Ihram in a white robe ");
        System.out.println(" Talbiyah and raising one’s voice ");
        System.out.println(" Overnight in Mina on the night of Arafat ");
        System.out.println(" kissing the black stone ");
        System.out.println(" Al-Ithtiba’ (Putting the robe under the right armpit during the Advent Tawaf or Umrah) ");
        System.out.println(" Raml (the speed in the first three circuits of the tawaf of the arrival or the pilgrimage) ");
        System.out.println(" Tawaf al-Qadūm for the comparative and the singular ");
    }

    /**
     * The importance of identifying the rituals of slaughter
     */
    public void Alhuda(){ // الهدي
        System.out.println("Place of slaughter: Mina, and it is permissible in Makkah and the rest of the Haram ");
        System.out.println("Kind: camel, cow or sheep ");
        System.out.println("What is not permissible from sacrifice:The one-eyed whose nakedness is clear, \nthe lame whose lameness is clear, the sick person whose illness is clear, \nthe weak one that purifies, and safety from the wrath of the close, which is the absence of most of them.");
    }

    /**
     * Identify the times of Hajj types
     */
    public void HajjGuide(){ //مواقيت الحج
        System.out.println("1- The pleasant pilgrimage");
        System.out.println("2- Compare");
        System.out.println("3- Individuals");
    }


    /**
     * Counter to calculate the circumambulattion and the quest
     */
    
    public void QuestCounter(){ // العداد
        
        Scanner ab=new Scanner (System.in);
        int x=0;
        while(x!=7){
           
            System.out.println("Enter the part number");
            System.out.println("--------");
               try{
            x=ab.nextInt();
               } catch(Exception e){
                    System.err.println("Enter only numbers from 1-7 !");
                    }
            switch(x){
                case 1: 
                 
                    System.out.println("You are now in the first half");
                   System.out.println("--------");
                    break;
                case 2:
                    System.out.println("You are now in the second half");
               System.out.println("--------");
                    break;
                case 3:
                    System.out.println("You are now in the third half");
                   System.out.println("--------");
                    break;
                case 4:
                    System.out.println("You are now in the fourth half");
                     System.out.println("--------");
                    break;
                case 5:
                    System.out.println("You are now in the fifth half");
                    System.out.println("--------");
                    break;
                case 6:
                    System.out.println("You are now in the sixth half");
              System.out.println("--------");
                    break;
                case 7:
                   System.out.println("You are now in the seventh half");
            

                case 8:
                    System.out.println("The end of Circumambulation /sa'iy ");
                    System.out.println("--------");
                    break;
            


            }
        }

    }
}
