class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
       
        //arraylist intitialisation 
        
        ArrayList<Integer> resultarr=new ArrayList<>();
        
        //int n=arr.size();
        int j=0;
        int n=arr.length; 
        
        for(int i=0 ; i<n;i+=2){
            // resultarr[j] =(arr[i]);
            //j++;
            resultarr.add(arr[i]);
            
            
            //ArrayList is data type not container
            
        }
        return  resultarr;
    }
}