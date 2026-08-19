package is.xyz.mpv;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MPVLib {
    private static final List<LogObserver> logObservers;
    private static final List<EventObserver> observers;

    public interface EventObserver {
        void event(int i);

        void eventProperty(String str);

        void eventProperty(String str, double d);

        void eventProperty(String str, long j);

        void eventProperty(String str, String str2);

        void eventProperty(String str, boolean z);
    }

    public interface LogObserver {
        void logMessage(String str, int i, String str2);
    }

    public static class MpvEvent {
        public static final int MPV_EVENT_AUDIO_RECONFIG = 18;
        public static final int MPV_EVENT_CLIENT_MESSAGE = 16;
        public static final int MPV_EVENT_COMMAND_REPLY = 5;
        public static final int MPV_EVENT_END_FILE = 7;
        public static final int MPV_EVENT_FILE_LOADED = 8;
        public static final int MPV_EVENT_GET_PROPERTY_REPLY = 3;
        public static final int MPV_EVENT_HOOK = 25;

        @Deprecated
        public static final int MPV_EVENT_IDLE = 11;
        public static final int MPV_EVENT_LOG_MESSAGE = 2;
        public static final int MPV_EVENT_NONE = 0;
        public static final int MPV_EVENT_PLAYBACK_RESTART = 21;
        public static final int MPV_EVENT_PROPERTY_CHANGE = 22;
        public static final int MPV_EVENT_QUEUE_OVERFLOW = 24;
        public static final int MPV_EVENT_SEEK = 20;
        public static final int MPV_EVENT_SET_PROPERTY_REPLY = 4;
        public static final int MPV_EVENT_SHUTDOWN = 1;
        public static final int MPV_EVENT_START_FILE = 6;

        @Deprecated
        public static final int MPV_EVENT_TICK = 14;
        public static final int MPV_EVENT_VIDEO_RECONFIG = 17;
    }

    public static class MpvFormat {
        public static final int MPV_FORMAT_BYTE_ARRAY = 9;
        public static final int MPV_FORMAT_DOUBLE = 5;
        public static final int MPV_FORMAT_FLAG = 3;
        public static final int MPV_FORMAT_INT64 = 4;
        public static final int MPV_FORMAT_NODE = 6;
        public static final int MPV_FORMAT_NODE_ARRAY = 7;
        public static final int MPV_FORMAT_NODE_MAP = 8;
        public static final int MPV_FORMAT_NONE = 0;
        public static final int MPV_FORMAT_OSD_STRING = 2;
        public static final int MPV_FORMAT_STRING = 1;
    }

    public static class MpvLogLevel {
        public static final int MPV_LOG_LEVEL_DEBUG = 60;
        public static final int MPV_LOG_LEVEL_ERROR = 20;
        public static final int MPV_LOG_LEVEL_FATAL = 10;
        public static final int MPV_LOG_LEVEL_INFO = 40;
        public static final int MPV_LOG_LEVEL_NONE = 0;
        public static final int MPV_LOG_LEVEL_TRACE = 70;
        public static final int MPV_LOG_LEVEL_V = 50;
        public static final int MPV_LOG_LEVEL_WARN = 30;
    }

    static {
        System.loadLibrary("mpvplayer");
        System.loadLibrary("mpv");
        observers = new ArrayList();
        logObservers = new ArrayList();
    }

    public static void addLogObserver(LogObserver logObserver) {
        List<LogObserver> list = logObservers;
        synchronized (list) {
            list.add(logObserver);
        }
    }

    public static void addObserver(EventObserver eventObserver) {
        List<EventObserver> list = observers;
        synchronized (list) {
            list.add(eventObserver);
        }
    }

    public static native void attachSurface(Surface surface);

    public static native void command(String[] strArr);

    public static native void create(Context context);

    public static native void destroy();

    public static native void detachSurface();

    public static void event(int i) {
        List<EventObserver> list = observers;
        synchronized (list) {
            try {
                Iterator<EventObserver> it = list.iterator();
                while (it.hasNext()) {
                    it.next().event(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void eventProperty(String str, long j) {
        List<EventObserver> list = observers;
        synchronized (list) {
            try {
                Iterator<EventObserver> it = list.iterator();
                while (it.hasNext()) {
                    it.next().eventProperty(str, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static native Boolean getPropertyBoolean(String str);

    public static native Double getPropertyDouble(String str);

    public static native Integer getPropertyInt(String str);

    public static native String getPropertyString(String str);

    public static native Bitmap grabThumbnail(int i);

    public static native void init();

    public static void logMessage(String str, int i, String str2) {
        List<LogObserver> list = logObservers;
        synchronized (list) {
            try {
                Iterator<LogObserver> it = list.iterator();
                while (it.hasNext()) {
                    it.next().logMessage(str, i, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static native void observeProperty(String str, int i);

    public static void removeLogObserver(LogObserver logObserver) {
        List<LogObserver> list = logObservers;
        synchronized (list) {
            list.remove(logObserver);
        }
    }

    public static void removeObserver(EventObserver eventObserver) {
        List<EventObserver> list = observers;
        synchronized (list) {
            list.remove(eventObserver);
        }
    }

    public static native int setOptionString(String str, String str2);

    public static native void setPropertyBoolean(String str, boolean z);

    public static native void setPropertyDouble(String str, double d);

    public static native void setPropertyInt(String str, int i);

    public static native void setPropertyString(String str, String str2);

    public static void eventProperty(String str, boolean z) {
        List<EventObserver> list = observers;
        synchronized (list) {
            try {
                Iterator<EventObserver> it = list.iterator();
                while (it.hasNext()) {
                    it.next().eventProperty(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void eventProperty(String str, double d) {
        List<EventObserver> list = observers;
        synchronized (list) {
            try {
                Iterator<EventObserver> it = list.iterator();
                while (it.hasNext()) {
                    it.next().eventProperty(str, d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void eventProperty(String str, String str2) {
        List<EventObserver> list = observers;
        synchronized (list) {
            try {
                Iterator<EventObserver> it = list.iterator();
                while (it.hasNext()) {
                    it.next().eventProperty(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void eventProperty(String str) {
        List<EventObserver> list = observers;
        synchronized (list) {
            try {
                Iterator<EventObserver> it = list.iterator();
                while (it.hasNext()) {
                    it.next().eventProperty(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
