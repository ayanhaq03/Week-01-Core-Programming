class LongestWord{



    public static void main (String args[]){

     String  str = "welcome to bridgelabz aaaaaaaaaaaaaa ";

     String [] arr = str.split(" ");

     StringBuilder longWord = new StringBuilder(arr[0]);
     int maxLen = arr[0].length() ;

     for(int i = 1 ; i < arr.length ; i++){
        
        if(arr[i].length()>maxLen){

           longWord.delete(0, longWord.length());
           longWord.append(arr[i]);
        }
        
     }

     System.out.println("longest word is " + longWord.toString());
        
    }
}