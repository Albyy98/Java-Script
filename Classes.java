class student
{
    int id;
    String name;
    String dept;
    char sec;
}
public class Classes{
    public static void main(String[]args)
    {
        student s1=new student();
        s1.id=016; 
        s1.name="Albyy";
        s1.dept="CSE";
        s1.sec='A';
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.dept);
        System.out.println(s1.sec);
                
    }
}