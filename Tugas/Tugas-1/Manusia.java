class Manusia  {
    String nama;
    boolean punyaTv = false;

    //konstruktor kosng
    public Manusia(){

    }

    //Method
    public Manusia (String nama){
        this.nama = nama;
    }

    //fungsi ngebalikin nama
    public String namaSaya(){
        return nama;
    }

    // Method beli TV
    public void beliTV(TV tiviku) {
        punyaTv = true;
    }

    // Method jual TV
    public void jualSemuaTV(TV tiviku) {
        punyaTv = false;
    }

    //cek apakah punya TV
    public boolean cekPunyaTV() {
        return punyaTv;
    }
}