package src.main.java.com.pattern.structural.adapter;

public class MainAdapter {

    private static void testSocketAdapterObject() {
        Adapter sockAdapter = new SocketAdapterObject();
        Volt v15 = getVolt(sockAdapter,15);
        Volt v50 = getVolt(sockAdapter,50);
        Volt v80 = getVolt(sockAdapter,80);
        System.out.println(
                "testSocketAdapterObject results\n" +
                        "v15 volts using socket adapter object = " + v15.getVolts() + "\n" +
                        "v50 volts using socket adapter object = " + v50.getVolts() + "\n" +
                        "v80 volts using socket adapter object = " + v80.getVolts()
        );
    }

    private static void testSocketAdapterClass() {
        Adapter sockAdapter = new SocketAdapterClass();
        Volt v15 = getVolt(sockAdapter,15);
        Volt v50 = getVolt(sockAdapter,50);
        Volt v80 = getVolt(sockAdapter,80);
        System.out.println(
                "testSocketAdapterClass results\n" +
                "v15 volts using socket adapter class = " + v15.getVolts() + "\n" +
                "v50 volts using socket adapter class = " + v50.getVolts() + "\n" +
                "v80 volts using socket adapter class = " + v80.getVolts()
        );
    }

    private static Volt getVolt(Adapter sockAdapter, int i) {
        switch (i){
            case 15: return sockAdapter.get15Volt();
            case 50: return sockAdapter.get50Volt();
            case 80:
            default: return sockAdapter.get80Volt();
        }
    }

    public static void main(String[] args)
    {
        testSocketAdapterObject();
        testSocketAdapterClass();
    }
}
