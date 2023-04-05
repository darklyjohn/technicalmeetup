package be.fgov.fahmp.technicalmeetup.katas.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author John
 * @created 04-12-22
 * @project technicalmeetup
 */
@SpringBootTest
public class StackTest {

    @Autowired
    Stack stack;

    @Test
    @DisplayName("Push should stake the provided value")
    public void pushTest42(){
        stack.push(42);
        int pop = stack.pop();
        assertEquals(42, pop);

    }

    @Test
    @DisplayName("Push should stake the provided value")
    public void pushTest69(){
        stack.push(69);
        int pop = stack.pop();
        assertEquals(69, pop);

    }

    @Test
    @DisplayName("Pop should provide the latest value")
    public void popTest(){
        stack.push(42);
        stack.push(69);
        assertEquals(69, stack.pop());
        assertEquals(42, stack.pop());

    }

    @Test
    @DisplayName("Count should return the stak size")
    public void countTest(){
        stack.push(42);
        assertEquals(1, stack.count());
        stack.push(69);
        assertEquals(2, stack.count());
        stack.pop();
        assertEquals(1, stack.count());

    }
}
