import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
      Scanner sc = new Scanner(System.in);
      //System.out.println("Enter a number: "); // enter number of numbers
      int num = sc.nextInt();
      int [] a = new int[num]; // create int array of num length
      //System.out.println("Enter " + num + " numbers: "); // enter numbers

      for (int i = 0; i < num; i++)
      {
        a[i] = sc.nextInt(); // add numbers to array
      }
      
      int maxCount = 0;
      int mode = 0;
      for (int i = 0; i < num; i++)
      {
        int value = a[i]; // num in array
        int count = 0;
        for (int j = 0; j < num; j++)
        {
          if (a[j] == value)
          {
            count += 1; 

            if (count > maxCount)
            {
              mode = value;
              maxCount = count;
              
            }
          }
        }
      }

      System.out.println(mode);
    
  }
}
