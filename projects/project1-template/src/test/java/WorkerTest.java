import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.mockito.Mockito.*;

import java.util.Arrays;


@RunWith(Parameterized.class)
public class WorkerTest {
    @Parameterized.Parameter
    public int num;

    @Parameterized.Parameters
    public static Iterable<Object> data() {
        return Arrays.asList(1, 3, 4);
    }

    @Test
    public void testWorkerNum() throws Exception {
        WordCount wordCount = spy(new WordCount(num, new String[]{}));
        wordCount.run();
        verify(wordCount, times(num)).createWorker();
    }
}
