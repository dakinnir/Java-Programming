import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTester {
    @Test
    public void testPersonAge() {
        Person person = new Person();
        person.setAge(101);

        // Age defaults to zero when assigned something greater than 100 or lesser than 0
        assertTrue(person.getAge() == 0);
    }

    @Test
    public void testIfTeen() {
        Person person1 = new Person();
        person1.setAge(12);

        Person person2 = new Person();
        person2.setAge(13);

        // Test to see if person is a teen: Person must be older than 12
        assertFalse(person1.isTeen());
        assertTrue(person2.isTeen());
    }
}
