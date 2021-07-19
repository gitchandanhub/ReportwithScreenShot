package Execution;

import org.testng.annotations.Test;

public class Paralleltest 
{
    @Test
    public void g()
    {
    	for(int i = 0; i <100; i++)
    	{
    		System.out.println("I am inside method g");
    		System.out.println(Thread.currentThread());
    	}
    }
    @Test
    public void h()
    {
    	for(int j = 0; j<100; j++)
    	{
    		System.out.println("I am inside method h");
    		System.out.println(Thread.currentThread());
    	}
    }
}
