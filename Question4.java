public class Question4 {

    public static void Sequence(int val){
        int[] nFibo = {0,1,3,11,39,139,495,1763,6279,22363};

        //iterates through array
        for(int i=0; i< nFibo.length;i++){
            if(val == nFibo[i]){
                System.out.println("This value is the "+ (i+1) + " number in this sequence.");
                break;
            } else if ( val < nFibo[i]){
                System.out.println(i+1);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int val = 39;
        Sequence(val);
    }
}