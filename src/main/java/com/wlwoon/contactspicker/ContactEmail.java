package com.wlwoon.contactspicker;

import android.os.Parcel;
import android.os.Parcelable;

public class ContactEmail implements Parcelable {
	public String address;
	public String type;

	public ContactEmail(String address, String type) {
		this.address = address;
		this.type = type;
	}

	protected ContactEmail(Parcel in) {
		address = in.readString();
		type = in.readString();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(address);
		dest.writeString(type);
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static final Creator<ContactEmail> CREATOR = new Creator<ContactEmail>() {
		@Override
		public ContactEmail createFromParcel(Parcel in) {
			return new ContactEmail(in);
		}

		@Override
		public ContactEmail[] newArray(int size) {
			return new ContactEmail[size];
		}
	};
}
