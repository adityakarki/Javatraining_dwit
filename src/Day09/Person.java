package Day09;

/**
 * Created by aditya on 2/14/14.
 */
public class Person {

    String name;
    String address;
   // String contact;

    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);

    }

    public Person(String aaa, String add){

        name = aaa;
        address = add;



    }
    public Person(){

      String num1 = "123";
    }
}
