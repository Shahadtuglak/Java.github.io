package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1+2=3
        System.out.println("1+2 = " + result);
        int previousResult = result;
        System.out.println("PreviousResult = "  + previousResult);

        result = result - 1; // 3-1=2
        System.out.println(result);
        System.out.println("PreviousResult = "  + previousResult);

        result = result * 10; // 2*10 = 20
        System.out.println(result);

        result = result /5; // 20/5 = 4
        System.out.println(result);


        result = result % 3;  // 4 % 3= 1
        System.out.println(result);



        // result = result + 1;
        result++;  // 1+1 = 2
        System.out.println(result);


        result--; // 2-1 = 1
        System.out.println(result);

        // result = result +2;

        result += 2;  // 1+2 = 3;
        System.out.println(result);


        //result = result *10;
        result *= 10; // 3*10=30;
        System.out.println(result);

        //result = result /3;
        result /=3;   // 10*30=30
        System.out.println(result);


        //result = result-2;
        result -= 2; // 10 - 2;
        System.out.println(result);

       

        boolean isAlien = false;
        if (isAlien == false)
        {
            System.out.println("it is not an alien!");
            System.out.println("now i am not scared");

        }


        int topScore = 100;
        if(topScore == 100){
            System.out.println("you got the high score");
        }


        int noTopScore = 100;
        if(noTopScore != 100){
            System.out.println("you got the high score");
        }


        int yourScore = 100;
        if (yourScore >= 100){
            System.out.println("You got the high Score");
        }

        int yourNewScore = 80;
        if (yourNewScore < 100){
            System.out.println("You got the new  high Score");
        }

        int yourOldScore = 60;
        if ( (yourNewScore > yourOldScore ) && (yourNewScore < 100) ){  // '&&' Checks the both left and Right Conditions is true
            System.out.println("Great Score");
        }

        if ((yourNewScore > 90) || (yourOldScore <= 90)){    //   '||' Check the conditions but if one is true is will exicuted
            System.out.println("Either or Both of the conditions are true");

        }



        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is True");
        }


        boolean isCar = false;
        if (isCar){
            System.out.println("THis is not suppose to happen");
        }





    }

}
