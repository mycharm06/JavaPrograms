import java.io.*;
class MyByteWriter
{
public static void main(String[] args)throws IOException
{
ByteArrayOutputStream fw=new ByteArrayOutputStream();
String s="India is a good country";
byte ch[]=s.getBytes();
for(int i=0;i<ch.length;i++)
fw.writeTo(new FileOutputStream("rabari11.txt"));
fw.writeTo(new FileOutputStream("rabari12.txt"));
System.out.println(fw.toString());
byte z[]=fw.toByteArray();
ByteArrayInputStream fr=new ByteArrayInputStream(z);
int i=0;
while((i=fr.read())!=-1)
System.out.print((char)i);
}
}
