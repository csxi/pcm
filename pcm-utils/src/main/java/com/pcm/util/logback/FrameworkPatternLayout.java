package com.pcm.util.logback;

import ch.qos.logback.classic.PatternLayout;
import com.pcm.util.logback.pattern.HostConverter;

/**
 * @author <a href="mailto:157224@ycgwl.com">Guo chengxi</a>
 * @createDate 2018/8/8 15:35
 */
public class FrameworkPatternLayout extends PatternLayout {
  static{
    defaultConverterMap.put("host", HostConverter.class.getName());
  }
}
