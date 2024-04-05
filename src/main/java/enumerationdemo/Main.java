package enumerationdemo;

public class Main {
    public static void main(String[] args) {

        Days day = Days.SATURDAY;
        //System.out.println(day);

//        Days[] days = Days.values();
//        for (Days d:days) {
//            System.out.println(d);
//        }

        //System.out.println(day.getNumberOfDay()); // 6th day of the week

//        if(day == Days.FRIDAY){
//            System.out.println("Friday forum day");
//        }else if(day == Days.SATURDAY || day == Days.SUNDAY){
//            System.out.println("It's the weekend");
//        }else{
//            System.out.println("Just another day at year up");
//        }


        switch(day){
            case FRIDAY:
                System.out.println("Friday forum day");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("It's the weekend");
                break;
            default:
                System.out.println("Just another day at year up");
                break;
        }



    }
}
