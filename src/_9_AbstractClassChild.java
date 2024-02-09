public class _9_AbstractClassChild extends _9_AbstractClass
{
    public _9_AbstractClassChild()
    {
        System.out.println("_9_AbstractClassChild has been instantiated.");

        super.method1();
    }

    //overridden method from parent class
    @Override
    public void method2()
    {
        System.out.println("method2() is running from AbstractClassChild.");
    }

}
