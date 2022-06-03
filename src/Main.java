public class Main {
    public static void main(String[] args) {
        int[] birds = new int[3];
        birds[0] = 1;
        birds[1] = 2;
        birds[2] = 3;
        for (int i = 0; i < birds.length; i++) {
            System.out.print(birds[i]);
            if (i != birds.length - 1)
                System.out.print(",");
        }
        System.out.println();

        for (int e = birds.length - 1; e > -1; e--) {
            System.out.print(birds[e]);
            if(e != 0)
                System.out.print(",");

        }
        System.out.println();

        double[] cows = {1.57, 7.654, 9.986};
        for (int w = 0; w < cows.length; w++) {
            System.out.print(cows[w]);
            if (w != cows.length - 1)
                System.out.print(",");
        }
        System.out.println();

        for (int z = cows.length - 1; z > -1; z--) {
            System.out.print(cows[z]);
            if(z != 0)
                System.out.print(",");

        }
        System.out.println();

        short[] sheeps = {4, 5, 6};
        for (int q = 0; q < sheeps.length; q++) {
            System.out.print(sheeps[q]);
            if (q != sheeps.length - 1)
                System.out.print(",");
        }
        System.out.println();
        for (int v = sheeps.length -1 ; v > -1; v--) {
            System.out.print(sheeps[v]);
            if(v != 0)
                System.out.print(",");

        }
        System.out.println();

        for (int j = 0; j < birds.length; j++) {
            if (birds[j] % 2 == 1) {
                birds[j] = birds[j] + 1;

            }
            System.out.print(birds[j]);
        }


    }
}