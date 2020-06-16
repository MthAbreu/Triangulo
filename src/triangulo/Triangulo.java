/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;

public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ("Determine um valor para A");
        double A = entrada.nextDouble();
        System.out.println ("Determine um valor para B");
        double B = entrada.nextDouble();
        System.out.println ("Determine um valor para C");
        double C = entrada.nextDouble();
        
        if (A + B > C && A + C > B && B + C > A)
        {
            if (A == B && A == C && B == C)
            {
                System.out.println ("O triângulo é Equilátero");
            }
            else
            {
                if (A != B && A != C && B != C)
                {
                    System.out.println ("O triângulo é Escaleno");
                }
                else
                {
                     if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A))
                     {
                         System.out.println ("O triângulo é Isósceles");
                     }
                }
            }
        }
        else
        {
            System.out.println ("Os valores não formam um triângulo");
        }
                
        
    }
    
}
