public class java19{
    public static void main(String[] args) {
        long longvalue= 6778898;
        float floatvalue =longvalue;
        System.out.println("long value:"+longvalue);
        System.out.println("float value:"+floatvalue);
        if((long)floatvalue == longvalue){
            System.out.println("long values fits in float");
        }
        else{
            System.out.println("long values does not fit in float");
        }

    }
}
