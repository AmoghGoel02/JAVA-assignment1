public class numberpattern3 {
    public static void main(String[] args)  
    {  
    int rows=5;
    int j;
       
    //inner loop  
    for (int i= 1; i<=rows; i++)  
    {  
    //outer loop  
    for (j=1; j<=i; j++)  
    {  
    //prints star and space 
    System.out.print(i+" ");
     
}   
    for(j=rows-i;j>0;j--)
{
    System.out.print(1+" ");
} 
  
    //throws the cursor in the next line after printing each line  
    System.out.println();   
    }
    }       
}
