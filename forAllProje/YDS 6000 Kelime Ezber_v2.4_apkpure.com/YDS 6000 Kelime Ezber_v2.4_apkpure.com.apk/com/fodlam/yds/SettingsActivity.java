package com.fodlam.yds;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.RingtonePreference;
import android.speech.tts.TextToSpeech.EngineInfo;
import android.text.TextUtils;
import android.view.MenuItem;
import com.fodlam.yds.alarms.a;
import com.fodlam.yds.utility.b;
import java.util.List;

public class SettingsActivity extends a {
    private static OnPreferenceChangeListener a = new OnPreferenceChangeListener() {
        public boolean onPreferenceChange(Preference preference, Object obj) {
            CharSequence obj2 = obj.toString();
            if (preference instanceof ListPreference) {
                ListPreference listPreference = (ListPreference) preference;
                int findIndexOfValue = listPreference.findIndexOfValue(obj2);
                preference.setSummary(findIndexOfValue >= 0 ? listPreference.getEntries()[findIndexOfValue] : null);
            } else if (!(preference instanceof RingtonePreference)) {
                preference.setSummary(obj2);
            } else if (TextUtils.isEmpty(obj2)) {
                preference.setSummary(R.string.pref_ringtone_silent);
            } else {
                Ringtone ringtone = RingtoneManager.getRingtone(preference.getContext(), Uri.parse(obj2));
                if (ringtone == null) {
                    preference.setSummary(null);
                } else {
                    preference.setSummary(ringtone.getTitle(preference.getContext()));
                }
            }
            return true;
        }
    };

    @TargetApi(11)
    public static class GeneralPreferenceFragment extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            int i = 0;
            super.onCreate(bundle);
            addPreferencesFromResource(R.xml.pref_general);
            setHasOptionsMenu(true);
            final Preference preference = (ListPreference) findPreference("ttsengine");
            List a = b.a(getActivity().getApplicationContext()).a();
            if (a.size() > 0) {
                CharSequence[] charSequenceArr = new CharSequence[a.size()];
                CharSequence[] charSequenceArr2 = new CharSequence[a.size()];
                for (int i2 = 0; i2 < a.size(); i2++) {
                    charSequenceArr[i2] = ((EngineInfo) a.get(i2)).label;
                    charSequenceArr2[i2] = ((EngineInfo) a.get(i2)).name;
                }
                preference.setEntries(charSequenceArr);
                preference.setEntryValues(charSequenceArr2);
                String string = PreferenceManager.getDefaultSharedPreferences(getActivity()).getString("ttsengine", null);
                String str = string == null ? ((EngineInfo) a.get(0)).name : string;
                int i3 = 0;
                while (i < a.size()) {
                    int i4 = str.equals(((EngineInfo) a.get(i)).name) ? i : i3;
                    i++;
                    i3 = i4;
                }
                preference.setDefaultValue(((EngineInfo) a.get(i3)).name);
                preference.setSummary(((EngineInfo) a.get(i3)).label);
                preference.setValueIndex(i3);
                SettingsActivity.b(preference);
            }
            SettingsActivity.b(findPreference("notifications_new_message_ringtone"));
            findPreference("test_wrong_vibrate").setOnPreferenceChangeListener(new OnPreferenceChangeListener(this) {
                final /* synthetic */ GeneralPreferenceFragment a;

                {
                    this.a = r1;
                }

                public boolean onPreferenceChange(Preference preference, Object obj) {
                    OxfordApplication.e = ((Boolean) obj).booleanValue();
                    return true;
                }
            });
            findPreference("remind_me").setOnPreferenceChangeListener(new OnPreferenceChangeListener(this) {
                final /* synthetic */ GeneralPreferenceFragment a;

                {
                    this.a = r1;
                }

                public boolean onPreferenceChange(Preference preference, Object obj) {
                    OxfordApplication.k = (Boolean) obj;
                    preference.getEditor().putBoolean("remind_me", OxfordApplication.k.booleanValue()).commit();
                    a.a(this.a.getActivity());
                    return true;
                }
            });
            findPreference("test_sound_on").setOnPreferenceChangeListener(new OnPreferenceChangeListener(this) {
                final /* synthetic */ GeneralPreferenceFragment a;

                {
                    this.a = r1;
                }

                public boolean onPreferenceChange(Preference preference, Object obj) {
                    OxfordApplication.d = ((Boolean) obj).booleanValue();
                    return true;
                }
            });
            findPreference("ttsengine").setOnPreferenceChangeListener(new OnPreferenceChangeListener(this) {
                final /* synthetic */ GeneralPreferenceFragment b;

                public boolean onPreferenceChange(Preference preference, Object obj) {
                    SettingsActivity.b(this.b.findPreference("ttsengine"));
                    int findIndexOfValue = preference.findIndexOfValue((String) obj);
                    preference.setSummary(findIndexOfValue >= 0 ? preference.getEntries()[findIndexOfValue] : null);
                    b.a(this.b.getActivity()).a((String) obj);
                    return true;
                }
            });
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            startActivity(new Intent(getActivity(), SettingsActivity.class));
            return true;
        }
    }

    public static boolean a(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 4;
    }

    private static void b(Preference preference) {
        preference.setOnPreferenceChangeListener(a);
        a.onPreferenceChange(preference, PreferenceManager.getDefaultSharedPreferences(preference.getContext()).getString(preference.getKey(), ""));
    }

    protected boolean isValidFragment(String str) {
        return PreferenceFragment.class.getName().equals(str) || GeneralPreferenceFragment.class.getName().equals(str);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentManager().beginTransaction().replace(16908290, new GeneralPreferenceFragment()).commit();
    }

    public boolean onIsMultiPane() {
        return a((Context) this);
    }
}
