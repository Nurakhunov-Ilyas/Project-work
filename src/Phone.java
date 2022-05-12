public class Phone {
    private long number;
    private String owerName;
    private String model;
    private double weight;

    public Phone(long number, String owerName, String model,double weight){
        this(number, model);
        this.owerName = owerName;
        this.weight = weight;
    }

    public Phone(long number, String model){
        this.number = number;
        this.model = model;
        this.owerName = "Ilyas";
        this.weight = 55;
    }

    public void receiveCall(long number, String owerName){
        System.out.println(owerName + ":" + number + "Zvonit");
    }

    public Phone(){
        this(8700_666_999L, "Xiaomi", "Ilyas", 55);
    }

    public void receiveMessage(String message){
        System.out.println(this.owerName + ":" + message);
    }

    void sendMessage(Phone phone, String message){
        phone.receiveMessage(message);
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getOwerName() {
        return owerName;
    }

    public void setOwerName(String owerName) {
        this.owerName = owerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
