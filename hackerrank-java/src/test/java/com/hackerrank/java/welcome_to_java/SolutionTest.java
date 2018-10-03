package com.hackerrank.java.welcome_to_java;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class SolutionTest {

    private ByteArrayOutputStream byteArrayOutputStream;
    private PrintStream byteArrayPrintStream;
    private PrintStream previousPrintStream;

    /**
     * Redirect System.out to ByteArrayOutputStream.
     */
    @Before
    public void setUp() {
        previousPrintStream = System.out;
        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayPrintStream = new PrintStream(byteArrayOutputStream);
        System.setOut(byteArrayPrintStream);
    }

    @Test
    public void testSystemOutPrintlnInvocations() {
        Solution.main(null);
        Assert.assertEquals("Hello, World.\nHello, Java.\n", 
                            byteArrayOutputStream.toString());
    }

    /**
     * Rollback System.out to original configuration.
     */
    @After
    public void tearDown() {
        System.setOut(previousPrintStream);
    }
}