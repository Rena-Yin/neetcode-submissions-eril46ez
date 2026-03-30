class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] arr = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));
        // System.out.println(Arrays.deepToString(arr));
        
        Stack<Double> carFleet = new Stack<>();
        for (int i = 0; i < position.length; i++) {
            double time = (double)(target - arr[i][0]) / arr[i][1];
            // System.out.println("time " + time);
            if (carFleet.isEmpty()) {
                carFleet.push(time);
            } else {
                double prev = carFleet.pop();
                // System.out.println("prev " + prev);
                if (time > prev) {
                    carFleet.push(prev);
                    carFleet.push(time);
                } else {
                    // System.out.println("inner else " + carFleet);
                    carFleet.push(prev);
                }
            }
            // System.out.println(i + " " + carFleet);
        }
        // System.out.println(carFleet.size());

        return carFleet.size();
    }
}
