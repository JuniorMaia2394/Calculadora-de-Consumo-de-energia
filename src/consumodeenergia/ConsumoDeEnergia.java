/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumodeenergia;

import java.util.Scanner;




/**
 *
 * @author JuniorMaia
 */
public class ConsumoDeEnergia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----------BEM-VINDO----------");
        System.out.println("DIGITE SEU NOME:");     
        Scanner ler = new Scanner(System.in);
        String nome;
        
        nome = ler.next();
        
        
        System.out.println("BEM-VINDO "+nome);
        
        double potencia = 0;
        double hora = 0;
        int dias =0;
        double minutos;
        double consumo;
        double mediaPreco =0;
        
         System.out.println("INFORME A POTENCIA(WATTS) DO APARELHO:");
       
        potencia = ler.nextDouble();
        
        System.out.println("DIGITE A HORA:");
        hora = ler.nextInt()*60;
        
        System.out.println("DIGITE OS MINUTOS:");
        minutos = ler.nextInt();
        
        System.out.println("DIGITE OS DIAS DE USO: ");
        dias = ler.nextInt();
        
        
        
        consumo = (potencia/1000)*((hora+minutos)/60)*30;
        
        System.out.println("SEU CONSUMO É DE "+consumo+"KWH EM UM MÊS");
        
        System.out.println("QUAL É A MEDIA DE PREÇO DO KWH EM SUA FATURA DE ENERGIA ELETRICA?");
        mediaPreco = ler.nextDouble();
        
        
        mediaPreco *= consumo;
        System.out.println("O VALOR É DE R$"+mediaPreco);
        
        
    }
    
}
