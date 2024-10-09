package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PRPeridoicFunctionStackTest {

    PR1PeriodicFunctionStack pr1q;

    private void fillStack() {
        for (int i = 0; i < this.pr1q.CAPACITY ; i++) {
            PR1PeriodicFunction Periodic = new PR1PeriodicFunction(i+1);
            pr1q.push(Periodic.getPeriodicNumber());
        }
    }

    @Before
    public void setUp() {
        this.pr1q = new PR1PeriodicFunctionStack();
        assertNotNull(this.pr1q.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @Test
    public void stackTest() {
        assertEquals(this.pr1q.CAPACITY, this.pr1q.getStack().size());
        Assert.assertTrue("", pr1q.getStack().pop()==9);
        Assert.assertTrue("", pr1q.getStack().pop()==4);
        Assert.assertTrue("", pr1q.getStack().pop()==1);
        Assert.assertTrue("", pr1q.getStack().pop()==0);
        Assert.assertTrue("", pr1q.getStack().pop()==9);
        Assert.assertTrue("", pr1q.getStack().pop()==4);
        Assert.assertTrue("", pr1q.getStack().pop()==1);
        Assert.assertTrue("", pr1q.getStack().pop()==0);
        Assert.assertTrue("", pr1q.getStack().pop()==9);
        Assert.assertTrue("", pr1q.getStack().pop()==4);
        Assert.assertTrue("", pr1q.getStack().pop()==1);
        Assert.assertTrue("", pr1q.getStack().pop()==0);
        Assert.assertTrue("", pr1q.getStack().pop()==9);
        Assert.assertTrue("", pr1q.getStack().pop()==4);
        Assert.assertTrue("", pr1q.getStack().pop()==1);
        assertEquals(0,this.pr1q.getStack().size());
    }
}
