public class Question4 {

    public static void Sequence(int val){
        int[] nFibo = {0,1,3,11,39,139,495,1763,6279,22363};

        //iterates through array
        for(int i=0; i< nFibo.length;i++){
            // if val is equal to the val in array it returns the indices of that value
            if(val == nFibo[i]){
                System.out.println("This value is the "+ i + " number in this sequence.");
                // if not it prints out the indices that is lowest/cloest to it.
            } else if ( val < nFibo[i]){
                System.out.println(i-1);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int val = 38;
        Sequence(val);
    }
}