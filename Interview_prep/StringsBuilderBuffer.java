import java.util.*;
class StringsBuilderBuffer
{
    
    public static void concatString(String str)
    {
        str=str+" antony";
    }
    public static void concatstringbuffer(StringBuffer s)
    {
        s=s.append(" Antony");
    }
    public static void concatstringbuilder(StringBuilder st)
    {
        st=st.append("Antony");

    }
    public static void main(String args[]) 
    {
        String mains="meera";
        concatString(mains);
        System.out.println("String:"+ mains);
        StringBuffer mains2=new StringBuffer("Meera ");
        concatstringbuffer(mains2);

        System.out.println("StringBuffer:"+ mains2);

        StringBuilder mains3=new StringBuilder(" Heera");
        concatstringbuilder(mains3);

        System.out.println("StringBuilder:"+ mains3);

        

    }

}
