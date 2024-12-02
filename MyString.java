public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Shekels : " + lowerCase("This costs 15 Shekels : "));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        if (str == null) { 
            return ""; 
        }
        String lowerCaseString = "";
        for (int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                lowerCaseString += (char) (letter + 32);  
            } else {
                lowerCaseString += letter;
            }
        }
        return lowerCaseString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
        public static boolean contains(String str1, String str2) {
            if (str1 == null || str2 == null || str1.length() == 0 || str2.length() > str1.length()) {
                return false;
            }
            if (str2.length() == 0) {
                return true;
            }  
            for (int i = 0; i <= str1.length() - str2.length(); i ++) {
                    int j = 0;
                    for (j = 0; j < str2.length() ; j++) {
                        if (str1.charAt(i + j) != str2.charAt(j)) {
                            break;
                        }
                    }
                    if (j == str2.length()) {
                        return true;
                    }
                }

                return false;
            }
        }

