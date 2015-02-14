
import java.util.ArrayList;

class Machine
{

    @Override
    public String toString()
    {
        return "I am a Machine";
    }

    public void start()
    {
        System.out.println("starting");
    }

}

class Camera extends Machine
{

    @Override
    public String toString()
    {
        return "i am a camera";
    }

    public void snap()
    {
        System.out.println("This is taking a photo");
    }

}

public class Application
{
    public static void main(String[] args)
    {
        ArrayList<Machine> list = new ArrayList<>();

        list.add(new Machine());
        list.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<>();

        list2.add(new Camera());
        list2.add(new Camera());

        showlist(list2);
        showlist2(list);
    }
    /*
     the ? is the wild card
     but we will need to use Object as the class as it is only for wild card
     */

    public static void showlist(ArrayList<? extends Machine> list)
    {
        for (Machine value : list)
        {
            System.out.println(value);
            value.start();
        }
    }

    public static void showlist2(ArrayList<? super Camera> list)
    {
        for (Object value : list)
        {
            System.out.println(value);
        }
    }

    public static void showlist3(ArrayList<?> list)
    {
        for (Object value : list)
        {
            System.out.println(value);
        }
    }
}
