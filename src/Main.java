import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args){

        // telefonszám

//        String number = "06301234567";
//        System.out.println(PhoneValidator.validate(number));

        // számlaszám
//        String szamlaszamok[] = new String[]{
//                "6747126247524605",
//                "52805177-17451132",
//                "52805177-17451132-",
//                "528051771745113-",
//                "52805177-17451132-52805177",
//                "528051775280517752805177",
//                "52805177-52805177-52805177-"
//        };
//
//        for (String szamlaszam: szamlaszamok) {
//            System.out.println(BankAccountNumberValidator.validate(szamlaszam));
//        }

//         TAJ

//        String taj = "855 078 702";
//        System.out.println(TAJValidator.validate(taj));

        // email
//        String email = "alien.detonator@gmail.com";
//        System.out.println(EmailValidator.validate(email));

        // különbség

        String sample = getFileContent("sample.txt");
        String compare = getFileContent("compare.txt");

        int difference = DifferenceChecker.getDifferenceSum(sample, compare);

        System.out.println(difference);

    }


    private static String getFileContent(String path){
        File file = new File(
                path);

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String text = "";
        String line;
        while (true)

        // Print the string
        {
            try {
                if (!((line = br.readLine()) != null)) break;
                 text += line + "\n";
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return text;
    }
}