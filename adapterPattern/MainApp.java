public class MainApp {
    public static void main(String[] args) {
        // creating laptop object and its adapter
        Laptop laptop = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);

        // creating refrigerator object and its adapter
        Refrigerator ref = new Refrigerator();
        PowerOutlet refOutlet = new RefrigeratorAdapter(ref);

        // creating smartphone charger object and its adapter
        SmartphoneCharger charger = new SmartphoneCharger();
        PowerOutlet chargerOutlet = new SmartphoneAdapter(charger);

        // plugging in the 3 appliances
        System.out.println(laptopOutlet.plugIn());
        System.out.println(refOutlet.plugIn());
        System.out.println(chargerOutlet.plugIn());
    }
}
