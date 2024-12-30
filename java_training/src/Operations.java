public class Operations {

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
