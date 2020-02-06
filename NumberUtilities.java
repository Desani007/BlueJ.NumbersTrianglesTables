


public class NumberUtilities {

    public static String getRange(int stop) {
        String string ="";
    for ( int i=0; i<stop;i++){
      string+=i ;
        }
        return string;
    }

    public static String getRange(int start, int stop) {
        String string ="";
      for ( int i=start; i<stop;i++){
         string+=i ;
        }
      
        return string;
    }


    public static String getRange(int start, int stop, int step) {
         String string ="";
         
      for ( int i=start; i<stop; i+=step){
         string+=i;
        
        }
      
        return string;
    }

    public static String getEvenNumbers(int start, int stop) {
        String string ="";
         
      for ( int i=start; i<stop; i++){
          if (i%2!=0) continue;{
         string+=i;
        }
        
        }
      
        return string;
    }


    public static String getOddNumbers(int start, int stop) {
         String string ="";
         
      for ( int i=start; i<stop; i++){
          if (i%2!=0){
         string+=i;
        }
    }
        return string;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
     String string ="";
     for ( int i=start; i <=stop; i++){
       int num=(int)Math.pow(i, exponent);
       string+=num;
       
    }
    return string;  
}

}
