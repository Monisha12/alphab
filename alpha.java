import java.io.*;
import java.util.*;
public class alpha
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char ip=s.next().charAt(0);
if(ip=='a' || ip=='e' ||ip=='i'||ip=='o'||ip=='u')
{
System.out.println("character is vowel");
}
else 
{
System.out.println("character is consonant");
}
}
}
