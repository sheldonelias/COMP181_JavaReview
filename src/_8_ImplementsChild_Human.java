public class _8_ImplementsChild_Human implements _8_ImplementsInterface
{

    //_8_ImplementsChild_Human must implement all of the
    //declared abstract methods in _8_Implements

    public _8_ImplementsChild_Human()
    {
        //myInterfaceMethod1_idle();;
        //myInterfaceMethod2_walk();
        //myInterfaceMethod3_run();
    }

    @Override
    public void myInterfaceMethod1_idle()
    {
        System.out.println("In my unique way, I am an IDLING HUMAN.");
    }

    @Override
    public void myInterfaceMethod2_walk()
    {
        System.out.println("In my unique way, I am a WALKING HUMAN.");
    }

    @Override
    public void myInterfaceMethod3_run()
    {
        System.out.println("In my unique way, I am a RUNNING HUMAN.");
    }





}