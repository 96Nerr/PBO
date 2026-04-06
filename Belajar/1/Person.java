class Person{
    String nama;
    int umur;
    String KataSandi;
    final String country = "Indonesia";

    //constructor
    Person(String ParamNama, int ParamUmur, String pin){
        nama = ParamNama;
        umur = ParamUmur;
        KataSandi = pin;
    }
    
    //constructor overloading (param harus beda (tipe data atau jumlahnya))
    Person(String ParamNama){
        this(ParamNama, 0, "XXXXX");
    }

    //constructor kosong
    Person(){
        this("Unknown", 0, "XXXXX");
    }

    public void DataDiri(){
        
    }

    void sapa(){
        System.out.println ("halo nama saya " + nama + ", umur saya " + umur + " Tahun");
    }

    void Login(String Nickname, String password){

        if (Nickname.equals(nama) && password.equals(KataSandi)){
        System.out.println ("Selamat Datang Kembali " + nama);   }
    }
}