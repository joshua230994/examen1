package prueba.prueba;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonGreeterTest {

    @Test
    public void sayHello_personWithFirstNameAndLast_shouldReturnPersonGreeting() {
        //Setup
        Person person = new Person("joshua", "Rod");
        PersonGreeter personGreeter = new PersonGreeter(person);
        //test
        String result = personGreeter.sayHello();
        //Verify
        assertNotNull("Greeting should not be null.", result);
        assertEquals("Greeting with unexpected value.", "Hello joshua rod", result);


    }
}