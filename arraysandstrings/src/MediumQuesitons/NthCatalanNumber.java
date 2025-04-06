package MediumQuesitons;

public class NthCatalanNumber {

    public static int getNthCatalan(int number){

        if (number<=1){
            return 1;
        }

        int [] catalan = new int[number+1];

        catalan[0]=catalan[1]=1;

        for (int i = 2 ; i<= number;i++){
            catalan[i]=0;
            for (int j = 0 ; j< i ; j++){

                catalan[i]+= catalan[j] *catalan[i-j-1];
            }


        }
    return catalan[number];
    }

    public static void main(String [] args){

        int n = 6;
        int res = getNthCatalan(n);
        System.out.println(res);

    }

}
