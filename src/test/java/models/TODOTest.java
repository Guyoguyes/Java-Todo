package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TODOTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void todo_createInstancesOfObject_true(){
        TODO todo = new TODO("Do tests");
        assertEquals(true, todo instanceof TODO);
    }
}