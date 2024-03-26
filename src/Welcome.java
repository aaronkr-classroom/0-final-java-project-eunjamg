import java.util.Scanner;

public class Welcome {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
     
      System.out.println("당신의 이름을 입력하세요 : ");
      String name = input.nextLine();
     
      System.out.println("연락처를 입력하세요");
      int phone = input.nextInt();
     
      String greeting = "Welcome to Shopping Mall";
      String tagline = "Welcome to Book Market!!";
      boolean quit = false;
     
      while (!quit) {
         System.out.println("********************************************");
         System.out.println("\t" + greeting);
         System.out.println("\t" + tagline);
         menuIntro();
         System.out.println("메뉴 번호를 선택하세요 : ");
         int choice = input.nextInt();
         if (choice < 1 || choice > 8) {
            System.out.println("1부터 8까지의 숫자를 입력하세요.");
         }
         else {
            switch(choice) {
            case 1:
//               System.out.println("1. 현재 고객 정보 : ");
//               System.out.println("이름 : " + name + ", 연락처 : " + phone);
               menuGuestInfo(name, phone);
               break;
            case 2:
               menuCartItemList();
               break;
            case 3:
               menuCartClear();
               break;
            case 4:
               menuCartBil();
               break;
            case 5:
               menuCartAddItem();
               break;
            case 6:
               menuCartRemoveItemCount();
               break;
            case 7:
               menuCartRemoveItem();
               break;
            case 8:
               menuCartExit();
               quit = true;
               break;
            }
         }
      }
   }
   
   
   public static void menuIntro() {
      System.out.println("********************************************");
      System.out.println("1. 고객 정보 확인하기\t5. 장바구니에 항목 추가하기");
      System.out.println("2. 장바구니 상품 목록 보기\t6. 장바구니의 항목 수량 줄이기");
      System.out.println("3. 장바구니 비우기\t7. 장바구니의 항목 삭제하기");
      System.out.println("4. 영수증 표시하기\t8. 종료");
      System.out.println("********************************************");
   }
   /**
    * 설명 : 고객 정보 출력
    * 매게변수 :
    *    -String      name   고개 이름
    *    -int      phone   전화 번호
    * 변환 :
    */
   public static void menuGuestInfo(String name, int phone) {
      System.out.println("1. 현재 고객 정보 : ");
      System.out.println("이름 : " + name + ", 연락처 : " + phone);
   }
   /**
    * 설명 : 장바구니 상품 목록
    * 매게변수 :
    *    -String      name   고개 이름
    *    -int      phone   전화 번호
    * 변환 :
    */
   public static void menuCartItemList() {
      System.out.println("2번 장바구니 상품 목록 보기");
   }
   
   public static void menuCartClear() {
      System.out.println("3. 장바구니 비우기 : ");
   }

   public static void menuCartAddItem() {
      System.out.println("5. 장바구니에 항목 추가하기 : ");
   }

   public static void menuCartRemoveItemCount() {
      System.out.println("6. 장바구니의 항목 수량 줄이기 : ");
   }

   public static void menuCartRemoveItem() {
      System.out.println("7. 장바구니의 항목 삭제하기 : ");
   }

   public static void menuCartBil() {
      System.out.println("4. 영수증 표시하기 : ");
   }

   public static void menuCartExit() {
      System.out.println("8. 종료 : ");
   }
}