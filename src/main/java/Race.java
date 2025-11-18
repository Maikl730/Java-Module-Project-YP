import java.util.ArrayList;

public class Race {


    public  ArrayList<String> goRacing( ArrayList<Car> cars){

        ArrayList<String> raceResult = new ArrayList<>();
        int bestSpeed = 0;
        String bestCar ="";
        String winner = "Неизвестно";

        for(Car car:cars){
            raceResult.add(car.name + " проехала " + car.speed*24 + "км");
        }

        for(Car car:cars){
            if(car.speed>bestSpeed) {
                bestSpeed = car.speed;
                bestCar = car.name;
                winner = "Победитель " + car.name +
                        " с результатом " + bestSpeed * 24 +
                        "км за 24 часа!";
            } else if (car.speed == bestSpeed) {
                bestCar = bestCar+" и "+car.name;
                winner = "Ничья между " + bestCar +
                        " с результатом " + bestSpeed * 24 +
                        "км за 24 часа!";
            }

        }

        raceResult.add(winner);

        return raceResult;
    }

}
