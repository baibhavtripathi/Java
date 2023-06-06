public class VowelOrNot {
    public static void main(String[] args) {
        char ch = 'i';
        switch(ch){
            case 'a','e','i','o','u':
                System.out.println("Vowel!!");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
