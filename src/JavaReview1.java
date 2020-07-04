
// for the criteria 1, 2, 3 and 5


public class JavaReview1 {

    public static void RectArea(){
        int länge1 = 20;
        int breite1 = 30;
        int länge2 = 40;
        int breite2 = 50;

        int area1 =  länge1 * breite1;
        int area2 =  länge2 * breite2;

        System.out.println("The area of the rectangular is " + area1);
        System.out.println("The area of the rectangular is " + area2);

    }




    public static void calculateRectArea(int laenge, int breite){

        int area = laenge * breite;

        System.out.println("The area of the rectangular is " + area);
    }


    public static int rec(int l,int b){

        int a = l * b;
        return  a;
    }


    public static void main(String[] args) {

        RectArea();

       calculateRectArea(20,30);
       calculateRectArea(40,50);

        System.out.println("The area of the rectangular is " + rec(20,30));
        System.out.println("The area of the rectangular is " + rec(40,50));

    }
}
