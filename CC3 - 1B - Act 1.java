
package cc31b;
import java.util.Scanner;
/**
 *
 * @author m304user
 */
public class CC31B {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of the array: ");
        int []el = new int[n];
        for(int i = 0; i < n; i++){
            el[i] = sc.nextInt();
        }
        System.out.println("The mean is: ");
        System.out.println(mean(el));
        System.out.println();
        System.out.println("The mode is: ");
        System.out.println(mode(el));
    }
    static double mean(int[] m){
        double f = 0;
        for (int i = 0; i < m.length; i++) {
            f += m[i];
        }
    return f / m.length;
    }
    static int mode(int a[]){
        int m = 0, n = 0;
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i])
                c++; {
                    if (c > m) {
                        m = c;
                        n = a[i];
                    }
    
                }
                
            }
        }
        return n;
    }
}
