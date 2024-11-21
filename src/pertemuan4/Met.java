package pertemuan4;
public class Met {
    public int umur = 10;
    public String nama = "Yodi";
    
    public void tampilNama() {
        System.out.println("Nama " + nama);
    }
    
    public String tamNama(){
        return nama;
    }
    
    public int umur(){
        return umur;
    }
    
    public void umurNama(int umur, String nama) {
        System.out.println("Nama: " + nama + " Umur : " + umur);
    }

}
