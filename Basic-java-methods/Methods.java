class Methods {
    public static void main(String[] args) {
        String first = "java";
        String second = "java";
        String upperCaseWord = new String("JAVA");
        String sentence = new String("Hello Java");
        String paddedWord = new String(" hello ");
        String csv = "java,hello,siva";
        String empty = "";
        char whitespace = ' ';
        char letter = 's';
        char digit = '7';

        String[] words = csv.split(",");

        System.out.println(first == second);
        System.out.println(second.toLowerCase());
        System.out.println(sentence.toUpperCase());
        System.out.println(second.charAt(0));
        System.out.println(first.contains(second));
        System.out.println(first.substring(0, 3));
        System.out.println(sentence.lastIndexOf('a'));
        System.out.println(sentence.indexOf('a'));
        System.out.println(first.replace('a', 'o'));
        System.out.println(empty.isEmpty());
        System.out.println(csv.length());
        System.out.println(paddedWord.concat(" " + first));
        System.out.println(paddedWord.trim());
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isDigit(digit));
        System.out.println(Character.isWhitespace(whitespace));
        System.out.println(words.length);
        System.out.println(upperCaseWord.toLowerCase());
    }
}
