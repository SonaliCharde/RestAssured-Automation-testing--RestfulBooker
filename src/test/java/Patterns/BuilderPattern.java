package Patterns;

public class BuilderPattern {
    // Change return type of each method as Class type
    // "this" always points to current/calling object. Returning the same to
    // have same reference


    public BuilderPattern Stage1(){
        System.out.println("Stage1");
        return this;
    }
    public BuilderPattern Stage2(String string){
        System.out.println("Stage2 is String" + string);
        return this;
    }
    public BuilderPattern Stage3(){
        System.out.println("Stage3");
        return this;
    }

    public static void main(String[] args) {
       BuilderPattern bp = new BuilderPattern();
       bp.Stage1().Stage2("test").Stage3();


    }
}
