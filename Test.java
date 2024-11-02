class Test{
    public static void main(String[] args) {
        /*
        1. Print the Pattern
            *                 * 
            * *             * * 
            * * *         * * * 
            * * * *     * * * * 
            * * * * * * * * * * 
            * * * * * * * * * * 
            * * * *     * * * * 
            * * *         * * * 
            * *             * * 
            *                 * 
        
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=2*(r-i);k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=2*(r-i);k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        2. Print the pattern
                1 
               2 2 
              3 3 3 
             4 4 4 4 
            5 5 5 5 5
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }System.out.println();
        }
        3. Print the pattern
            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *
        */
        int r=5;
        for(int i=1;i<r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=r;i>=1;i--){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        



        


    }
}


