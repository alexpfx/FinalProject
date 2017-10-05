package com.udacity.gradle.builditbigger;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by alexandre on 05/10/17.
 */

@RunWith(JUnit4.class)
public class EndPointAsyncTaskTest {


    @Test
    public void testTellJoke () throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);

        EndPointAsyncTask endPointAsyncTask = new EndPointAsyncTask(new EndPointAsyncTask.Listener() {
            @Override
            public void onResult(String result) {
                Assert.assertNotNull(result);
                Assert.assertNotSame("", result);
                latch.countDown();

            }
        });

        endPointAsyncTask.execute();
        latch.await(120, TimeUnit.SECONDS);
    }
}
