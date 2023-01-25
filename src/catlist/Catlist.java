/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catlist;

/**
 *deeeee
 * @author Fuwad Oladega
 */
public class Catlist 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Cat[] list= new Cat[3];
        
        Cat c1= new Cat();
        c1.setName("Tiger");
        c1.setAge(30);
        Cat c2= new Cat();
        c2.setName("Domestic Lion");
        c2.setAge(40);
        Cat c3= new Cat();
        c3.setName("Lion");
        c3.setAge(20);
        
        list[0]=c1;
        list[1]=c2;
        list[2]=c3;
        for(int i=0; i<list.length; i++)
        {
            System.out.println(list[0].getName() + " " + list[0].getAge());
            System.out.println(list[1].getName() + " " + list[1].getAge());
            System.out.println(list[2].getName() + " " + list[2].getAge());
            // System.out.println(list[i].getName() + " " + list[i].getAge());
        }
         for(int i=0; i<list.length; i++)
        {
            System.out.println(list[0].getName() + " " + list[0].getAge());
            System.out.println(list[1].getName() + " " + list[1].getAge());
            System.out.println(list[2].getName() + " " + list[2].getAge());
            // System.out.println(list[i].getName() + " " + list[i].getAge());
        }
    }
    
}
