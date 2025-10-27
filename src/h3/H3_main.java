package h3;

public class H3_main {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = -10;

        boolean a = i > j;
        boolean b = i > 200;
        boolean c = j > 100;

        if (a && !b && !c) {
            k = 1;
        }
        if (a && b && !c) {
            k = 2;
        }
        if (a && b && c) {
            k = 3;
        }
        if (!a && !b && !c) {
            k = 4;
        }
    }
}
