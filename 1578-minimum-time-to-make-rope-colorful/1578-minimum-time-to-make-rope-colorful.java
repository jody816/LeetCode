class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        int max = neededTime[0];

        for (int i = 1; i < neededTime.length; i++) {
            if (colors.charAt(i-1) == colors.charAt(i)) {
                time += Math.min(max, neededTime[i]);
                
                max = Math.max(max, neededTime[i]);
            } else {
                max = neededTime[i];
            }
        }

        return time;
    }
}