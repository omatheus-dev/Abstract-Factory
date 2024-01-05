package br.com.mfer;

public class ContractFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new TeslaCar(220, "gasoline and álcool", "white");
        } else if("B".equals(requestedGrade)) {
            return new ToyotaCar(140, "álcool", "red");
        } else {
            return null;
        }
    }
}
