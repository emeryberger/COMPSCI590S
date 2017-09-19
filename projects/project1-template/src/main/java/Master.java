import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;


public interface Master {
    /**
     * No sockets or workers should be created before calling this method
     * Before it returns, final result should be printed to the stream
     * specified in `setOutputStream`
     */
    void run();

    /**
     * @return Returns a collection of processes for active workers
     */
    Collection<Process> getActiveProcess();

    /**
     * Use this method to create a single worker process
     * When grading, it counts the invocation of this method
     * to check fault tolerance mechanism.
     * See `WorkerTest` to know how it works.
     */
    void createWorker() throws IOException;

    /**
     * The final result should be written to the stream specified here.
     * When grading, a dedicate stream will be set here, so you can
     * print any debug info to console if you want.
     * See `FormatTest` to know how it works.
     */
    void setOutputStream(PrintStream out);
}
