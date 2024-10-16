

// OUTPUT
// Enter the String : geeksforgeeks
// e --> 4
// g --> 2
// k --> 2
// s --> 2


// Enter the String : geeekks
// e --> 3
// k --> 2

//====Time Complexity: O(n*log n)======

import java.util.Arrays;
import java.util.Scanner;
public class Print_all_the_duplicate_characters_in_a_string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.next(); // str = "geeksforgeeks"

        char[] arr = str.toCharArray(); // converting String to CharArray
        Arrays.sort(arr); // here sorting String 

        String sortedString  = new String(arr); //Creating new String to store sorted array
        int n = sortedString.length();

        

        
        for(int i=0; i<n; i++){ 
            int count = 1;
            while(i < n-1 && arr[i] == arr[i+1]){
                count = count + 1;
                i = i + 1;
            }

            if(count > 1){
                
                System.out.println(sortedString.charAt(i) + " --> " + count);
            }   
        }


        
     
    }
}
  
  
