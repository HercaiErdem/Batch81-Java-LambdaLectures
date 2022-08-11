package day10_practice;

public class OgretmenBilgileri {

    String isim;
    String soyisim;
    int yas;
    String brans;
    String tel;


    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", brans='" + brans + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }



    public OgretmenBilgileri(String isim, String soyisim, int yas,
                             String brans, String tel) {

        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;








    }
}

