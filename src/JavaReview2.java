public class JavaReview2 {

    public static void square(){
        int width = 16;
        int area = width * width;
        int perimeter = 4 * width;

        System.out.println( "The area is " + area + "cm² and the perimeter is " + perimeter +"cm.");
    }

    public static void squaretwo( int width){

        int area = width * width;
        int perimeter = 4 * width;

        System.out.println( "The area is " + area + "cm² and the perimeter is " + perimeter +"cm.");
    }

    public static String squarethree( int w ){

        int area = w * w;
        int perimeter = 4 * w;

        return "The area is " + area + "cm² and the perimeter is " + perimeter +"cm.";
    }


    public static void main(String[] args) {
        square();

        squaretwo(16);

        System.out.print(squarethree(16));

    }


   

}
