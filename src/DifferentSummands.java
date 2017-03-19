import java.util.*;

public class DifferentSummands {
    public static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();

        int summand = 1;
        while(true) {
            if (n <= 2 * summand) {
                summands.add(n);
                break;
            } else {
                summands.add(summand);
                n -= summand;
                summand++;
            }
        }

        return summands;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}

