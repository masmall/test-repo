package org.pro.lang;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Pro.
 */
public class ProTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ProTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ProTest.class );
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp()
    {
        // TODO something
        assertTrue( true );
    }
  // DRY test
  private int fact(int n) {
    if (n < 2) return 1;
    return n*fact(n-1);
  }
  
}
