import java.util.Arrays;

public class hw_7 {
    public static void main(String[] args) {
        // task 1
        int[] massiv1 = new int[3];
        massiv1[0] = 1;
        massiv1[1] = 2;
        massiv1[2] = 3;
        float[] massiv2 = {1.57f, 7.654f, 9.986f};
        long[] massiv3 = {101010l, 10001l};

        // task 2
        System.out.println(Arrays.toString(massiv1));
        System.out.println(Arrays.toString(massiv2));
        System.out.println(Arrays.toString(massiv3));

        // task 3
        for (int i = (massiv1.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(massiv1[i]);
            } else {
            System.out.print(massiv1[i] + ", ");}
        }
        for (int i = (massiv2.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(massiv2[i]);
            } else {
                System.out.print(massiv2[i] + ", ");}
        }
        for (int i = (massiv3.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(massiv3[i]);
            } else {
                System.out.print(massiv3[i] + ", ");}
        }

        // task 4
        for (int i = 0; i < massiv1.length; i++) {
            if (massiv1[i] % 2 != 0) {
                massiv1[i]++;
                System.out.print(massiv1[i] + " ");
            } else {
                System.out.print(massiv1[i] + " ");
            }
        }
    }
}
