import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TodoBusinessImplTest {

    @Test
    public void usingAStub() {
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Ranga");
        assertEquals(2, todos.size());
    }

}