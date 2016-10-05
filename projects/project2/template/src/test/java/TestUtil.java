import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class TestUtil {
    public static String getTestFilePath(String name) {
        return TestUtil.class.getResource(name + ".txt").getPath();
    }

    public static String getReferenceOutput(String name) throws IOException {
        Path p = Paths.get(TestUtil.class.getResource(name + ".out").getPath());
        return new String(Files.readAllBytes(p));
    }

    public static String[] getInputArguments(String... filenames) {
        return Stream.of(filenames).map(TestUtil::getTestFilePath).toArray(String[]::new);
    }

    public static String[] getInputArguments(int repeat, String... filenames) {
        return Stream.iterate(getInputArguments(filenames), o -> o)
                .limit(repeat)
                .flatMap(Arrays::stream)
                .toArray(String[]::new);
    }
}
