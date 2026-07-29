import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for (int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n-i-1; j++){
                sb.append(' ');
            }
            for (int j = 0; j < (2*i)+1; j++){
                sb.append('*');
            }
            System.out.println(sb);
        }

        sc.close();
    }
}