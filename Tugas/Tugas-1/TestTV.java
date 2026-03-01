//*Naufal Ridho Permana - 2404130075

public class TestTV{
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1`s channel is " + tv1.channel
        + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2`s channel is " + tv2.channel
        + " and volume level is " + tv2.volumeLevel);

        Manusia man1 = new Manusia("Erik");
        System.out.println(man1.namaSaya());

        TV tiviku = new TV();
        man1.beliTV(tiviku);

        //output cek TV
        System.out.println(man1.cekTV());

        //jual semua TV
        man1.jualSemuaTV(tiviku);

        //cek output cek TV setelah dijual
        System.out.println(man1.cekTV());

    }
}