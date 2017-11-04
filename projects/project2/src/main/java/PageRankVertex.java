import java.util.Collection;


public class PageRankVertex implements Vertex<Double, Double> {
    private static final Double damping = 0.85; // the damping ratio, as in the PageRank paper
    private static final Double tolerance = 1e-4; // the tolerance for converge checking

    @Override
    public int getVertexID() {
        return 0;
    }

    @Override
    public Double getValue() {
        return null;
    }

    @Override
    public void compute(Collection<Double> messages) {

    }

    @Override
    public void sendMessageTo(int vertexID, Double message) {

    }

    @Override
    public void voteToHalt() {

    }

    @Override
    public void run() {

    }
}
