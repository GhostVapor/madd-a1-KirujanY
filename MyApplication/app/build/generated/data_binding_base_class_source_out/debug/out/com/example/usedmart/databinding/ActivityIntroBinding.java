// Generated by view binder compiler. Do not edit!
package com.example.usedmart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.usedmart.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityIntroBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final AppCompatButton introBtn;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView signupTxt;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  private ActivityIntroBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView3,
      @NonNull AppCompatButton introBtn, @NonNull ConstraintLayout main,
      @NonNull TextView signupTxt, @NonNull TextView textView10, @NonNull TextView textView8,
      @NonNull TextView textView9) {
    this.rootView = rootView;
    this.imageView3 = imageView3;
    this.introBtn = introBtn;
    this.main = main;
    this.signupTxt = signupTxt;
    this.textView10 = textView10;
    this.textView8 = textView8;
    this.textView9 = textView9;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityIntroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityIntroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_intro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityIntroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.introBtn;
      AppCompatButton introBtn = ViewBindings.findChildViewById(rootView, id);
      if (introBtn == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.signupTxt;
      TextView signupTxt = ViewBindings.findChildViewById(rootView, id);
      if (signupTxt == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      return new ActivityIntroBinding((ConstraintLayout) rootView, imageView3, introBtn, main,
          signupTxt, textView10, textView8, textView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
