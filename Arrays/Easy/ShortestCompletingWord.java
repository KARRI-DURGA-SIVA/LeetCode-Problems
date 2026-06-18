class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] need = new int[26];

        for (char ch : licensePlate.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                need[ch - 'a']++;
            }
        }

        String answer = "";

        for (String word : words) {
            int[] frequency = new int[26];

            for (char ch : word.toCharArray()) {
                frequency[ch - 'a']++;
            }

            if (containsAllLetters(frequency, need)
                    && (answer.equals("") || word.length() < answer.length())) {
                answer = word;
            }
        }

        return answer;
    }

    private boolean containsAllLetters(int[] frequency, int[] need) {
        for (int i = 0; i < 26; i++) {
            if (frequency[i] < need[i]) {
                return false;
            }
        }

        return true;
    }
}
