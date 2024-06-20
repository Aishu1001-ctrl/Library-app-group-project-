// Generated by view binder compiler. Do not edit!
package com.example.library_app_java.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.library_app_java.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView dashTitle;

  @NonNull
  public final CardView homeAddBookBtn;

  @NonNull
  public final CardView homeAddMemBtn;

  @NonNull
  public final CardView homeBorrowBookBtn;

  @NonNull
  public final CardView homeReturnBookBtn;

  @NonNull
  public final View topView;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull TextView dashTitle,
      @NonNull CardView homeAddBookBtn, @NonNull CardView homeAddMemBtn,
      @NonNull CardView homeBorrowBookBtn, @NonNull CardView homeReturnBookBtn,
      @NonNull View topView) {
    this.rootView = rootView;
    this.dashTitle = dashTitle;
    this.homeAddBookBtn = homeAddBookBtn;
    this.homeAddMemBtn = homeAddMemBtn;
    this.homeBorrowBookBtn = homeBorrowBookBtn;
    this.homeReturnBookBtn = homeReturnBookBtn;
    this.topView = topView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dash_title;
      TextView dashTitle = ViewBindings.findChildViewById(rootView, id);
      if (dashTitle == null) {
        break missingId;
      }

      id = R.id.home_add_book_btn;
      CardView homeAddBookBtn = ViewBindings.findChildViewById(rootView, id);
      if (homeAddBookBtn == null) {
        break missingId;
      }

      id = R.id.home_add_mem_btn;
      CardView homeAddMemBtn = ViewBindings.findChildViewById(rootView, id);
      if (homeAddMemBtn == null) {
        break missingId;
      }

      id = R.id.home_borrow_book_btn;
      CardView homeBorrowBookBtn = ViewBindings.findChildViewById(rootView, id);
      if (homeBorrowBookBtn == null) {
        break missingId;
      }

      id = R.id.home_return_book_btn;
      CardView homeReturnBookBtn = ViewBindings.findChildViewById(rootView, id);
      if (homeReturnBookBtn == null) {
        break missingId;
      }

      id = R.id.top_view;
      View topView = ViewBindings.findChildViewById(rootView, id);
      if (topView == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, dashTitle, homeAddBookBtn,
          homeAddMemBtn, homeBorrowBookBtn, homeReturnBookBtn, topView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}