public class Operations extends Input {

    Operations (int number1, int number2, String signs) {
        super(number1, number2, signs);
    }

    public int calculate (int number1, int number2, String signs) {

        if (signs.equals("+")) {
            return number1 + number2;
        }
        else if (signs.equals("-")) {
            return number1 - number2;
        }
        else if (signs.equals("x") || signs.equals("*")) {
            return number1 * number2;
        }
        else if (signs.equals("/")) {
            return number1 / number2;
        }
        else {
            System.out.println("You must enter a valid signs : + / - *");
        }
        return -1;
    }

}
