public class numbertriangle {
    public static void main(String[] args)  
    {  
    int rows=5;
    int number;      
    //inner loop  
    for (int i= 0; i<=rows-1 ; i++)  
    { number = 1; 
    //outer loop  
    for (int j=0; j<=i; j++)  
    {  
    //prints star and space  
    System.out.print(number + " ");  
    number++;    
}   
    //throws the cursor in the next line after printing each line  
    System.out.println();   
    }
    }      
}
