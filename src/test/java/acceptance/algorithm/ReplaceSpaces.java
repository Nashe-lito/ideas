package acceptance.algorithm;

public class ReplaceSpaces {
  public static void main(String[] args) {
    String str = "Mr John Smith  ";
   // Integer length = 13;
   // int length1 = length.
  //  System.out.println(replaceSpaces1(str));
  }

  public static void replaceSpaces1(char[] str, int length) {
    int spaceCount = 0, newLength, i;
    for(i = 0; i < length; i++) {
      if (str[i] == ' ') {
        spaceCount++;
      }
    }

    newLength = length + spaceCount * 2;
    str[newLength] = '\0';
    for (i = length - 1; i >= 0; i --) {
      if (str[i] == ' ') {
        str[newLength - 1] = '0';
        str[newLength - 2] = '2';
        str[newLength - 3] = '%';
        newLength = newLength - 3;
      } else {
        str[newLength - 1] = str[i];
        newLength = newLength - 1;
      }
    }
  }
}
