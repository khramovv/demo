/**
 * Created with IntelliJ IDEA.
 * User: vkhramov
 * Date: 6/6/13
 * Time: 10:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class People
{
    public People(String aName, int aAge)
    {
        name =aName;
        age = aAge;
    }

    public int getAge() {
        return age;
    }

    public String getName()
    {
        return name;
    }
    private int age;
    private String name;
}
