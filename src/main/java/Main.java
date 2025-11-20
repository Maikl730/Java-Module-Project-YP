import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
     final static int MAX_SPEED = 250;
    final static int MIN_SPEED = 0;

    public static void main(String[] args) {


        System.out.println("///////////////////////////////////");
        System.out.println("Приветсвуем на гонке 24 часа Леман!");
        System.out.println("///////////////////////////////////");

        Race race = new Race();
        ArrayList<String> result = race.goRacing(readAndWriteCars());

        System.out.println("///////ФИНИШ!///////");
        for(String i : result){
            System.out.println(i);
        }
    }

     static ArrayList<Car> readAndWriteCars(){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 1;i<=3;i++) {

            while (true) {
                System.out.println("Введите название автомобиля №" + i );

                String name = scanner.next().trim();
                if(name.length()>1) {

                    while (true) {
                        System.out.println("Введите скорость автомобиля №" + i + " "+name );
                        scanner.nextLine();

                        if (scanner.hasNextInt()) {
                            int speed = scanner.nextInt();

                            if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
                                cars.add(new Car(name, speed));
                                break;
                            } else {
                                System.out.println("Скорость должна быть от 1 до 250 км/ч,");
                            }
                        } else {
                            System.out.println("Нужно ввести скорость целым числом");
                        }
                    }
                    break;
                }else{
                    System.out.println("Название должно состоять из двух и более символов");
                }
            }
        }
        return cars;
    }
}
