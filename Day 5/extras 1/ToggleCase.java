public class ToggleCase {
    



    public static void main (String args[]){
 
        String str = "AvsdfGGdgsg";
        String ans = "";

        for(int i = 0 ; i < str.length();i++){
           
            if((int)str.charAt(i)>96){
                 int ascii = (int )str.charAt(i)-32;
                 char temp = (char) ascii ;
                 ans+=temp ;

            }

            if((int)str.charAt(i)<91){
                int ascii = (int )str.charAt(i)+32;
                char temp = (char) ascii ;
                ans+=temp ;

           }

        
        }

        System.out.println("toggled string is " + ans);
    }
}
