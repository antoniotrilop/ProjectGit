package uf2_p17;

import java.util.Scanner;

public class UF2_P17 {
//declaraciones globales
    static Scanner keyboard = new Scanner (System.in);//teclado
     public static void main (String[] args) {
        int option =-1;
        int euro;
        float dolars;
        double dolarsDouble;
        int euros;
        
        do{
        userMenu();
        option = keyboard.nextInt();
        switch(option) {//inicio switch
            case 1:
                System.out.println("Euros: ");
                euro=keyboard.nextInt();
                FunctionTribaldos(euro);
                break;
            case 2:
                System.out.println("Euros: ");
                euro = keyboard.nextInt();
                dolarsDouble = FunctionIntToDouble(euro);
                System.out.println(dolarsDouble);
                break;
            case 3:
                System.out.println("Euros: ");
                euro = keyboard.nextInt();
                String euros = Integer.toString(euros);
                System.out.println(euro);
                break;
            case 4:;
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;   
            case 0:p0();
                break;
            default: System.out.println("Invalid case");
            }//fin switch
        }while(option !=0);//fin de do while
    }
     private static float FunctionTribaldos(int boxEuro)
    {
        float result = 0;
        
        result=(float)(boxEuro*1.1f);
        
        return result;
    }
    private static double FunctionIntToDouble(int euro)
    {
        double result = 0;
            result = Double.valueOf(euro*1.1);
        return result;
    }
    private static void FunctionIntToString(int euro)
    {
        String result = String.valueOf(boxEuro*1.1);
    }
    private static void p04()      
    {
    
    }
            
    private static void p05()
    {
    
    }
    private static void p06()
    {
    
    }
    private static void p07()
    {
     
    }     
    private static void p08()
    {
        
                
            
    }
    private static void p09()
    {
        
                
            
    }
    private static void p10()
    {
        
    }        
    private static void p0()
    {
        System.out.println("Thanks for using our program");
    }
    
    private static void userMenu()
    {
        System.out.println("");
        keyboard.useDelimiter("\n");
        System.out.println("Author:Antonio Tribaldos");
        System.out.println("Option1 ");
        System.out.println("Option2 ");
        System.out.println("Option3 ");
        System.out.println("Option4 ");
        System.out.println("Option5 ");
        System.out.println("Option6 ");
        System.out.println("Option7 ");
        System.out.println("Option8 ");
        System.out.println("Option9 ");
        System.out.println("Option10 ");
        System.out.println("Option0- out");
        System.out.print("\nOption?: ");
    }
}
    

