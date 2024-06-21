package Activities;

public class Activity4 {

    public static void main(String[] args) {
        sort();
    }
    public static void sort(){
    int num[]={4, 3, 2, 10, 12, 1,5,6};
    int temp, j;

    for(int i=0;i<num.length-2;i++)
    {

        //System.out.println("num 1st"+num[i]);
        //System.out.println("num 2nd"+num[++i]);
        
            temp= num[i];
            j=i-1;
            while (j>=0 && temp<=num[j])
            {
                num[j+1] = num[j];     
                j = j-1; 
            }

            num[j+1] = temp;   
        }
    

    for (int i=0;i<num.length;i++)
      System.out.println("array"+ num[i]);
}
}
