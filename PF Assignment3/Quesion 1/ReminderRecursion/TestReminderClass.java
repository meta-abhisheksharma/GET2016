package ReminderRecursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReminderClass {

	@Test
	public void test() {
		Reminder ob=new Reminder();
		assertEquals(0, ob.reminderCal(2, 1));
		assertEquals(-1, ob.reminderCal(2, 0));
		assertEquals(1, ob.reminderCal(100, 3));
	}

}
