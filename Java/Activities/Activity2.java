package Activities;

public class Activity2 {
    
    public static void main(String[] args) {
    int num[]={10, 77, 10, 54, -11, 10};
    int sum=0;
   
    for(int x=0;x<num.length;x++){
        if(num[x]==10)
          sum+=num[x];
    }

    if(sum==30)
     System.out.println("result:" + "true");
    else
    System.out.println("result:" + "false");
}
}
