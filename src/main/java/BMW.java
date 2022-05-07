public class BMW extends Car {
    public void autoPilot()
    {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        BMW bmw= (BMW)new Car();
    }
}
