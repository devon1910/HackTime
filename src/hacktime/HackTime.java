/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacktime;
import java.util.*;

/**
 *
 * @author Ekpokpobe Davidson
 */
public class HackTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        System.out.println("Enter time: ");
        String d=s.next();
        System.out.println(converTime(d));
       
    }
    public static String converTime(String s){
        String newTime="";
        String hh="";
        String mm="",ss="";
        String []d= s.split(":");
     if(d[2].contains("AM"))
        {
            hh+=d[0];
            mm+=d[1];
            ss+=d[2].replace("AM","");
                if(hh=="12" && mm=="00" && ss=="00"){newTime="00:00:00";  }
                else if(hh.equals("12")){
                    int k= Integer.parseInt(hh);
                    hh=Integer.toString((12-k)); 
                    newTime="0"+hh+":"+mm+":"+ss; 
                            }
                
                else{
                    newTime=hh+":"+mm+":"+ss; 
                    } 
        }
        
            return newTime; 
        }
}
    
