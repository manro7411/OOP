import java.util.*;;
public class recap {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please inset the limited number");
            int number = sc.nextInt();
            int temp=0;
            for (int i = 1; i <= number; i++) {
                 temp+=i;
            }
            System.out.println(temp);
            result(number);
        }
        public static void result(int num){
            System.out.println(num);
        }
    
}
