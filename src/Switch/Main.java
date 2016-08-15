package Switch;


// https://docs.oracle.com/javase/tutorial/java/index.html - The Java™ Tutorials

public class Main {
    public static void main(String[] args){
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        }
//        else if (value == 2) {
//            System.out.println("Value was 2");
//        }
//        else if (value == 3) {
//            System.out.println("Value was 3");
//        }
//        else{
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 5;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            case 4:case 5:case 6:
                System.out.println("Value was 4 or 5 or 6");
                break;
            default:
                System.out.println("Something else");
                break;
        }

        //
        //
        //
        char charValue = 'D';
        switch (charValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Something else was found");
                break;
        }


        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);


    }
}
