// Last updated: 12/08/2026, 16:20:22
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        int maxDiagonal = 0;
        int maxArea = 0;

        for(int i = 0; i < dimensions.length; i++) {

            int l = dimensions[i][0];
            int w = dimensions[i][1];

            int diagonal = l * l + w * w;
            int area = l * w;

            if(diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
            else if(diagonal == maxDiagonal && area > maxArea) {
                maxArea = area;
            }
        }

        return maxArea;
    }
}