package ALRAHMA1.company;

import java.util.*;
import java.awt.Desktop;
import java.net.URI;


public class Main {

  public static void main(String[] args) throws Exception {
       Scanner ab = new Scanner(System.in);
        Health_Information hel = new Health_Information();
        Hajj_Information Haj = new Hajj_Information();
        Hajjadministration2 Idm = new Hajjadministration2();


       int n = 0;
        while (n != 20) {

            System.out.println("1- Choose number one to fill in your information :");

            System.out.println("2- Choose number two to know about types of camps :");
            System.out.println("3- Choose number three to know Toursit trip :");

            try {
                n = ab.nextInt();

            }catch (InputMismatchException N){
                System.err.println("InputMismatchException,Enter only numbers");
                ab.nextLine();
            }
            if (n == 2) {
                System.out.println("Camp 'A' is VIP type , there are a lot of benefits, \n The price start from 16,500 SAR ");
                System.out.println("Camp 'B' is a moderate type , there are less benefits, \n The price start from 10,500 SAR ");
                System.out.println("Camp 'C' is an economy type , there are fewer benefits, \n the price start form 5,500 SAR ");
            }


            switch (n) {
                case 1:
                    try {
                        System.out.println("enter your first name: ");
                        String name = ab.next();
                        System.out.println("enter your middle name: ");
                        String mid = ab.next();
                        System.out.println("enter your last name: ");
                        String last = ab.next();
                        System.out.println("enter your ID ");
                        int Id = ab.nextInt();
                        System.out.println("Enter your phone number");
                        int num = ab.nextInt();
                        System.out.println("Enter your age :");
                        int age = ab.nextInt();
                        System.out.println("Enter your nationality : ");
                        String nat = ab.next();
                        System.out.println("Enter your country :");
                        String con = ab.next();
                        System.out.println("Enter your last doing hajj");
                        int lasthajj = ab.nextInt();
                        String dei = " ";
                        if (hel.Health_Qu() == true) {
                            System.out.println("Enter your disease :");
                            dei = ab.next();
                        }
                        int a = (int) (Math.random() * 200);
                        int c = (int) (Math.random() * 200);
                        String ran = "22" + a + c;//hajjnum
                        if (Haj.Accsept_Age(age) == true)//lees the 18
                            System.out.println("You are not accept becuse your age is youger");
                        else if (Haj.Last_hajj(lasthajj) == false) {
                            System.out.println("You are not accept");
                            System.exit(0);
                        } else
                            System.out.println("You Have been accepted in ALRAHMAH company.");
                        //   Hel=new(name,mid,last,age,nat,con,Id,num,ran,dei);
                        hel = new Health_Information(name, mid, last, age, nat, con, Id, num, ran, dei);


                    } catch (InputMismatchException N) {
                        System.err.println("InputMismatchException, Enter numbers  ");
                    }
                    Idm.add_hajj(hel);
                    break;
                case 2:

                    System.out.println("Enter your choose :");
                    char type = ab.next().charAt(0);
                    switch (type) {
                        case 'A':
                            Camp_A A=new Camp_A();
                            Buss bu = new Buss();
                            Menu_A ma = new Menu_A();
                            Hajjadministration2 haj = new Hajjadministration2();
                            int Num = 0;
                            while (Num != 4) {
                                System.out.println("If you want to know about \n" +
                                        "1-servicesOfCamp \n 2-description \n 3-Location \n 4-menu \n 5-reservation information");

                                Num = ab.nextInt();
                                switch (Num) {
                                    case 1: {
                                        A.servicesOfCamp();
                                        break;
                                    }
                                    case 2: {
                                        A.description();
                                        break;
                                    }
                                    case 3: {
                                        A.Location();
                                        System.out.println("Do you want to show the location on google map ");
                                        String Ask_userA = ab.next().toLowerCase();
                                        if (Ask_userA.equalsIgnoreCase("Yes")) {
                                            Desktop D = Desktop.getDesktop();
                                            D.browse(new URI("https://goo.gl/maps/88nG6ZnhMotaB1FS8"));
                                            break;
                                        }
                                    }
                                    case 4: {
                                      ma.description();
                                      int num=0;
                                      while ( num!=4) {
                                          System.out.println("If you want to display :\n 1-breakfast \n2-lunch\n3-dinner");
                                          switch (num){
                                              case 1:
                                                  ma.BreakFast();
                                                  break;
                                              case 2:
                                                  ma.lunch();
                                                  break;

                                              case 3:
                                                  ma.Dinner();
                                              break;


                                          }// switch menu

                                      }// while menu
                                        }//case 4


                                } // switch A
                            } // while A

                        case 'B':
                            Camp_B B = new Camp_B();
                            B.servicesOfCamp();
                            B.description();
                            B.Location();
                            System.out.println("Do you want to show the location on google map ");
                            String Ask_userB = ab.next().toLowerCase();
                            if (Ask_userB.equalsIgnoreCase("Yes")) {
                                Desktop D = Desktop.getDesktop();
                                D.browse(new URI("https://goo.gl/maps/88nG6ZnhMotaB1FS8"));

                            }
                            break;
                        case 'C':
                            Camp_C C = new Camp_C();
                            C.servicesOfCamp();
                            C.description();
                            C.Location();
                            System.out.println("Do you want to show the location on google map ");
                            String Ask_userC = ab.next().toLowerCase();
                            if (Ask_userC.equalsIgnoreCase("Yes")) {
                                Desktop D = Desktop.getDesktop();
                                D.browse(new URI("https://goo.gl/maps/88nG6ZnhMotaB1FS8"));
                            }
                            break;
                    }
            }
                  /*


                    }
            }

        }}}


                   */

            }
        }
  }
