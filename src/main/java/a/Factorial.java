package a;

public class Factorial {
    public static void main(String[] args) {
        String input;
        do {
            input = System.console().readLine("Te exijo una lista de numero separados por comas, por favor, hermano:");
            if (input != null && !input.trim().isEmpty()) {
                String[] numbers = input.split(",");
                for (String number : numbers) {
                    try {
                        int n = Integer.parseInt(number.trim());
                        if (n < 0) {
                            System.out.println("El numero falsio: " + n);
                        } else {
                            FactorialThread thread = new FactorialThread(n);
                            thread.start();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("A CARAY, ERROR" + number);
                    }
                }
            } else {
                System.out.println("ADIOSITO");
            }
        } while (input != null && !input.trim().isEmpty());
    }

    static class FactorialThread extends Thread {
        private final int number;

        public FactorialThread(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            double factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println(number + "! = " + factorial);
        }
    }
}
