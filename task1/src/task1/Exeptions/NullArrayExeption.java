package task1.Exeptions;

public class NullArrayExeption extends Exception {
    public NullArrayExeption(Throwable e){
        System.out.println("you try to work with null array");
    }
}
