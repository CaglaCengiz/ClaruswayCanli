package j25_Encapsulation.encapsulation02;

public class Runner {
    public static void main(String[] args) {
        Kişi obj1=new Kişi("umit","K","umitK33",33);
        System.out.println("obj1.ad = " + obj1.ad);
        obj1.ad="guzel insan umit bey";
        System.out.println("obj1.ad = " + obj1.ad);
        System.out.println("obj1.soyad = " + obj1.soyad);
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        obj1.setYas(-34);
        System.out.println("obj1.getYas() = " + obj1.getYas());
    }
}
