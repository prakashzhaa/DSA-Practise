Geek is playing an array game. He is weak in the concepts of arrays. Geek is given two arrays arr[ ] and brr[ ] of the same size n.
The array arr[ ] will be said to fit in array brr[ ] if by arranging the elements of both arrays,
there exists a solution such that i'th element of arr[ ] is less than or equal to i'th element of brr[ ], for each i, 0 <= i < n.
Help Geek find if the given array arr[ ] will fit in array brr[ ] or not.
  
  Results 

This is a function problem. The input is already taken care of by the driver code. You only need to complete the function isFit() that takes an array arr[], 
another array brr[], size of the array n and returns true if array arr[ ] fit in array brr[ ] otherwise returns false. The driver code takes care of the printing.

Expected Time Complexity: O(N*log(N)).
Expected Auxiliary Space: O(1).
  
>>Input:
n=4
arr[]={7 5 3 2 };
brr[]={5 4 8 7};
  
>>Code
  
  class Solution{
    
   
    // Function for finding maximum and value pair
    public static boolean isFit (int arr[], int brr[], int n) {
        //Complete the function
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<n;i++){
            if(arr[i]>brr[i]){
                return false;
            }
        }
         return true;
    }

Output: 
YES
