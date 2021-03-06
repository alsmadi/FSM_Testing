/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IAlsmadi
 */
public class CruiseControlTest {
    CruiseControl c1;
    public CruiseControlTest() {
        c1= new CruiseControl();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void test1Off2Ready() {
        
        assertEquals(c1.main1(CruiseControl.OFF, "on"),CruiseControl.READY);
         
    }
    @Test
    public void test2Off2Off() {
        
        assertEquals(c1.main1(CruiseControl.OFF, "set"),CruiseControl.OFF);
         
    }
    @Test
    public void test3Off2Off() {
        
        assertEquals(c1.main1(CruiseControl.OFF, "brake"),CruiseControl.OFF);
         
    }
    @Test
    public void test4Off2Off() {
        
        assertEquals(c1.main1(CruiseControl.OFF, "accP"),CruiseControl.OFF);
         
    }
    @Test
    public void test5Off2Off() {
        
        assertEquals(c1.main1(CruiseControl.OFF, "accR"),CruiseControl.OFF);
         
    }
    @Test
    public void test6Off2Off() {
        
        assertEquals(c1.main1(CruiseControl.OFF, "resume"),CruiseControl.OFF);
         
    }
    @Test
    public void test7Off2Off() {
        
        assertEquals(c1.main1(CruiseControl.OFF, "correct"),CruiseControl.OFF);
         
    }
    @Test
    public void test8Off2Off() {
        
        assertEquals(c1.main1(CruiseControl.OFF, "slow"),CruiseControl.OFF);
         
    }
    @Test
    public void test9Off2Off() {
        
        assertEquals(c1.main1(CruiseControl.OFF, "fast"),CruiseControl.OFF);
         
    }
    @Test
    public void test10Off2Off() {
        
        assertEquals(c1.main1(CruiseControl.OFF, "store"),CruiseControl.OFF);
         
    }
    @Test
    public void test11ff2Off() {
        
        assertEquals(c1.main1(CruiseControl.OFF, "inc"),CruiseControl.OFF);
         
    }
    
    @Test
    public void test12ff2Off() {
        
        assertEquals(c1.main1(CruiseControl.OFF, "dec"),CruiseControl.OFF);
         
    }
      @Test
    public void test1Ready2Off() { 
        
        assertEquals(c1.main1(CruiseControl.READY, "Engineoff"),CruiseControl.OFF);
         
    }
    @Test
    public void test2Ready2Off() {
        
        assertEquals(c1.main1(CruiseControl.READY, "set"),CruiseControl.SET);
         
    }
    @Test
    public void test3Ready2Off() {
        
        assertEquals(c1.main1(CruiseControl.READY, "brake"),CruiseControl.OFF);
         
    }
    @Test
    public void test4Ready2Off() {
        
        assertEquals(c1.main1(CruiseControl.READY, "accP"),CruiseControl.OFF);
         
    }
    @Test
    public void test5Ready2Off() {
        
        assertEquals(c1.main1(CruiseControl.READY, "accR"),CruiseControl.OFF);
         
    }
    @Test
    public void test6Ready2Off() {
        
        assertEquals(c1.main1(CruiseControl.READY, "resume"),CruiseControl.OFF);
         
    }
    @Test
    public void test7Ready2Off() {
        
        assertEquals(c1.main1(CruiseControl.READY, "correct"),CruiseControl.OFF);
         
    }
    @Test
    public void test8Ready2Off() {
        
        assertEquals(c1.main1(CruiseControl.READY, "slow"),CruiseControl.OFF);
         
    }
    @Test
    public void test9Ready2Off() {
        
        assertEquals(c1.main1(CruiseControl.READY, "fast"),CruiseControl.OFF);
         
    }
    @Test
    public void test10Ready2Off() {
        
        assertEquals(c1.main1(CruiseControl.READY, "store"),CruiseControl.OFF);
         
    }
    @Test
    public void test11Ready2Off() {
        
        assertEquals(c1.main1(CruiseControl.READY, "inc"),CruiseControl.OFF);
         
    }
    
    @Test
    public void test12Ready2Off() {
        
        assertEquals(c1.main1(CruiseControl.READY, "dec"),CruiseControl.OFF);
         
    }

}
