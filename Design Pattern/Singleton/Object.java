public class Object {

    private static volatile Object Object; // = new Object();

    private Object(){
        //Manually invoking in the constructor

        if(Object != null){
            throw new RuntimeException(" use getObject method");
        }
        //If interferes with reflection framework it will block in here
    }

    public static Object getObject(){
        //If the Object is null or not created
    
        if(Object == null){
            //If it is null we call synchronize to Object class
            synchronized (Object.class){
                if(Object == null){
                    Object = new Object();
                }
            }
        }
        //If it is created then it will return the singleObject
        return Object;
    }

}