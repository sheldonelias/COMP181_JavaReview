public class _16_AbstractClassChild extends _16_AbstractClass
{
    public _16_AbstractClassChild()
    {
        //super.method2();

        System.out.println("_16_AbstractClassChild has been instantiated.");

        //method2();

    }

    //overridden method from parent class
    @Override
    public void method2()
    {
        System.out.println("method2() is running from Abstract ClassChild.");
    }

    public void newMethod()
    {

    }

}
