/**
 * input: "Mr John Smith    ",13
 * output: "Mr%20%John%20Smith"
 * 
*/
package urlify;

import java.util.Scanner;

/**
 *
 * @author Rakesh
 */
public class URLify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            int len = sc.nextInt();
            char[] inChar = input.toCharArray();
            int i = len-1;
            for(int j=inChar.length-1; j>=0;j--)
            {
                if(inChar[i]==' '){
                    inChar[j]='0';
                    inChar[--j]= '2';
                    inChar[--j]= '%';
                    j--;
                    i--;
                }
                inChar[j]=inChar[i];
                i--;
                
            }
            for(int k = 0;k<inChar.length; k++)
            {
                System.out.print(inChar[k]);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
