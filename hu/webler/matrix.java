package hu.webler;

public class matrix {

    public static void main(String[] args) {

        int[] nums = new int[100];
        for (int i=0; i < nums.length; i++){
            nums[i] = i * 100;
        }

        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++){
                matrix[i][j] = (i+100) + (j+100);
            }
        }
        for (int[] numbers : matrix ){
            for (int num : numbers){
                System.out.print(num + " ");
            }
            System.out.println();
        }



    }
}
