public class Main {

  public static void main(String[] args) {

    int low = 23;
    int high = 97;
    for(int i = low; i<=high; i++)
    {
           boolean flag = false;
        for(int j=2;j<=i/2;j++)
        {
            if(i%j==0)
            {
                flag = true;
                break;
            }
        }   
            if (!flag)
                 System.out.println(i + " is a prime number.");
          
    }
  }
}
