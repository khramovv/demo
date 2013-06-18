import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vkhramov
 * Date: 6/6/13
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class Employee extends People implements Comparable<Employee>
{
    private Date hireDay;
    @Override
    public int compareTo(Employee other) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
