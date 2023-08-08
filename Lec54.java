public class InbuiltClassStudy
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        System.out.println(pq.isEmpty());
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(9);
        pq.add(7);
        pq.add(2);
        pq.add(6);
        System.out.println(pq.isEmpty());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.size());

    }
}



class PQArray
{
    final int size = 10;
    int arr[] = new int[size];
    int nItems = 0;

    void add(int data)
    {
        if(isEmpty())
        {
            arr[0] = data;
            nItems++;
            return;
        }
        int i;
        for(i = nItems-1;i>=0;i++)
        {
            if(data<arr[i])
            {
                arr[i+1] = arr[i];
            }
            else
            {
                arr[i+1] = data;
                break;
            }
        }
        arr[i+1];
        nItems;
    }

    int poll()
    {
        return arr[--nItems];
    }

    int peek()
    {
        if(isEmpty()) return -1;
        return arr[nItems - 1];
    }

    boolean isEmpty()
    {
        return nItems == 0;
    }

    int size()
    {
        return nItems;
    }
}

public class ArrayImp1
{
    public static void main(String[] args)
    {
        PQArray pq = new PQArray();
        System.out.println(pq.isEmpty());
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(9);
        pq.add(7);
        pq.add(2);
        pq.add(6);
        System.out.println(pq.isEmpty());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.size());
    }
}
