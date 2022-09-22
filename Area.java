import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the smaller circle: ");
        double radius = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the radius of the bigger circle: ");
        double radius_2 = Double.parseDouble(scanner.nextLine());

        double area_of_big = Math.PI * Math.pow(radius_2,2);
        double area_of_small = Math.PI * Math.pow(radius,2);
        double area_of_rectangle = Math.pow(radius_2 * 2,2);

        double segment_of_small = area_of_small/ 8;
        double shaded_segment_of_small  = segment_of_small * 3;

        double segment_of_rectangle = area_of_rectangle / 8;
        double segment_of_big = area_of_big / 8;

        double shaded_segment_of_rectangle = (segment_of_rectangle -(segment_of_big + segment_of_small)) * 4;

        double area_of_total_shaded = shaded_segment_of_rectangle + shaded_segment_of_small;

        System.out.println(area_of_total_shaded);
    }

}
