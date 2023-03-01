public class ButtonPhone extends Phone {

    public ButtonPhone(String model) {
        super.model = model;
    }

    @Override
    public void call(String number) {
        System.out.println("Phone " + model + " call to " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Phone " + model + " receive call from " + number);
    }

    @Override
    public void showTime(int hours, int minutes) {
        System.out.println(model + " показывает время: " + hours + ":" + minutes);
    }

    @Override
    public String toString() {
        return "ButtonPhone{" +
                "model='" + model + '\'' +
                '}';
    }
}