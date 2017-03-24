package com.mwr.example.sieve;

import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class DBParser {
    public static final String ns = null;

    public static String processElement(PasswordEntry pe) {
        StringBuffer out = new StringBuffer("<entry>");
        out.append("<service>" + pe.service + "</service>");
        out.append("<username>" + pe.username + "</username>");
        out.append("<email>" + pe.email + "</email>");
        out.append("<password>" + pe.password + "</password>");
        out.append("</entry>");
        return out.toString();
    }

    public static List<PasswordEntry> readFile(InputStream in) throws XmlPullParserException, IOException {
        XmlPullParser parser = Xml.newPullParser();
        parser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        parser.setInput(in, null);
        parser.nextTag();
        return readFeed(parser);
    }

    public static String getKey(InputStream in) throws XmlPullParserException, IOException {
        XmlPullParser parser = Xml.newPullParser();
        parser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        parser.setInput(in, null);
        parser.nextTag();
        parser.require(2, ns, PWTable.TABLE_NAME);
        return parser.getAttributeValue(null, PWTable.KEY_TABLE_NAME);
    }

    public static String getPIN(InputStream in) throws XmlPullParserException, IOException {
        XmlPullParser parser = Xml.newPullParser();
        parser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        parser.setInput(in, null);
        parser.nextTag();
        parser.require(2, ns, PWTable.TABLE_NAME);
        return parser.getAttributeValue(null, "Pin");
    }

    private static List<PasswordEntry> readFeed(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(2, ns, PWTable.TABLE_NAME);
        List<PasswordEntry> pe = new LinkedList();
        while (parser.next() != 3) {
            if (parser.getEventType() == 2) {
                if (parser.getName().equals("entry")) {
                    pe.add(readEntry(parser));
                } else {
                    skip(parser);
                }
            }
        }
        return pe;
    }

    private static PasswordEntry readEntry(XmlPullParser parser) throws XmlPullParserException, IOException {
        String service = null;
        String username = null;
        String email = null;
        String password = null;
        while (parser.next() != 3) {
            if (parser.getEventType() == 2) {
                String name = parser.getName();
                if (name.equals(PWTable.COLUMN_NAME_SERVICE)) {
                    service = readElement(parser, PWTable.COLUMN_NAME_SERVICE);
                } else if (name.equals(PWTable.COLUMN_NAME_USERNAME)) {
                    username = readElement(parser, PWTable.COLUMN_NAME_USERNAME);
                } else if (name.equals(PWTable.COLUMN_NAME_EMAIL)) {
                    email = readElement(parser, PWTable.COLUMN_NAME_EMAIL);
                } else if (name.equals(PWTable.COLUMN_NAME_PASSWORD)) {
                    password = readElement(parser, PWTable.COLUMN_NAME_PASSWORD);
                }
            }
        }
        return new PasswordEntry(service, username, email, password);
    }

    private static String readElement(XmlPullParser parser, String tag) throws XmlPullParserException, IOException {
        parser.require(2, ns, tag);
        String text = readText(parser);
        parser.require(3, ns, tag);
        return text;
    }

    private static String readText(XmlPullParser parser) throws XmlPullParserException, IOException {
        String result = "";
        if (parser.next() != 4) {
            return result;
        }
        result = parser.getText();
        parser.nextTag();
        return result;
    }

    private static void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        if (parser.getEventType() != 2) {
            Log.i("parser", "IllegalState thrown");
            throw new IllegalStateException();
        }
        int depth = 1;
        while (depth != 0) {
            switch (parser.next()) {
                case 2:
                    depth++;
                    break;
                case 3:
                    depth--;
                    break;
                default:
                    break;
            }
        }
    }
}
