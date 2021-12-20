public class PairUtilDemo {
    public static void main(String[] args) {


        Pair<Integer> para = new Pair<Integer>(1, 2);
        para.swap(para);
            System.out.println(para.getFirst());
            System.out.println(para.getSecond());
    
            Pair para2 = new Pair();
            para2 = PairUtil.swap(para);
    
            System.out.println(para2.getFirst());
            System.out.println(para2.getSecond());
}
}