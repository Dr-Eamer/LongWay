package java_test.Algorithm;

public class AlgorithmComplexity {
    /**
     * 算法复杂度
     * 时间复杂度  T(n) = O(f(n))
     */
    class TimeComplexity{
        //时间复杂度O(1)
        private final static String TAG = "不参与循环的单行代码";

        //时间复杂度O(n)
        private void m1(int n){
            int j;
            for(int i=1; i<=n; ++i)
            {
                j = i;
                j++;
            }
        }

        //时间复杂度O(logN)
        private void m2(int n){
            int i = 1;
            while(i<n) {
                i = i * 2;
            }
        }

        //时间复杂度O(nlogN)
        private void m3(int n){
            for(int m=1; m<n; m++) {
                while(m<n) {
                    m = m * 2;
                }
            }
        }

        //时间复杂度O(n^k)
        private void m4(int n){
            //k可以理解为循环体嵌套的层数
            //比如下面的例子k则为2
            for(int x=1; x<=n; x++)
            {
                for(int i=1; i<=n; i++)
                {
                    int j = i;
                    j++;
                }
            }
        }

    }

    /**
     * 算法复杂度
     * 空间复杂度  S(n)
     */
    class SpaceComplexity{
        //空间复杂度O(1)
        private final static String TAG = "不参与循环的单行代码（声明变量）或者类似s1()的情况";

        private void s1(int n){
            int m =0;
            for(int i=0; i<=n; ++i)
            {
                m = i;
            }
        }

        //空间复杂度O(n)
        private void s2(int n){
            int[] m = new int[n];
            for(int i=0; i<=n; ++i)
            {
                m[i] = i;
            }
        }

        //空间复杂度O(n^k)
        private void s3(int n){
            //k可以理解为循环体嵌套的层数
            //比如下面的例子k则为2
            for(int i=0; i<=n; ++i)
            {
                for (int j = 0; j < n; j++) {
                    int m = 0;
                }
            }
        }
    }

}
