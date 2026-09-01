class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();

        int sr = 0, sc = 0, count = 0;
        int[][] id = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                id[i][j] = -1;

                if (classroom[i].charAt(j) == 'S') {
                    sr = i;
                    sc = j;
                } else if (classroom[i].charAt(j) == 'L') {
                    id[i][j] = count++;
                }
            }
        }

        int all = (1 << count) - 1;

        boolean[][][][] visited =
            new boolean[m][n][1 << count][energy + 1];

        java.util.ArrayDeque<int[]> q = new java.util.ArrayDeque<>();
        q.offer(new int[]{sr, sc, 0, energy});
        visited[sr][sc][0][energy] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int moves = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {
                int[] cur = q.poll();

                int r = cur[0];
                int c = cur[1];
                int mask = cur[2];
                int e = cur[3];

                if (mask == all) {
                    return moves;
                }

                for (int d = 0; d < 4; d++) {
                    int nr = r + dr[d];
                    int nc = c + dc[d];

                    if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                        continue;
                    }

                    if (classroom[nr].charAt(nc) == 'X' || e == 0) {
                        continue;
                    }

                    int ne = e - 1;
                    int nmask = mask;

                    if (classroom[nr].charAt(nc) == 'L') {
                        nmask |= 1 << id[nr][nc];
                    }

                    if (classroom[nr].charAt(nc) == 'R') {
                        ne = energy;
                    }

                    if (!visited[nr][nc][nmask][ne]) {
                        visited[nr][nc][nmask][ne] = true;
                        q.offer(new int[]{nr, nc, nmask, ne});
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}