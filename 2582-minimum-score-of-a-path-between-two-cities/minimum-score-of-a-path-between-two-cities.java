class Solution {
    public int minScore(int n, int[][] roads) {
        int[] parent = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        // Union all roads
        for (int[] road : roads) {
            union(parent, road[0], road[1]);
        }

        int root = find(parent, 1);
        int ans = Integer.MAX_VALUE;

        // Find minimum edge in the component of city 1
        for (int[] road : roads) {
            if (find(parent, road[0]) == root) {
                ans = Math.min(ans, road[2]);
            }
        }

        return ans;
    }

    int find(int[] parent, int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent, parent[x]);
    }

    void union(int[] parent, int a, int b) {
        int pa = find(parent, a);
        int pb = find(parent, b);
        if (pa != pb)
            parent[pa] = pb;
    }
}