
public class Main {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;
        int count = 0;
        while (temp != 0) {
            int rem = temp % 10;
            count++;
            temp = temp / 10;
        }

        while (n != 0) {
            int rem = n % 10;
            sum += Math.pow(rem, count);
            n = n / 10;
        }

        System.out.println(sum);
    }
}
