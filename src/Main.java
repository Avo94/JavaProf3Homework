public class Main {
    public static void main(String[] args) {

        //Level 1
        String[] number = {"+1(8882)315-71-07", "+1(034)596-45-52",
                "+1(6008)761-58-18", "+1(7508)496-98-18",
                "+1(639)358-33-10", "+1(35)537-38-81",
                "+1(30)289-03-64", "+1(57)402-60-29",
                "+1(159)887-00-00", "+1(2983)475-94-43}"};

        ButtonPhone buttonPhoneOne = new ButtonPhone();
        buttonPhoneOne.setModel("Nokia");
        ButtonPhone buttonPhoneTwo = new ButtonPhone();
        buttonPhoneTwo.setModel("Siemens");

        MobilePhone mobilePhoneOne = new MobilePhone();
        mobilePhoneOne.setModel("Xiaomi");
        MobilePhone mobilePhoneTwo = new MobilePhone();
        mobilePhoneTwo.setModel("Huawei");

        RadioPhone radioPhoneOne = new RadioPhone();
        radioPhoneOne.setModel("Panasonic");
        RadioPhone radioPhoneTwo = new RadioPhone();
        radioPhoneTwo.setModel("Texet");

        Phone[] phones = {buttonPhoneOne, buttonPhoneTwo,
                mobilePhoneOne, mobilePhoneTwo,
                radioPhoneOne, radioPhoneTwo};

        for (Phone model : phones) {
            makeCall(model, number[(int) (Math.random() * 9)]);
            receiveCall(model, number[(int) (Math.random() * 9)]);
        }
        System.out.println();

        //Level 2
        getTime();
    }

    public static void makeCall(Phone phone, String number) {

        phone.call(number);
    }

    public static void receiveCall(Phone phone, String number) {

        phone.receiveCall(number);
    }

    //Level 2
    public static void getTime() {

        ButtonPhone nokia = new ButtonPhone();
        nokia.setModel("Nokia");
        MobilePhone xiaomi = new MobilePhone();
        xiaomi.setModel("Xiaomi");
        RadioPhone panasonic = new RadioPhone();
        panasonic.setModel("Panasonic");

        AppleWatch appleWatch = new AppleWatch();
        appleWatch.setModel("Apple Watch");
        PocketWatch kaigunkoukutai = new PocketWatch();
        kaigunkoukutai.setModel("Kaigunkoukutai");
        WristWatch casio = new WristWatch();
        casio.setModel("Casio");


        Device[] devices = {nokia, xiaomi, panasonic, appleWatch, kaigunkoukutai, casio};

        for (Device model : devices) {
            time24hFormat(model);
        }
        System.out.println();

        //Just for example
        appleWatch.setTime(23, 59);
    }

    public static void time24hFormat(Device device) {
        device.showTime((int) (Math.random() * 23), (int) (Math.random() * 59));
    }
}