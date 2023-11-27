package org.example;

import junit.framework.TestCase;

public class RegularExpressionTest extends TestCase {

    /*
        test for RegularExpression
     */
    public void testRegularExpression() {
    	RegularExpression regularExpression = new RegularExpression();

        String s1 = "aa";
        String p1 = "a";
        assertFalse(regularExpression.isMatch(s1, p1));

        String s2 = "aa";
        String p2 = "a*";
        assertTrue(regularExpression.isMatch(s2, p2));

        String s3 = "ab";
        String p3 = ".";
        assertFalse(regularExpression.isMatch(s3, p3));

        String s4 = "aab";
        String p4 = "c*a*b";
        assertFalse(regularExpression.isMatch(s4, p4));

        String s5 = "mississippi";
        String p5 = "mis*is*p*.";
        assertTrue(regularExpression.isMatch(s5, p5));

    }
}
