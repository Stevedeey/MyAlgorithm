package tosinRepo;

public class Largest {
    static  void findMax()
    {
        int[] a = new int[] { 20, 30, 50, 4, 71, 100,1000};

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
            {
                max = a[i];
            }
        }

        System.out.println("The Given Array Element is:");
        for(int i = 0; i < a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("From The Array Element Largest Number is:" + max);
    }
}
