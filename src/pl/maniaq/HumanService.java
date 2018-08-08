package pl.maniaq;

public class HumanService {

    Human [] humans = {
            new Human("Pablo", 180, 85.4f),
            new Human("Escabo", 160, 75.4f),
            new Human("John", 150, 55.4f),
            new Human("Admin", 152, 45.4f),
            new Human("Kamil", 170, 65.4f),
    };

    public HumanService() {

    }

    public int countHumanTallerThan(int radix) {
        int count = 0;
        for (Human human : humans) {
            if (human.height > radix ) {
                count++;
            }
        }
        return count;
    }

    public int countHumanLowerThan(int radix) {
        int count = 0;
        for (Human human : humans) {
            if (human.height < radix ) {
                count++;
            }
        }
        return count;
    }

    public int countHeights() {
        int sumHeight = 0;
        for (Human human : humans) {
            sumHeight += human.height;
        }
        return sumHeight;
    }

    public int countWeights() {
        int sumWeight = 0;
        for (Human human : humans) {
            sumWeight += human.weight;
        }
        return sumWeight;
    }

    public int getCountHumans() {
        return humans.length;
    }

    public Human getHumanByName(String name) {
        for (Human human : humans) {
            boolean sameNames = human.name.equals(name);
            if(sameNames){
                return human;
            }
        }
        return null;
    }
}
