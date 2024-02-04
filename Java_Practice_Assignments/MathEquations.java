package Java_Practice_Assignments;
import java.util.Scanner;
import java.lang.Math;

public class MathEquations {

static final double Pi = 3.14;
    

    public static void main(String[] args){

        do{
            menu();
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();


            if(choice == 10){
                System.exit(0);
            }
            else if(choice == 1){
                areaOfTriangle();
            }
            else if(choice ==2){
                areaOfParallelogram();
            }
            else if(choice == 3){
                areaOfCircle();
            }
            else if(choice == 4){
                circumfranceOfCircle();
            }
            else if(choice == 5){
                volumeOfPrisms();
            }
            else if(choice == 6){
                volumeOfCylinder();
            }
            else if(choice == 7){
                volumeOfSphere();
            }
            else if(choice == 8){
                volumeOfCone();
            }
            else if(choice == 9){
                volumeofPyramid();
            }
        }while(true);


    }

    public static void menu(){
        System.out.println("---- Equation Menu ----");
        System.out.println("1 -> Area of Triangle ");
        System.out.println("2 -> Area of Parallelogram");
        System.out.println("3 -> Area of Circle");
        System.out.println("4 -> Circumfrance of Circle");
        System.out.println("5 -> Volume of General Prisms");
        System.out.println("6 -> Volume of Cylinder");
        System.out.println("7 -> Volume of Sphere");
        System.out.println("8 -> Volume of Cone");
        System.out.println("9 -> Volume of Pyramid");
        System.out.println("10 -> Exit");
    }

    public static void areaOfTriangle(){
        System.out.println("Area of Triangle");
        System.out.println("Enter Value of Base: ");
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        System.out.println("Enter Value of Height: ");
        double height = input.nextDouble();

        double area = (base*height)*0.5; //0.5 is 1/2 in decimal form
        System.out.println("Area of Triangle is = "+area);

    }

    public static void areaOfParallelogram(){
        System.out.println("Area of Parallelogram");
        System.out.println("Enter Value of Base: ");
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        System.out.println("Enter Value of Height: ");
        double height = input.nextDouble();

        double area = base*height;
        System.out.println("Area of Parallelogram is = "+area);

    }

    public static void areaOfCircle(){
        System.out.println("Area of Circle");
        System.out.println("Enter value of Radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        double area = (Math.pow(radius,2))*Pi;
        System.out.println("Area of Circle is = "+area);

    }

    public static void circumfranceOfCircle(){
        System.out.println("Circumfrance of Circle");
        System.out.println("Enter value of Diameter: ");
        Scanner input = new Scanner(System.in);
        double diameter = input.nextDouble();

        double circumfrance = Pi*diameter;
        System.out.println("Circumfrance of Circle is = "+circumfrance);

    }

    public static void volumeOfPrisms(){
        System.out.println("Volume of General Prisms");
        System.out.println("Enter value of Length: ");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("Enter value of Width: ");
        double width = input.nextDouble();
        System.out.println("Enter value of Height: ");
        double height = input.nextDouble();

        double volume = length*width*height;
        System.out.println("Volume of Prism is = "+volume);


    }

    public static void volumeOfCylinder(){
        System.out.println("Volume of Cylinder");
        System.out.println("Enter value of Height: ");
        Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        System.out.println("Enter value of Radius: ");
        double radius = input.nextDouble();

        double volume = (Math.pow(radius, 2))*Pi*height;
        System.out.println("Volume of Cylinder is = "+volume);

    }
    public static void volumeOfSphere(){
        System.out.println("Volume Of Sphere");
        System.out.println("Enter value of Radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        double volume = (Math.pow(radius, 3))*Pi*1.33; // 4/3 in decimal form
        System.out.println("Volume of Sphere is = "+volume);

    }

    public static void volumeOfCone(){
        System.out.println("Volume of Cone");
        System.out.println("Enter value of Radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println("Enter value of Height: ");
        double height = input.nextDouble();

        double volume = (Math.pow(radius, 2))*Pi*0.3333*height; // 1/3 in decimal form
        System.out.println("Volume of Cone is = "+volume);

    }
    public static void volumeofPyramid(){
        System.out.println("Volume of Pyramid");
        System.out.println("Enter value of Length: ");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("Enter value of Width: ");
        double width = input.nextDouble();
        System.out.println("Enter value of Height: ");
        double height = input.nextDouble();

        double volume = (length*width*height)*0.3333; // 1/3 in decimal form
        System.out.println("Volume of Pyramid is = "+volume);
        
    }
}

