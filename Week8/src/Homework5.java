public class Homework5 {
    public static class Computer {
        private String cpu = "Core i7", memory = "32GB", hd = "2TB", color = "White", power = "700W";

        Computer() {
        }

        void turnOn() {
            System.out.println("Turning on the computer.");
        }

        void printInfo() {
            System.out.println("The spec of the computer");
            System.out.printf(" CPU: %s\n", this.cpu);
            System.out.printf(" Memory: %s\n", this.memory);
            System.out.printf(" HDD: %s\n", this.hd);
            System.out.printf(" Color: %s\n", this.color);
            System.out.printf(" Power: %s\n", this.power);

        }
    }
    public static class Monitor {
        String monitorSize = "32 inch", color = "Black", power = "45W";

        void turnOn() {
            System.out.println("Turing on the monitor.");
        }

        void printInfo() {
            System.out.println("The spec of the monitor");
            System.out.printf(" Size: %s\n", this.monitorSize);
            System.out.printf(" Color: %s\n", this.color);
            System.out.printf(" Power: %s\n", this.power);
        }
    }

    public static class PersonalComputer {
        Computer c;
        Monitor m;

        void turnOn(Computer c, Monitor m){
            this.c = c;
            this.m = m;
            c.turnOn();
            m.turnOn();
        }
    }

    public static void main(String[] args) {
        PersonalComputer personalComputer = new PersonalComputer();
        Computer computer = new Computer();
        Monitor monitor = new Monitor();
        personalComputer.turnOn(computer, monitor);
        computer.printInfo();
        monitor.printInfo();
    }
}