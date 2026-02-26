class Tes {
    
    public static void main(String[] args) {
        Manusia michelle = new Manusia();
        michelle.getNama("Michelle Susanto");
        System.out.println(michelle.getNama());
        Manusia human = new Manusia("Jason");
        System.out.println(human.getNama());      

    }
}