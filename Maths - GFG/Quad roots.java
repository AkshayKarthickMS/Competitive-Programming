class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> list = new ArrayList<>();
        int root = b * b - 4 * a * c;

        if (root < 0) {
            list.add(-1);
        } else {
            // Math.sqrt returns a double, so division is safely handled as double division
            int x = (int) Math.floor((-b + Math.sqrt(root)) / (2 * a));
            int y = (int) Math.floor((-b - Math.sqrt(root)) / (2 * a));

            // Add the larger root first, then the smaller root
            list.add(Math.max(x, y));
            list.add(Math.min(x, y));
        }

        return list; // Single return statement at the end
    }
}