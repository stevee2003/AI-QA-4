// NeuralNetworkForwardPass.java
// QA–4 : Neural Network Forward Pass (Dynamic Input, No Training)

import java.util.Scanner;

public class NeuralNetworkForwardPass {

    // ReLU Activation Function
    public static double relu(double x) {
        return Math.max(0, x);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- INPUT LAYER --------
        System.out.println("Enter input values:");

        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double x5 = sc.nextDouble();

        System.out.println("\nInput Layer:");
        System.out.println("x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 +
                           ", x4=" + x4 + ", x5=" + x5);

        // -------- HIDDEN LAYER --------
        // Weights and Biases
        double[] w_h1 = {0.2, 0.4, 0.6, 0.3, 0.5};
        double[] w_h2 = {0.5, 0.3, 0.2, 0.4, 0.6};

        double b1 = 1.0;
        double b2 = 1.0;

        // Hidden neuron calculations
        double h1_input =
                (x1 * w_h1[0]) + (x2 * w_h1[1]) + (x3 * w_h1[2]) +
                (x4 * w_h1[3]) + (x5 * w_h1[4]) + b1;

        double h2_input =
                (x1 * w_h2[0]) + (x2 * w_h2[1]) + (x3 * w_h2[2]) +
                (x4 * w_h2[3]) + (x5 * w_h2[4]) + b2;

        // Apply ReLU activation
        double h1 = relu(h1_input);
        double h2 = relu(h2_input);

        System.out.println("\nHidden Layer:");
        System.out.println("h1 (after ReLU): " + h1);
        System.out.println("h2 (after ReLU): " + h2);

        // -------- OUTPUT LAYER --------
        double w5 = 1.2;
        double w6 = 0.7;
        double b3 = 0.5;

        double output = (h1 * w5) + (h2 * w6) + b3;

        System.out.println("\nOutput Layer:");
        System.out.println("Final Output: " + output);

        sc.close();
    }
}
