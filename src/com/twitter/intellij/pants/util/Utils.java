package com.twitter.intellij.pants.util;

import com.intellij.openapi.externalSystem.model.project.ExternalSystemSourceType;

/**
 * Created by tdesai on 8/27/14.
 */
public class Utils {
  public enum SOURCE_TYPES{SOURCE, TEST, RESOURCE, TEST_RESOURCE}

  public static ExternalSystemSourceType getSourceTypeForTargetType(String target_type) {
    ExternalSystemSourceType source_type = null;
    try {
      switch (SOURCE_TYPES.valueOf(target_type.toUpperCase())) {
        case TEST:
          source_type = ExternalSystemSourceType.TEST;
          break;
        case RESOURCE:
          source_type = ExternalSystemSourceType.RESOURCE;
          break;
        case TEST_RESOURCE:
          source_type = ExternalSystemSourceType.TEST_RESOURCE;
          break;
        case SOURCE:
        default:
          source_type = ExternalSystemSourceType.SOURCE;
      }
      return source_type;
    }
    catch (java.lang.IllegalArgumentException e) {
      return ExternalSystemSourceType.SOURCE;
    }
  }
}
