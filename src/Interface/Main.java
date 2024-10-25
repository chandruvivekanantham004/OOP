package Interface;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        Engine car1 = new Car();
        //car1.brake(); gives error because of overriding you already know it;
      //  car.stop();
     NiceCar car = new NiceCar(5);
     car.start();
     car.upgradeEngine();
     car.start();
     Media CAR = new CDplayer();
     CAR.start();


    }
}



