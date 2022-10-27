public class DoHilleLac {
    public static void main(String args[])
            throws java.io.IOException {
          char choice;
          do {
              System.out.println("справка по животным");
              System.out.println(" 1. кот");
              System.out.println(" 2. пёс");
              System.out.println(" 3. рыба");
              System.out.println(" 4. насекомое");
              System.out.println(" 5. динозавр");
              System.out.println(" 6. покемон\n");
              System.out.println(" веберети существо");
              choice = (char) System.in.read();
          }
          while (choice< '1' || choice > '6' );
            System.out.println("\n");
            switch (choice){
                case '1':
                    System.out.println("относится к млекопитающим\n");
                    System.out.println("богоподобный");
                    break;
                case '2':
                    System.out.println("относится к млекопитающим\n");
                    System.out.println("ангельское создание");
                    break;
                case '3':
                    System.out.println("отдельный клас животных\n");
                    System.out.println("замичательные дамашнии питомци");
                    System.out.println("рыбка кои");
                    break;
                case '4':
                    System.out.println("отдельные существа\n");
                    System.out.println("ну, типа паука");
                    System.out.println("если ты хочеш его завести ты псих");
                    break;
                case '5':
                    System.out.println("вымершие существа\n");
                    System.out.println("это ящиры");
                    System.out.println("если хочеш завести тебе в филем");
                    break;
                case '6':
                    System.out.println("вид мультяшек\n");
                    System.out.println("пикачу я выбераю тебя!!");
                    System.out.println("тебе в аниме, удачи");
                    break;

            }

        }
    }


