package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 12;
        int j = 234;
        int k = 84;
        int min = 4;
        int max = 5;

        if (i < j) {
            min = i;
            max = j;
        } else if (i > j) {
            max = i;
            min = j;
        }
        if (k < min) {
            min = k;
        } else if (k > max) {
            max = k;
        }
    }
}
