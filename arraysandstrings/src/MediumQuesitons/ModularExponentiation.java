package MediumQuesitons;

public class ModularExponentiation {

        public static int getModularExponentiation1(int x , int y , int p){
            if (x==0 ){
                if (y==0 )
                    return 1%p;
                return 0;
            }
            int product = 1;
            for(int i = 1 ; i<=y ;i++)
            {
                product = (product * x) % p;
            }
         return product%p;
        }

        public static int getModularExponentiation2(int x , int y , int p){

            int res = 1;
            x = x%p;
            if (x==0){
                return 0;
            }

            while (y>0){

                if ((y&1) !=0){
                    res = (res * x ) % p;
                }

                x = (x * x ) % p;
                y = y>>1;
            }

return  res;
        }

    public static void main(String [] args){

            System.out.println(getModularExponentiation1(2,5,13));
            System.out.println(getModularExponentiation1(2,5,13));

    }

}
