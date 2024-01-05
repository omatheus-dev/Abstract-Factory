package br.com.mfer;

public class Program {

    public static void main(String[] args) {
        Customer cliente = new Customer("A", true);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.hasCompanyContract()) {
            return new ContractFactory();
        } else {
            return new WithoutContractFactory();
        }
    }
}
