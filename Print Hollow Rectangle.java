import java.util.Scanner;

// can be more optimal using java string builder, which omits inner loop

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // code here
        
        for (int i=1; i <= n; i++){
            for (int j=1; j <= m; j++){
                if (i == 1 || i == n){
                    System.out.print('*');
                }
                else if (j == 1 || j == m){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}