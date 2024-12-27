public class Main {
    public static void main (String[] args) {

        Code[] stockage = new Code[2];

        Code code1 = new Code("Praline", "Java");
        Code code2 = new Code("Chocolat blanc", "React");

        stockage[0] = code1;
        stockage[1] = code2;

        System.out.println(stockage[0].language);

        //Code[] stockage = {code1, code2};
        

    }

}