package io.github.dkorobtsov.plinter;

import io.github.dkorobtsov.plinter.core.internal.HttpStatus;
import io.github.dkorobtsov.plinter.utils.Interceptor;
import org.junit.Test;

/**
 * Simple Enum parsing tests - just to increase total coverage.
 */
public class EnumParsingTest {

  @Test(expected = IllegalArgumentException.class)
  public void unknownHttpStatusCodeThrowsIllegalArgumentException() {
    HttpStatus.fromCode(999);
  }

  @SuppressWarnings("ResultOfMethodCallIgnored")
  @Test(expected = IllegalArgumentException.class)
  public void unknownInterceptorThrowsIllegalArgumentException() {
    Interceptor.fromString("UnknownInterceptor");
  }

}
