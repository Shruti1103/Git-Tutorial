import java.util.*;
 class Floydtriangle {
    public static void main (String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows");
    int a =  sc.nextInt();
    int number = 1;
    
    int i,j;
    for( i=1;i<=a;i++){
        for( j=1;j<=i;j++){ 
            
                System.out.print(number+" ");
                number++;
            }
         System.out.println();   
            
    }



    }

}


