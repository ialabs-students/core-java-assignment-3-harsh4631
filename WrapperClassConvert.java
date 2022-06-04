import java.util.Scanner;

public class WrapperClassConvert {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a= sc.nextInt();
        int object = 10;
        convertToWrapper(object);
    }
        public static Integer convertToWrapper(int object){
            Integer b = Integer.valueOf(object);
        Float c=Float.valueOf(object);
            try {
                if (b instanceof Integer) {
                    System.out.println(b);
                }
//            else if (c instanceof Float) {
//                    System.out.println(c);
//            }
                else {
                    System.out.println("please provide a proper input");
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
            return b;
        }
    }
