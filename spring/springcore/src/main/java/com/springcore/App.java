package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //initiate a cointaner
       ApplicationContext context= 
    		   new ClassPathXmlApplicationContext("/springcore/src/main/java/config.xml");
       
       //context is the basically the spring cointener.
      Student student1= (Student) context.getBean("student2"); //I have to give the name of the bean.
      //now printing the object of student class
      System.out.println(student1);
    }
}
