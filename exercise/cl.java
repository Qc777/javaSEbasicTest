import java.util.Scanner;
public class cl{
	public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的身高");
		int height = scanner.nextInt();
		System.out.println("请输入您的体重");
		int width = scanner.nextInt();

		    if(height>=175||width>=50||width<=100){
					System.out.println("恭喜");
			    }
				
				else{
					System.out.println("遗憾");
				}
			}
	}
