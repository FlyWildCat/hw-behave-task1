package ru.pda;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int r : new Randoms(90, 100)) {
            System.out.printf("Выпало случайное число %d\n", r);
            if (r == 100) {
                System.out.printf("Выпало число %d, давайте на этом закончим!\n", r);
                break;
            }
        }
    }
}
