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
    public void beliTV(TV TVku) {
        punyaTv = true;
    }

    

}