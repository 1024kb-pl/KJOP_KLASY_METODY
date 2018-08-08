package pl.maniaq;

public class NumberService {
    int [] numbers = {10, 2, 3, 85, 23, 491, 23, 412, 42, 41, 22, 25};

    public NumberService() {

    }

    public int getCountNumbers() {
        return numbers.length;
    }

    public int countNumbersHigherThan(int radix) {
        int count = 0;
        for (int number : numbers) {
            if (number > radix ) {
                count++;
            }
        }
        return count;
    }

    public int countNumbersLowerThan(int radix) {
        int count = 0;
        for (int number : numbers) {
            if (number < radix ) {
                count++;
            }
        }
        return count;
    }

    public int sumNumbers() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public void sortNumbers() {
        for (int i=0;i<numbers.length;i++) {
            for (int j=0;j<numbers.length;i++) {
                boolean sameNumbers = i == j;
                if (sameNumbers) continue; // pomiń krok pętli, gdy indexy są sobie równe i == j -> czyli porównujemy te same elementy

                boolean numberIsHigher = numbers[i] > numbers[j];
                if (numberIsHigher) { // jeżeli liczba jest większa to zamień je miejscami;
                    int tempNumber = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tempNumber;
                }
            }
        }
    }

    public void displayNumbers() {
        for (int number : numbers) {
           System.out.println(number);
        }
    }
}
