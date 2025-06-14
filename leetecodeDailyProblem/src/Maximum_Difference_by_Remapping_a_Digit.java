public class Maximum_Difference_by_Remapping_a_Digit {



    public static void main(String [] args){

            int number = 11891;
            String str1 = Integer.toString(number);
            String str2 = str1;

            int index = 0;
            for (int i = 0; i<str1.length(); i++){

                if(str1.charAt(i)!='9'){
                    index= i;
                    break;
                }

            }
            if (index<str1.length()){
                str1= str1.replace(str1.charAt(index),'9');
            }

            str2 = str2.replace(str2.charAt(0),'0');

        System.out.println(Integer.parseInt(str1)-Integer.parseInt(str2));

    }

}
