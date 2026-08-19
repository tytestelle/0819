package org.fourthline.cling.support.messagebox.model;

import java.util.Random;
import org.fourthline.cling.support.messagebox.parser.MessageDOM;
import org.fourthline.cling.support.messagebox.parser.MessageDOMParser;
import org.fourthline.cling.support.messagebox.parser.MessageElement;
import org.seamless.xml.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import org.seamless.xml.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Message implements ElementAppender {
    private final Category category;
    private DisplayType displayType;
    private final int id;
    protected final Random randomGenerator;

    public enum Category {
        SMS("SMS"),
        INCOMING_CALL("Incoming Call"),
        SCHEDULE_REMINDER("Schedule Reminder");

        public String text;

        Category(String str) {
            this.text = str;
        }
    }

    public enum DisplayType {
        MINIMUM("Minimum"),
        MAXIMUM("Maximum");

        public String text;

        DisplayType(String str) {
            this.text = str;
        }
    }

    public Message(Category category, DisplayType displayType) {
        this(0, category, displayType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.id == ((Message) obj).id;
    }

    public Category getCategory() {
        return this.category;
    }

    public DisplayType getDisplayType() {
        return this.displayType;
    }

    public int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id;
    }

    public String toString() {
        try {
            MessageDOMParser messageDOMParser = new MessageDOMParser();
            MessageDOM messageDOM = (MessageDOM) messageDOMParser.createDocument();
            MessageElement messageElementCreateRoot = messageDOM.createRoot(messageDOMParser.createXPath(), "Message");
            ((MessageElement) messageElementCreateRoot.createChild("Category")).setContent(getCategory().text);
            ((MessageElement) messageElementCreateRoot.createChild("DisplayType")).setContent(getDisplayType().text);
            appendMessageElements(messageElementCreateRoot);
            return messageDOMParser.print((O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) messageDOM, 0, false).replaceAll("<Message xmlns=\"urn:samsung-com:messagebox-1-0\">", "").replaceAll("</Message>", "");
        } catch (O000000oooOoo00ooo0O0000000o00O0Oooo0OOO e) {
            throw new RuntimeException(e);
        }
    }

    public Message(int i, Category category, DisplayType displayType) {
        Random random = new Random();
        this.randomGenerator = random;
        this.id = i == 0 ? random.nextInt(Integer.MAX_VALUE) : i;
        this.category = category;
        this.displayType = displayType;
    }
}
