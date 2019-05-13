@isTest
private class AP01_NumberInWords_Test {
	@isTest
    static void one(){
        System.assertEquals('one', AP01_NumberInWords.convertNumberInWords(1));
    }
	@isTest
    static void two(){
        System.assertEquals('two', AP01_NumberInWords.convertNumberInWords(2));
    }
	@isTest
    static void three(){
        System.assertEquals('three', AP01_NumberInWords.convertNumberInWords(3));
    }
	@isTest
    static void five(){
        System.assertEquals('five', AP01_NumberInWords.convertNumberInWords(5));
    }
	@isTest
    static void fourteen(){
        System.assertEquals('fourteen', AP01_NumberInWords.convertNumberInWords(14));
    }
	@isTest
    static void fifteen(){
        System.assertEquals('fifteen', AP01_NumberInWords.convertNumberInWords(15));
    }
	@isTest
    static void sixteen(){
        System.assertEquals('sixteen', AP01_NumberInWords.convertNumberInWords(16));
    }
	@isTest
    static void twenty(){
        System.assertEquals('twenty ', AP01_NumberInWords.convertNumberInWords(20));
    }
	@isTest
    static void twentyOne(){
        System.assertEquals('twenty one', AP01_NumberInWords.convertNumberInWords(21));
    }
	@isTest
    static void fifty(){
        System.assertEquals('fifty', AP01_NumberInWords.convertNumberInWords(50));
    }
}