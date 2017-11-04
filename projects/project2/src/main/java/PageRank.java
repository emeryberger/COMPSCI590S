

public class PageRank {
    public PageRank(int size, int[] fromVertices, int[] toVertices) {

    }

    public void run() throws InterruptedException {

    }

    public static void main(String[] args) {
        // Graph has vertices from 0 to `size-1`
        // and edges 1->0, 2->0, 3->0
        int size = 4;
        int[] from = {1,2,3};
        int[] to = {0,0,0};

        PageRank pr = new PageRank(size, from, to);

        try {
            pr.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
