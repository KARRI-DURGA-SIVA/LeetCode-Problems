import java.util.*;

class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length;
        List<int[]>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++) graph[i]=new ArrayList<>();
        int[] indegree=new int[n];
        TreeSet<Integer> set=new TreeSet<>();
        for(int[] e:edges){
            graph[e[0]].add(new int[]{e[1],e[2]});
            indegree[e[1]]++;
            set.add(e[2]);
        }
        int[] topo=new int[n];
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++)
            if(indegree[i]==0)
                q.offer(i);
                int idx=0;
        while(!q.isEmpty()){
            int u=q.poll();
            topo[idx++]=u;

            for(int[] e:graph[u]){
                if(--indegree[e[0]]==0)
                    q.offer(e[0]);
            }
        }
       if(!check(0,graph,topo,online,k))
            return -1;
        int[] vals=new int[set.size()];
        idx=0;
        for(int x:set)
            vals[idx++]=x;
        int lo=0,hi=vals.length-1;
        int ans=0;
         while(lo<=hi){
            int mid=(lo+hi)/2;
         if(check(vals[mid],graph,topo,online,k)){
                ans=vals[mid];
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
      return ans;
    }
  private boolean check(int limit,List<int[]>[] graph,int[] topo,boolean[] online,long k){
        int n=online.length;
        long INF=Long.MAX_VALUE/4;
        long[] dp=new long[n];
        Arrays.fill(dp,INF);
        dp[0]=0;
        for(int u:topo){
            if(dp[u]==INF)
                continue;
          if(u!=0 && u!=n-1 && !online[u])
                continue; 
        for(int[] e:graph[u]){
                int v=e[0];
                int w=e[1];
             if(w<limit)
                    continue;
            if(v!=0 && v!=n-1 && !online[v])
                    continue;
              dp[v]=Math.min(dp[v],dp[u]+w);
            }
        }
      return dp[n-1]<=k;
    }
}