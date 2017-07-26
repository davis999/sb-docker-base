package io.davis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Davis on 17/7/26.
 */
public class Example {

  /**
   * Logger.
   */
  private static final Logger LOG = LoggerFactory.getLogger(Example.class);

  public static void main(String[] args) throws InterruptedException {
    while (true) {
      LOG.debug("Example log.");
      Thread.sleep(2 * 1000);
    }
  }
}
