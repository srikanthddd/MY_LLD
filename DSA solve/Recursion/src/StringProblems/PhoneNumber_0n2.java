package StringProblems;

import java.util.ArrayList;

public class PhoneNumber_0n2 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        ArrayList<String> output = new ArrayList<>();
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                StringBuffer stringBuffer = new StringBuffer();
                char aa = a.charAt(i);
                char bb =  b.charAt(j);
                stringBuffer.append(aa).append(bb);
                String x = stringBuffer.toString();
                output.add(x);
            }
        }
        System.out.println(output);
    }
}
