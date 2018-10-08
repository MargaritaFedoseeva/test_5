package com.company;

public class ConcreteClass extends BaseClass implements BaseInterfase {
    public int publicInt;
    private String privateString = "private string";
    protected boolean protectedBoolean;
    Object defauitObject;

    public ConcreteClass(int i) {
        this.publicInt = i;
    }


    @Override
    public void method1() {
        System.out.println("Method1 impl.");
    }

    @Override
    public int method2(String str) {
        System.out.println("Method2 impl.");
        return 0;
    }

    @Override
    public int method4() {
        System.out.println("Method4 overriden.");
        return 0;
    }

    public int method5(int i) {
        System.out.println("Method4 overriden.");
        return 0;
    }
     public class ConcreteClassPublicClass{}
     private class ConcreteClassPrivaeClass{}
     protected class ConcreteClassProtectedClass{}
     class ConcreteClassDefaultClass{}

     enum ConcreteClassDefauitEnum{}
     public enum ConcreteClassPublicEnum{}

     public interface ConcreteClassPublicInterface{}


}
