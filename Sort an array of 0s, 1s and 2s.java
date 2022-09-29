Sort an array of 0s, 1s and 2s

  >>Discription: 
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

  >>For Input: 
5
0 2 1 2 0

  >>Code
  
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int zero=0;
        int one=1;
        int two=2;
        for(int i:a){
            if(i==0){
                zero++;
            }else if(i==1){
                one++;
            } else{
                two++; 
            }
        }
        int idx=0;
        while(zero-->0){
            a[idx++]=0;
        }
        while(one-->1){
            a[idx++]=1;
        }
        while(two-->2){
            a[idx++]=2;
        }
    }
}

>>  Your Output: 
0 0 1 2 2 
