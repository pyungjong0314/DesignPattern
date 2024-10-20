package Singletion;

public class Single {
    private static Single single;

    private Single(){}
    
    public static Single getInstance(){
        if(single == null){
            single = new Single();
        }
        return single;
    }
}
