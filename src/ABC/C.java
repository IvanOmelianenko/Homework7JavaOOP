package ABC;

public class C extends B {


    @Override
    public void superA() {
        super.superA();
        System.out.println("This method overwritten from class B(see class B) and got new preferences. Method superA serves for reusable or inheritance");
    }


}
