public class TestTV{
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.setChannel(120);
        tv2.setVolume(2);

        System.out.println("tv1`s channel is " + tv1.channel);
        System.out.println("tv1`s volume is " + tv1.volumeLevel);
        System.out.println("tv2`s channel is " + tv2.channel);
        System.out.println("tv2`s volume is " + tv2.volumeLevel);

    }
}