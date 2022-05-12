public class Main {
    public static void main(String[] args) {
        Phone one = new Phone();
        Phone two = new Phone(8676858L, "Luisa", "Samsung", 60);
        Phone three = new Phone();
        System.out.println(one.getModel());
        System.out.println(two.getModel());
        System.out.println(three.getModel());

    }
}
