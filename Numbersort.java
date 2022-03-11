class Numbersort
{
 public static void maion (String arg[])
{
  int number []={ 2,10, 15,1,12,17};
  int n=number.length;
  system.out.println(n);
   for(int i=0;i<n;i++)
   {
     system.out.println(" "+number[i]);
   }
   system.out.println("\n");
   for(int i=0;i<n;i++)
   {
      for(int j=i+1;j<n;j++)
      {
         if(number[i]<number[j]) 
      {
         int temp=number [i];
         number[i]=number[j];
         number[j]=temp;
      }
   }
system.out.println("sorted list");
   for(int i=0;i<n;i++)
   {
          system.out.println(number[i]);
   }
     system.out.println(" ");
}


