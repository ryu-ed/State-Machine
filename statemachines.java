
import java.util.Scanner;

public class statemachines {
    
    public static void main (String [] args ){
       String s;
     //String  s = new String("r1@333333333333312#");
     //
     Scanner teclado = new Scanner(System.in);

     System.out.print("Ingrese Cadena: ");
     s = teclado.nextLine();

     String digits = new String("0123456789");
     int state = 0;

     for (int ind = 0; ind < s.length(); ind++){
         if ( state == 0)
         {
             if (s.charAt(ind) == '@')
             {
                 state = 1;
             }
         }
         else if (state == 1)
         {
             if (digits.indexOf(s.charAt(ind)) != -1)
             {
                 state = 2;
             }
             else if (s.charAt(ind) == '@')
             {
                 state = 1;
             }
             else
             {
                 state = 0;
             }
            

         }
         else if (state == 2)
         {
             if (s.charAt(ind) == '#')
             {
                 state = 3;
             }
             else if (digits.indexOf(s.charAt(ind)) != -1)
             {
                 state = 2;
             }
             else if (s.charAt(ind) == '@')
             {
                 state = 1;
             }
             else
             {
                 state = 0;
             }
         }
         else if (state == 3)
         {
             if (s.charAt(ind) == '@')
             {
                 state = 1;
             }
             else
             {
                 state = 0;
             }
         }
     }//end loop

     if (state == 3)
     {
         System.out.println("ACEPTADA");
     }
     else
     {
        System.out.println("NO ACEPTADA");
  
     }

    }
}