class Solution {
public:
    int mySqrt(int x) {
        long sqr;
        long start=1, end =x,mid=0,ans=0;
      if(x==0){return 0;}  
       while (start<=end){
       mid=(start+end)/2;
       if (mid==x/mid)return mid; 
       else if (mid>x/mid){end=mid-1;}
       else if(mid<x/mid) {ans=mid;start=mid+1;}

       }

        // for (int mid=1;mid<x;mid++){

            // if(mid==x/mid){
            // return mid;
            // break;} 

        //}
        return ans;
    }   
    
};