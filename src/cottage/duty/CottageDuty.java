/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cottage.duty;

import java.util.Scanner;

/**
 *
 * @author ubaya
 */
public class CottageDuty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Input your name");
         Scanner nameInput = new Scanner(System.in);
         String name = nameInput.nextLine();
        System.out.println("Hello "+name+", Welcome to BHAKTI ALAM ");
        System.out.println("How many people do you want to order?");
         Scanner input = new Scanner(System.in);
         String cottage = null, Day = null;
        int chamber = 0;
        int Price = 0;
        int night = 0;
        int room = 0;
         chamber = input.nextInt();
        
        if (chamber == 1) {
            System.out.println("Choose Alpukat or Jambu Air Cottage");
            cottage = input.next();
            System.out.println("Choose day (Weekday,Weekend,Holiday)");
            Day = input.next();
            if (cottage.equals("Alpukat")) {
                if (Day.equals("Weekday")) {
                    Price = 575000;
                    System.out.println("Alpukat cottage on "+Day+" has a price Rp."+Price+" ");
                } else if (Day.equals("Weekend")) {
                    Price = 695000;
                    System.out.println("Alpukat cottage on "+Day+" has a price Rp."+Price+"");
                } else if (Day.equals("Holiday")) {
                    Price = 895000; 
                    System.out.println("Alpukat cottage on "+Day+" has a price Rp."+Price+"");
                }
            }
            if (cottage.equals("Jambu_Air")) {
                if (Day.equals("Weekday")) {
                    Price = 575000;
                    System.out.println("Jambu Air cottage on "+Day+" has a price Rp."+Price+"");
                } else if (Day.equals("Weekend")) {
                    Price = 695000;
                    System.out.println("Jambu Air cottage on "+Day+" has a price Rp."+Price+"");
                } else if (Day.equals("Holiday")) {
                    Price = 895000;
                    System.out.println("Jambu Air cottage on "+Day+" has a price Rp."+Price+"");
                }
            }
            
        }
        if (chamber == 2) {
            System.out.println("Choose cottage (Duku,Jeruk,Durian,Melon,Belimbing,Mangga,Kedondong)");
            cottage = input.next();
            System.out.println("Choose Day (Weekday,Weekend,Holiday)");
            Day = input.next();
            
            if (cottage.equals("Duku")) {
                if (Day.equals("Weekday")) {
                    Price = 915000;
                    System.out.println("Duku cottage on "+Day+" has a price Rp."+Price+"");
                } else if (Day.equals("Weekend")) {
                    Price = 1025000;
                    System.out.println("Duku cottage on "+Day+" has a price Rp."+Price+"");
                } else if (Day.equals("Holiday")) {
                    Price = 1225000;
                    System.out.println("Duku cottage on "+Day+" has a price Rp."+Price+"");
                }
            }
         
        if (cottage.equals("Jeruk")) {
            if (Day.equals("weekday")) {
                Price = 915000;
                System.out.println("Jeruk cottage on "+Day+" has a price Rp."+Price+"");
            }else if (Day.equals("Weekend")) {
                Price = 1025000;
                System.out.println("Jeruk cottage on "+Day+" has a price Rp."+Price+"");
            }else if (Day.equals("Holiday")) {
                Price = 1225000;
                System.out.println("Jeruk cottage on "+Day+" has a price Rp."+Price+"");
            }
        }
        if (cottage.equals("Durian")) {
            if (Day.equals("Weekday")) {
                Price = 595000;
                System.out.println("Durian cottage on "+Day+" has a price Rp."+Price+"");
            }else if (Day.equals("Weekend")) {
                Price = 715000;
                System.out.println("Durian cottage on "+Day+" has a price Rp."+Price+"");
            }else if (Day.equals("Holiday")) {
                Price = 915000;
                System.out.println("Durian cottage on "+Day+" has a price Rp."+Price+"");
            }
        } 
         if (cottage.equals("Melon")) {
            if (Day.equals("Weekday")) {
                Price = 595000;
                System.out.println("Melon cottage on "+Day+" has a price Rp."+Price+"");
            }else if (Day.equals("Weekend")) {
                Price = 715000;
                System.out.println("Melon cottage on "+Day+" has a price Rp."+Price+"");
            }else if (Day.equals("Holiday")) {
                Price = 915000;
                System.out.println(" cottage on "+Day+" has a price Rp."+Price+"");
            }
        }
          if (cottage.equals("Belimbing")) {
            if (Day.equals("Weekday")) {
                Price = 495000;
                System.out.println("Belimbing cottage on "+Day+" has a price Rp."+Price+"");
            }else if (Day.equals("Weekend")) {
                Price = 575000;
                System.out.println("Belimbing cottage on "+Day+" has a price Rp."+Price+"");
            }else if (Day.equals("Holiday")) {
                Price = 755000;
                System.out.println("Belimbing cottage on "+Day+" has a price Rp."+Price+"");
            }
          }
           if (cottage.equals("Mangga")) {
            if (Day.equals("Weekday")) {
                Price = 495000;
                System.out.println("Mangga cottage on "+Day+" has a price Rp."+Price+"");
            }else if (Day.equals("Weekend")) {
                Price = 575000;
                System.out.println("Mangga cottage on "+Day+" has a price Rp."+Price+"");
            }else if (Day.equals("Holiday")) {
                Price = 755000;
                System.out.println("Mangga cottage on "+Day+" has a price Rp."+Price+"");
            }
           }
            if (cottage.equals("Kedondong")) {
            if (Day.equals("Weekday")) {
                Price = 495000;
                System.out.println("Kedondong cottage on "+Day+" has a price Rp."+Price+"");
            }else if (Day.equals("Weekend")) {
                Price = 575000;
                System.out.println("Kedondong cottage on "+Day+" has a price Rp."+Price+"");
            }else if (Day.equals("Holiday")) {
                Price = 755000;
                System.out.println("Kedondong cottage on "+Day+" has a price Rp."+Price+"");
            }
        }
    }
        if (chamber > 2 ) {
            System.out.println("Cottage barracks available");
            System.out.println("Choose Day (Weekday,Weekend,Holiday)");
            Day = input.next();
            if (Day.equals("Weekday")) {
                Price = 25000;
                System.out.println("Barrack cottage on "+Day+" price per person Rp."+Price+" ");
            }else if (Day.equals("Weekend")) {
                Price = 25000;
                System.out.println("Barrack cottage on "+Day+" price per person Rp."+Price+"");
            }else if (Day.equals("Holiday")) {
                Price = 35000;
                System.out.println("Barrack cottage on "+Day+" price per person Rp."+Price+"");
            }
        }
            System.out.println("How many rooms?");
            room = input.nextInt();
            System.out.println("How many nights?");
            night = input.nextInt();
            System.out.println("Total cost Rp. "+room * night * Price+" ");
           
    }
    
}
