

import java.util.Scanner;

public class RecursionPractice{
		  public static void main(String[] args) {
			  Scanner sc=new Scanner(System.in);
		    int n  = sc.nextInt();
            int result=fact(n);
		    System.out.println(result);
		  }
		  public static int fact(int n) {
		    if (n== 1) {
		      return 1;
		    } else {
		    	int result =(n * fact(n-1));
		      return result;
		    }
		  }
		}

