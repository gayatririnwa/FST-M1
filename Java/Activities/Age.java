package Activities;

public class Age {
    int age;
    public Age (int age)
    {
        this.age=age; 
    }

    public float earthAge(){
    
       float EAge=0;
       EAge=age/31557600;
     
       return(EAge);
    }

    public float mercuryAge(){
      
        float MAge=0;
        MAge=age/20809;
      
        return(MAge);
     }

     public float VenusAge(){
       
        float VAge=0;
        VAge=age/53153;
       
        return(VAge);
     }

     public float MarsAge(){
       
        float MSAge=0;
        MSAge=age/162502;
        
        return(MSAge);
     }

     public float JupiterAge(){
      
        float JAge=0;
        JAge=age/1024929;
        
        return(JAge);
     }

     public float SaturnAge(){
       
        float SAge=0;
        SAge=age/1024929;
       
        return(SAge);
     }

     public float UranusAge(){
       
        float UAge=0;
        UAge=age/7259055;
       
        return(UAge);
     }
     public float NeptuneAge(){
      
        float NAge=0;
        NAge=age/14237970;
        
        return(NAge);
     }

}
