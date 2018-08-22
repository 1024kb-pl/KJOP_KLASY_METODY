package pl.maniaq;

public class Main {

    public static void main(String[] args) {
        HumanService humanService = new HumanService();
        Human pablo = humanService.getHumanByName("Pablo");
        Human john = humanService.getHumanByName("john");

        if (pablo != null) {
            System.out.println("Pablo: " + pablo.name + ", " + pablo.height + ", " + pablo.weight);
        } else {
            System.out.println("Nie znaleziono pablo.");
        }

        if (john != null) {
            System.out.println("John: " + john.name + ", " + john.height + ", " + john.weight);
        } else {
            System.out.println("Nie znaleziono john.");
        }
    }
}
