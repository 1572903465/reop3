package String_Editor;

public class String_Editor {
    public static String[] words = new String[20];
    public static String convert(String value) {
        StringBuffer upAfter = new StringBuffer(value.length());
        char aCharacter;
        //��tab , ; .�ȱ������滻�ɿո�
        value = value.replaceAll("[\\pP��������]", " ");
        words = value.split(" ");
        for (int i = 0;i < words.length; i++)
        {
            for(int j = 0;j < words[i].length(); j++) {
                aCharacter = words[i].charAt(j);
                if (j==0) {
                    //�ж��ǲ�����ĸ
                    if(Character.isLetter(aCharacter)) {
                        upAfter.append(Character.toUpperCase(aCharacter));
                    }
                    else {
                        upAfter.append(words[i].charAt(j));
                    }
                }
                else {
                    //������ַ�����ĸ���Ǵ�д��ĸ����תСд������ֱ������
                    if(Character.isLetter(aCharacter) && Character.isUpperCase(aCharacter)) {
                        upAfter.append(Character.toLowerCase(aCharacter));
                    }
                    else {
                        upAfter.append(words[i].charAt(j));
                    }
                }
            }
            upAfter.append(" ");
        }
        return new String(upAfter);
    }
}
