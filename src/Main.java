public class Main {
    public static void main(String[] args) {
        int month = 13;
        int cat = 6;
        String season;
        switch  (month) {
            case 12:
            case 1:
            case 2:
                season="рыбы";
                break;
            case 3:
            case 4:
            case 5:
                season="насикомые";
                break;
            case 6:
            case 7:
            case 8:
                season="кашачим";
                    break;
            case 9:
            case 10:
            case 11:
                season="сабачи";
                break;
            case 13:
                season="богопадобным";
                break;
            default:
                season="GG";
        }
        String seaso;
        switch  (cat) {
            case 12:
            case 1:
            case 2:
                seaso="рыбы";
                break;
            case 3:
            case 4:
            case 5:
                seaso="насикомые";
                break;
            case 6:
            case 7:
            case 8:
                seaso="кашачим";
                break;
            case 9:
            case 10:
            case 11:
                seaso="сабачи";
                break;
            case 13:
                seaso="богопадобным";
                break;
            default:
                seaso="GG";
        }
        System.out.println("кот относится к " + seaso + " и " + season + ".");
        for(int i=0; i<6; i++)
            switch (i){
            case 0:
                System.out.println("Дурак");
                break;
            case 1:
                System.out.println("нарды");
break;
            case 2:
                System.out.println("шашки");
break;
            case 3:
                System.out.println("шахматы");
break;
            case 4:
                System.out.println("покер");
break;
            case 5:
                System.out.println("класика");
                break;


        }


    }
}