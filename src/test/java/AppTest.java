import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    void ArrayList_클래스가_존재한다() {
        ArrayList al = new ArrayList();
    }
    @Test
    void size() {
        ArrayList al = new ArrayList();
        assertEquals(0, al.size());
    }
    @Test
    void add() {
        ArrayList al = new ArrayList();
        al.add(100);
    }
}
