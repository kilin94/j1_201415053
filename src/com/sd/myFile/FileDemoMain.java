package com.sd.myFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class FileDemoMain {
  public static void main(String[] args) throws Exception {
    File readme=null;
    FileInputStream isReadme=null;
    InputStreamReader isrReadme=null;
    BufferedReader brReadme=null;
    String str;
    
    try{  // IO�� ����ó�� �׻� �Ű�����
      String cwd=new File(".").getCanonicalPath();
      readme=new File(cwd,"test.txt");  // �ڹٴ� ��ȣ�ȿ� ������ ��������
      isReadme=new FileInputStream(readme);
      isrReadme=new InputStreamReader(isReadme,"UTF8");
      brReadme= new BufferedReader(isrReadme);

      while( (str=brReadme.readLine()) != null ) {  // End of File
        System.out.println(str);
      }
                
    } catch(Exception e) {
       e.printStackTrace();
    } finally {
      if(brReadme != null)
        brReadme.close();
    }
  }
}