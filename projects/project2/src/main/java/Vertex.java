import java.util.Collection;


public interface Vertex<V, M> extends Runnable{
    int getVertexID();
    V getValue();

    void compute(Collection<M> messages);
    void sendMessageTo(int vertexID, M message);
    void voteToHalt();
}
