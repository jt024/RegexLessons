/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author jt024
 */
public class Lesson1 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String numbers[] = {"407-799-2253"
                ,"321-565-8878","753-665-1254"
                ,"407-225-5679","531-665-1235"};
        String phNum = "407-799-2253'";
        

        
        
        for (int i = 0; i < numbers.length; i++) {
            
            if (numbers[i].matches(".*[407].*")) {
                System.out.println(numbers[i]);
            } 
            
        }
        
        
        
        
    }
    
}
