public class Question1 {
    String text1 = "abc";
    String text2 = "abc";

    public static void main(String[] args) {
        Question1 question = new Question1();
        int count = 0;
        boolean[] matched = new boolean[question.text2.length()];

// Iterates through the loop
        for (int i = 0; i < question.text1.length(); i++) {
            // Iterates through as well
            for (int j = 0; j < question.text2.length(); j++) {
                //If condition is met, then counter increases, showing their are more matching characters
                if (!matched[j] && question.text1.charAt(i) == question.text2.charAt(j)) {
                    count++;
                    matched[j] = true;
                    break;
                }
            }
        }

        System.out.println("There are " + count + " matching characters");
    }
}