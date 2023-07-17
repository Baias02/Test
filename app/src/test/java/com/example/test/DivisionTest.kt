package com.example.test

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before

class DivisionTest{

    var test : Test? = null

    @Before
    fun init(){
        test = Test()
    }

    @org.junit.Test
    fun division_one(){
        assertEquals("5",test?.division("10","2"))
    }

    @org.junit.Test
    fun division_two(){
        assertEquals("5",test?.division("10","0"))
    }



    @After
    fun detach(){
        test=null
    }
}