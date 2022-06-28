package codewars.April23;

public class Dictionary {
//undone
        private final String[] words;

        public Dictionary(String[] words) {
            this.words = words;
        }


        public String findMostSimilar(String to, String[] words) {
            int maxCount = 0;
            String answer = "";
            char[] chars1 = to.toCharArray();
            String[] things = words;
            for (String thing : things) {
                int currentCount = 0;
                char[] chars = thing.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    for (int j = 0; j < chars1.length; j++) {
                        if (chars[i] == chars1[j]){
                            currentCount++;
                        }
                    }
                }
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    answer = thing;
                }
            }
            return answer;
        }

}
