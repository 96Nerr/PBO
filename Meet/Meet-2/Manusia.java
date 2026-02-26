class Manusia{

    //properties
    private String nama;

    //methods

    //constructor kosong
    public Manusia(){
        nama = "Hi aku Michelle";
    }

    //constructor 2
    public Manusia(String nm){
        this.nama = nm;
    }

    //enkapsulasi get-set method
    public void getNama(String nm){
        this.nama = nm;
    }

    public String getNama(){
        return this.nama;
    }

    //Diganti 
   /*Manusia(String nama){
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
    }*/
}