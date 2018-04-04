import java.util.ArrayList;

public class FodorString {
  final private char[] chars;

  public FodorString(final char[] chars) {
    this.chars = chars;
  }

  public char charAt(final int index) {
    return chars[index];
  }

  public int length() {
    return chars.length;
  }

  public boolean equals(final FodorString fs) {
    boolean equals = fs.length() == this.length();
    for (int i = 0; i < this.length() && equals; ++i)
      equals &= this.charAt(i) == fs.charAt(i);

    return equals;
  }

  public FodorString substring(final int begin, final int end) {
    char sub[] = new char[end - begin];
    for (int i = begin; i < end; ++i)
      sub[i - begin] = this.charAt(i);

    return new FodorString(sub);
  }

  public FodorString[] split(FodorString s) {
    FodorString[] splits = new FodorString[this.length()];
    int nSplits = 0;

    int splitLength = 0;
    char[] split = new char[this.length()];

    for (int i = 0; i < this.length(); ++i) {
      boolean match = i + s.length() < this.length();
      for (int j = 0; match && j < s.length(); ++j)
        match &= s.charAt(j) == this.charAt(i + j);

      if (match && splitLength > 0) {
        splits[nSplits++] = new FodorString(split);
        splitLength = 0;
        split = new char[this.length() - i];
        i += s.length() - 1;
      } else
        split[splitLength++] = this.charAt(i);
    }

    if (splitLength > 0)
      splits[nSplits++] = new FodorString(split);

    FodorString[] ret = new FodorString[nSplits];
    for (int i = 0; i < nSplits; ++i)
      ret[i] = splits[i];

    return ret;
  }

  public static FodorString valueOf(int value) {
    int nDigits = (int) Math.floor(Math.log(value) / Math.log(10)) + 1;
    final char[] digits = new char[nDigits];
    int index = 0;

    do {
      digits[index++] = (char) ('0' + value % 10);
      value /= 10;
    } while (value != 0);

    for (int i = 0; i < digits.length / 2; ++i) {
      final char tmp = digits[i];
      digits[i] = digits[digits.length - 1 - i];
      digits[digits.length - 1 - i] = tmp;
    }

    return new FodorString(digits);
  }

  public FodorString toLowerCase() {
    final char[] ret = new char[this.length()];

    for (int i = 0; i < this.length(); ++i)
      ret[i] = Character.toLowerCase(this.charAt(i));

    return new FodorString(ret);
  }
    
  public String toString() {
    return new String(chars);
  }
}
