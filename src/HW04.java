public class HW04 {
    public static void main(String[] args) {
        HW04 hw04 = new HW04();
        System.out.println(hw04.missingChar("Homework", 5));
        System.out.println(hw04.missingChar("kitten", 0));
        System.out.println(hw04.missingChar("Tallinn", 2));
        System.out.println(hw04.sumDouble(1, 2));
        System.out.println(hw04.sumDouble(3, 2));
        System.out.println(hw04.sumDouble(2, 2));
        System.out.println(hw04.intMax(1, 2, 3));
        System.out.println(hw04.intMax(1, 3, 2));
        System.out.println(hw04.intMax(3, 2, 1));
        System.out.println(hw04.nearHundred(211));
        System.out.println(hw04.nearHundred(105));
        System.out.println(hw04.nearHundred(95));
        System.out.println(hw04.notString("Kitty"));
        System.out.println(hw04.notString("not dad"));
        System.out.println(hw04.evenNumber(6));
        System.out.println(hw04.evenNumber(9));
        System.out.println(hw04.in1020(20,65));
        System.out.println(hw04.in1020(32,99));
        System.out.println(hw04.icyHot(120,-1));
        System.out.println(hw04.icyHot(54,98));
        System.out.println(hw04.caughtSpeeding(61,false));
        System.out.println(hw04.caughtSpeeding(61,true));
        System.out.println(hw04.caughtSpeeding(90,true));
        System.out.println(hw04.fizzString("fig"));
        System.out.println(hw04.fizzString("dib"));
        System.out.println(hw04.fizzString("fisab"));





    }

// task 1
public String missingChar (String str , int n) {
    if (n >= 0 && n < str.length()) {
        return str.substring(0, n) + str.substring(n + 1); // Use the substring method to remove the character at index n (0 beginning of the string) + character immediately following the character at index n.
    } else {
        return str;
    }
}
// task 2
    public  int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;}
        else {
            return a + b;
        }
    }
// task 3
    public int intMax(int a, int b, int c) {
        if (a >=b && a >= c) {
            return a;
        } else if (b >= a && b >= c ) {
            return b;
        } else{
            return c;
        }
    }


// task 4

    public boolean nearHundred (int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200-n) <= 10);
    }

 //    task 5

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    // task 6

    public boolean evenNumber(int n){
        return (n%2==0);
    }



    //extra task 1

    public boolean in1020(int n, int b) {
        if (n >= 10 && n <= 20 || b >= 10 && b <= 20) {
            return true;
        } else {
            return false;
        }

    }
   //  extra task 2
    //it was a first code, but the program told me how to simplify it.
//     public boolean icyHot(int a, int b) {
//            if (a <0 &&  b>100 || b <0 && a > 100){
//                return true;}
//                    else {
//                        return false;

    public boolean icyHot(int a,int b) {
        return a < 0 && b > 100 || b < 0 && a > 100;
    }


    // extra task 3

    public int caughtSpeeding (int speed, boolean bDay ){
        if(bDay) speed -= 5;
        if (speed <61) {
            return 0;
        }

        if ((speed >= 61) && (speed<=81)) {
            return 1;
        }
        if (speed >=81){
            return 2;
        }


        return speed;
    }

//extra task 4
    public String fizzString(String string){
        if (string.startsWith("f") &&(string.endsWith("b")) ){
           return ("FizzBuzz");
        }
        if (string.startsWith("f")){
            return ("Fizz");
        }
        if (string.endsWith("b")){
            return ("Buzz");
        }

        return string;


    }


}





