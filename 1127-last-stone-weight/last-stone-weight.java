class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)->b-a);
        for(int x:stones){
            p.offer(x);
        }
        while(p.size()>1){
            int x=p.poll();
            int y=p.poll();
            if(x!=y){
                p.offer(x-y);
            }
        }
        return p.isEmpty()?0:p.poll();
    }
}