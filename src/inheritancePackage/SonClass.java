package inheritancePackage;

public class SonClass extends ParentClass implements MyInterface,MyInterface2 {


    @Override
    public void name() {
        System.out.println("MUSTAFA");
    }
    @Override
    public void age() {
        System.out.println("29");

    }
    @Override
    public void length() {
        System.out.println("170");

    }
    @Override
    public void weight() {
        System.out.println("70");

    }
    @Override
    public void hobby() {
        System.out.println("Football");
    }
    @Override
    public void job() {
        System.out.println("Engineer");

    }
    @Override
    public void collage() {
        System.out.println("Engineering");

    }
}
