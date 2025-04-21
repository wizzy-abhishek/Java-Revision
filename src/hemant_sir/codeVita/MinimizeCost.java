package hemant_sir.codeVita;

public class MinimizeCost {

    public static void main(String[] args) {

        minimizingCost(new int[]{3, -1, -2}, 1);
    }

    public static void minimizingCost(int[] a, int k) {
        int n = a.length;
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            if (a[i] <= 0){
                continue;
            }

            int available = a[i];

            for (int j = i + 1 ; j <= i + k && j < n && available > 0; j++) {
                if (a[j] < 0) {
                    int needed = Math.min(-a[j], available);
                    t[i] -= needed;
                    t[j] += needed;
                    available -= needed;
                }
            }
        }

        int cost = 0;
        for (int i = 0; i < n; i++) {
            cost += Math.abs(a[i] + t[i]);
        }

        System.out.println(cost);
    }
}
