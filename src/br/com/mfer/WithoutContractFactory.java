package br.com.mfer;

public class WithoutContractFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new AudiCar(190, "gasoline", "black");
        } else if("B".equals(requestedGrade)) {
            return new VolksvagemCar(120, "gasoline", "yellow");
        } else {
            return null;
        }
    }
}
