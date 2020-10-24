public class ex3{
    public static void main (String[] args) {
    
        int sum = 0;
        int sum2 = 0;
        
        
        for(int i=0; i<=100; i++){
            sum = sum + i*i;
            
        }
       
        
        for(int j=0; j<=100; j++){
            sum2 = sum2+j;
            
        }
        System.out.println(sum2*sum2 - sum);
        
        
        
    }
    
    
}
