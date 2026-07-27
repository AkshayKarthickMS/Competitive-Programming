import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for (int i = n; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            
            for (int j = 0; j < 2*(n-i); j++){
                System.out.print(' ');
            }
            
            for (int j = i; j > 0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}