import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    static int[] buildArray(int n) {

        FastReader in = new FastReader();
        int arr[] = new int[n];
        try {
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }

    public static void main(String[] args) {

        try {
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();
            int testCases = in.nextInt();

            while (testCases-- > 0) {
                // write code here
                int a = in.nextInt();
                int b = in.nextInt();

                String str = in.nextLine();

                out.println(a*b);
                out.println(str);
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
