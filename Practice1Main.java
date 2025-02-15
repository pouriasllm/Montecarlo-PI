public class Practice1Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Practice1Main <number_of_steps>");
            return;
        }

        long steps = Long.parseLong(args[0]);
        System.out.println("Number PI is " + Practice1.generatePiIterative(steps));
    }
}

