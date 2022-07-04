import java.util.Scanner;
public class tiktac {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        char[][] choice = new char[3][3];
        boolean out = false;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                choice[i][j] = '_';
            }
        }
        printboard(choice);
            do{
                int count = 0;

                System.out.println("Choose between 0-2 ");
                System.out.println("X play: ");
                System.out.println("x coordinate: ");
                int x_choice_x = in.nextInt();
                System.out.println("y coordinate: ");
                int x_choice_y = in.nextInt();
//                x-input
                if(available(x_choice_x,x_choice_y,choice)==true){
                    choice[x_choice_x][x_choice_y] = 'X';
                }else {
                    System.out.println("This spot has been chosen, please choose another spot.");
                    System.out.println("Please try again");
                    boolean correct =false;
                    while (correct == false){
                        System.out.println("X play: ");
                        System.out.println("x coordinate: ");
                        x_choice_x = in.nextInt();
                        System.out.println("y coordinate: ");
                        x_choice_y = in.nextInt();
                        if(available(x_choice_x,x_choice_y,choice) == true){
                            choice[x_choice_x][x_choice_y] = 'X';
                            correct = true;
                        }
                    }

                }

                if(boardfilled(choice) == true){
                    System.out.println("Noone won, it is a tie");
                    break;
                }

                System.out.println("O play");
                System.out.println("x coordinate: ");
                int o_choice_x = in.nextInt();
                System.out.println("y coordinate: ");
                int o_choice_y = in.nextInt();
                if(available(o_choice_x,o_choice_y,choice)==true){
                    choice[o_choice_x][o_choice_y] = 'O';
                }else
                {
                    System.out.println("This spot has been chosen, please choose another spot.");
                    System.out.println("Try again");
                    boolean correct =false;
                    while (correct == false){
                        System.out.println("O play");
                        System.out.println("x coordinate: ");
                        o_choice_x = in.nextInt();
                        System.out.println("y coordinate: ");
                        o_choice_y = in.nextInt();
                        if(available(o_choice_x,o_choice_y,choice)){
                            choice[o_choice_x][o_choice_y] = 'O';
                            correct = true;
                        }
                    }


                }

                switch (haswon(choice)){
                    case 1:
                        System.out.println("X Won 🥳");
                        break;

                    case 2:
                        System.out.println("O Won 🥳");
                        break;
                    case 3:
                        System.out.println("X won 🥳");
                        break;
                    case 4:
                        System.out.println("O Won 🥳");
                        break;
                    case 5:
                        System.out.println("X Won 🥳");
                        break;
                    case 6:
                        System.out.println("O Won 🥳");
                        break;
                    case 7:
                        System.out.println("X Won 🥳");
                        break;
                    case 8:
                        System.out.println("X Won 🥳");
                        break;

                }
                if(haswon(choice) != 0){
                    break;
                }



                //something here!
                printboard(choice);


            }while (out==false);




    }
    public static boolean boardfilled(char[][]x){
        int count = 0;
        for(int i = 0; i< 3; i++){
            for(int j = 0 ; j<3; j++){
                if(x[i][j] == '_'){
                    count++;
                }
            }
        }
        if(count == 0){
            return true;
        }
        return false;
    }
    public static int haswon(char[][] x){
        for(int i = 0; i<=2; i++){
            if(x[i][0] == x[i][1] && x[i][1] == x[i][2] && x[i][0] != '_'){
                if(x[i][0] == 'X'){
                    return 1;
                }else{
                    return 2;
                }

            }
        }
        for(int j =0; j<=2; j++){
            if(x[0][j] == x[1][j] && x[1][j] == x[2][j] && x[0][j] != '_'){
                if(x[0][j] == 'X'){
                    return 3;
                }else {
                    return 4;
                }

            }
        }
        if(x[0][0] == x[1][1] && x[1][1] == x[2][2] & x[0][0] !='_'){
            if(x[0][0] == 'X'){
                return 5;
            }else{
                return 6;
            }

        }
        if(x[0][2] == x[1][1] && x[1][1] == x[2][0] & x[0][2] != '_'){
            if(x[0][2] == 'X'){
                return 7;
            }else {
                return 8;
            }
        }
        return 0;

    }
    //hackton
    public static boolean available(int one, int two, char[][] checker){
        if(checker[one][two] == '_'){
            return true;
        }
        return false;
    }
    public static void printboard(char[][] board){
        for(int i = 0 ;i < 3; i++){
            for(int j=0; j<3;j++){
                System.out.print(board[j][i] + " | ");
            }
            System.out.println("");
        }
    }


//    public static void check(char c){
//        if ((c == 0)|| (c==1) || (c == 2)){
//            System.out.println("");
//        }else {
//            System.out.println("Put in either 1, 2, or 3");
//        }
//    }

}
