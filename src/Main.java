import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        Reader.init(System.in);
        int n=Reader.nextInt();

        for(int i=1;i<=n;i++) {
            int n1 = Reader.nextInt();
            if(n1==0){
                System.out.println(1 + " " +0);
            }
            else if(n1==1){
                System.out.println(0 + " " +1);
            }else{
                System.out.println(fibo(n1-1) + " " +fibo(n1));
            }
        }

    }
    public static int fibo(int n){
        double root5 = Math.sqrt(5);
        return (int)((1/root5)*(pow(((1+root5)/2),n)-pow(((1-root5)/2),n)));
    }
    public static double pow(double a, int b){
        double data=1;
        for(int i=1;i<=b;i++)
            data*=a;
        return data;
    }
}

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}