public class numberpattern {
    public static void main(String[] args)  
    {  
    int rows=5;
    int number=1;      
    //inner loop  
    for (int i= 0; i<=rows-1 ; i++)  
    {  
    //outer loop  
    for (int j=0; j<=rows-1; j++)  
    {  
    //prints star and space  
    System.out.print(number + " ");  
}   
    number++;
    //throws the cursor in the next line after printing each line  
    System.out.println();   
    }
    }       
}
