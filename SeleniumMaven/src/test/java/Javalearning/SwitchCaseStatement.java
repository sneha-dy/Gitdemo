package Javalearning;

public class SwitchCaseStatement {
    public static void main(String[] args) {

        String browser = "chrome";

        switch (browser){

            case "chrome":
                System.out.println("launch chrome");
                break;

            case "Firefox":
                System.out.println("launch firefox");
                break;

            case "Safari":
                System.out.println("launch Safari");
                break;
            default:
                System.out.println("please pass the right browser");
                break;

        }






    }
}
