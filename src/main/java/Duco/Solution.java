package Duco;

import java.util.ArrayList;
import java.util.List;
public class Solution {
    static List<Integer> list = new ArrayList<>();
    private static List<Integer> maxDepth(Tree node, List<Integer> set){

        if(node == null){
            return set;
        }

        if(!set.contains(node.x))
            set.add(node.x);

        List<Integer> lCount = maxDepth(node.l, set);
        List<Integer> rCount = maxDepth(node.r, set);

        if(lCount.size() > rCount.size())
            return lCount;
        else
            return rCount;

    }


    public static int solution(Tree T) {
        //Set<Integer> set = new HashSet<>();
        List<Integer> setl = new ArrayList<>();List<Integer> setr = new ArrayList<>();

        list.add(T.x);
        List<Integer> l = maxDepth(T.l, setl);
        List<Integer> r = maxDepth(T.r, setr);
        if(l.size() > r.size()){
            list.addAll(setl);
        }else
            list.addAll(setr);
        return list.size();
    }

    public static void main(String[] args) {
        Tree t = new Tree(4);
        t.l =new Tree(5);
        t.l.l = new Tree(3);
        t.l.l.l = new Tree(1);
        t.l.l.l.l = new Tree(9);

        t.r =new Tree(6);
        t.r.l = new Tree(1);
        t.r.l.l = new Tree(2);
        t.r.r = new Tree(6);

        System.out.println("..."+solution(t));
        list.forEach(e -> System.out.println(e));


    }
}
class Tree {
    public int x;
    public Tree l;
    public Tree r;

    public Tree(final int x) {
        this.x = x;
    }
}
