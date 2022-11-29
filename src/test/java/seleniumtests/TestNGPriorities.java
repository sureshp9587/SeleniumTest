package seleniumtests;
import org.testng.annotations.Test;
public class TestNGPriorities {


    @Test(priority=2)
    public void a_method(){
    System.out.println("I'm in method a");
    }
    @Test(priority=4)
    public void b_method(){
    System.out.println("I'm in method b");
    }
    @Test(priority=1)
    public void c_method(){
    System.out.println("I'm in method c");
    }
    @Test(priority=0)
    public void d_method(){
    System.out.println("I'm in method d");
    }
    @Test(priority=3)
    public void e_method(){
    System.out.println("I'm in method e");
    }

}