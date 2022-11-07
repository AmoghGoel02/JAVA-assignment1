public class numberpattern2 {
    public static void main(String[] args)  
    {  
    int rows=5;
    int number;
    int j;      
    //inner loop  
    for (int i= 0; i<=rows-1 ; i++)  
    {  number=1;
    //outer loop  
    for (j=0; j<=rows-1; j++)  
    {  
    //prints star and space 
    System.out.print(number+" ");
    number++; 
}  
    //throws the cursor in the next line after printing each line  
    System.out.println();   
    }
    }          
}
