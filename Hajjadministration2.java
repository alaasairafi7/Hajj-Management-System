package ALRAHMA1.company;

import java.util.*;

public  class Hajjadministration2 implements Hajj_administration {
    Hajj_Information[] ar = new Hajj_Information[200];
    ArrayList<Hajj_Information> A = new ArrayList<Hajj_Information>();
    int add = 0;

    public void add_hajj(Health_Information P) {
            ar[add] =P;
            add++;
}



    public void display_single(Health_Information p) {
     /*  Hajj_Information h=new Hajj_Information();
        Scanner ab=new Scanner (System.in);
        System.out.println("Enter the id ");
        int number =ab.nextInt();
        h.setId(number);
        int s=search(h);
        System.out.println(ar[s]);*/

        Buss b = new Buss() ;
        Camp a = new Camp_A();
         Camp_A c= new Camp_A() ;
        Hajj_Information i= new Hajj_Information();
        p.toString();
        System.out.println("your information "+p.toString()+b.toString());
  }

    //public void display_all (){
    //     Buss b = new Buss() ;
    //        Camp a = new Camp_A();
    //
    //        Camp_A c= new Camp_A() ;
    //        Hajj_Information i= new Hajj_Information();
    //        a.toString();
    //        System.out.println("your informaition "+c+b+i); }
    public int search(int Id) {
        int i = 0;
        for (; i < ar.length; i++) {
            if (ar.equals(Id)) ;

            break;
        }
        return i;
    }

    public void remove_hajj(Hajj_Information P) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter you ID ");
        int num = ab.nextInt();

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != null && ar[i].getId() == (num)) {

                ar[i] = null;
                break;
            }
            if (i == ar.length - 1) {
                System.out.println("That requested person is not Hajj at this compny");

            }

        }
    }

    public void update_info() {
        Scanner ab = new Scanner(System.in);
        Health_Information H = new Health_Information();
        System.out.println("Enter you ID ");
        int id = ab.nextInt();
        int c = search(id);
        H.setId(id);
        System.out.println("Enter your first name");
        String name = ab.next();
        System.out.println("Enter your middel name");
        String mid = ab.next();
        System.out.println("Enter your last name");
        String last = ab.next();
        System.out.println("Enter your number phone");
        int num = ab.nextInt();
       H=new Health_Information(name,mid,last,id,num);
    }


    public boolean equals(Object o) {
        Hajj_Information H = (Hajj_Information) o;
        if (this.add != H.getId())
            return false;
        else
            return true;

    }

}