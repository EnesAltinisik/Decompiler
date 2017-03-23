package com.google.android.gms.location.places.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.gms.R;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocomplete.IntentBuilder;
import com.google.android.gms.maps.model.LatLngBounds;

public class SupportPlaceAutocompleteFragment extends Fragment {
    private LatLngBounds zzaYA;
    private AutocompleteFilter zzaYB;
    private PlaceSelectionListener zzaYC;
    private View zzaYx;
    private View zzaYy;
    private EditText zzaYz;

    private void zzDo() {
        int i = 0;
        int i2 = !this.zzaYz.getText().toString().isEmpty() ? 1 : 0;
        View view = this.zzaYy;
        if (i2 == 0) {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void zzDp() {
        int i;
        int connectionStatusCode;
        try {
            startActivityForResult(new IntentBuilder(2).setBoundsBias(this.zzaYA).setFilter(this.zzaYB).zzeR(this.zzaYz.getText().toString()).zziH(1).build(getActivity()), 30421);
            i = -1;
        } catch (Throwable e) {
            connectionStatusCode = e.getConnectionStatusCode();
            Log.e("Places", "Could not open autocomplete activity", e);
            i = connectionStatusCode;
        } catch (Throwable e2) {
            connectionStatusCode = e2.errorCode;
            Log.e("Places", "Could not open autocomplete activity", e2);
            i = connectionStatusCode;
        }
        if (i != -1) {
            GoogleApiAvailability.getInstance().showErrorDialogFragment(getActivity(), i, 30422);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 30421) {
            if (i2 == -1) {
                Place place = PlaceAutocomplete.getPlace(getActivity(), intent);
                if (this.zzaYC != null) {
                    this.zzaYC.onPlaceSelected(place);
                }
                setText(place.getName().toString());
            } else if (i2 == 2) {
                Status status = PlaceAutocomplete.getStatus(getActivity(), intent);
                if (this.zzaYC != null) {
                    this.zzaYC.onError(status);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.place_autocomplete_fragment, viewGroup, false);
        this.zzaYx = inflate.findViewById(R.id.place_autocomplete_search_button);
        this.zzaYy = inflate.findViewById(R.id.place_autocomplete_clear_button);
        this.zzaYz = (EditText) inflate.findViewById(R.id.place_autocomplete_search_input);
        OnClickListener anonymousClass1 = new OnClickListener(this) {
            final /* synthetic */ SupportPlaceAutocompleteFragment a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.zzDp();
            }
        };
        this.zzaYx.setOnClickListener(anonymousClass1);
        this.zzaYz.setOnClickListener(anonymousClass1);
        this.zzaYy.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ SupportPlaceAutocompleteFragment a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.setText("");
            }
        });
        zzDo();
        return inflate;
    }

    public void onDestroyView() {
        this.zzaYx = null;
        this.zzaYy = null;
        this.zzaYz = null;
        super.onDestroyView();
    }

    public void setBoundsBias(LatLngBounds latLngBounds) {
        this.zzaYA = latLngBounds;
    }

    public void setFilter(AutocompleteFilter autocompleteFilter) {
        this.zzaYB = autocompleteFilter;
    }

    public void setHint(CharSequence charSequence) {
        this.zzaYz.setHint(charSequence);
        this.zzaYx.setContentDescription(charSequence);
    }

    public void setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzaYC = placeSelectionListener;
    }

    public void setText(CharSequence charSequence) {
        this.zzaYz.setText(charSequence);
        zzDo();
    }
}
