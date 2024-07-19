class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int minin=0,minn=matrix[i][0];
            for(int j=0; j<matrix[i].length;j++){
                if(minn>matrix[i][j]){
                    minn=matrix[i][j];
                    minin=j;
                }
            }
            boolean istrue=true;
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][minin]<matrix[j][minin]){
                    istrue= false;
                    break;
                }
            }
            if(istrue == true){
                arr.add(matrix[i][minin]);
            }
        }
        return arr;
    }
}