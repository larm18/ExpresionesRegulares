/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesregulares;
import java.util.regex.*;

/**
 *
 * @author luis
 */
public class ExpresionesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test();
        testLookingAt();
        testFind();
    }
    
    static Pattern patron;
    static Matcher match;
    
    static void test()
    {
        patron = Pattern.compile("www.[a-z]+\\w*t[0-9]{5}.com");
        match = patron.matcher("www.marcelino_barbat123456.com");
        
        System.out.println(match.matches());
    }
    
    
    static void testLookingAt()
    {
        patron = Pattern.compile("camion");
        match = patron.matcher("el camion de basura");
        
        System.out.println(match.lookingAt());
    }
    
    static void testFind()
    {
        patron = Pattern.compile("camion");
        match = patron.matcher("el camion de basura");
        
        System.out.println(match.find());
        // Test
    }
}
