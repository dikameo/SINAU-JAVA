class perkenalan{
    String nama;
    perkenalan(String nama){
        this.nama = nama;
    }

    void show(){
        System.out.println("nama saya :" + this.nama);
    }
}


public class variabel {
    public static void main(String[] args) {
        System.out.println("wahyu andika");
        perkenalan nama = new perkenalan("budi");
        nama.show();
    }
}
