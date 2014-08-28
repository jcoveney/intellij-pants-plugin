package com.twitter.intellij.pants.util;

import com.intellij.openapi.externalSystem.model.project.ExternalSystemSourceType;
import junit.framework.TestCase;

/**
 * Created by tdesai on 8/27/14.
 */
public class UtilsTest extends TestCase{

  public void testSourceTypeForTargetType() {
    assertEquals("Source type correctly set",
                 ExternalSystemSourceType.SOURCE,
                 Utils.getSourceTypeForTargetType("source"));

    assertEquals("Source type correctly set",
                 ExternalSystemSourceType.RESOURCE,
                 Utils.getSourceTypeForTargetType("resource"));

    assertEquals("Source type correctly set",
                 ExternalSystemSourceType.TEST,
                 Utils.getSourceTypeForTargetType("TEST"));

    assertEquals("Source type correctly set",
                 ExternalSystemSourceType.TEST_RESOURCE,
                 Utils.getSourceTypeForTargetType("TEST_RESOURCE"));

    assertEquals("Source type correctly set",
                 ExternalSystemSourceType.SOURCE,
                 Utils.getSourceTypeForTargetType("gibberish"));
  }
}
