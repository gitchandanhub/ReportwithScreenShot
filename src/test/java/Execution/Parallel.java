package Execution;

import org.testng.annotations.Test;

public class Parallel 
{
	@Test
    public void i()
    {
    	for(int i = 0; i <100; i++)
    	{
    		System.out.println("I am inside method i");
    		System.out.println(Thread.currentThread());
    	}
    }
    @Test
    public void j()
    {
    	for(int j = 0; j<100; j++)
    	{
    		System.out.println("I am inside method j");
    		System.out.println(Thread.currentThread());
    	}
    }
}
