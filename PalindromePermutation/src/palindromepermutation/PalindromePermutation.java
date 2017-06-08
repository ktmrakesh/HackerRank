/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromepermutation;

import java.util.Scanner;

/**
 *
 * @author Rakesh
 */
public class PalindromePermutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();//"taco cat";
        int count = 0;
        boolean flag =false;
        int[] charArr = new int[128]; //use Hashmap to reduce the space complexity
        for(int i=0; i< str.length();i++){
            if(str.charAt(i) != ' '){
                charArr[str.charAt(i)] += 1; 
            }
        }

        for(int i = 0; i<128;i++){
            if(charArr[i] != 0){
                if(charArr[i] %2 ==0){
                        flag = true;
                }
                else{
                    if(charArr[i] % 2 == 1){
                        flag =true; 
                        count++;
                    }
                    else 
                        flag = false;
                }
            }
        }

        if(flag && count == 1){
            System.out.println("true");
        }
        else{
            System.out.println("false");

        }
    }
}
