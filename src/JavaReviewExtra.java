// bonus points

public class JavaReviewExtra {

    public static void extra() {
        int[] widths = {20, 30, 40, 50 };
        int[] heights = {25, 35, 45, 55 };
        int total = 0;
        int t = 0;

        for (int i = 0; i < widths.length; i++) {

                total = widths[i] * heights[i];
                 t = ++t;
                System.out.println( "For the " + t + " rectangular is the area: " + total + "cm².");
        }
    }


    public static void main(String[] args) {
            extra();
    }
}
