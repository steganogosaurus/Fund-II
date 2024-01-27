import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Deck {
    private ArrayList<Card> cards;                              //สร้างArrayListเพื่อเก็บ Card
    /*
    *  ในส่วนนี้จะทำงานใน Constructor ของ Class Deck
    *   1.นำcardต่างสร้างมาเป็นDeckโดยการ NestedForeach จาก enumSuitเเละenumCard
    */
    public Deck() {
        cards = new ArrayList<Card>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }
    public void print(){                        //methodที่ใช้printไพ่ทั้งหมดในdeck โดยการใช้ Foreach ใน ArrayList card
        for (Card c : cards) {
            System.out.println(c);
        }
    }
    public void shuffle() {                    //ใช้สับไพ่โดยการใช้งาน methodshuffle ของ Class Collections
        Collections.shuffle(cards);
    }
    public Card draw(int i) {                 //เป็นOverloadingmethod โดยจะรับparameterเป็นเลขเพื่อใช้อ้างอิงIndexในการจั่ว(ใช้ในการสุ่มไพ่)
        if (cards.isEmpty()) {                //ถ้าไม่ไพ่ในกองจะreturn null
            return null;
        }
        return cards.remove(i);               //ถ้ามีจะreturn cardในตำเเหน่งนั้นเเล้วลบออกจากArraylist
    }
    public Card draw() {                      //เป็นOverloadingmethod โดยmethodในจะไม่รับparameterมาทำงาน เเต่จะส่งไพ่ใบบนสุดไปให้ผู้เล่น
        if (cards.isEmpty()) {                //ถ้าไม่ไพ่ในกองจะreturn null
            return null;
        }
        return cards.remove(cards.size() - 1); //ถ้ามีจะreturn cardในตำเเหน่งสุดท้ายในArraylist
    }
    public boolean isEmpty(){                   //เป็นmethodเช็คว่ายังหลือไพ่ในกองไหม
        return cards.isEmpty();
    }
    public int cardsLeft() {                   //เป็นmethodที่ใช้ในการดูว่ามีไพ่กี่ใบในกอง จะreturn เป็น size ของ Arraylist
        return cards.size();
    }
    public int randomDeal(){                   //ใช้สุ่มเลขจาก 0 - Size ของ Arraylist จะreturnออกมาเป็นเลขเพื่อใช้อ้างอิงตำเเหน่งของIndex
        Random rand = new Random();
        int randomIndex = rand.nextInt(cards.size());
        return randomIndex;
    }
    public void drawAllCard(){
        for(int i = cards.size()-1;i >= 0 ;i--){
            System.out.println(cards.get(i));
            cards.remove(i);
        }
    }
}
