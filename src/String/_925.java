package String;

public class _925 {
    public static void main(String[] args) {

    }
    static public boolean isLongPressedName(String name, String typed) {
        int namePointer = 0;
        int typedPointer = 0;
        char previous = '0';
        if(name.length() > typed.length()) return  false;
        while(namePointer < name.length() && typedPointer <typed.length())
        {

            if (name.charAt(namePointer) == typed.charAt(typedPointer)){
                previous= name.charAt(namePointer);
                namePointer++;
                typedPointer++;

            }else {

                if (typed.charAt(typedPointer) != previous) return false;
                while (typedPointer <typed.length() && typed.charAt(typedPointer)== previous) typedPointer++;
            }
        }
        if (namePointer < name.length()) return  false;
        if (typedPointer < typed.length()){
            char lastCh = name.charAt(name.length()-1);
            while (typedPointer<typed.length()){
                if (typed.charAt(typedPointer) != lastCh) return false;
            }
        }

        return true;

    }
    //  cleaner Solution
    public boolean isLongPressedName2(String name, String typed) {
        int i = 0; //typed idx
        int j = 0; //name idx
        while(i<typed.length()){
            if(j<name.length() && name.charAt(j) == typed.charAt(i)){
                i++;
                j++;
            }else if(i>0 && typed.charAt(i)==typed.charAt(i-1)){
                i++;
            }else{
                return false;
            }
        }

        return j==name.length();
    }
}
