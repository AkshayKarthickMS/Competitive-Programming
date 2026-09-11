class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        // 0, 1, or 2 points will always form a single line
        if (n <= 2) return n;

        int maxPoints = 0;

        for (int i = 0; i < n; i++) {
            // Using Double instead of String
            Map<Double, Integer> map = new HashMap<>();
            int currentMax = 0;
            
            // Start j from i + 1 to avoid redundant pairs and backward counting
            for (int j = i + 1; j < n; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                
                double slope;
                if (dx == 0) {
                    slope = Double.POSITIVE_INFINITY;
                } else {
                    slope = (double) dy / dx;
                    // In Java, -0.0 and 0.0 have different hash codes.
                    // This check forces -0.0 to become 0.0.
                    if (slope == -0.0) {
                        slope = 0.0;
                    }
                }
                
                map.put(slope, map.getOrDefault(slope, 0) + 1);
                currentMax = Math.max(currentMax, map.get(slope));
            }
            
            // Add 1 to include the anchor point `i` itself
            maxPoints = Math.max(maxPoints, currentMax + 1);
        }

        return maxPoints;
    }
}