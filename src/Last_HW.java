public class Last_HW{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите количество членов последовательности Фибоначчи: ");
    int amount = scanner.nextInt();

    int[] arrFib = new int[amount];
    arrFib[0] = 0;
    arrFib[1] = 1;
    if (amount > 2) {
      for (int i = 2; i < amount; i++) {
        arrFib[i] = arrFib[i-1]+arrFib[i-2];
      }

    }
    System.out.println("Последовательность Фибоначчи: ");
    for(int i = 0; i < arrFib.length; i++){
      System.out.print(arrFib[i]);
      if(i < arrFib.length - 1){
        System.out.print(", ");
      }

    }
  }
}