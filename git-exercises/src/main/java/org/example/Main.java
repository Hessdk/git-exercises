
public class Main {
    public static void main(String[] args) {
        int num = 200;
        for (int i = 1; i <  num; i++){
            String str = "";
            if (i % 3 == 0)
                str += "Fizz";
            if (i % 5 == 0)
                str += "Buzz";
            str = (str == "") ? Integer.toString(i) : str;
            str = (i < num - 1) ? str + ", " : str;
            System.out.print(str);
        }
        System.out.println("lol git");
    }
}

