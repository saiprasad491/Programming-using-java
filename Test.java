class Test{
    public static void main(String[] args) {
        /*
        1. Solid Rectangle 
        int r=4,c=5;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("* ");
            }System.out.println();
        }
        * * * * * 
        * * * * * 
        * * * * * 
        * * * * * 
        
        2.Hollow Rectangle
        int r=4,c=5;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0||j==0||i==r-1||j==c-1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }System.out.println();
        }
        * * * * * 
        *       * 
        *       * 
        * * * * * 
        3. right angle triangle
        
        int r=4;
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
        * 
        * * 
        * * * 
        * * * * 
        4. Print the pattern
        * * * * 
        * * * 
        * * 
        * 
        
        int r=4;
        for(int i=0;i<r;i++){
            for(int j=r;j>i;j--){
                System.out.print("* ");
            }System.out.println();
        }
        5. Print the pattern
              * 
            * * 
          * * * 
        * * * *
         
        int r=4;
        for(int i=0;i<r;i++){
            for(int k=0;k<r-i-1;k++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
        6. Print the pattern
        1 
        1 2 
        1 2 3 
        1 2 3 4 
        1 2 3 4 5
        
        int r=5;
        for(int i=1;i<=5;i++){
            int k=1;
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }System.out.println();
        }
        7. Print the pattern
        1 2 3 4 5 
        1 2 3 4 
        1 2 3 
        1 2 
        1
         
        int r=5;
        for(int i=1;i<=r;i++){
            int k=1;
            for(int j=i;j<=r;j++){
                System.out.print(k+++" ");
            }System.out.println();
        }
        8. Print the pattern
        1
        2 3
        4 5 6
        7 8 9 10
        
        int r=4,k=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+++" ");
            }System.out.println();
        }
        9. Print the pattern
        1 
        0 1
        1 0 1
        0 1 0 1
        int r=4,k=1;
        for(int i=1;i<=r;i++){
            if(i%2==0)k=0;
            else k=1;
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                if(k==1)k=0;
                else k=1;
            }System.out.println();
        }
        10. Solid Rhombus
              * * * * 
            * * * * 
          * * * * 
        * * * * 
        
        int r=4;
        for(int i=1;i<=r;i++){
            for(int k=i;k<r;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=r;j++){
                System.out.print("* ");
            }System.out.println();
        }
        11. Print number pyramid
               1  
              2  2  
            3  3  3  
          4  4  4  4  
        5  5  5  5  5 
           
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=i;j<r;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+"  ");
            }System.out.println();
        }
        12. Print a palindromic number pyramid
                1 
              2 1 2 
            3 2 1 2 3 
          4 3 2 1 2 3 4 
        5 4 3 2 1 2 3 4 5 
            */
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=i;j<r;j++){
                System.out.print("  ");
            }
            int v = i;
            for(int k=1;k<=i;k++){
                System.out.print(v--+" ");
            }
            int m=2;
            for(int l=1;l<i;l++){
                System.out.print(m+++" ");
            }System.out.println();
        }
        



        


    }
}


