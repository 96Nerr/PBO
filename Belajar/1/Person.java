class Person{
    String nama;
    int umur;
    final String country = "Indonesia";

    //constructor
    Person(String ParamNama, int ParamUmur){
        nama = ParamNama;
        umur = ParamUmur;
    }

    //constructor overloading (param harus beda (tipe data atau jumlahnya))
    Person(String ParamNama){
        nama = ParamNama;
    }

    //constructor kosong
    Person(){
    }

    void sapa(){
        System.out.println ("halo nama saya " + nama + ", umur saya " + umur + " Tahun");
    }

}