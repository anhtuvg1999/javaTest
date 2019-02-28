/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fan;

/**
 *
 * @author MSI
 */
class X
{
    int m = 1111;
 
    {
        m = m++;
 
        System.out.println(m);
    }
}
 
class Y extends X
{
    {
        System.out.println(methodOfY());
    }
 
    int methodOfY()
    {
        return m-- + --m;
    }
}
 
public class Fan
{
    public static void main(String[] args)
    {
        Y y = new Y();
    }
}