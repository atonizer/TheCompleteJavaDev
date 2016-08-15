package While;

// https://docs.oracle.com/javase/tutorial/java/index.html - The Java™ Tutorials

public class Main {
    public static void main(String[] args) {
//        int count = 0;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        for (int i = 1; i < 7; i++) {
//            System.out.println("Count value is " + count);
//        }
//        System.out.println("*****************");

//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count >100){
//                break;
//            }
//        } while (count != 6);


//        int number = 5;
//        int finishNumber = 20;
//        while(number<=finishNumber){
//            if(!isEvenNumber(number)){
//                number++;
//                continue;
//            }
//            System.out.println("Even number " + number);
//            number++;
//        }

        //
        //
        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number<=finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            evenNumbersFound++;
            if(evenNumbersFound >=5){
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);

    }
    //
    //

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        } else {
            return false;
        }
    }
}
