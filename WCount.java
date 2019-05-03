import java.util.Scanner;

class WCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter the substring: ");
        String sub = sc.nextLine();
        

        int str_len = str.length();
        int sub_len = sub.length();

        int count = 0;


        for(int i=0; i<str_len; i++)
        {
            if(str.charAt(i)==sub.charAt(1))
            {
                int j = i+sub_len;
                if(j>str_len)
                    j=str_len+1;
                
                String cut = str.substring(i-1,j-1);
                Boolean opt = sub.equals(cut);

                if(opt)
                    count++;
                    
            }
        }
        
        System.out.println(count);
    }
}