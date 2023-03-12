package day33_encapsulation;

public class Ogretmen {

    private String isim;
    private String soyisim;
    private String brans;

    /*
    Bazen de yetkileri sinirlamak degil de
    yapilan isi daha iyi tanimlama icin encapsulation kullanilir.



   Bu yaklasimi kullanan class larda
   tum variable lar pirvate yapilip
     */


    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getIsim() {
        return isim;

    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;

    }


}
