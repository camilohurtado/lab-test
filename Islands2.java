/**
 * @author Camilo Hurtado
 */
public class Islands2 {

    static int counter = 0;
    static int global = 0;
    static boolean[][] visited;

    /**
     * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected
     * 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
     * The area of an island is the number of cells with a value 1 in the island.
     * Return the maximum area of an island in grid. If there is no island, return 0.
     **/

    public static void main(String[] args) {
        int grid1[][] = {
                { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 }
        };

        int grid2[][] = {
                { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1 },
                { 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 }
        };

        int grid3[][] = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        System.out.println("Is test case 1 passing? " + (maxAreaOfIsland(grid1) == 6) + "Actual result = " + (maxAreaOfIsland(grid1)));
        System.out.println("Is test case 2 passing? " + (maxAreaOfIsland(grid2) == 12) + "Actual result = " + (maxAreaOfIsland(grid2)));
        System.out.println("Is test case 3 passing? " + (maxAreaOfIsland(grid3) == 0) + "Actual result = " + (maxAreaOfIsland(grid3)));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        Integer area = 0;

        visited = new boolean[grid.length][grid[0].length];

        /////////////////////////
        //Insert your code here//
        /////////////////////////
        for (int i = 0; i < grid.length; i ++){
            for (int j = 0; j < grid[i].length; j++) {
                area = Math.max(area, area(i, j, grid));
            }

        }
        return area;
    }

    public static int area(int i, int j,  int[][] grid){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || visited[i][j] || grid[i][j] == 0){
            return 0;
        }else{
            visited[i][j] = true;
            return (1 + //Go down
                        area(i + 1, j, grid) +
                        //Go up
                        area(i - 1, j , grid) +
                        //Go right
                        area(i, j +1 , grid) +
                        //Go left
                        area(i, j -1, grid));
        }
    }
}
