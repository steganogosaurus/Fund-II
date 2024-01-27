import java.util.Scanner;
public class DeckTest {
    public static void main(String[] args) {
        int i = 0;
        int playercount = 0;
        int dealercount = 0;
        Card dealer ;
        Card player ;
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();
        Deck deck2 = new Deck();
        deck.shuffle();                                                             //สับไพ่ตอนเริ่มเกม
        System.out.println("         This is BlackJack Game");
        while(true){                                                                //while true ทำงานจนกว่าจะมีคำสั่ง
            System.out.println("\nChoose: \n 0.Exit\n 1.DrawCard\n 2.Shuffle\n 3.RandomCard\n 4.IsEmpty\n 5.YourScore");
            System.out.println(" 6.ShowCard\n 7.not DrawCard  \n 8.DrawAllCard \n 9.RefilDeck");
            System.out.print("Enter: ");
            int choose = sc.nextInt();
            if(choose == 0){
                break;
            }
            else if(choose == 1){
                dealer = deck.draw();                                               //dealer จั่วไพ่
                player = deck.draw();                                               //player จั่วไพ่
                System.out.println("Dealer Card : [ Hidden ]");
                System.out.println("Your Card   : " + player);
                System.out.println("Cards left in deck: " + deck.cardsLeft());      //print ว่ามีไพ่กี่ใบในกอง
                playercount += player.getValue();                                   //นำค่าของไพ่มาบวกเข้า playercount เพื่อนับคะเเนน
                dealercount += dealer.getValue();                                   //นำค่าของไพ่มาบวกเข้า dealercount เพื่อนับคะเเนน
            }
            else if(choose == 2){
                deck.shuffle(); //สับไพ่ในกอง
                i--;
            }
            else if(choose == 3){
                dealer = deck.draw(deck.randomDeal());                              //dealer จั่วไพ่แบบสุ่ม
                player = deck.draw(deck.randomDeal());                              //player จั่วไพ่แบบสุ่ม
                System.out.println("Dealer Card : [ Hidden ]");
                System.out.println("Your Card   : " + player);
                System.out.println("Cards left in deck: " + deck.cardsLeft());      //print ว่ามีไพ่กี่ใบในกอง
                playercount += player.getValue();                                   //นำค่าของไพ่มาบวกเข้า playercount เพื่อนับคะเเนน
                dealercount += dealer.getValue();                                   //นำค่าของไพ่มาบวกเข้า dealercount เพื่อนับคะเเนน
            }
            else if(choose == 4){
                System.out.println(deck.isEmpty());                                 //checkว่ายังมีไพ่อยู่ในกองหรือเปล่า
                System.out.println("Cards left in deck: " + deck.cardsLeft());
                i--;
            }
            else if(choose == 5){
                System.out.println("Your Score is " + playercount);
                i--;
            }else if(choose == 6){
                deck.print();       //ใช้เเสดงไพ่ทั้งหมดในกอง
                i--;
            }else if(choose == 7){
                System.out.println("Not DrawCard");                                 //ไม่จั่วไพ่ต่อ
                System.out.println("Cards left in deck: " + deck.cardsLeft());
            }else if(choose == 8){
               deck.drawAllCard();
            }
            else if(choose == 9){
                deck = deck2;
                System.out.println("Refill!!");
                i--;
            }
            else {
                break;
            }
            i++;
            if(i % 3 == 0 && i != 0){
                /*
                 *  1. if statement นี้เอาไว้ Check คะเเนนว่าถึงหรือว่าเดิน 21 คะเเนนไหมฝั่งไหนมีมากกว่าชนะเท่ากันเสมอหรือฝั่งไหนน้อยกว่าเเพ้
                 */
                System.out.println("-------------------------");
                System.out.println("Dealer Score : " + dealercount);
                System.out.println("Your Score : " + playercount);
                if (playercount > 21) {
                    System.out.println("Player loses: exceeded 21");
                } else if (dealercount > 21) {
                    System.out.println("Dealer loses: exceeded 21");
                } else if (playercount > dealercount) {
                    System.out.println("Player wins!");
                } else if (dealercount > playercount) {
                    System.out.println("Dealer wins!");
                } else if(dealercount == playercount){
                    System.out.println("It's Tie!");
                }
                playercount = 0;
                dealercount = 0;
                continue;
            }
        }
    }
}
