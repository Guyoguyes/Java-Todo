package models;

import com.sun.tools.javac.comp.Todo;
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
        TODO.clearAllTODO();
    }

    @Test
    public void todo_createInstancesOfObject_true(){
        TODO todo = new TODO("Do tests", "Make sure they run", "12/12/2020");
        assertEquals(true, todo instanceof TODO);
    }

    @Test
    public void todo_allTodoAreCorrectlyReturned_true(){
        TODO todo = new TODO("Do test", "Make user they pass", "03/12/2020");
        TODO otherTodo = new TODO("code", "Bluecollar", "03/12/2020");

        assertEquals(2, TODO.getAll().size());
    }
}