public class Card {
        Suit s;
        Rank r;

        /*
        * สร้าง Enum Suit(ชนิดของไพ่)
        */
        enum  Suit{
            Spade , Heart , Diamond , Clubs
        }

        /*
        * สร้าง Enum Rank(ค่าของไพ่)
        */
        enum Rank{
            ACE(1) , TWO(2), THREE(3), FOUR(4), FIVE(5) , SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN (10), JACK(10), QUEEN (10), KING(10);
            int priority;
            Rank(int s) {                       //Constructorนี้จะใช้กำหนดค่าของ priority จาก parameter ของenum
                priority = s;
            }
            public int getPriority(){           //Methodนี้จะreturnค่าparameterของenum
                return priority;
            }
        }
        Card(Rank r, Suit s){                  //เป็นContructorที่รับArgumentมากำหนดค่าให้ตัวเเปรเเต่ละตัว
            this.r = r;
            this.s = s;
        }
        Rank getRank(){                         //เป็นGetterเพือ return enum Rank
        return r;
    }
        public String toString()               //เป็น Overridingmethod ที่ใช้ return ค่าเป็น String
        {
            return r + " of " + s;
        }
        public int getValue(){                 //เป็น method ที่ return เป็นค่า Integerของไพ่เเต่ละใบ
            return r.getPriority();
        }
}
