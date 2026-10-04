//row[j] = previousRow[j-1] + previousRow[j] row[0] = 1 row[i] = 1
//jave concepy:triangle.get(i - 1).get(j - 1)

class Solution {
    public List<List<Integer>> generate(int numRows) {
       // main result jisme saari rows jauye 
        
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i=0;i<numRows;i++){
            //har baar ek nayi row banani hai 
            List <Integer>row= new ArrayList<>();

            for (int j=0;j<=i;j++){
               // agar pehla ya aakhiri element hai 1 dalo
                if (j==0||j==i){
                    row.add(1);
                }
                //warna upar wale dono element ko add kro

                else{
                    //triangle.get(i-1) humein upar wali row dega
                    int val1=triangle.get(i-1).get(j-1);//left no
                    int val2=triangle.get(i-1).get(j);//right wala

                    row.add(val1+val2);
                }
            }
            //row taiyar hai triangle m dalo
            triangle.add(row);
        }
        return triangle;


    }
}