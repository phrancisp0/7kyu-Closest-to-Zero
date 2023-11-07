import java.util.*; 
public class ClosestToZero {

	public static Integer find(int[] arr) { 
      int min =Integer.MAX_VALUE; 
      for (int i :arr){  
         int r1=Math.abs(i); 
         int r2=Math.abs(min); 
         if(r1==r2)return null; 
         else if (r1<r2)min=i;
       }
      return min;
    }
}
/*
Simply find the closest value to zero from the list. Notice that there are negatives in the list.

List is always not empty and contains only integers. Return None if it is not possible to define only one of such values. And of course, we are expecting 0 as closest value to zero.

Examples:

[2, 4, -1, -3]  => -1
[5, 2, -2]      => None
[5, 2, 2]       => 2
[13, 0, -6]     => 0
*/