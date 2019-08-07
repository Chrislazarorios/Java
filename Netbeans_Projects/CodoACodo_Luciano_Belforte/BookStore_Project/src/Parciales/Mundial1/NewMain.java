/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundial1;

/**
 *
 * @author alumno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] var=new int[3][4];
        for(int[] e:var){
           for(int p:e){
               p=(int)Math.floor(Math.random()*(6-0+1)+(0));
               System.out.println(p);
           } 
        }



    }
    
}
