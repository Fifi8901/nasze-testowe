package petla_w_petli_tabliczka;

public class Petla_w_petli_tabliczka 
{
    /*Program ten to zastosowanie praktyczne na przykładzie tabliczki mnożenia zagnieżdżenia pętli w pętli
    Ponadto wyświetla ona tylko przemnożone rzędy liczb parzystych
    */

     public static void main(String[] args) 
    {
        for(int j=1; j<=10; j++)
        {
            if(j%2!=0)
                   continue;      
            
            for (int i=1; i<=10; i++)
            {

                System.out.print(i*j+ " ");
            }
            System.out.println();
        }    
    }
    
}