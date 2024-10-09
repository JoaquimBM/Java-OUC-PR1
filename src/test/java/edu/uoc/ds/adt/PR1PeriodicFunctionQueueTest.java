package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1PeriodicFunctionQueueTest {

    PR1PeriodicFunctionQueue pr1q;




    private void fillQueue() {
        for (int i = 0; i < this.pr1q.CAPACITY ; i++) {
            PR1PeriodicFunction Periodic = new PR1PeriodicFunction(i+1);
            pr1q.add(Periodic.getPeriodicNumber());
        }

    }

    @Before
    public void setUp() {
        this.pr1q = new PR1PeriodicFunctionQueue();
        assertNotNull(this.pr1q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void queueTest() {
            assertEquals(this.pr1q.CAPACITY, this.pr1q.getQueue().size());

            Assert.assertTrue("", pr1q.getQueue().poll()==1);
            Assert.assertTrue("", pr1q.getQueue().poll()==4);
            Assert.assertTrue("", pr1q.getQueue().poll()==9);
            Assert.assertTrue("", pr1q.getQueue().poll()==0);
            Assert.assertTrue("", pr1q.getQueue().poll()==1);
            Assert.assertTrue("", pr1q.getQueue().poll()==4);
            Assert.assertTrue("", pr1q.getQueue().poll()==9);
            Assert.assertTrue("", pr1q.getQueue().poll()==0);
            Assert.assertTrue("", pr1q.getQueue().poll()==1);
            Assert.assertTrue("", pr1q.getQueue().poll()==4);
            Assert.assertTrue("", pr1q.getQueue().poll()==9);
            Assert.assertTrue("", pr1q.getQueue().poll()==0);
            Assert.assertTrue("", pr1q.getQueue().poll()==1);
            Assert.assertTrue("", pr1q.getQueue().poll()==4);
            Assert.assertTrue("", pr1q.getQueue().poll()==9);
            assertEquals(0,this.pr1q.getQueue().size());


    }

}
