package com.wlwoon.contactspicker;

import android.os.Parcel;
import android.os.Parcelable;

public class ContactPhone implements Parcelable {
	public String number;
	public String type;

	public ContactPhone(String number, String type) {
		this.number = number;
		this.type = type;
	}

	protected ContactPhone(Parcel in) {
		number = in.readString();
		type = in.readString();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(number);
		dest.writeString(type);
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static final Creator<ContactPhone> CREATOR = new Creator<ContactPhone>() {
		@Override
		public ContactPhone createFromParcel(Parcel in) {
			return new ContactPhone(in);
		}

		@Override
		public ContactPhone[] newArray(int size) {
			return new ContactPhone[size];
		}
	};
}
