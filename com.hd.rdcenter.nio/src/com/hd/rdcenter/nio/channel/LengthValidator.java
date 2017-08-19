package com.hd.rdcenter.nio.channel;

public class LengthValidator implements Validator<Length> {

  public String validate(Length annotation, Object value) throws RuntimeException {
    if (annotation == null || value == null)
      return null;

    if (value instanceof String == false)
      return null;

    int length = ((String) value).length();

    return null;
  }

}