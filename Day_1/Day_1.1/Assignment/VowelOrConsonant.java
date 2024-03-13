import java.util.Scanner;
class VowelOrConsonant{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a character: ");
        char ch=sc.next().charAt(0);
        char newChar=Character.toLowerCase(ch);
        if(newChar=='a' || newChar=='e' || newChar=='i' || newChar=='o' || newChar=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }        
    }
}