/**
 * @author Camilo Hurtado
 */
public class Islands2 {

    /**
     * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected
     * 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
     * The area of an island is the number of cells with a value 1 in the island.
     * Return the maximum area of an island in grid. If there is no island, return 0.
     **/

    public static void main(String[] args) {
        int grid1[][] = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0
                , 1, 1, 0, 0, 1, 0, 1, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
        int grid2[][] = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1 }, { 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1 }, { 0, 1, 0, 0
                , 1, 1, 0, 0, 0, 1, 0, 0, 1 }, { 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
        int grid3[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0
                , 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

        System.out.println("Is test case 1 passing? " + (maxAreaOfIsland(grid1) == 6));
        System.out.println("Is test case 2 passing? " + (maxAreaOfIsland(grid2) == 12));
        System.out.println("Is test case 3 passing? " + (maxAreaOfIsland(grid2) == 0));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        Integer area = 0;

        /////////////////////////
        //Insert your code here//
        /////////////////////////
        int counter = 0;
        int pos = -1; //Position where should look for 1s in next array

        for(int i = 0; i < grid[i].length; i++){
            int [] n = grid[i];

            for (int j = 0; j < n.length; j ++){
                int position = n[j];

                if(position == 1){
                    counter ++;
                    //Look to the right
                    if(j < n.length){
                        int rightPosition = n[j + 1];
                        if(rightPosition == 1){
                            counter ++;
                        }
                    }

                    //Look left position
                    if(j > 0){
                        int leftPosition = n[j - 1];
                        if(leftPosition == 1){
                            counter ++;
                        }
                    }

                    //Look up
                    if(i > 0){

                    }
                }
            }


        }

        return area;
    }

    static void searchForLand(int fromPosition, int counter, int[] portion) {
        for (; fromPosition < portion.length; fromPosition++) {
            int selectedNum = portion[fromPosition];
            if (selectedNum == 1) {
                counter++;
            }

            if (fromPosition < portion.length && portion[fromPosition] == 1) {
                continue;
            } else {
                break;
            }
        }
    }
}
