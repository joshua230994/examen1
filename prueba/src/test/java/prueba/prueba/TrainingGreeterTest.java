package prueba.prueba;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrainingGreeterTest {

    private Object result2;

    @Test
    public void sayHelloo_personWithCursNameAndLast_shouldReturnTrainingGreeting() {
        //setup
        Training training = new Training("java"," 3");
        //verify
        assertNotNull("Greeting should not be null.", result2);
        assertEquals("Greeting with unexpected value.", "java", result2);
    }
}