import java.util.Scanner;
public class sz{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		char sex = 'ÄÐ';
		int a = age<25&&sex=='ÄÐ'?200:100;
		System.out.println(a);
    }
}