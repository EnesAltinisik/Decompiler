package com.pinarsu.siparis.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnItemClick;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.SurveyBaseAdapter;
import com.pinarsu.siparis.interfaces.IClickListener;
import com.pinarsu.siparis.model.SurveyAnswer;
import com.pinarsu.siparis.model.data.SORULAR;
import com.pinarsu.siparis.ui.activity.SurveyActivity;
import java.util.ArrayList;
import java.util.List;

public class SurveyViewPagerFragment extends Fragment {
    private SurveyActivity activity;
    private SurveyBaseAdapter adapter;
    private IClickListener delegate;
    @InjectView(2131558573)
    EditText edDesc;
    private SORULAR item;
    @InjectView(2131558581)
    ListView lv;
    private int position;
    @InjectView(2131558646)
    TextView tvContinue;
    @InjectView(2131558577)
    TextView tvTitle;

    public static SurveyViewPagerFragment newInstance(int i, SORULAR sorular, IClickListener iClickListener) {
        SurveyViewPagerFragment surveyViewPagerFragment = new SurveyViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        bundle.putSerializable("item", sorular);
        bundle.putSerializable("delegate", iClickListener);
        surveyViewPagerFragment.setArguments(bundle);
        return surveyViewPagerFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.activity = (SurveyActivity) getActivity();
        this.position = getArguments().getInt("position", 0);
        this.item = (SORULAR) getArguments().getSerializable("item");
        this.delegate = (IClickListener) getArguments().getSerializable("delegate");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_survey_viewpager_item, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        ButterKnife.inject(this, view);
        if (this.item.SORU_METNI == null || this.item.SORU_METNI.isEmpty()) {
            this.tvTitle.setText("");
        } else {
            this.tvTitle.setText(this.item.SORU_METNI);
        }
        if (this.position == this.activity.size - 1) {
            this.tvContinue.setText(this.activity.getString(R.string.send));
        } else {
            this.tvContinue.setText(getString(R.string._continue));
        }
        List<String> list = this.item.questionList;
        if (this.item.TEK_CEVAP_SECILSIN == null || !this.item.TEK_CEVAP_SECILSIN.equals("X")) {
            z = false;
        } else {
            z = true;
        }
        if (this.item.answerObjectList == null) {
            this.item.answerObjectList = new ArrayList();
            for (String surveyAnswer : list) {
                this.item.answerObjectList.add(new SurveyAnswer(surveyAnswer, false));
            }
        }
        this.adapter = new SurveyBaseAdapter(getActivity(), this.item.answerObjectList, z);
        this.lv.setAdapter(this.adapter);
        this.edDesc.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SurveyViewPagerFragment.this.item.CEVAP_METNI = charSequence.toString();
            }

            public void afterTextChanged(Editable editable) {
            }
        });
    }

    @OnItemClick({2131558581})
    void onItemClickLv(int i) {
        boolean z = !((SurveyAnswer) this.item.answerObjectList.get(i)).isChecked;
        if (this.adapter.isRadio) {
            this.adapter.clearFlags();
        }
        ((SurveyAnswer) this.item.answerObjectList.get(i)).isChecked = z;
        this.adapter.notifyDataSetChanged();
    }

    @OnClick({2131558646})
    void clickContinue() {
        this.delegate.onClickListener(this.position);
    }
}
