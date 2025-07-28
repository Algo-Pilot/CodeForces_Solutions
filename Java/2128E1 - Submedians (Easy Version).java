import java.util.*;

public class Main {
    static class R {
        boolean ok;
        int l, r;
        R(boolean ok, int l, int r) {
            this.ok = ok;
            this.l = l;
            this.r = r;
        }
    }

    static R f(int x, int[] a, int k) {
        int n = a.length;
        int[] p = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            p[i] = p[i - 1] + (a[i - 1] >= x ? 1 : -1);
        }

        final long INF = (long) 4e18;
        long[] m = {INF, INF};
        int[] idx = {-1, -1};

        for (int r = 1; r <= n; ++r) {
            int i = r - k;
            if (i >= 0) {
                int b = i & 1;
                if (p[i] < m[b]) {
                    m[b] = p[i];
                    idx[b] = i;
                }
            }

            int b = r & 1;

            if (idx[b] != -1 && p[r] - m[b] >= 0) {
                return new R(true, idx[b] + 1, r);
            }

            int ob = b ^ 1;
            if (idx[ob] != -1 && p[r] - m[ob] >= 1) {
                return new R(true, idx[ob] + 1, r);
            }
        }

        return new R(false, -1, -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }

            int mx = 1, l = 1, r = k, lo = 1, hi = n;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                R res = f(mid, v, k);
                if (res.ok) {
                    mx = mid;
                    l = res.l;
                    r = res.r;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            System.out.println(mx + " " + l + " " + r);
        }

        sc.close();
    }
}
