package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите пример: ");

            String userInput = br.readLine();

            System.out.println(calc(userInput));
        }

    }

    public static String calc(String input) {

        int[] arrInput = Helper.Validator(input);

        String value = Helper.Calc(arrInput);

        return value;

    }

}