package j26_Inheritance.Inheritance01;

public class Kedi extends  Mammal {//Mammal parent class  Mammal child class - torun

    /*Chil class obj olmadan parent class variable ve method `lara ulaşabilir*/
    public Kedi(){
        System.out.println("agam ahan da kedi p``siz cons.");

    }
    public  void cırmala(){
        System.out.println("kedi fena cırmalar miyavlar");
    }
}
