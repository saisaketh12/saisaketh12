import java.io.*;
import java.util.*;

class SGPA_Cal 
{
     public static void main (String[] args)
 {
        String subjects[]={"Graphics","PPS","JAVA","Chemisrty","English","Technical Skills","Data Structures"};
        double credits[]={2,4,3,3,2,1.5,4};
        int i,gp=0;
     double total=0,sum=0,SGPA; 
     Scanner s=new Scanner(System.in);
     for(i=0;i<subjects.length;i++) 
     {
         System.out.println("enter  "+subjects[i]+" grade");
         String grade = s.next(); 
         switch(grade)
         {
             case "A+" :gp=10;
                          break;
             case "A" : gp=9;
                          break;
            case "B+" : gp=8;
                          break;
            case "B" : gp=7;
                          break; 
            case "C" : gp=6;
                          break;
            case "P" : gp=5; 
                          break;
            case "F" : gp=0; 
                          break;
                default : System.out.println("wrong"); 
                i--; 
             
         } 
         if(gp==0) 
         {
             break; 
             
         } 
         total +=credits[i] * gp;
         sum+= credits[i];
     }  
    if(gp==0) 
     {
        System.out.println("you are failed"); 
        
     }
    else 
    { 
        SGPA = total/sum;
        System.out.print("SGPA is :"+SGPA); 
        
    } 
       
  }
    
}