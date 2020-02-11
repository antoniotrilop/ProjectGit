/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zellerg;
 

public class Zellerg {


    public static void main(String[] args) {
        //Declaraciones Globales
        int d = ZellerG(26, 2, 1996);
        String [] arrayDays;
        arrayDays = new String [] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(arrayDays[d]);
    }
    
    private static int ZellerG(int Day, int Month, int Year) {
        int Zeller;
        Month = (Month + 10) % 12;
        Year = Year - 1 * ((Month > 10)?1:0);
        Zeller = (13 * Month - 1) / 5 + 1 + Year & 100 + (Year % 100) / 4 + (-2 * (Year / 100)) + (Year /400) % 7;
        Zeller = ((Zeller +Day) % 7 + 6) % 7;
        return Zeller;
    }
}

