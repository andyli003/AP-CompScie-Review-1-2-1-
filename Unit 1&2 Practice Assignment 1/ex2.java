// Please go over this in class//
public class ex2 {
    public static void main (String[] args) {
        int num1 = 0;
        int num2 = 1;
        int middlesum = 0;
        int sum = 0;
        
        do {
        if(num2%2 == 0){
            sum = sum + num2;
            
        }
        middlesum = num1 + num2;
        num1 = num2;
        num2 = middlesum;
        }
        while (num2<=4000000);{
            System.out.println(sum);
            
        }
        
     
        
        
    }
    
}
