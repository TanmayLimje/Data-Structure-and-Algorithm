package star_pattern;

public class Star {


    public void beautify(){
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();
    }

    public void patternOne(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void patternTwo(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void patternThree(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void patternFour(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void patternFive(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void patternSix(){
        for (int i = 1; i <= 5; i++) {
            for (int j =4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void patternSeven(){
        // tukdam 1
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--################--");
        System.out.println();

        // tukdam 2
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j > i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public void patternEight(){

        // 1st way
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--################--");
        System.out.println();

        //2nd way
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i*2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void patternNine(){

        //1st way
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            for (int l = 4; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--################--");
        System.out.println();

        //2nd way
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 11; k > (i*2); k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--################--");
        System.out.println();

        //3rd way
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i*2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void patternTen(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i >= 2 && j <= i-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void patternEleven(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i >= 2 && k > 1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

}
