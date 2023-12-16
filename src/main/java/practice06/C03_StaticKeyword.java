package practice06;

public class C03_StaticKeyword {

    /*
    scope: kapsam --> variable ve methodlarin nerelerde gecerli oldugunu belirtir

    4 cesit scope vardır:
    1-static variable/method --> class var/method
    2- instance var/method   --> object var/method
    3- local variable        --> method variable
    4- loop variable
     */

    //Bir classta instance, static, local ve loop variablelar olusturunuz
    //instance ve static 2 method olusturunuz
    //main method içinde 2 tane obje olusturunuz, variableları yazdırınız
    //static variable degerini artırınız
    //obj1 inst varb degerini guncelleyiniz
    //obj1, obj2'in ins ve static variablelarını yazdırınız
    //obj2'nin instance ve static variable artırınız
    //obj1, obj2'in ins ve static variablelarını yazdırınız

    int instanceSayi;
     static int staticSayi;

     public  void instanceMethod(){
         System.out.println(instanceSayi);
         System.out.println(staticSayi);

     }


     public static void staticMethod(){
         System.out.println(staticSayi);

         C03_StaticKeyword obj= new C03_StaticKeyword();
         System.out.println(obj.instanceSayi);

     }

    public static void main(String[] args) {
        //main method içinde 2 tane obje olusturunuz, variableları yazdırınız
        //static variable degerini artırınız
        //obj1 inst varb degerini guncelleyiniz
        //obj1, obj2'in ins ve static variablelarını yazdırınız
        //obj2'nin instance ve static variable artırınız
        //obj1, obj2'in ins ve static variablelarını yazdırınız


        int localSayi=0;
        for (int i = 0; i < 2; i++) { // loop variable

        }
        C03_StaticKeyword obj1 = new C03_StaticKeyword();
        C03_StaticKeyword obj2 = new C03_StaticKeyword();
        System.out.println(obj1.instanceSayi);
        System.out.println(staticSayi);
        staticMethod();
        obj1.instanceMethod();

        staticSayi++; // tum class'i etkiler
        obj1.instanceSayi++; // sadece objeyi etkiler
        System.out.println("64. satır : "+obj1.instanceSayi); //1
        System.out.println(obj2.instanceSayi); // 0
        System.out.println(obj1.instanceSayi);//1

        obj2.instanceSayi++;
        System.out.println("obj1.instanceSayi = " + obj1.instanceSayi);//1
        System.out.println("obj2.instanceSayi = " + obj2.instanceSayi);//1

        obj1.instanceSayi++;
        System.out.println("obj1.instanceSayi = " + obj1.instanceSayi);//2
        System.out.println("obj2.instanceSayi = " + obj2.instanceSayi);//1
        System.out.println("staticSayi = " + staticSayi); // 1

                /*
        Aynı classtaki static bir method icinden;
          1-static variable/methodlar direk cagrılır,
          2-instance variable/methodlar obje ile cagrılır

        Aynı classtaki instance method icinden;
          1- static variable/methodlar direk cagrılır
          2-instance variable/methodlar direk cagrılabilir

        Farklı class static method icinden
          1- static variable/methodlar class ismi ile cagrılır
          2- instance variable/methodlar obje ile cagrılır

          Farklı class instance method icinden
          1- static variable/methodlar class ismi ile cagrılır
          2- instance variable/methodlar obje ile cagrılır
         */



    }
}
