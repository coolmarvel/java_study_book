package sec4;

class SportsCar extends Car {
    void whoami() {
        System.out.println("나는 스포츠카다.");
    }
}

public class PolymorDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new SportsCar();

        for (Vehicle v : vehicles) {
            v.whoami();
        }
    }
}
