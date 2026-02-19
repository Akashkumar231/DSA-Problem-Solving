public class Binary_Number_Alternating_Bits {

    public static boolean isAlternate(int n){
        StringBuilder stringBuilder = new StringBuilder("");
        while (n!=0){
            int rem = n% 2;
            stringBuilder.append(rem);
            n = n / 2;
        }

        int length = stringBuilder.length();
        for(int idex = 1 ; idex<=length-1; idex++){
            if (stringBuilder.charAt(idex)==stringBuilder.charAt(idex-1)){
                System.out.println(stringBuilder);
                return false;
            }

        }

        System.out.println(stringBuilder);
        return true;
    }

    public static void main(String [] args){
        System.out.println(isAlternate(5
        ));
    }

}
