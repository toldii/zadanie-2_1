import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("wybierz rozmiar choinki");
    int a= scan.nextInt();
     //System.out.println("wybierz z czego ma byc zrobiona choinka");
    //int b= scan.nextInt();
    char c= '$';
    for (int i = 1; i<=a; i++)
        {
            for(int j=0;j<a-i;j++)System.out.print(" ");
            for (int j = 0; j<(i*2)-1; j++)System.out.print(c);
            System.out.println(" ");
        }
     
  }
}