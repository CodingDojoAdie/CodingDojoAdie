public class AP01_NumberInWords {
    public static String convertNumberInWords(Integer vNumber){
        String result = '';
        String vNumberString = String.valueOf(vNumber);
        Integer vNumberUnite = Integer.valueOf(vNumberString.right(1));
        
        if(vNumberUnite == 1){
        	result = 'one';
        }
        
        if(vNumberUnite == 2){
        	result = 'two';
        }
        
        if(vNumberUnite == 3){
        	result = 'three';
        }
        
        if(vNumberUnite == 4){
        	result = 'four';
        }
        
        if(vNumberUnite == 5){
        	result = 'five';
        }
        
        if(vNumberUnite == 6){
        	result = 'six';
        }
        
        Integer vNumberDizaine = Integer.valueOf(vNumberString.right(2));
        
        if(vNumberDizaine > 13 && vNumberDizaine < 20){
            result += 'teen';
        }
        
        if(vNumber == 15){
            result = 'fifteen';
        }
        
        if(vNumberDizaine > 19 && vNumberDizaine < 30){
            result = 'twenty ' + result;
        }
        
        if(vNumber == 50){
            result = 'fifty';
        }
        
        return result;
    }
}