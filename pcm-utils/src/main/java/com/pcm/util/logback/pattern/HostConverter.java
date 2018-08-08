package com.pcm.util.logback.pattern;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.pcm.util.IPUtil;

/**
 * @author <a href="mailto:157224@ycgwl.com">Guo chengxi</a>
 * @createDate 2018/8/8 15:42
 */
public class HostConverter extends ClassicConverter {
  @Override
  public String convert(ILoggingEvent event) {
    return IPUtil.getLocalIP();
  }
}
