import java.util.Scanner;

public class Spiral {
    static int N;
    static int[][][] cube;
    static int value = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        cube = new int[N][N][N];

        fillCube();

        printCube();
    }

    static void fillCube() {
        int layers = (N + 1) / 2;

        for (int layer = 0; layer < layers; layer++) {
            int start = layer;
            int end = N - layer - 1;

            for (int z = start; z <= end; z++) {
                for (int y = start; y <= end; y++) {
                    for (int x = start; x <= end; x++) {
                        if (z == start || z == end || y == start || y == end || x == start || x == end) {
                            if (cube[z][y][x] == 0) {
                                cube[z][y][x] = value++;
                            }
                        }
                    }
                }
            }
        }
    }

    static void printCube() {
        for (int z = 0; z < N; z++) {
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < N; x++) {
                    System.out.print(cube[z][y][x]);
                    if (x != N - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            if (z != N - 1) {
                System.out.println();
            }
        }
    }
}

