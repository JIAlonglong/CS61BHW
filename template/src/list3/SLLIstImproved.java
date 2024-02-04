package list3;

/** 下面展示的是通用链表 **/
public class SLLIstImproved<LochNess> {
    private class StuffNode{
        public LochNess item;
        public StuffNode next;
        public StuffNode(LochNess i,StuffNode n){
            this.item=i;
            this.next=n;
        }
    }

    private StuffNode first;
    private int size;

    public SLLIstImproved(LochNess x){
        this.first=new StuffNode(x,null);
        this.size=1;
    }

    public void addFirst(LochNess x){
        this.first=new StuffNode(x,first);
        this.size+=1;
    }
}
