class Solution {
    public int fib(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        int n1 = n - 1;
        int n2 = n - 2;

        // Find fib(n-1)
        int t1 = 1;
        int a1 = 1;
        int b1 = 1;
        int c1 = 2;

        if (n1 == 0) {
            t1 = 0;
        } else if (n1 == 1) {
            t1 = 1;
        } else {
            while (c1 < n1) {
                t1 = a1 + b1;
                a1 = b1;
                b1 = t1;
                c1++;
            }
        }

        // Find fib(n-2)
        int t2 = 1;
        int a2 = 1;
        int b2 = 1;
        int c2 = 2;

        if (n2 == 0) {
            t2 = 0;
        } else if (n2 == 1) {
            t2 = 1;
        } else {
            while (c2 < n2) {
                t2 = a2 + b2;
                a2 = b2;
                b2 = t2;
                c2++;
            }
        }

        return t1 + t2;
    }
}