package com.gainsight.segmentloader.util;

import com.segment.analytics.Callback;
import com.segment.analytics.Log;
import com.segment.analytics.messages.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by samujjal on 15/02/17.
 */
public class SegmentLog {
    static Logger LOGGER = LoggerFactory.getLogger(SegmentLog.class);
    public static final Callback CALLBACK = new Callback() {
        public void success(Message message) {
            LOGGER.info("Uploaded " + message);
        }

        public void failure(Message message, Throwable throwable) {
            LOGGER.info("Could not upload " + message);
        }
    };

    public static final Log STDOUT = new Log() {
        public void print(Level level, String s, Object... objects) {
            String logStr = String.format("Message: {}, Objects: {}", s, objects);
            switch (level){
                case VERBOSE:
                    LOGGER.info(logStr);
                    break;
                case DEBUG:
                    LOGGER.debug(logStr);
                    break;
                case ERROR:
                    LOGGER.error(logStr);
                    break;
                default:
                    LOGGER.info(logStr);
            }

        }

        public void print(Level level, Throwable throwable, String s, Object... objects) {
            print(level, s, objects);
        }
    };
}
