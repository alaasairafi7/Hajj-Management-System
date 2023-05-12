package alrahma1.company;

import java.util.*;
import java.awt.Desktop;
import java.net.URI;


public class Main {

    
  public static void main(String[] args) throws Exception {
      
      
      Scanner ab = new Scanner(System.in);
      Health_Information hel = new Health_Information();
      Hajj_Information Haj = new Hajj_Information();
      Hajjadministration2 Idm = new Hajjadministration2();
      
      System.out.println("*** Welcome you in ALRAHMA company for organization Hajj ***");
      System.out.println("------------------------------------");
      int numofstart = 0;
      while (numofstart != 4) {
          System.out.println("1- Choose number one to fill in your information :");
          System.out.println("2- Choose number two to know about types of camps :");
          System.out.println("3- Choose number three to know Toursit trip :");
          System.out.println("4- End the program ");
          System.out.println("------------------------------------");

          try {
              numofstart = ab.nextInt();
          } catch (InputMismatchException N1) {
              System.err.println("InputMismatchException,Enter only numbers. ");
              ab.nextLine();
          }
          if (numofstart == 2) {
              System.out.println("***Camp 'A' is VIP type , there are a lot of benefits ,\n- The price start from 16,500 SAR ");
              System.out.println("------------------------------------------");
              System.out.println("***Camp 'B' is a moderate type , there are less benefits ,\n- The price start from 10,500 SAR ");
              System.out.println("------------------------------------------");
              System.out.println("**Camp 'C' is an economy type , there are fewer benefits ,\n- the price start form 5,500 SAR ");

          }


      switch (numofstart) {
              case 1: {
                  try {
                      System.out.println("enter your first name: ");
                      String name = ab.next();

                      System.out.println("enter your middle name: ");
                      String mid = ab.next();

                      System.out.println("enter your last name: ");
                      String last = ab.next();

                      System.out.println("enter your ID:");
                      int Id = ab.nextInt();

                      System.out.println("Enter your phone number:");
                      int num= ab.nextInt();

                      System.out.println("Enter your age:");
                      int age = ab.nextInt();

                      System.out.println("Enter your nationality :");
                      String nat = ab.next();

                      System.out.println("Enter your country :");
                      String con = ab.next();

                      String dei = " ";

                      if (hel.Health_Qu() == true) {
                          System.out.println("Enter your disease : ");
                          dei = ab.next();
                      
                      }
                      else {
                          dei= "No diesase.";

                      }
                      
                      
                      System.out.println("Enter your last doing hajj: \n * Enter zero if you did'nt do Hajj ever *.");

                      int lasthajj = ab.nextInt(); // user Enter the last year he has get to hajj

                        String Ran= hel.getPermitNOhaj(); // to get the priemt number for hajj
                     
                      if (Haj.Accsept_Age(age) == true) {//lees the 18
                          System.out.println("Sorry, you are not accepted because of the requirement of age.");
                           System.exit(0);
                   
                      }
                      else if (Haj.Last_hajj(lasthajj) == false) {
                          System.out.println("Sorry, you are not accepted because of the requirement of year of Hajj.");

                          System.out.println("---------------------------------------");
                          System.exit(0);
                      } else {
                          System.out.println("successfully! You Have been accepted in ALRAHMAH company.");
                          System.out.println("------------------------------------------");}
                   
                      
                      hel = new Health_Information(name, mid, last, age, nat, con, Id, num, Ran, dei);


                  } catch (InputMismatchException N) {
                      System.err.println("InputMismatchException, Enter numbers only ");
                      ab.nextLine();
                  }
                  Idm.add_hajj(hel);
                  break;
              }
              case 2: {
                  System.out.println("Enter your choice :");
                  System.out.println("------------------------------------------");
                  char type = ab.next().toUpperCase().charAt(0);
                  
                  
                  switch (type) {
                      case 'A': {  //  ****START CAMP A ****

                          Camp A = new Camp_A();
                          Buss bu = new Buss();
                          Menu ma = new Menu_A();
                          Hajj_Status hs = new Hajj_Status();
                          Hajjadministration2 haj = new Hajjadministration2();
                          int num2 = 0;
                          
                          while (num2 != 8) {
                              System.out.println("\nIf you want to know about: \n" +
                                      "1-servicesOfCamp \n2-description \n3-Location \n4-menu \n5-Stations \n6-about Hajj \n7-display information \n8-Return to beginning");
                              System.out.println("------------------------------------------");
try{
                              num2 = ab.nextInt();
}catch(Exception e){
    System.err.println("Enter only numbers! ");
    ab.nextLine();
}
                              switch (num2) {
                                  case 1: {
                                      A.servicesOfCamp();
                                       System.out.println("------------------------------------------");
                                      break;
                                  }
                                  case 2: {
                                      A.description();
                                       System.out.println("------------------------------------------");
                                      break;
                                  }
                                  case 3: {
                                      A.Location();
                                      System.out.println("Do you want to show the location on google map ?");
                                      String Ask_userA = ab.next().toLowerCase();
                                      if (Ask_userA.equalsIgnoreCase("Yes")) {
                                          Desktop D = Desktop.getDesktop();
                                          D.browse(new URI("https://goo.gl/maps/tNKF97xw276kH9ww8"));
                                          System.out.println("------------------------------------------");

                                      } break;
                                  }
                                  case 4: { //   ****for menu A *****
                                      
                                      ma.description();
                                      int num3 = 0;
                                      while (num3 != 6) {
                                          System.out.println("If you want to display :\n1-Meal times\n2-breakfast \n3-lunch\n4-dinner\n5-other\n6-exit menu");
                                          try{
                                                num3 = ab.nextInt();
                                          }catch (Exception e){
                                                 System.err.print("Enter numbers only! ");
                                                 ab.nextLine();
                                          }
                                        
                                          switch (num3) {
                                              case 1:
                                                   System.out.println("--------");
                                                  ma.Timing();
                                                   System.out.println("--------");
                                                  break;
                                              case 2:
                                                   System.out.println("--------");
                                                    ma.BreakFast();
                                                   System.out.println("--------");
                                                  break;
                                              case 3:
                                                   System.out.println("--------");
                                                  ma.lunch();
                                                   System.out.println("--------");
                                                  break;

                                              case 4:
                                                   System.out.println("--------");
                                                  ma.Dinner();
                                                   System.out.println("--------");
                                                  break;
                                              case 5:
                                                   System.out.println("--------");
                                                  ma.other();
                                                   System.out.println("--------");
                                                  break;
                                              case 6:

                                          }// switch menuA

                                      }// while menuA
                                      break;  }//case 4
                                  case 5: {
                                      System.out.println("the First station is: ");
                                      bu.First_station();

                                      System.out.println("-------------------------------");
                                      System.out.println("the Secound station is: ");
                                      bu.Secound_station();

                                      System.out.println("-------------------------------");
                                      System.out.println("the Third station is: ");
                                      bu.Third_station();

                                      System.out.println("-------------------------------");
                                      System.out.println("the Fourth station is: ");
                                      bu.Fourth_station();

                                      System.out.println("-------------------------------");
                                      break;
                                  } // end case of station

                                  case 6: {
                                      int num4 = 0;
                                    while (num4 != 11) {
                                    System.out.println("If you want to display :\n1-Hajj guide video: \n2-Hajj Perparation:\n3-Prohibitions Of Ihram: \n4-Forms For Fulfilling Hajj: \n5-Pillars Of Hajj:\n6-Hajj Duties:\n7-Sunnahs Of Hajj:\n8-Alhuda:\n9-Hajj Guide:\n10-Quest Counter:\n11-Exit Hajj Status");
try{
     num4 = ab.nextInt();
}catch(Exception e1){
    System.err.println("Enter only numbers! ");
    ab.nextLine();
}
                                     
                                      switch (num4) {
                                         
                                            case 1:{
                                           
                                                  Desktop D = Desktop.getDesktop();
                                                  D.browse(new URI("https://youtu.be/BWYm2ycRN3I"));
                                                  System.out.println("------------------------------------------");
                                                  break;

                                          }
                                          case 2:
                                                 System.out.println("--------");
                                              hs.HajjPerparation();
                                                System.out.println("--------");
                                              break;
                                          case 3: 
                                                 System.out.println("--------");
                                              hs.ProhibitionsOfIhram();
                                                System.out.println("--------");
                                              break;
                                          case 4: 
                                                 System.out.println("--------");
                                              hs.FormsForFulfillingHajj();
                                                System.out.println("--------");
                                              break;
                                          case 5: 
                                                 System.out.println("--------");
                                              hs.PillarsOfHajj();
                                                System.out.println("--------");
                                              break;
                                          case 6: 
                                                 System.out.println("--------");
                                              hs.HajjDuties();
                                                System.out.println("--------");
                                              break;
                                          case 7: 
                                                 System.out.println("--------");
                                              hs.SunnahsOfHajj();
                                                System.out.println("--------");
                                              break;
                                          case 8: 
                                                 System.out.println("--------");
                                              hs.Alhuda();
                                                 System.out.println("--------");
                                              break;
                                              
                                          case 9:
                                            System.out.println("--------");
                                              hs.HajjGuide();
                                             System.out.println("--------");
                                            
                                              break;
                                          case 10:
                                               hs.QuestCounter();
                                              break;
                                      } // switch 6
                                    
                                  } // end case 6
                               break;
                                  }
                                  
                                  //start case 7
                                  case 7: {
                                      try {
                                          System.out.println("Do you want to confirm your reservation ?");
                                          String ans = ab.next();
                                          if (ans.equalsIgnoreCase("yes")) {
                                              System.out.println("-------------------------------");
                                              bu.Display_sets();
                                               System.out.println("*********");
                                               Idm.display_singleA();
                                              System.out.println("*********");
                                          } else if (ans.equalsIgnoreCase("no")) {
                                              System.out.println("Do you want to update your information  ?");
                                              ans = ab.next();
                                              if (ans.equalsIgnoreCase("yes")) {
                                                  Idm.update_info();
                                              }
                                              System.out.println("Do you want to remove your information ?");
                                              ans = ab.next();
                                              if (ans.equalsIgnoreCase("yes")) {
                                                  Idm.remove_hajj(hel);
                                             
                                              }
                                          }
                                      } catch (Exception e) {
                                          System.out.println("there is no information !");
                                      }
                                      
                                      // switch A
                                      break;
                                  } // end case 7


                              }// end switch A

                          } //end while A

                          break;
                      }
                      case 'B': {   // ****start campB*****

                          Camp B = new Camp_B();
                          Buss b1 = new Buss();
                          Menu B2 = new Menu_B();
                          
                          Hajj_Status h = new Hajj_Status();
                          Hajjadministration2 Haj1 = new Hajjadministration2();
                          int Num1 = 0;
                          while (Num1 != 8) {
                              System.out.println("\nIf you want to know about: \n"+
                                      "1-servicesOfCamp \n2-description \n3-Location \n4-menu \n5-Stations \n6-about Hajj \n7-display information \n8-Return to beginning");
                              System.out.println("------------------------------------------");
try{
      Num1 = ab.nextInt();
}catch (Exception e1){
    System.err.print("Enter numbers only! ");
    ab.nextLine();
}
                            
                              switch (Num1) {
                                  case 1: {
                                      B.servicesOfCamp();
                                       System.out.println("------------------------------------------");
                                      break;
                                  }
                                  case 2: {
                                      B.description();
                                       System.out.println("------------------------------------------");
                                      break;
                                  }
                                  case 3: {
                                      B.Location();
                                      System.out.println("Do you want to show the location on google map ?");

                                      String Ask_userA = ab.next().toLowerCase();
                                      if (Ask_userA.equalsIgnoreCase("Yes")) {
                                          Desktop D = Desktop.getDesktop();
                                          D.browse(new URI("https://goo.gl/maps/dLsTHFKbCcT4mi9W8"));
                                          System.out.println("------------------------------------------");
                                          break;
                                      }
                                      break;
                                  }
                                  
                                  case 4: { // for menuB
                                      B2.description();
                                      int num3 = 0;
                                      while (num3 != 6) {
                                          System.out.println("If you want to display :\n1-Meal times\n2-breakfast \n3-lunch\n4-dinner\n5-other\n6-Exit Menu");
try{ 
    num3 = ab.nextInt();
    
}catch(Exception e1){
 System.err.print("Enter numbers only! ");
 ab.nextLine();
}
                                         
                                          switch (num3) {
                                              case 1:
                                                   System.out.println("--------");
                                                  B2.Timing();
                                                   System.out.println("--------");
                                                  break;
                                              case 2:
                                                   System.out.println("--------");
                                                  B2.BreakFast();
                                                   System.out.println("--------");
                                                  break;
                                              case 3:
                                                   System.out.println("--------");
                                                  B2.lunch();
                                                   System.out.println("--------");
                                                  break;

                                              case 4:
                                                   System.out.println("--------");
                                                  B2.Dinner();
                                                   System.out.println("--------");
                                                  break;
                                              case 5:
                                                   System.out.println("--------");
                                                  B2.other();
                                                   System.out.println("--------");
                                                  break;
                                              case 6:
                                          }// switch menuB

                                      }// while menuB
                                      break; 
                                  }//case 4
                              

                                  case 5: {

                                      System.out.println("the First station is: ");
                                      b1.First_station();
                                      System.out.println("-------------------------------");
                                      System.out.println("the Secound station is: ");
                                      b1.Secound_station();
                                      System.out.println("-------------------------------");
                                      System.out.println("the Third station is: ");
                                      b1.Third_station();
                                      System.out.println("-------------------------------");
                                      System.out.println("the Fourth station is: ");
                                      b1.Fourth_station();
                                      System.out.println("-------------------------------");
                                      break;
                                  } // end cases of station

                                  case 6: {
                                      int num6 = 0;
                                      while (num6 != 11){
                                         System.out.println("If you want to display :\n1-Hajj guide video: \n2-Hajj Perparation:\n3-Prohibitions Of Ihram: \n4-Forms For Fulfilling Hajj: \n5-Pillars Of Hajj:\n6-Hajj Duties:\n7-Sunnahs Of Hajj:\n8-Alhuda:\n9-Hajj Guide:\n10-Quest Counter:\n11-Exit Hajj Status");
                                         try{
                                             num6 = ab.nextInt();
                                         }catch(Exception e){
                                              System.err.print("Enter numbers only! ");
                                              ab.nextLine();
                                         }
                                         
                                          switch (num6) {
                        case 1:{
                                           
                                                  Desktop D = Desktop.getDesktop();
                                                  D.browse(new URI("https://youtu.be/BWYm2ycRN3I"));
                                                  System.out.println("------------------------------------------");
                                                  break;

                                          }
                                          case 2:
                                                 System.out.println("--------");
                                              h.HajjPerparation();
                                                System.out.println("--------");
                                              break;
                                          case 3: 
                                                 System.out.println("--------");
                                              h.ProhibitionsOfIhram();
                                                System.out.println("--------");
                                              break;
                                          case 4: 
                                                 System.out.println("--------");
                                              h.FormsForFulfillingHajj();
                                                System.out.println("--------");
                                              break;
                                          case 5: 
                                                 System.out.println("--------");
                                              h.PillarsOfHajj();
                                                System.out.println("--------");
                                              break;
                                          case 6: 
                                                 System.out.println("--------");
                                              h.HajjDuties();
                                                System.out.println("--------");
                                              break;
                                          case 7: 
                                                 System.out.println("--------");
                                              h.SunnahsOfHajj();
                                                System.out.println("--------");
                                              break;
                                          case 8: 
                                                 System.out.println("--------");
                                              h.Alhuda();
                                                 System.out.println("--------");
                                              break;
                                          case 9:
                                                 System.out.println("--------");
                                              h.HajjGuide();
                                               System.out.println("--------");
                                              break;
                                          case 10:
                                               h.QuestCounter();
                                              break;
                                      } // switch 6
                                
                                  } // end case 6
                                      break;
                                  }
                                  
                      
                  
                                  case 7: {
                                      try {
                                          System.out.println("Do you want to confirm your reservation ?");

                                          String ans = ab.next();
                                          if (ans.equalsIgnoreCase("yes")) {
                                              System.out.println("The sets of buss :");

                                              b1.Display_sets();
                                              System.out.println("*********");
                                              Idm.display_singleB();
                                              System.out.println("*********");
                                          } else if (ans.equalsIgnoreCase("no")) {
                                              System.out.println("Do you want to update your information ?");

                                              ans = ab.next();
                                              if (ans.equalsIgnoreCase("yes")) {
                                                  Idm.update_info();
                                              }
                                              System.out.println("Do you want to remove your information ?");

                                              ans = ab.next();
                                              if (ans.equalsIgnoreCase("yes")) {
                                                  Idm.remove_hajj(hel);
                                                    
                                              }
                                          }
                                      } catch (Exception e) {
                                          System.out.println("there is no information ! ");
                                      }
                                      // switch A
                                      break;
                                  } // end case7

                              }// end switch num

                          } //end while
                          break;
                      } //end case
      
  
                      
                      case 'C': // ****START CAMP C****
                          Camp C = new Camp_C();

                          Buss C1 = new Buss();
                          Menu_C C2 = new Menu_C();
                          Hajj_Status HC = new Hajj_Status();
                          
                          Hajjadministration2 Haj2 = new Hajjadministration2();
                          int Num2 = 0;
                          while (Num2 != 8) {
                              System.out.println("\nIf you want to know about :\n" +
                                      "1-servicesOfCamp \n2-description \n3-Location \n4-menu \n5-Stations \n6-about Hajj \n7-display information \n8-Return to biging");

                              System.out.println("------------------------------------------");
                              try{
                                                        Num2 = ab.nextInt();
                                         }catch(Exception e){
                                              System.err.print("Enter numbers only! ");
                                              ab.nextLine();
                                         }
                                         
                  
                              switch (Num2) {
                                  case 1: {
                                      C.servicesOfCamp();
                                       System.out.println("------------------------------------------");
                                      break;
                                  }
                                  case 2: {
                                      C.description();
                                       System.out.println("------------------------------------------");
                                      break;
                                  }
                                  case 3: {
                                      C.Location();
                                      System.out.println("Do you want to show the location on google map ?");

                                      String Ask_userC = ab.next().toLowerCase();
                                      if (Ask_userC.equalsIgnoreCase("Yes")) {
                                          Desktop D = Desktop.getDesktop();
                                          D.browse(new URI("https://goo.gl/maps/48xDfp1Ls8SYgadr5"));
                                          break;
                                      }
                                      break;
                                  }
                                  case 4: { // *****for menu C*****
                                      C2.description();
                                      int num3 = 0;
                                      while (num3 != 6) {
                                          System.out.println("If you want to display :\n1-Meal times\n2-breakfast \n3-lunch\n4-dinner\n5-other\n6-Exit Menu");
try{     
    num3 = ab.nextInt();
                                            
                                         }catch(Exception e){
                                              System.err.print("Enter numbers only! ");
                                              ab.nextLine();
                                         }
                                         
                                    
                                          switch (num3) {
                                              case 1:
                                                   System.out.println("--------");
                                                  C2.Timing();
                                                   System.out.println("--------");
                                                  break;
                                              case 2:
                                                   System.out.println("--------");
                                                  C2.BreakFast();
                                                   System.out.println("--------");
                                                  break;
                                              case 3:
                                                   System.out.println("--------");
                                                  C2.lunch();
                                                   System.out.println("--------");
                                                  break;

                                              case 4:
                                                   System.out.println("--------");
                                                  C2.Dinner();
                                                   System.out.println("--------");
                                                  break;
                                              case 5:
                                                   System.out.println("--------");
                                                  C2.other();
                                                   System.out.println("--------");
                                                  break;
                                              case 6:

                                          }// switch menuA

                                      }// while menuA
                                      break;  }//case 4

                                  case 5: { 

                                      System.out.println("the First station is: ");
                                      C1.First_station();
                                      System.out.println("-------------------------------");
                                      System.out.println("the Secound station is: ");
                                      C1.Secound_station();
                                      System.out.println("-------------------------------");
                                      System.out.println("the Third station is: ");
                                      C1.Third_station();
                                      System.out.println("-------------------------------");
                                      System.out.println("the Fourth station is: ");
                                      C1.Fourth_station();
                                      System.out.println("-------------------------------");
                                      break;
                                  } // end cases of station

                                  case 6: {
                                      int num7 = 0;
                                      while (num7 != 11){
                                          System.out.println("If you want to display :\n1-Hajj guide video: \n2-Hajj Perparation:\n3-Prohibitions Of Ihram: \n4-Forms For Fulfilling Hajj: \n5-Pillars Of Hajj:\n6-Hajj Duties:\n7-Sunnahs Of Hajj:\n8-Alhuda:\n9-Hajj Guide:\n10-Quest Counter:\n11-Exit Hajj Status");
                                          try{
                                                   num7 = ab.nextInt();
                                         }catch(Exception e){
                                              System.err.print("Enter numbers only! ");
                                              ab.nextLine();
                                         }
                                         
                              
                                      switch (num7) {
                                          
                                          case 1:{
                                           
                                                  Desktop D = Desktop.getDesktop();
                                                  D.browse(new URI("https://youtu.be/BWYm2ycRN3I"));
                                                  System.out.println("------------------------------------------");
                                                  break;

                                          }
                                          case 2:
                                                 System.out.println("--------");
                                              HC.HajjPerparation();
                                                System.out.println("--------");
                                              break;
                                          case 3: 
                                                 System.out.println("--------");
                                              HC.ProhibitionsOfIhram();
                                                System.out.println("--------");
                                              break;
                                          case 4: 
                                                 System.out.println("--------");
                                              HC.FormsForFulfillingHajj();
                                                System.out.println("--------");
                                              break;
                                          case 5: 
                                                 System.out.println("--------");
                                              HC.PillarsOfHajj();
                                                System.out.println("--------");
                                              break;
                                          case 6: 
                                                 System.out.println("--------");
                                              HC.HajjDuties();
                                                System.out.println("--------");
                                              break;
                                          case 7: 
                                                 System.out.println("--------");
                                              HC.SunnahsOfHajj();
                                                System.out.println("--------");
                                              break;
                                          case 8: 
                                                 System.out.println("--------");
                                              HC.Alhuda();
                                                 System.out.println("--------");
                                              break;
                                          case 9:
                                                 System.out.println("--------");
                                              HC.HajjGuide();
                                               System.out.println("--------");
                                              break;
                                          case 10:
                                               HC.QuestCounter();
                                              break;
                                      } // switch 6
                             
                                  } // end case 6
                                      break;
                                  }
                              
                                case 7: {
                                      try {
                                          System.out.println("Do you want to confirm your reservation ?");

                                          String ans = ab.next();
                                          if (ans.equalsIgnoreCase("yes")) {
                                              System.out.println("The sets of buss :");

                                              C1.Display_sets();
                                              System.out.println("*********");
                                              Idm.display_singleC();
                                              System.out.println("*********");
                                          } else if (ans.equalsIgnoreCase("no")) {
                                              System.out.println("Do you want to update your information ?");

                                              ans = ab.next();
                                              if (ans.equalsIgnoreCase("yes")) {
                                                  Idm.update_info();
                                              }
                                              System.out.println("Do you want to remove your information ?");

                                              ans = ab.next();
                                              if (ans.equalsIgnoreCase("yes")) {
                                                  Idm.remove_hajj(hel);
                                              
                                              }
                                          }
                                      } catch (Exception e) {
                                          System.out.println("there is no information ! ");
                                      }
                                      
                                      // switch A
                                      break;
                                  } // end case7
                              
                              } // end switch

                          } // end while

                  } // end switch type


                  break;
              } // end switch

  
  

              case 3: {
                  int num = 0;
                  Tourist_trips t = new Tourist_trips();
                  Health_Information hell1 = new Health_Information();
                  t.our_trips();
                  System.out.println("------------------------------------------");
                  System.out.println("Do you want to join to our trips ?");

                  System.out.println("------------------------------------------");
                  String an = ab.next();
                  if (an.equalsIgnoreCase("yes")) {

                      while (num != 5) {
                          System.out.println("------------------------------------------");
                          System.out.println("1- Choose number one to fill in your information :");

                          System.out.println("2-Choose number two to confirm and display your reservation ");

                          System.out.println("3-Choose number three to update your reservation ");

                          System.out.println("4-Choose number four to remove your reservation ");

                          System.out.println("5-End program ..");

                          System.out.println("------------------------------------------");
                          num = ab.nextInt();



                          switch (num) {
                              case 1: {
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

                                      int numpho = ab.nextInt();
                                      System.out.println("Enter your nationality : ");

                                      String nat = ab.next();
                                      System.out.println("Enter your country :");
                                      String con = ab.next();

                                      System.out.println("Enter your Age :");
                                      int age2 = ab.nextInt();

                                      String dei = " ";
                                      if (hel.Health_Qu() == true) {
                                          System.out.println("Enter your disease :");

                                          dei = ab.next();
                                      }else
                                      {
                                          dei= "No Deisease";
                                      }


                               
                                      hell1 = new Health_Information(name, mid,last ,age2,nat, con,Id,numpho ,hell1.getPermitNOhaj(),dei );
 
    
                                  } catch (InputMismatchException N) {
                                      System.err.println("InputMismatchException, Enter numbers:");
                                      ab.nextLine();
                                  }
                                  t.add_hajj(hell1);
                                  System.out.println("------------------------------------------");
                                  break;
                              } // end case 1

                              case 2: {
                                  t.display_infoTrips();
                                  break;
                              }// end case 2
                              case 3: {
                                  t.update_info();
                                  break;
                              } // end case 3
                              case 4: {
                                  t.remove_hajj(hell1);
                               
                                
                              }


                          }


                      } // end while torist tiep

                  } // end big while
              }
          }
      }
  }
}