public class starpattern {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6();
        pattern7();
        pattern8();
        System.out.println();
        pattern9();
        System.out.println();
        pattern10();
        System.out.println();
        pattern11();
        pattern12();
        System.out.println();
        pattern13();
        pattern14();
        System.out.println();
        pattern15();
        pattern16();
        System.out.println();
        pattern17();
        pattern18();
        



        
    }

    static void pattern1(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(n-i);
                
            }
            System.out.println();
        }
    }

    static void pattern2(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <(n-i); j++) {
                System.out.print(j);
                
            }
            System.out.println();
        }
    }

    
    // realastic peramid
    static void pattern3(int n)
    {

        for (int i = 0; i < n; i++) {
            // Spaces

            for (int j = 0; j <(n-i-1); j++) {
                System.out.print(" ");
                
            }

            // Stars
            for (int j = 0; j <(2*i+1); j++) {
                System.out.print("*");
                
            }
        

            // Spaces

            for (int j = 0; j <(n-i-1); j++) {
                System.out.print(" ");
                
            }
            System.out.println();
        }
        }

        // Downward pyramid
    static void pattern4(int n)
    {

        for (int i = 0; i <n; i++) {
            // Spaces

            for (int j = 2; j <=i+1; j++) {
                System.out.print(" ");
                
            }

            // Stars
            for (int j = 1; j <=(2*(n-i)-1); j++) {
                System.out.print("*");
                
            }
            // for (int j = 0; j <(n-i); j++) {
            //     System.out.print(" ");
                
            // }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int i = 1; i <=n; i++) {
            // spaces
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }

    static void pattern6()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= i+2; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <(3+2*i-2); j++) {
                System.out.print("*");
                
            }
            System.out.println();


           
    }
}
    static void pattern7()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j <= i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(3-2*i+2); j++) {
                System.out.print("*");
                
            }
            System.out.println();


           
        }
    
    }
    static void pattern8()
    {
        for(int i=0;i<5;i++)
        {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
        for(int i=0;i<4;i++)
        {
            for (int j = 4; j > i; j--) {
                System.out.print("*");
                
            }
            System.out.println();
        }

    }
    
    static void pattern9()
    {
        for (int i =  0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= (5-2*i+2); j++) {
                System.out.print(" ");
            }

        // for (int i =  0; i < 4; i++){
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10()
    {
        for (int i =  0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j <= (5-2*i+2); j++) {
                System.out.print(" ");
            }

        // for (int i =  0; i < 4; i++){
            for (int j = 0; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern11()
    {
        for (int i = 0 ; i <4; i++) {
            for (int j = 3 ; j > i; j--) {
                System.out.print(" ");
                
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }

    static void pattern12()
    {
        for (int i = 0 ; i <4; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 4; j >i ; j--) {
                System.out.print("*");
            }

            System.out.println();


        }
    }

    static void pattern13()
    {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                    System.out.print("*");
            }
            for (int j = 0; j <((8-2*i)-2); j++) {
                System.out.print(" ");
        }
            for (int j = 0; j <=i; j++) {
                    System.out.print("*");
            }
            System.out.println();
            

            
        }
    }
    static void pattern14()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                    System.out.print("*");
            }
            for (int j = 0; j <((4+2*i)-2); j++) {
                System.out.print(" ");
        }
            for (int j = 3; j >i; j--) {
                    System.out.print("*");
            }
            System.out.println();
            

            
        }
    }
    static void pattern15()
    {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("*");
                
            }
            for (int j = 2; j < (4-2+2*i); j++) {
                System.out.print(" ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern16()
    {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                
            }
            for (int j = 0; j < (4+2-2*i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern17()
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >i; j--) {
                System.out.print("*");

            }
            for (int j = 2; j < 5+2*i-3; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
    static void pattern18()
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 5+3-2*i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


