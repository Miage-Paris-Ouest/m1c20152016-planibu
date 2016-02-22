package com.example.leys.m1c20152016_planibu.test;

import android.test.suitebuilder.annotation.SmallTest;

import com.example.leys.m1c20152016_planibu.MainActivity;

import junit.framework.TestCase;

/**
 * Created by User on 22/02/2016.
 */
public class ActivityMainTest extends TestCase {



    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }


    @SmallTest
    public void checker(){

        MainActivity ma = new MainActivity();
     /* boolean result = ma.( );
        assertEquals(false.result);*/
    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}

