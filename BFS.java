public class BFS {
    public static void main(String[] args) {
        // Example graph represented as an adjacency list
        int[][] graph = {
            {1, 2},    
            {0, 3, 4}, 
            {0},       
            {1},       
            {1}        
        };

        int startVertex = 0; 
        bfs(graph, startVertex);
    }

    public static void bfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : graph[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
    
}
