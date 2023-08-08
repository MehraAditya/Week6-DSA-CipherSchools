import java.util.*;
public class SetImp1
{
    public static void main(String[] args)
    {
        Set<Integer> s = new HashSet<>();
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s.contains(2));
        System.out.println(s.contains(4));
        System.out.println(s.size());
        System.out.println(s.contains(3));
        s.remove(3);
        System.out.println(s.contains(3));
        System.out.println(s.size());
        s.add(2);
        System.out.println(s.size());
        s.clear();
        System.out.println(s.size());

        for(int i=0;i<n;i++)
        {
            System.out.println("Please enter " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: ");

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i] + " ");
        }
        
        for(Integer x:s)
        {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
