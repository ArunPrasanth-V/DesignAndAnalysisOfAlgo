package bruteForce;
public class BruteForcePatternSearching_1 {
    public static void main(String args[])
    {
    	char main[]= {'o','d','b','c','a','d','a','d'};
    	char pattern[]= {'a','d'};
    	int max=main.length-pattern.length+1;
    	for(int i=0;i<=max;i++)
    	{
    		for(int j=i;j<pattern.length;j++)
    		{
    			if(main[i+j]!=pattern[i])
    				break;
    			if(main[j]==pattern[i])
    			{
    				System.out.println("the index is "+i);
    				break;
    			}
    		}
    	}
    }
	

}
