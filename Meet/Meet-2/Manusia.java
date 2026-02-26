class Manusia{
    //properties

    String nama;



    Manusia(){
        nama = "Nama aku Michelle";
    }
    void getNama(){
        System.out.println(nama);
    }
    public static void main(String[] args) {
        Manusia michelle = new Manusia();
        System.out.println(michelle.nama);
        michelle.nama = "Michelle";
        System.out.println(michelle.nama);
    }
}