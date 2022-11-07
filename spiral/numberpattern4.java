public class numberpattern4 {
    public static void main(String[] args)  
    {  
    int rows=5;
    int j;
       
    //inner loop  
    for (int i= 1; i<=rows; i++)  
    {  
    //outer loop  
    for (j=1; j<=rows; j++)  
    {  if(i==j)
        {
            System.out.print(i+" ");
        }
        else{
    //prints star and space 
    System.out.print(1+" ");    
}}
   
    //throws the cursor in the next line after printing each line  
    System.out.println();   
    }
    }    
}
