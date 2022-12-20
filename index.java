class Main {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in); 
    System.out.print("Enter base- ");  
    int a = sc.nextInt();
    System.out.print("Enter exponent- ");  
    int b = sc.nextInt();  

    int base = a, exponent = b;

    long result = 1;

    while (exponent != 0) {
      result *= base;
      --exponent;
    }

    System.out.println("Answer = " + result);
  }
}
