
public class SingletonPattern {
    public static void main(String[] args){

        //First Instance
        Object Object1 = Object.getObject();
        System.out.println(Object1);

        //Second Instance
        Object Object2 = Object.getObject();
        System.out.println(Object2);

    }
}