import java.util.*;

public class Main {
    static boolean _s(Deque<Integer> d, int x) {
        if (d.size() < 4) return true;
        Iterator<Integer> it = d.iterator();
        int a0 = it.next();
        int a1 = it.next();
        int a2 = it.next();
        int a3 = it.next();
        return !(a0 < a1 && a1 < a2 && a2 < a3 && a3 < x) &&
               !(a0 > a1 && a1 > a2 && a2 > a3 && a3 > x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }

            int l = 0, r = n - 1;
            Deque<Integer> q = new ArrayDeque<>();
            StringBuilder res = new StringBuilder(n);

            for (int i = 0; i < n; i++) {
                boolean a = _s(q, v[l]);
                boolean b = _s(q, v[r]);
                char c = 'L';

                if (a && !b) c = 'L';
                else if (b && !a) c = 'R';
                else if (a && b) {
                    Deque<Integer> ql = new ArrayDeque<>(q);
                    Deque<Integer> qr = new ArrayDeque<>(q);
                    if (ql.size() == 4) ql.pollFirst();
                    if (qr.size() == 4) qr.pollFirst();
                    ql.addLast(v[l]);
                    qr.addLast(v[r]);

                    boolean f1 = (l + 1 <= r) ? (_s(ql, v[l + 1]) || _s(ql, v[r])) : true;
                    boolean f2 = (l <= r - 1) ? (_s(qr, v[l]) || _s(qr, v[r - 1])) : true;

                    if (f1 && !f2) c = 'L';
                    else if (f2 && !f1) c = 'R';
                    else c = 'L';
                }

                if (c == 'L') {
                    if (q.size() == 4) q.pollFirst();
                    q.addLast(v[l++]);
                    res.append('L');
                } else {
                    if (q.size() == 4) q.pollFirst();
                    q.addLast(v[r--]);
                    res.append('R');
                }
            }

            System.out.println(res);
        }

        sc.close();
    }
}
