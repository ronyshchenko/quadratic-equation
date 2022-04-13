package quadratic;

public class Solution {
    static class MyRoot {
        private int first;
        private int second;

        public MyRoot(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }

    public static MyRoot calculationRoot(int a, int b, int c) {
        int root1 = 0;
        int root2 = 0;
        int d = b*b - 4*a*c;

        if(d>0) {
            root1 = (int) (-b + Math.sqrt(d))/2*a;
            root2 = (int) (-b - Math.sqrt(d))/2*a;
            return new MyRoot((int) root1, (int) root2);
        }

        if(d==0) {
            root1 = root2 = (int) (-b/2*a);
            return new MyRoot((int) root1, (int) root2);
        }
        return null;
    }
}
