class TrappingWater{
    public static int trap(int[] height) {
         int n = height.length;
        // Calculating Left Max Boundry
        
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];
        for(int i = 1; i < n; i++){
            maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
        }

        // Calculating Right Max Boundry

        int maxRight[] = new int[n];
        maxRight[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            maxRight[i] = Math.max(height[i], maxRight[i + 1]);
        }

        // Loop

        int trappedWater = 0;
        for (int i = 0; i < n; i++){

            // Water Level = Minimum Of Left Max Boundry and Right Max Boundry

            int waterLevel = Math.min(maxLeft[i], maxRight[i]);

            // Trapped Water = Water Level - Height[i]

            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String...args){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
