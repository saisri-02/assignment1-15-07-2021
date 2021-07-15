import java.util.*;
public class Arraylist
{
public static void main(String args[])
{
ArrayList<Integer> a=new ArrayList<Integer>();
a.add(10);
a.add(20);
a.add(30);
a.add(40);
System.out.println(a);
ArrayList<Integer> b=new ArrayList<Integer>();
b.add(100);
b.add(200);
b.add(300);
b.add(400);
System.out.println(b);
ArrayList<Integer> c=new ArrayList<Integer>();
c.addAll(a);
c.addAll(b);
System.out.println(c);
}
}

output:

[10, 20, 30, 40]
[100, 200, 300, 400]
[10, 20, 30, 40, 100, 200, 300, 400]

/*
import java.util.*;
public class Arraylist
{
public static void main(String args[])
{
ArrayList<String> a=new ArrayList<String>();
a.add("red");
a.add("blue");
a.add("green");
a.add("pink");
System.out.println(a);
ArrayList<String> b=new ArrayList<String>();
b.add("white");
b.add("yellow");
b.add("pink");
System.out.println(b);
ArrayList<String> c=new ArrayList<String>();
c.addAll(a);
c.addAll(b);
System.out.println(c);
}
}

output:

[red, blue, green, pink]
[white, yellow, pink]
[red, blue, green, pink, white, yellow, pink]

*/