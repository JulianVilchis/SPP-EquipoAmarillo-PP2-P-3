/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.equipoamarillo.pp2.p.pkg3;
import java.util.Scanner;
/**
 *
 * @author Julián
 */
public class SPPEquipoAmarilloPP2P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner (System.in);
        
        int dec, dec2, x, a=1, b=2;
        
        x = decTamaño();
        
        System.out.println("Matriz : ");
        
        int [][] matrizA = matriz(x);
        
        contenido(matrizA);        
    }
    
    public static int decTamaño(){
        Scanner kb = new Scanner (System.in);
        boolean flag;
        int x = 0;
        do{
            try {
                System.out.print("Porfavor introduzca el tamaño de la matriz: ");
                x = kb.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("El numero no es entero");
                flag = true;
            }   
        } while (flag);
        return x;
    }
    
    public static int [][] matriz (int x){
        int [][] matriz = new int [x][x];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = solicita();
        }}
        return matriz;
    }
    
    public static int solicita (){
        Scanner kb = new Scanner(System.in);
        boolean flag;
        int x = 0;
        do{
            try {
                System.out.println("Porfavor introduzca un numero entero");
                x = kb.nextInt();
                flag = false;
            } catch (Exception e){
                System.out.println("El numero no es un numerto entero");
                flag = true;
            }
        }while (flag);
        return x;
    }
    
    public static int [][] contenido (int [][] x){
        int [][] matriz = x;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                for(int k = 1; k <= matriz[i][j]; k++){
                    System.out.print("*");
                }
                if(!(j==(matriz[0].length-1)))System.out.print(" - ");
            }
            System.out.println();
        }
        return matriz;
}
}