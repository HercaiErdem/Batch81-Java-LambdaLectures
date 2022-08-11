package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1 = new Ogretmen();

        ogr1.setIsim("Tulay");
        System.out.println(ogr1.getIsim());

        ogr1.setSoyisim("Erdem");
        System.out.println(ogr1.getSoyisim());

        ogr1.setBrans("Cografya");
        System.out.println(ogr1.getBrans());

        System.out.println("Ogretmenin bilgileri: " + ogr1.getIsim() + " " + ogr1.getSoyisim()
        + " " + ogr1.getBrans());


    }
}
