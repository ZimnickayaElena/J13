import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void testMatchesForSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("родителям");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMatchesForSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("маме");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMatchesForEpicTrue() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Яйца");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMatchesForEpicFalse() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Масло");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMatchesForMeetingTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("вторник");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMatchesForMeetingFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("четверг");

        Assertions.assertEquals(expected, actual);

    }

}
