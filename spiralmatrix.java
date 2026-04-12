import java.util.ArrayList;
import java.util.List;

class spiralmatrix {
    public List<Integer> spiralOrder(int[][] matrix) {// this is an 2D array of spiral matrix
        ArrayList<Integer>result=new ArrayList<>();//ArrayList is dynamic ,size automatically grows and shrink as elem is add are removed ;;;..

        int m=matrix.length;// finding no ofrows
        int n=matrix[0].length;//cloums
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;//colums
        while(top <= bottom && left <= right){//repeating ...
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
                //top++;

            }
            top++;
            for(int i=top;i<=bottom;i++){//i<=forward
                result.add(matrix[i][right]);//.add is adding to elem in array list
               // right--;
            }
            right--;

            if(top<=bottom){  // it checks still bottom row is to travesal 
            for(int i=right;i>=left;i--){//i>=backaward
                result.add(matrix[bottom][i]);
            }

            }
            bottom--;
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
        }
            left++;
        }
        return result;
    }
    
}